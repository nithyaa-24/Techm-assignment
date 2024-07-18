package com.example.curtainapp.controller;

import com.example.curtainapp.entity.Curtain;
import com.example.curtainapp.repository.CurtainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurtainController {

    @Autowired
    private CurtainRepository curtainRepository;

    @GetMapping("/curtains/price")
    public List<Curtain> getCurtainsByPriceGreaterThan(@RequestParam int price) {
        return curtainRepository.getCurtainsByPriceGreaterThan(price);
    }

    @GetMapping("/curtains/brand")
    public List<Curtain> getCurtainsByBrand(@RequestParam String brand) {
        return curtainRepository.getCurtainsByBrand(brand);
    }
}
