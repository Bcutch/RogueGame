package rogue;

import java.util.Scanner;
import java.util.ArrayList;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.awt.Point;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class A1Solution{




    public static void main(String[] args) { 
        // Hardcoded configuration file location/name
        String configurationFileLocation = "fileLocations.json";  //please don't change this for this version of the assignment
        
 // reading the input file locations using the configuration file
        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader(configurationFileLocation));
            JSONObject configurationJSON = (JSONObject) obj;

            // Extract the Rooms value from the file to get the file location for rooms
            

            // Extract the Symbols value from the file to get the file location for symbols-map

            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

// instantiate a new Rogue object and call methods to do the required things
        System.out.println("We have liftoff!");
        
    }


}