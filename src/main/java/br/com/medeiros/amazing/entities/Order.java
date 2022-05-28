package br.com.medeiros.amazing.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class Order {

    private Integer id;
    private LocalDate data;
    private Double total;
    private List<Product> products = new ArrayList<>();
}
