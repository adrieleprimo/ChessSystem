package application;

import java.util.Scanner;

import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Board board = new Board (3, 7);
		System.out.println(board);
		
		sc.close();

	}

}
