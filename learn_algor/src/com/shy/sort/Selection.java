package com.shy.sort;
/**
 * 选择排序
 * @author SHY
 *
 */
public class Selection {
	public static void sort(int[] a){
		if(a==null||a.length==0){
			return ;
		}
		for(int i=0;i<a.length;i++){
			int minIndex=i;
			for(int j=i+1;j<a.length;j++){
				if(a[minIndex]>a[j]){
					minIndex=j;
				}
			}
			SortUtil.exchang(a, i, minIndex);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,2,4,1,3,8,3};
		sort(a);
		SortUtil.print(a);
	}

}
