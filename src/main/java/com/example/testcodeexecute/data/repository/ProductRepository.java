package com.example.testcodeexecute.data.repository;


import com.example.testcodeexecute.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
