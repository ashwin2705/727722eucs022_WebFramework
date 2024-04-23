package com.example.day5cw1.Ashwinrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.AshwinModel.AshwinProduct;

@Repository
public interface Ashwinproductrepo extends JpaRepository<AshwinProduct,Integer>{
    
}
