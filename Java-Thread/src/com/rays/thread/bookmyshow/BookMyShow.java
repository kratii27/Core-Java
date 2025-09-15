package com.rays.thread.bookmyshow;

import java.util.HashSet;
import java.util.Set;

public class BookMyShow {
	
	Set<Integer> bookedTickets = new HashSet<>();
	
	public synchronized void bookTicket(String name, int seat) {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		bookedTickets.add(0);
		
		if (!bookedTickets.contains(seat)) {
			System.out.println("seat no:  " + seat + " booked for: " + name);
			bookedTickets.add(seat);
		} else {
			System.out.println("dear, " + name+ " seat is already booked");
		}
	}
	
	
	
//	public int bookedSeats = -1;
//	public synchronized void bookTicket(String name, int seat) {
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if (bookedSeats == -1) {
//			bookedSeats = seat;
//			System.out.println("seat no:  " + seat + " booked for: " + name);
//			
//		} else if (bookedSeats == seat) {
//			System.out.println("dear, " + name+ " seat is already booked");
//			
//		} else {
//			System.out.println("seat no:  " + seat + " booked for: " + name);
//			bookedSeats = seat;
//		}
//	}

}
