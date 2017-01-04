package com.shy.sort;

public class SortUtil {
	public static <T> boolean less(int v, int w) {
		return v<w;
	}
	
	public static void  exchang(int[] array,int index1,int index2){
		if(array==null||array.length==0){
			return;
		}
		if(index1<0&&index1>=array.length){
			System.out.println("index1越界");
			return;
		}
		if(index2<0&&index2>=array.length){
			System.out.println("insex2越界");
		}
		
		int temporary=array[index1]^array[index2];
		array[index1]=temporary^array[index1];
		array[index2]=temporary^array[index2];
	}
	public static void print(int[] a){
		if(a!=null){
			for(int item :a){
				System.out.print(item+" ");
			}
		}
		System.out.println();
	}
	private static <Key extends Comparable<Key>> boolean less(Key v, Key w) {
        return v.compareTo(w) < 0;
    }
}
