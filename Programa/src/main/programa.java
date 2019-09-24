package main;

import java.io.*;
import java.util.*;

public class programa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in); //Inicia el scanner
		
		int [] valors = new int [5];
		int petit = 0;
		
		for(int i = 0; i <=4;i++) {
			valors[i]=lector.nextInt();;
		}
		
		for(int i = 0; i <=valors.length-1;i++) {
			if(petit<valors[i])petit=valors[i];
		}
		
		System.out.println(petit);
	
	}
}
