package com.insta.ad.model;

import com.insta.ad.dto.TouristDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Tourist {
    @Id
    @GeneratedValue
    private Long id;

    private String first_name;

    private String last_name;

    private Long passportId;

    public TouristDto toTouristDto() {
        return  TouristDto.builder()
                .first_name(this.first_name)
                .last_name(this.last_name)
                .build();
    }
}
