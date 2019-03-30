package com.bridgelabz.functional;

import java.util.Scanner;

public class TicTacToe {
	public static int row,col;
	public static char[][] board=new char[3][3];
	public static char turn='x';
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]='_';
			}
		}
		play();
	}

	private static void play() {
		boolean playing=true;
		while(playing) {
			System.out.println("Enter row and column  no");
			row=sc.nextInt()-1;
			col=sc.nextInt()-1;
			board[row][col]=turn;
		
			if(gameover(row,col)) {
				playing=false;
				System.out.println("Game  over "+turn+" wins!!!");
			}
			if(turn=='x')
				turn='0';
			else
				turn='x';
		}
		
	}

	private static boolean gameover(int rmove, int cmove) {
		//for row ,col check
		if(board[0][cmove]==board[1][cmove] && board[0][cmove]==board[2][cmove])
			return true;
		if(board[rmove][0]==board[rmove][1] && board[rmove][0]==board[rmove][2])
			return true;
		//for diagonal check
		if(board[0][0]==board[1][1] && board[0][0]==board[2][2]&&board[1][1]!='_')
			return true;
		if(board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[1][1]!='_')
			return true;
		return false;
	}


	
}
