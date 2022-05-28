package br.com.medeiros.amazing.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Product {

    private Integer id;
    private Double value;

}
