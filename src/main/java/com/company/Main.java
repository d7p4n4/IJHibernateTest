package com.company;

import com.sycompla.cap.CategoryHibernateCap;
import com.sycompla.entity.Category;
import com.sycompla.service.CategoryStringService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CategoryStringService stringService = new CategoryStringService();

        String list = stringService.getList();

        System.out.println(list);

        System.out.println(stringService.getOneRecord(2));

    }
}
