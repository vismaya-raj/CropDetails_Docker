package com.vismayawork.cropwise.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.*;  // Use jakarta.persistence instead of javax.persistence
import jakarta.validation.constraints.NotNull;  // Use jakarta.validation.constraints instead of javax.validation.constraints

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "crop_stock")
@Data // Lombok annotation to generate getters, setters, equals, hashcode, and toString
@NoArgsConstructor // Lombok annotation to generate a no-args constructor
@AllArgsConstructor // Lombok annotation to generate an all-args constructor
public class CropStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String type;

    @NotNull
    private BigDecimal weight;  // In kg

    @NotNull
    private String unit;  // kg

    @NotNull
    private BigDecimal pricePerUnit;

    private LocalDate harvestDate;

    private LocalDate expiryDate;
}
