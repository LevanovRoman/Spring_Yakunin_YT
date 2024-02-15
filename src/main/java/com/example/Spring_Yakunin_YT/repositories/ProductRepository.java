package com.example.Spring_Yakunin_YT.repositories;

import com.example.Spring_Yakunin_YT.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
