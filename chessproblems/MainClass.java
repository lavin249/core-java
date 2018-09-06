package chessproblems;

import java.util.Scanner;

/**
 * @author Lavin 
 * 		   Chess Championship: Germany is organizing a world level chess
 *         championship. Various players participated in the tournament all over
 *         the world. Each player is assigned a different puzzle to solve
 *         related to chess only. In the final level, they are planning to give
 *         a single puzzle to solve to both of the contestants. Assuming that
 *         the king starts on some square of an infinite chess board. In the
 *         puzzle of chess, the king can move to any neighboring square
 *         horizontally, vertically, or diagonally. In this puzzle, the king
 *         takes one move extra after n number of moves. You have to find that
 *         in how many different squares can the king be after n moves?
 *
 *         TechGig (06.09.2018)
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Moves Played");
		int moves = sc.nextInt();
		long squares = 0;
		for (int i = 1; i <= (moves + 1); i++)
			squares = squares + i * 8;
		if (moves <= 1)
			System.out.print(squares);
		else
			System.out.print(squares + 1);
		sc.close();
	}
}
/**
 * Input Format Your program should read one integer(n) depicting the number of
 * moves taken by the king in the starting position.
 * 
 * Constraints 1 <= n <= 10^3
 * 
 * Output Format Print the total number of different squares king can cover
 * after n moves.
 * 
 * 
 * Sample TestCase 
 * Input 
 *    2 
 * Output 
 *    49
 *    
 *  Logic:  
 * (8 + 16 + 24 + 1(starting point))
 * How do these number come? 
 * Draw chessboard. Keep King in middle and compute
 */