/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package com.mycompany.snake;

/**
 *
 * @author alu10211999
 */
public class Config {
    
    public static Config instance = new Config();
    private int level; 
    private String name;
    
    public static final int WITDH = 500;
    public static final int WEIGHT = 500;
    public static final int SIZE_BOX = 10;
    public static final int NUMBER_BOX = (WITDH * WEIGHT) / (SIZE_BOX * SIZE_BOX);
    
    
    private Config() {
        level = 0;
        name = "Player";
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    
    
    
    
    
}
