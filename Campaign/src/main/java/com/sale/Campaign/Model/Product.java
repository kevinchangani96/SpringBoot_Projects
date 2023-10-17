package com.sale.Campaign.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String title;
    private String description;
    private Double mrp;
    private Double currentPrice;
    private Double discount;
    private Integer inventory;
    private String formattedTime;
    @PrePersist
    private void prePersist() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Define your desired date/time format
        this.formattedTime = sdf.format(new Date( System.currentTimeMillis()));
    }
}
