package sef.module4.activity;

import java.util.Date;

public class DateActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		int year = d.getYear()+1900;
		System.out.println("Date today is " + "0"  + d.getDate() + "." + "0" + (d.getMonth()+1)+ "." + year);

	}

}
