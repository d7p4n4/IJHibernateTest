package com.sycompla.service;

import com.sycompla.cap.CategoryHibernateCap;
import com.sycompla.entity.Category;
import com.sycompla.gson.GsonCap;

import java.util.List;

public class CategoryStringService {

    public String getOneRecord(int id) {

        CategoryHibernateCap cap = new CategoryHibernateCap();

        Category category = cap.getOneRecord(id);

        return new GsonCap().getObjectAsJson(category);

    } // getOneRecord

    public String getList() {

        CategoryHibernateCap cap = new CategoryHibernateCap();

        List<Category> categories = cap.getList();

        String categoriesString = "";

        for(int counter = 0; counter < categories.size(); counter++) {

            categoriesString += new GsonCap().getObjectAsJson(categories.get(counter)) + "\n";

        }

        return categoriesString;

    } // getList


}
