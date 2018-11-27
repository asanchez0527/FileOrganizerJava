package main.java;

import java.awt.*;
import javax.swing.*;
import main.java.resources.database.Database;

public class main {
    public static void main(String[] args){
        JFrame frame = new JFrame("MovieFlix");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,400);
        frame.setVisible(true);


        Database database = new Database("movies.db");
    }

}
