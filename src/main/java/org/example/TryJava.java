package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TryJava {
    public static void main(String[] args) {

        System.out.println("Enter size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int temp;


        System.out.println("enter elements: ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }

//        Arrays.sort(arr);

        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr[i];
                }
            }
        }

        System.out.println("max: " + arr[size - 1]);
        System.out.println("min: " + arr[0]);


    }
}
