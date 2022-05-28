package br.com.medeiros.amazing.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    private List<Order> orders = new ArrayList<>();

}
