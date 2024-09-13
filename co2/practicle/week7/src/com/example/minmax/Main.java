package com.example.minmax;
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 7, 2, 8};
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array: Min = " + intMinMax.min(intArray) + ", Max = " + intMinMax.max(intArray));
        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMax<String> strMinMax = new MinMaxImpl<>();
        System.out.println("String Array: Min = " + strMinMax.min(strArray) + ", Max = " + strMinMax.max(strArray));
        Character[] charArray = {'a', 'z', 'b', 'y'};
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Array: Min = " + charMinMax.min(charArray) + ", Max = " + charMinMax.max(charArray));

        // Float array
        Float[] floatArray = {3.4f, 1.2f, 6.8f, 2.5f};
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Array: Min = " + floatMinMax.min(floatArray) + ", Max = " + floatMinMax.max(floatArray));
    }
}

