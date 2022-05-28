package br.com.medeiros.amazing.controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Receiver {

    public BufferedReader fileBuffered(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));
        return br;
    }
}
