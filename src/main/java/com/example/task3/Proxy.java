package com.example.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Proxy implements MyImage{
    ArrayList<String> filenameList;
    ArrayList<RealImage> frames;
    private int curent_frame;
    MyImage service;
    public Proxy(){
        filenameList = new ArrayList<>();
        frames = new ArrayList<>();
        curent_frame = 0;
    }
    public String generate_frame(String filename){
        if (filenameList.contains(filename)){
            curent_frame = filenameList.indexOf(filename);
            return "from cache using proxy";
        }
        RealImage image = new RealImage(filename);
        frames.add(image);
        filenameList.add(filename);
        curent_frame = filenameList.indexOf(filename);
        return "created new obj";
    } 
    @Override
    public void display() {
        frames.get(curent_frame).display();
    }
    
    
}
