package com.darwin.learning.spring.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortImpl implements SortingAlgorithm {

    public QuickSortImpl() {
        System.out.println("Default constructor of quick sorting algorithm");
    }

    @Override
    public int[] sort(int[] arr) {
        return arr;
    }
}
