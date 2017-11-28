package com.example.shulinye.bioinstrumentation;


/**
 * Created by shulinye on 11/28/17.
 */

public class Datum {
    long timestamp;
    boolean flow;
    float mass;
    float color;

    public Datum()
    {
        this.timestamp = java.lang.System.currentTimeMillis();
    }

    public void setFlow(boolean flow){
        this.flow = flow;
    }

    public void setMass(float mass){
        this.mass = mass;
    }

    public void setColor(float color){
        this.color = color;
    }
}
