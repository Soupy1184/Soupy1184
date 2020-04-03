/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelprogram;

/**
 *
 * @author chris
 */
public class Room {
    String roomNumber;
    String roomStatus;
    String roomType;
    
    public Room (String roomNumber, String roomStatus, String roomType){
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
        this.roomType = roomType;
    }
    
    public String getRoomNumber(){return roomNumber;}
    public String getRoomStatus(){return roomStatus;}
    public String getRoomType(){return roomType;}
    
    public void setRoomStatus(String roomStatus){
        this.roomStatus = roomStatus;
    }
}
