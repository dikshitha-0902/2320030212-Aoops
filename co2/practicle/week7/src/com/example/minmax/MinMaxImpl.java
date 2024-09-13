package com.example.minmax;
	public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {

	    @Override
	    public T min(T[] array) {
	        T min = array[0];
	        for (T element : array) {
	            if (element.compareTo(min) < 0) {
	                min = element;
	            }
	        }
	        return min;
	    }

	    @Override
	    public T max(T[] array) {
	        T max = array[0];
	        for (T element : array) {
	            if (element.compareTo(max) > 0) {
	                max = element;
	            }
	        }
	        return max;
	    }
	}
	


