package util;

import java.time.LocalDate;
import java.util.Date;

import com.datastax.driver.core.Row;
import com.datastax.driver.core.UDTValue;

public class UtilierUDT
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

	@SuppressWarnings("deprecation")
	private boolean isDataValid(Row enderecoLocal)
	{
		LocalDate localDateHoje = LocalDate.now();
		Date dataHoje = new Date(localDateHoje.getYear() - 1900, localDateHoje.getMonthValue() - 1,
				localDateHoje.getDayOfMonth());

		UDTValue dataInicioSelected = enderecoLocal.getUDTValue(0);
		int diaInicio = dataInicioSelected.getInt(0);
		int mesInicio = dataInicioSelected.getInt(1);
		int anoInicio = dataInicioSelected.getInt(2);

		UDTValue dataFimSelected = enderecoLocal.getUDTValue(1);
		int diaFim;
		int mesFim;
		int anoFim;
		Date dataFim;

		if (dataFimSelected == null)
			dataFim = null;
		else
		{
			diaFim = dataFimSelected.getInt(0);
			mesFim = dataFimSelected.getInt(1);
			anoFim = dataFimSelected.getInt(2);
			dataFim = new Date(anoFim - 1900, mesFim - 1, diaFim);
		}

		Date dataInicio = new Date(anoInicio - 1900, mesInicio - 1, diaInicio);

		if (dataInicio.compareTo(dataHoje) <= 0 && (dataFim == null || dataFim.compareTo(dataHoje) >= 0))
			return true;
		return false;
	}
}
