package com.kaustubh;

public class IsUnique {

	public static void main(String[] args) {
		String str="Kaustubh";
		IsUnique obj = new IsUnique();
		obj.checkUnique(str);
	}
	public void checkUnique(String str)
	{
		int i,j,res=-1;
		int[] check = new int[str.length()];
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<str.length();j++)
			{
				if(i==j)
					continue;
				if(str.charAt(i)==str.charAt(j))
					res=1;
					break;
			}
		}
		if(res==0)
			System.out.println("unique");
		else
			System.out.println("not unique");
	}
}
