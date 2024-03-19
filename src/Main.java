import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Main {
    //    Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//    ottieni l'anno
//    ottieni il mese
//    ottieni il giorno
//    ottieni il giorno della settimana
//    Stampa i risultati sulla console
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = date.getYear();
        System.out.println("Year : " + year);

        int month = date.getMonthValue();
        System.out.println("Month : " + month);

        int dayInTheMonth = date.getDayOfMonth();
        System.out.println("Day in the month : " + dayInTheMonth);

        String dayInTheWeek = date.getDayOfWeek().toString();
        System.out.println("Day in the week : " + dayInTheWeek);

    }
}