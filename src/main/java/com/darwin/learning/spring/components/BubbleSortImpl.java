package com.darwin.learning.spring.components;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortImpl implements SortingAlgorithm {

    public BubbleSortImpl() {
        System.out.println("Default constructor of bubble sorting algorithm");
    }

    @Override
    public int[] sort(int[] arr) {
        return arr;
    }
}
