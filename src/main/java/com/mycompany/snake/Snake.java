/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;


public class Snake {
    
    private List<Node> listOfNodes;
    private Node node;
    private Direction direction;
    private KeyAdapter myKeyAdapter;
    
    
    
    public Snake() {
        Node firstNode = new Node(Config.instance.WEIGHT /2,Config.instance.WEIGHT /2);
        listOfNodes.add(node);
    }
    
    public void growSnake(Node node) {
        listOfNodes.add(node);
    } 
    
    public int sizeSnake() {
        return listOfNodes.size();
    }
    
    public boolean canMove() {
        
        return false;
    }
    
    public void movementSnake() {
        if (canMove()) {
            
        }
    }
    
    class MyKeyAdapter extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (canMove()) {
                       
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (canMove()) {
                        
                    }
                    break;
                case KeyEvent.VK_UP:
                    
                    if (canMove()) {
                        
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (canMove()) {
                        
                    }
                    break;
               
                default:
                    break;
            }
            repaint();
        }
    }
}
