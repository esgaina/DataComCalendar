import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss"); //Formato de data e hora.
		Date dt = new Date(); //Adicionar a data e hora atual à variavel dt.
		
		System.out.println(sdf.format(dt));
		
		Calendar cal = Calendar.getInstance(); // Inicializar o objecto Calandar.
		cal.setTime(dt); //Seta a data actual para a variavel cal.
		cal.add(Calendar.HOUR_OF_DAY, 5); //Adiciona 5H à variavel cal que recebeu a data atual da variavel dt.
		cal.add(Calendar.MONTH, 2); /*Adiciona 2 Meses à data atual*/
		dt = cal.getTime(); //dt recebe o conteudo da variavel cal. Que é 2 meses e 5h a mais.
		
		int minutos = cal.get(Calendar.MINUTE); //Recupera o dia.
		int hora = cal.get(Calendar.HOUR); //Recupera a hora.
		int dia = cal.get(Calendar.DAY_OF_MONTH); //Recupera o dia do mês.
		int mes = 1 + cal.get(Calendar.MONTH); //Recopera o mês mas como Janeiro vale 0 como um vector temos que adicionar 1.
		int ano = cal.get(Calendar.YEAR); //Recupera o ano.
		
		System.out.println("Resultado: " + sdf.format(dt));
		System.out.println("Minutos: " + minutos);
		System.out.println("Hora: " + hora);
		System.out.println("Dia: " + dia);
		System.out.println("Mês: " + mes);
		System.out.println("Ano: " + ano);
	}

}
