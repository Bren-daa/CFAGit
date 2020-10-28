package com.insta.ad.rest;

import com.insta.ad.dto.TouristDto;
import com.insta.ad.model.Tourist;
import com.insta.ad.repository.TouristRepository;
import com.insta.ad.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TouristRessource {

    @Autowired
    private TouristService touristService;

    @Autowired
    private TouristRepository touristRepository;

    @GetMapping("/tourists")
    List<TouristDto> getAll() {
        return touristService
                .findAllTourists();
    }

    @PostMapping("/tourists")
    Tourist create(@RequestBody Tourist tourist) {
        return touristRepository.save(tourist);
    }

    @DeleteMapping("/tourists/{id}")
    public void deletePost(@PathVariable(value = "id") Long touristId) {
        touristRepository.deleteById(touristId);
    }
}
