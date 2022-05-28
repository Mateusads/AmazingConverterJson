package br.com.medeiros.amazing.services;

import br.com.medeiros.amazing.entities.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConverterLine {

    public List<User> toEntity(BufferedReader br) throws IOException {

        List<User> users = new ArrayList<>();

        while (br.readLine().isEmpty()){

        }
        return users;

    }


}
