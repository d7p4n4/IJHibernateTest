package com.company;

import com.sycompla.cap.CategoryHibernateCap;
import com.sycompla.entity.Category;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CategoryHibernateCap cap = new CategoryHibernateCap();

        Category category = cap.getOneRecord(1);

        List<Category> categories = cap.getList();

        System.out.println(category.toString());

        System.out.println(categories.toString());

    }
}
