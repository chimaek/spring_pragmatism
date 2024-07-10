package net.chimaek.pragmatism_spring.ch01;

import java.util.List;

public class RestaurantChain {
  private List<Store> stores;

  public long calculateRevenue() {
    long revenue = 0;
    for (Store store : stores) {
      for (Order order : store.getOrders()) {
        for (Food food : order.getFoods()) {
          revenue += food.getPrice();
        }
      }
    }
    return revenue;
  }

  public long calcualteProfit() {
    long cost = 0;
    for (Store store : stores) {
      for (Order order : store.getOrders()) {
        long orderPrice = 0;
        for (Food food : order.getFoods()) {
          orderPrice += food.getPrice();
          cost += food.getOriginPrice();
        }
        cost += orderPrice * order.getTransctionFeePercent();
      }
      cost += store.getRentalFree();
    }
    return calculateRevenue() - cost;
  }
}