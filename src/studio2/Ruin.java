package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for startAmount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter value for winChance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter value for winLimit: ");
		double winLimit = in.nextDouble();
		System.out.println("Enter value for totalSimulation: ");
		int totalSimulations = in.nextInt();
		int numOfWin = 0;
		int numOfLose = 0;
		for (int simulationDay = 1; simulationDay <= totalSimulations; simulationDay++) {
			while ((startAmount < winLimit) || (startAmount > 0)) {
				double random = Math.random();

				if (random < winChance) {
					startAmount++;
					numOfWin++;
	
				} else {
					startAmount--;
					numOfLose++;
				}
				System.out.println(simulationDay);
				System.out.println(numOfWin + numOfLose);
				if (startAmount >= winLimit)
				{
					System.out.println("success");
				}
				{
				System.out.println(startAmount);
				
			}

		}

	}

	}}
