package com.achyut.thu2;

public class DiceRoll100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int se = 0;
		int ttt = 0;
		Dice d = new Dice();
		
		for(int i = 0; i<=100;i++) {
			d.roll();
			int t = d.getTotal();
			if(t == 7) {
				se++;
			}
			else if(t == 11) {
				se++;
			}
			else if(t == 2) {
				ttt++;
			}
			else if(t == 3) {
				ttt++;
			}
			else if(t == 12) {
				ttt++;
			}
			
				
		}
		
		System.out.println("7 and 11 were rolled " + se + "% of the time\n2, 3, and 12 were rolled " + ttt + "% of the time");
	}

}
