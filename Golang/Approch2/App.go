package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

type route struct {
	country, state, city, serverName string
}

var routeData = make(map[string][]route)

func loadConfig(file string) {

	f, _ := os.Open(file)
	scanner := bufio.NewScanner(f)
	for scanner.Scan() {
		line := scanner.Text()
		res := strings.Split(line, "=")
		res1 := strings.Split(res[0], ".")

		if _, ok := routeData[res1[0]]; ok {
			var temp []route = routeData[res1[0]]
			route1 := route{
				country:    strings.Trim(res1[1], " "),
				state:      strings.Trim(res1[2], " "),
				city:       strings.Trim(res1[3], " "),
				serverName: strings.Trim(res[1], " "),
			}
			temp = append(temp, route1)
			routeData[res1[0]] = temp
		} else {
			var temp []route
			route1 := route{
				country:    strings.Trim(res1[1], " "),
				state:      strings.Trim(res1[2], " "),
				city:       strings.Trim(res1[3], " "),
				serverName: strings.Trim(res[1], " "),
			}
			temp = append(temp, route1)
			routeData[res1[0]] = temp
		}
	}

	fmt.Println(routeData)

}

func findRoute(data string) string {

	res := strings.Split(data, ".")
	result := ""
	var max = 0
	if _, ok := routeData[res[0]]; ok {
		var temp []route = routeData[res[0]]

		for _, item := range temp {
			var count = 0
			if item.country == res[1] || item.country == "*" {
				if item.country != "*" {
					count++
				}
				if item.state == res[2] || item.state == "*" {
					if item.state != "*" {
						count++
					}
					if item.city == res[3] || item.city == "*" {
						if item.city != "*" {
							count++
						}
					} else {
						continue
					}
				} else {
					continue
				}
			} else {
				continue
			}
			if count >= max {
				max = count
				result = item.serverName
			}
		}

	} else if _, ok := routeData["*"]; ok {
		var temp []route = routeData["*"]

		for _, item := range temp {
			var count = 0
			if item.country == res[1] || item.country == "*" {
				if item.country != "*" {
					count++
				}
				if item.state == res[2] || item.state == "*" {
					if item.state != "*" {
						count++
					}
					if item.city == res[3] || item.city == "*" {
						if item.city != "*" {
							count++
						}
					} else {
						continue
					}
				} else {
					continue
				}
			} else {
				continue
			}
			if count >= max {
				max = count
				result = item.serverName
			}
		}

	} else {
		return "No Server Found."
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

}
