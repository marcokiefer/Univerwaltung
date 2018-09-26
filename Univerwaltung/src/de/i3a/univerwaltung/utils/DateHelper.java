package de.i3a.univerwaltung.utils;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateHelper {
		
	public static final Date parseDate(final String wert, final String datumFormaPattern) {
			DateFormat format = new SimpleDateFormat(datumFormaPattern);
			try {
				return format.parse(wert);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return null;
		}
}

