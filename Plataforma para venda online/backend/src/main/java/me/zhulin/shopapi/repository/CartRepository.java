package me.zhulin.shopapi.repository;

import me.zhulin.shopapi.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Criado por Dorgival Fernando em 30/08/2020.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
