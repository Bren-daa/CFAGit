package com.insta.ad.dto;

import com.insta.ad.model.Tourist;
import com.insta.ad.repository.TouristRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import net.bytebuddy.asm.Advice;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@Builder
public class TouristDto  {
    private String first_name;
    private String last_name;
}
