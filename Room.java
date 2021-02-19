package rogue;
import java.util.ArrayList; 
import java.util.Map;
import java.awt.Point;


/**
 * A room within the dungeon - contains monsters, treasure,
 * doors out, etc.
 */
public class Room  {

  

    // Default constructor
 public Room() {

 }

 


   // Required getter and setters below

 
 public int getWidth() {

return 0;
 }

 
 public void setWidth(int newWidth) {

 }

 
 public int getHeight() {

return 0;
 }


 public void setHeight(int newHeight) {
 }

 public int getId() {
    return 0;

 }


 public void setId(int newId) {

 }


 public ArrayList<Item> getRoomItems() {
    return null;

 }


 public void setRoomItems(ArrayList<Item> newRoomItems) {

 }


 public Player getPlayer() {
    return null;

 }


 public void setPlayer(Player newPlayer) {

 }


 



 public int getDoor(String direction){

    return 0;

 }

/*
direction is one of NSEW
location is a number between 0 and the length of the wall
*/

public void setDoor(String direction, int location){

}


public boolean isPlayerInRoom() {

return true;
}




   /**
    * Produces a string that can be printed to produce an ascii rendering of the room and all of its contents
    * @return (String) String representation of how the room looks
    */
   public String displayRoom() {
    return null;
     
     
   }
}