package net.chimaek.pragmatism_spring.ch01;

import java.util.List;
import lombok.Getter;

@Getter
public class Order {
    private List<Food> foods;

    private double transctionFeePercent = 0.03;



}