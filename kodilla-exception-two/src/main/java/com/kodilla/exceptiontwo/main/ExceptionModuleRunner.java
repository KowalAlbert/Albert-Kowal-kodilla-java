package com.kodilla.exceptiontwo.main;

import com.kodilla.exceptiontwo.io.FileReader;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}