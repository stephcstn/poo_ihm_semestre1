package org.robots;

public class Battery {
    private final Type type;
    private int capacity;

    private static final int DEFAULT_CAPACITY = 10;

    public Battery(Type t){
        this.type = t;
        this.capacity = DEFAULT_CAPACITY;
    }

    public Battery(Type t, int cap) throws InvalidNbBatteryException{
        if (cap <= 0){
            throw new InvalidNbBatteryException("The capacity of the battery must be above 0");
        }
        this.type = t;
        this.capacity = cap;
    }

    public void use(){
        if (this.capacity > 0){
            this.capacity --;
        }
        System.out.println("battery is out");
    }

    public int getCapacity(){
        return this.capacity;
    }
}
