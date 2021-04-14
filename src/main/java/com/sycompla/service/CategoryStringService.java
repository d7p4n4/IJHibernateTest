package com.sycompla.service;

import com.sycompla.cap.CategoryHibernateCap;
import com.sycompla.entity.Category;

import java.util.List;

public class CategoryStringService {

    public String getOneRecord(int id) {

        CategoryHibernateCap cap = new CategoryHibernateCap();

        Category category = cap.getOneRecord(id);

        return category.toString();

    } // getOneRecord

    public String getList() {

        CategoryHibernateCap cap = new CategoryHibernateCap();

        List<Category> categories = cap.getList();

        String categoriesString = "";

        for(int counter = 0; counter < categories.size(); counter++) {

            categoriesString += categories.get(counter).toString() + "\n";

        }

        return categoriesString;

    } // getList


}
