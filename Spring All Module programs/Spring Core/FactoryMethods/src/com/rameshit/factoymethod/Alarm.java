package com.rameshit.factoymethod;

import java.util.Calendar;

public class Alarm {
	
	private Calendar calendar;
	
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public void ring() {
	System.out.println("Ringing at : " + calendar.getTime());
	}

}
