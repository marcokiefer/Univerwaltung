package de.i3a.univerwaltung.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateHelper {
	/**
	 * ParameterStyle den übergebenen Wert gemäß dem übergebenen Format-Pattern.
	 * Der Formatter wird auf nicht lenient gesetzt, so dass nur gültige Daten,
	 * nicht aber Datumswerte, wie 29.2.2006 akzeptiert werden.
	 * 
	 * @param wert               zu passender Wert.
	 * @param datumFormatPattern Datums-Format.
	 * @return Datum.
	 * @throws ParseExeption bei Parse-Fehlern.
	 */
	public static final Date parseDate(final String wert, final String datumFormatPattern) {
		DateFormat format = new SimpleDateFormat(datumFormatPattern);
		try {
			return format.parse(wert);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
