package com.adnanAN.pattern;

public class B {

	public static void main(String[] args) {
		int j,i;
		
		for(i=1;i<=5;i++)
		{
			if(i==1 || i==5)
			{
				for(j=0;j<5;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				for(j=1;j<=5;j++)
				{
					if(j==1 || j==5){
						System.out.print("*\t");
					}
				}
				System.out.println();
			}
				
		}

	}

}
