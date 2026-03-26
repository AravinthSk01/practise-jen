package com.app.rvz.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.rvz.entity.Fruit;

public interface FruitRepo extends JpaRepository<Fruit,Integer> {

}
