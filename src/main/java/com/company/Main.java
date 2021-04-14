package com.company;

import com.sycompla.cap.CategoryHibernateCap;
import com.sycompla.entity.Category;

public class Main {

    public static void main(String[] args) {

        CategoryHibernateCap cap = new CategoryHibernateCap();

        Category category = cap.getOneRecord(1);

        System.out.println(category.toString());

    }
}
