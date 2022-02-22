package com.problem1019;

public class Main {

	public static void main(String[] args) {
		
		int N;
		int timeSec = 0, timeMin = 0, timeHr = 0, timeAux = 0;
		
		N = 140153;
		
		while(N % 60 != 0){
			N -= 1;
			timeSec += 1;
		}
		
		timeAux = (N/60);
		
		while(timeAux % 60 != 0){
			timeAux -= 1;
			timeMin += 1;
		}

		timeHr = (timeAux/60);
		
		System.out.println( timeHr + ":" + timeMin + ":" + timeSec);
	}
}
