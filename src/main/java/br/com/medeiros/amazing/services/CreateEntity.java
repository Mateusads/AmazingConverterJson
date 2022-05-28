package br.com.medeiros.amazing.services;

import br.com.medeiros.amazing.entities.Order;
import br.com.medeiros.amazing.entities.Product;
import br.com.medeiros.amazing.entities.User;
import lombok.Builder;

import java.time.LocalDate;

public class CreateEntity {




    private User createUser(Integer id, String name){
        return User.builder()
                .id(id)
                .name(name)
                .build();
    }

    private Order createOrder(Integer id, LocalDate data){
        return Order.builder()
                .id(id)
                .data(data)
                .build();
    }

    private Product createProduct(Integer id, Double value){
        return Product.builder()
                .id(id)
                .value(value)
                .build();
    }

}
