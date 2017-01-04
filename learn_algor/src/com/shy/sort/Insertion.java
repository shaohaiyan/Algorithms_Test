package com.shy.sort;
/**
 * 插入排序
 * @author SHY
 *
 */
public class Insertion {

	public static void sort(int[] a){
		if(a==null||a.length==0){
			return ;
		}
		for(int i=1;i<a.length;i++){
			//将元素a[i],插入到已经排序好的a[i-1],a[i-2],...,a[0]中
			for(int j=i;j>0&&SortUtil.less(a[j], a[j-1]);j--){
				//如果a[j]小于a[j-1]那么就交换这两个元素，使之升序
				SortUtil.exchang(a, j, j-1);
			}
		}
	}
	/**
	 * 改进后的，在内层循环的时候，不直接交换
	 * @param a
	 */
	public static void sort2(int[] a){
		if(a==null||a.length==0){
			return ;
		}
		for(int i=1;i<a.length;i++){
			//将元素a[i],插入到已经排序好的a[i-1],a[i-2],...,a[0]中
			int v=a[i];
			int j=i;
			for(;j>0&&SortUtil.less(v, a[j-1]);j--){
				a[j]=a[j-1];
			}
			a[j]=v;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,2,4,1,3,8,3,-1,7};
		sort2(a);
		SortUtil.print(a);
	}

}
