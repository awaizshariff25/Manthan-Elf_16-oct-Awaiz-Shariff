package com.manthan.array.test;

public class TestA {
	public static void main(String[] args) {
		int[] a=new int[4];
		a[0]=24;
		a[1]=10;
		a[2]=16;
		a[3]=4;
		System.out.println("---------Int------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
			
			System.out.println("---------char------------");
			char[] b=new char[5];
			b[0]='a';
			b[1]='p';
			b[2]='p';
			b[3]='l';
			b[4]='e';
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[j]);
			}
			System.out.println("---------double------------");
			double[] c=new double[5];
			c[0]=5.6;
			c[1]=2.4;
			c[2]=9.2;
			c[3]=3.4;
			c[4]=4.1;
			for (int j = 0; j < c.length; j++) {
				System.out.println(c[j]);
			}
			
			System.out.println("---------string------------");
			String[] d=new String[4];
			d[0]="dimple";
			d[1]="chinnu";
			d[2]="raju";
			d[3]="priya";
			
			for (int j = 0; j < d.length; j++) {
				System.out.println(d[j]);
			}
			
		
	}
}
