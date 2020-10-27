package com.insta.ad.service;

import com.insta.ad.dto.TouristDto;
import com.insta.ad.model.Tourist;
import com.insta.ad.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class TouristService {
    @Autowired
    private TouristRepository touristRepository;

    public List<TouristDto> findAllTourists() {
        return touristRepository
                .findAll()
                .stream()
                .map(t -> t.toTouristDto())
                .collect(toList());
    }
}
