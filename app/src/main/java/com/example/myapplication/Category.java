package com.example.myapplication;

import java.util.List;

import book.adapter_18093421_LeVanTai.Book;

public class Category {
    private  String nameCategory;
    private List<Book> nameArrayCategory;

    public Category(){}
    public Category(String nameCategory , List<Book> nameArrayCategory)
    {
        this.nameArrayCategory = nameArrayCategory;;
        this.nameCategory = nameCategory;
    }
    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Book> getNameArrayCategory() {
        return nameArrayCategory;
    }

    public void setNameArrayCategory(List<Book> nameArrayCategory) {
        this.nameArrayCategory = nameArrayCategory;
    }
}
