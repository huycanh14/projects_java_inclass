package com.company;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
	private ArrayList<Double> arrayList;
    private int maxSize = 0;

    public BubbleSort(int _maxSize) {
        this.arrayList = new ArrayList<>();
        this.maxSize = _maxSize;
        this.intialize();
        this.sort();
        //this.print();
    }

    private void intialize() {
        Random random = new Random();
        for (int i = 0; i < this.maxSize; i++) {
            this.arrayList.add(random.nextDouble() * Math.pow(10, random.nextInt(5)));
        }
    }

    private void sort() {
        int i = 0;
        while (i < this.maxSize) {
            for (int j = 0; j < maxSize - 1; j++) {
                if (this.arrayList.get(j) > this.arrayList.get(j + 1)) {
                    double tmp = this.arrayList.get(j);
                    this.arrayList.set(j, this.arrayList.get(j + 1));
                    this.arrayList.set(j + 1, tmp);
                }
            }
            i++;
        }
    }

    private void print() {
        for (double x: this.arrayList) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }
}
