package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        InitArray();

        //Euclid

        PrimeNumber();

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        int[] source = {10, 2, 10, 3, 1, 2, 5};
        SelectionSorter(array);

        QuickSort(source, 3, 5);

        InsertionSort(array);







    }

    //1
    public static void InitArray() {
        int passArray[] = new int[1000];
        for (int i = 0; i < passArray.length; i++){
            System.out.println(i);
        }
    }

    //2
    public void Euclid() {
        int[] vertorOne = {0, 0, 1, 1};
        int[] vectorTwo = {0, 0, 4, 2};

//        public int Count() {
//            int width = vertorOne[2] - vectorTwo[2];
//            int height = vertorOne[3] - vectorTwo[3];
//        }
    }

    //3
    public static void PrimeNumber() {
            Scanner scanner = new Scanner(System.in);
            int top = scanner.nextInt();
            for (int i=2;i<top;i++){
                if(checkSimple(i))
                    System.out.println(i);
            }
    }

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

    //==============================================

    //4
    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void SelectionSorter(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void InsertionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }




    public static void QuickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            QuickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            QuickSort(source, leftBorder, rightMarker);
        }

        System.out.println(Arrays.toString(source));

    }


}

