package com.tutorial.apidemo.Springboot.tutorial.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;

//POJO = Plain Object Java Object

@Entity
@Data
@NoArgsConstructor
@Table(name = "tblProduct")
public class Product {
    //this is "primary key"
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //auto-increment
    private Long id;
    //validate = constraint
    @Column(nullable = false, unique = true, length = 300)
    private String productName;
    @Column(name = "yea")
    private int year;
    private Double price;
    private String url;

    //Calculated field = transient, not exist in MySQL
    @Transient
    private int age; //age is calculated from "year"

    public Product(String productName, int year, Double price, String url) {
        this.productName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return year == product.year
                && age == product.age
                && id.equals(product.id)
                && productName.equals(product.productName)
                && price.equals(product.price)
                && url.equals(product.url);
    }

}


