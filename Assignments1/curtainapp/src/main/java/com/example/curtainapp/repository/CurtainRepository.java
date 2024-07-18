package com.example.curtainapp.repository;

import com.example.curtainapp.entity.Curtain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CurtainRepository extends JpaRepository<Curtain, Long> {

    @Query("SELECT c FROM Curtain c WHERE c.price > :price")
    List<Curtain> getCurtainsByPriceGreaterThan(@Param("price") int price);

    @Query("SELECT c FROM Curtain c WHERE c.brand = :brand")
    List<Curtain> getCurtainsByBrand(@Param("brand") String brand);
}
