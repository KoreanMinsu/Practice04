package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {

		int[] score = new int[6];
		
		for(int x=0; x<score.length; x++) {
			score[x] = (int)(1+Math.random()*6);
			if(x>0) {
				for(int c=0;c<=x-1;c++) {
					if(score[c]==score[x])	{
						x--;
					}
				}
			}
		}
		
		for(int a=0; a<score.length;a++) {
			System.out.print(score[a] + "\t");	
		}
	}
}
