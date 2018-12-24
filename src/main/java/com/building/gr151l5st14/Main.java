package com.building.grl51l5st14;

import java.io.File;
import java.io.IOException;

import eu.printingin3d.javascad.exceptions.IllegalValueException;
import eu.printingin3d.javascad.utils.SaveScadFiles;

public class Main {
   
    public static void main(String[] args) throws IllegalValueException, IOException {
        new SaveScadFiles(new File("./target")).
                addModel("14.scad", new Building()).
                saveScadFiles();
        System.out.println("Building was created!");
        System.out.println("You can find it in \"target\" directory");

    }
}
