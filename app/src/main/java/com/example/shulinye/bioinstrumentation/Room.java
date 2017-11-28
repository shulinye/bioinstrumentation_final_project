package com.example.shulinye.bioinstrumentation;

/**
 * Created by shulinye on 11/28/17.
 */

public class Room {
    java.lang.String room_number;
    long last_communication;

    public static final int GRACE = 300000; //Five minutes

    java.util.ArrayList datum;

    public Room(java.lang.String room_number){
        this.room_number = room_number;
        this.last_communication = java.lang.System.currentTimeMillis();
    }

    public void setRoom(java.lang.String room_number){
        this.room_number = room_number;
    }

    public java.lang.String getRoom(){
        return this.room_number;
    }

    public boolean withinGrace(){
        return java.lang.System.currentTimeMillis() - this.last_communication < GRACE;
    }

    public void addData(Datum data){
        this.datum.add(data);
    }

    public java.util.ArrayList getData(){
        return this.datum;
    }
}