import java.util.Scanner;

public class TicTac{
	public static void main(String[] args){
		int[] spots = {0,0,0,
			       0,0,0,
			       0,0,0};

		printBoard(spots);	

	}
	public static void printBoard(int[] spots){
		//this function to take in where the players have gone and 
		//print the board with the proper X's and O's	
		//ex blank board:
		//   |   |
		//-----------
		//   |   |
		//-----------
		//   |   |

		//60 being the number of total spaces
		//in the board, including new lines
		int[] spaces = {0,0,0,1,0,0,0,1,0,0,0,2,
			        3,3,3,3,3,3,3,3,3,3,3,2,
				0,0,0,1,0,0,0,1,0,0,0,2,
				3,3,3,3,3,3,3,3,3,3,3,2,
				0,0,0,1,0,0,0,1,0,0,0,2};

		if(spots[0] == 1){
			spaces[1] = 4;
		}
		if(spots[0] == 2){
			spaces[1] = 5;
		}
		if(spots[1] == 1){
			spaces[5] = 4;
		}
		if(spots[1] == 2){
			spaces[5] = 5;
		}
		if(spots[2] == 1){
			spaces[9] = 4;
		}
		if(spots[2] == 2){
			spaces[9] = 5;
		}
		if(spots[3] == 1){
			spaces[25] = 4;
		}
		if(spots[3] == 2){
			spaces[25] = 5;
		}
		if(spots[4] == 1){
			spaces[29] = 4;
		}
		if(spots[4] == 2){
			spaces[29] = 5;
		}
		if(spots[5] == 1){
			spaces[33] = 4;
		}
		if(spots[5] == 2){
			spaces[33] = 5;
		}
		if(spots[6] == 1){
			spaces[49] = 4;
		}
		if(spots[6] == 2){
			spaces[49] = 5;
		}
		if(spots[7] == 1){
			spaces[53] = 4;
		}
		if(spots[7] == 2){
			spaces[53] = 5;
		}
		if(spots[8] == 1){
			spaces[57] = 4;
		}
		if(spots[8] == 2){
			spaces[57] = 5;
		}

		for(int i = 0; i < spaces.length; i++){
			switch (spaces[i]){
				case 0:
					System.out.print(" ");
					break;
				case 1:
					System.out.print("|");
					break;
				case 2:
					System.out.println();
					break;
				case 3:
					System.out.print("-");
					break;
				case 4:
					System.out.print("X");
					break;
				case 5:
					System.out.print("O");
					break;
				default:
					System.out.println("ERROR");
					break;
			}
		}

	}
}
