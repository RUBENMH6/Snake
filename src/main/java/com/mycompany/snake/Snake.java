/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snake;

import java.util.List;


public class Snake {
    
    private List<Node> listOfNodes;
    private Node node;
    
    public Snake() {
        listOfNodes = null;
    }
    
    public void growSnake() {
        listOfNodes.add(node);
    } 
    
    public int sizeSnake() {
        return listOfNodes.size();
    }
}
