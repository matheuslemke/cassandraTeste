package util;

import java.util.Date;

public class UDTConversor
{
	@SuppressWarnings("deprecation")
	public static String toData(Date date)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("{ dia: ");
		sb.append(date.getDay());
		sb.append(", mes: ");
		sb.append(date.getMonth());
		sb.append(", ano: ");
		sb.append(date.getYear());
		sb.append("}");
		return sb.toString();
	}
}
