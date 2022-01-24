package com.darwin.learning.spring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortingAlgorithm sortingAlgorithm;

//    public BinarySearchImpl(SortingAlgorithm sortingAlgorithm) {
//        System.out.println("BeanSearchImpl with sortingAlgorithm invoked");
//        this.sortingAlgorithm = sortingAlgorithm;
//    }

//    public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
//        System.out.println("setSortingAlgorithm with sortingAlgorithm invoked");
//        this.sortingAlgorithm = sortingAlgorithm;
//    }

    public int binarySearch(int[] arr, int num) {
        return -1;
    }

}
