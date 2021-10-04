package no.hvl.dat100.lab6.matriser;

import static javax.swing.JOptionPane.*;

import java.util.Arrays;

import static java.lang.Integer.*;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		 for (int[] row : matrise) { 
	         for (int x : row) {
	            System.out.print(matrise[i][x] + " ");
	         }
	         System.out.println(); 
	      }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String str = "";
		for (int r[] : matrise) {
			for (int i : r) {
				str+= i + " ";
			}
			str += "\n";
		}
		return str;

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
			int[] lengde = matrise [0];
		for (int i = 0; i < matrise.length ; i++) {
			for (int k = 0 ; k< lengde.length; k++) {
				matrise [i][k] = (matrise [i][k])*tall;
			}
		}
		return matrise;
		
	}

	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean el = false;
		if (a.length!=b.length) {return el;}
		int [] lengde1 = a[0];
		int [] lengde2 = b[0];
		if (lengde1.length!=lengde2.length) {return el;}
		el = true;

		for (int i = 0 ; i < a.length ; i++) {
			for (int k = 0 ; k < lengde1.length; k++) {
				if (a[i][k]!=b[i][k]) {
					el=false;
				}
			}
		}
		
		return sjekk;
	}
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
