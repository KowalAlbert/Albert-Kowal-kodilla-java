package com.kodilla.exceptiontwo.main;

import com.kodilla.exceptiontwo.io.FileReader;
import com.kodilla.exceptiontwo.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}