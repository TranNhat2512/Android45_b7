package com.android45.android45_b7;

public class Food {
    String nameFood, details;
    int price, quantity, imageFood, imageAdd, imageLike;

    public Food(String nameFood, String details, int price, int quantity, int imageFood, int imageAdd, int imageLike) {
        this.nameFood = nameFood;
        this.details = details;
        this.price = price;
        this.quantity = quantity;
        this.imageFood = imageFood;
        this.imageAdd = imageAdd;
        this.imageLike = imageLike;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getImageFood() {
        return imageFood;
    }

    public void setImageFood(int imageFood) {
        this.imageFood = imageFood;
    }

    public int getImageAdd() {
        return imageAdd;
    }

    public void setImageAdd(int imageAdd) {
        this.imageAdd = imageAdd;
    }

    public int getImageLike() {
        return imageLike;
    }

    public void setImageLike(int imageLike) {
        this.imageLike = imageLike;
    }
}
