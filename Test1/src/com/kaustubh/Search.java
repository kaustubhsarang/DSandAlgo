package com.kaustubh;

public class Search {

	public static void main(String[] args) {
		int a[] = {1,2,4,5,6,8,9};
		int key=4;
		int length=a.length;
		int result;
		Search s = new Search();
		result=s.binarySearch(a,key,0,length-1);
		System.out.println(result);

	}
	public int binarySearch(int[] a, int key,int left,int right)
	{
		int mid=(left+right-1)/2;
		if(left<=right)
		{
		if(key==a[mid])
		{
			return mid;
		}
		if(key<a[mid])
		{
			
			binarySearch(a,key,0,mid-1);
		}
		if(key>a[mid]) {
			binarySearch(a,key,mid+1,right);
		}
		}
		return -1;
	}

}
