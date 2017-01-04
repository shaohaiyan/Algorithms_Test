package com.shy.sort;
/**
 * 希尔排序，是基于插入排序的一种优化
 * @author SHY
 *
 */
public class Shell {

	
	public static void  sort(int[] a){
		if(a==null||a.length==0){
			return;
		}
		int length=a.length;
		int h=1;
		while(h<length/3){
			h=h*3+1;
		}
		while(h>=1){
			for(int i=h;i<length;i++){
				for(int j=i;j>=h&&SortUtil.less(a[j], a[j-h]);j-=h){
					SortUtil.exchang(a, j, j-h);
				}
			}
			h=h/3;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,2,4,1,3,8,3,-1,7};
		sort(a);
		SortUtil.print(a);
	}

}
