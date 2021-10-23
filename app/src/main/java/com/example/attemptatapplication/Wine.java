package com.example.attemptatapplication;

public class Wine {
    private String name;
    private String size;
    private boolean sparkling;
    private boolean sweetened;

    public Wine(){

        name = "Null";
        size = "0";
        sparkling = false;
        sweetened = false;

    }

    public Wine(String name, String size, boolean sparkling, boolean sweetened){

        this.name = name;
        this.size = size;
        this.sparkling = sparkling;
        this.sweetened = sweetened;

    }
}
