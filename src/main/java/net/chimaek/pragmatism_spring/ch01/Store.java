package net.chimaek.pragmatism_spring.ch01;

import java.util.List;
import lombok.Getter;

@Getter
public class Store {

    private List<Order> orders;
    private long rentalFree;
}