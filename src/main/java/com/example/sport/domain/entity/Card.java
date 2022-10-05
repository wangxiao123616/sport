package com.example.sport.domain.entity;

<<<<<<< Updated upstream
import lombok.Data;

import java.time.LocalDateTime;

@Data
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> Stashed changes
public class Card {
    private Long id;
    private Integer money;
    private String cPassword;
    private String phone;
<<<<<<< Updated upstream
    private LocalDateTime date;
=======
    private LocalDate date;
>>>>>>> Stashed changes
}
