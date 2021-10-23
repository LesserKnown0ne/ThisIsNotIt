package com.example.attemptatapplication;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable {
    protected ArrayList<Wine> wineArrayList = new ArrayList<Wine>();

    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        for (Wine wine: wineArrayList )
        oos.writeObject(wine);
    }
}
