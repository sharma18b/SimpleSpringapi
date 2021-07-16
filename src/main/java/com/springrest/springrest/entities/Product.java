package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private int productId;
    private String productName;
    private String productCode;
    private String releaseDate;
    private int price;
    private String description;
    private String starRating;
    private String imageUrl;

    public Product() {
    }

    public Product(int productId, String productName, String productCode, String releaseDate, int price, String description, String starRating, String imageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.productCode = productCode;
        this.releaseDate = releaseDate;
        this.price = price;
        this.description = description;
        this.starRating = starRating;
        this.imageUrl = imageUrl;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getStarRating() {
        return starRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", starRating='" + starRating + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
