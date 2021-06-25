package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strings"
)

//Create a tree of all routes in configuration file
type routeNode struct {
	name, serverName string
	children         map[string]*routeNode
}

//Constructor for nodes of the tree
func newNode(name, serverName string) routeNode {
	node := routeNode{name, serverName, make(map[string]*routeNode)}
	return node
}

//Root of whole tree
var root = newNode("Bhumika", "")

func loadConfig(file string) {

	//Parsing config file
	f, error := os.Open(file)
	if error != nil {
		log.Fatal(error)
	}
	defer f.Close()

	scanner := bufio.NewScanner(f)
	for scanner.Scan() {
		line := scanner.Text()
		serv := strings.Split(line, "=")
		data := strings.Split(strings.ToLower(serv[0]), ".")

		serverName := strings.Trim(serv[1], " ")

		//Parse a single line and store all components in an array
		values := []string{
			strings.Trim(data[0], " "), //customer
			strings.Trim(data[1], " "), //country
			strings.Trim(data[2], " "), //state
			strings.Trim(data[3], " ")} //city

		currNode := &root
		index := 0

		//Add nodes in tree
		for index < 4 {
			if currNode.children[values[index]] != nil {
				currNode = currNode.children[values[index]]
			} else {
				//Create a new node when it does not exist and add it in tree
				node := newNode(values[index], "")
				currNode.children[values[index]] = &node
				currNode = &node
			}
			index++
		}
		currNode.serverName = serverName
	}
}

//Recersively calculate the route
func routeCalc(node *routeNode, values []string, index int) string {

	//Base case
	if node == nil {
		return ""
	}
	//Another Base case
	if node.serverName != "" {
		return node.serverName
	}

	//First trying to match exact value of children
	result := routeCalc(node.children[values[index]], values, index+1)
	if result != "" {
		return result
	} else {

		//If no exact match found then try with "*"
		return routeCalc(node.children["*"], values, index+1)
	}
}

func findRoute(query string) string {

	data := strings.Split(strings.ToLower(query), ".")
	values := []string{
		strings.Trim(data[0], " "), //customer
		strings.Trim(data[1], " "), //country
		strings.Trim(data[2], " "), //state
		strings.Trim(data[3], " ")} //city

	route := routeCalc(&root, values, 0)
	if route != "" {
		return route
	}
	return "No Server Found"
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
