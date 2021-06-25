package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strings"
)

var routeData = make(map[string]map[string]map[string]map[string]string)

func loadConfig(file string) {

	f, error := os.Open(file)
	if error != nil {
		log.Fatal(error)
	}
	defer f.Close()

	scanner := bufio.NewScanner(f)
	for scanner.Scan() {
		line := scanner.Text()
		res := strings.Split(line, "=")
		res1 := strings.Split(res[0], ".")

		serverName := strings.Trim(res[1], " ")
		customer := strings.Trim(res1[0], " ")
		country := strings.Trim(res1[1], " ")
		state := strings.Trim(res1[2], " ")
		city := strings.Trim(res1[3], " ")

		if _, ok := routeData[customer]; !ok {
			var countryMap = make(map[string]map[string]map[string]string)
			routeData[customer] = countryMap
			var stateMap = make(map[string]map[string]string)
			countryMap[country] = stateMap
			var cityMap = make(map[string]string)
			stateMap[state] = cityMap
			cityMap[city] = serverName

		} else {
			var tempCountryMap = routeData[customer]
			if _, ok := tempCountryMap[country]; !ok {
				var stateMap1 = make(map[string]map[string]string)
				tempCountryMap[country] = stateMap1
				var cityMap1 = make(map[string]string)
				stateMap1[state] = cityMap1
				cityMap1[city] = serverName
			} else {
				var tempStateMap = tempCountryMap[country]
				if _, ok := tempStateMap[state]; !ok {
					var cityMap2 = make(map[string]string)
					tempStateMap[state] = cityMap2
					cityMap2[city] = serverName
				} else {
					var tempCityMap = tempStateMap[state]
					if _, ok := tempCityMap[city]; !ok {
						tempCityMap[city] = serverName
					}
				}
			}

		}

	}

	fmt.Println(routeData)
}

func findRoute(data string) string {

	res := strings.Split(data, ".")
	customer := res[0]
	country := res[1]
	state := res[2]
	city := res[3]

	result := ""

	var Cu = ""

	if _, ok := routeData["*"]; ok {
		Cu = routeData["*"]["*"]["*"]["*"]
	}
	if _, ok := routeData[customer]; ok {
		var tempCountryMap = routeData[customer]
		var C = ""
		if _, ok := tempCountryMap["*"]; ok {
			C = tempCountryMap["*"]["*"]["*"]
		}
		if _, ok := tempCountryMap[country]; ok {
			var tempStateMap = tempCountryMap[country]
			var S = ""
			if _, ok := tempStateMap["*"]; ok {
				S = tempStateMap["*"]["*"]
			}
			if _, ok := tempStateMap[state]; ok {
				var tempCityMap = tempStateMap[state]
				if _, ok := tempCityMap[city]; ok {
					result = tempCityMap[city]
				} else {
					if _, ok := tempCityMap["*"]; ok {
						result = tempCityMap["*"]
					} else {
						if S != "" {
							return S
						} else {
							if C != "" {
								return C
							} else {
								if Cu != "" {
									return Cu
								} else {
									return "Server Not Found."
								}
							}
						}
					}
				}
			} else {
				if _, ok := tempStateMap["*"]; ok {
					return S
				} else {
					if C != "" {
						return C
					} else {
						if Cu != "" {
							return Cu
						} else {
							return "Server Not Found."
						}
					}
				}
			}

		} else {
			if _, ok := tempCountryMap["*"]; ok {
				return C
			} else {
				if Cu != "" {
					return Cu
				} else {
					return "Server Not Found."
				}
			}
		}

	} else {
		if _, ok := routeData["*"]; ok {
			return Cu
		} else {
			return "Server Not Found."
		}
	}

	return result
}

func main() {

	loadConfig("config.txt")
	output := findRoute("customer1.us.ca.sfo")
	fmt.Println(output)
	output1 := findRoute("customer1.us.ca.sjc")
	fmt.Println(output1)
	output2 := findRoute("customer2.us.tx.dfw")
	fmt.Println(output2)
	output3 := findRoute("customer2.cn.tw.tai")
	fmt.Println(output3)
	output4 := findRoute("customer10.us.ny.nyc")
	fmt.Println(output4)
	output5 := findRoute("customer1.cn.tx.nyc")
	fmt.Println(output5)
}
