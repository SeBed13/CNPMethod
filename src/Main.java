import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static boolean isCNPValid(int length){
        boolean flag = true;
        if (length != 13) {
            flag = false;
        }
        return flag;
    }
    public static String getBirthDateFromCNPAsString(String socialNumber){
        String dateOfBirth = socialNumber.substring(1, 7);
        String prefix = getYearPrefix(socialNumber.charAt(0));
        dateOfBirth = prefix + dateOfBirth;
        return dateOfBirth.substring(6, 8) + "-" + dateOfBirth.substring(4, 6) + "-" + dateOfBirth.substring(0, 4);
    }
    public static String[] formatDateAsString(String date){
        String[] formattedDate = date.split("-");
        return formattedDate;
    }

    public static String getYearPrefix(char firstNumber){
        String prefix = "";
        switch (firstNumber){
            case '1':
                prefix = "19";
                break;
            case '2':
                prefix = "19";
                break;
            case '3':
                prefix = "18";
                break;
            case '4':
                prefix = "18";
                break;
            case '5':
                prefix = "20";
                break;
            case '6':
                prefix = "20";
    break;
            default:
                prefix = "INVALID";
    break;
        }
        return prefix;
    }
    public static String countyOfBirth(int twoNumbers){
        String county = "";
    if(twoNumbers == 1){
        System.out.println("Alba");
    } else if (twoNumbers == 02) {
        System.out.println("Arad");
    } else if (twoNumbers == 03) {
        System.out.println("Arges");
    } else if (twoNumbers == 04) {
        System.out.println("Bacau");
    } else if (twoNumbers == 05) {
        System.out.println("Bihor");
    } else if (twoNumbers == 06) {
        System.out.println("Bistrita-Nasaud");
    } else if (twoNumbers == 07) {
        System.out.println("Botosani");
    } else if (twoNumbers == 8) {
        System.out.println("Brasov");
    } else if (twoNumbers == 9) {
        System.out.println("Braila");
    }else if (twoNumbers == 10) {
        System.out.println("Buzau");
    } else if (twoNumbers == 11) {
        System.out.println("Caras-Severin");
    } else if (twoNumbers == 12) {
        System.out.println("Cluj");
    } else if (twoNumbers == 13) {
        System.out.println("Constanta");
    } else if (twoNumbers == 14) {
        System.out.println("Covasna");
    } else if (twoNumbers == 15) {
        System.out.println("Dambovita");
    } else if (twoNumbers == 16) {
        System.out.println("Dolj");
    } else if (twoNumbers == 17) {
        System.out.println("Galati");
    } else if (twoNumbers == 18) {
        System.out.println("Gorj");
    } else if (twoNumbers == 19){
        System.out.println("Harghita");
    } else if (twoNumbers == 20) {
        System.out.println("Hunedoara");
    } else if (twoNumbers == 21) {
        System.out.println("Ialomita");
    } else if (twoNumbers == 22) {
        System.out.println("Iasi");
    } else if (twoNumbers == 23) {
        System.out.println("Ilfov");
    } else if (twoNumbers == 24) {
        System.out.println("Maramures");
    } else if (twoNumbers == 25) {
        System.out.println("Mehedinti");
    } else if (twoNumbers == 26) {
        System.out.println("Mures");
    } else if (twoNumbers == 27) {
        System.out.println("Neamt");
    } else if (twoNumbers == 28) {
        System.out.println("Olt");
    } else if (twoNumbers == 29) {
        System.out.println("Prahova");
    } else if (twoNumbers == 30) {
        System.out.println("Satu Mare");
    } else if (twoNumbers == 31) {
        System.out.println("Salaj");
    } else if (twoNumbers == 32) {
        System.out.println("Sibiu");
    } else if (twoNumbers == 33) {
        System.out.println("Suceava");
    } else if (twoNumbers == 34) {
        System.out.println("Teleorman");
    } else if (twoNumbers == 35) {
        System.out.println("Timis");
    } else if (twoNumbers == 36) {
        System.out.println("Tulcea");
    } else if (twoNumbers == 37) {
        System.out.println("Vaslui");
    } else if (twoNumbers == 38) {
        System.out.println("Valcea");
    } else if (twoNumbers == 39) {
        System.out.println("Vrancea");
    } else if (twoNumbers == 40) {
        System.out.println("Bucuresti");
    } else if (twoNumbers == 41) {
        System.out.println("Bucuresti - Sector 1");
    } else if (twoNumbers == 42) {
        System.out.println("Bucuresti - Sector 2");
    } else if (twoNumbers == 43) {
        System.out.println("Bucuresti - Sector 3");
    } else if (twoNumbers == 44) {
        System.out.println("Bucuresti - Sector 4");
    } else if (twoNumbers == 45) {
        System.out.println("Bucuresti - Sector 5");
    } else if (twoNumbers == 46) {
        System.out.println("Bucuresti - Sector 6");
    } else if (twoNumbers == 51) {
        System.out.println("Calarasi");
    } else if (twoNumbers == 52) {
        System.out.println("Giurgiu");
    }
        return county;
    }
    public static int age(String socialNumber){
        String[] birthDateFormatted = formatDateAsString(getBirthDateFromCNPAsString(socialNumber));

        int dayOfBirth = Integer.parseInt(birthDateFormatted[0]);
        int monthOfBirth = Integer.parseInt(birthDateFormatted[1]);
        int yearOfBirth = Integer.parseInt(birthDateFormatted[2]);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();

        String currentDate = format.format(date);
        System.out.println(currentDate);
        String[] currentDateFormatted = formatDateAsString(currentDate);

        int currentDay = Integer.parseInt(currentDateFormatted[0]);
        int currentMonth = Integer.parseInt(currentDateFormatted[1]);
        int currentYear = Integer.parseInt(currentDateFormatted[2]);

        int age = currentYear - yearOfBirth;
        if (monthOfBirth > currentMonth) {
            age -= 1;
        } else if (monthOfBirth == currentMonth) {
            if (dayOfBirth > currentDay) {
                age -= 1;
            }
        }
        return age;
    }

    public static void main(String[] args) {
       String socialNumber = "1700704372247";
        System.out.println(isCNPValid(socialNumber.length()));
        char sex = socialNumber.charAt(0);
        if (sex == '1' || sex == '3' || sex == '5' || sex == '7') {
            System.out.println("Male");
        } else if (sex == '2' || sex == '4' || sex == '6' || sex == '8') {
            System.out.println("Female");
        } else {
            System.out.println("Alien");
        }
        String county = countyOfBirth(Integer.parseInt(socialNumber.substring(7, 9)));
        System.out.println(getBirthDateFromCNPAsString(socialNumber));

        System.out.println("Current age is: " + age(socialNumber) + " years old.");




         }



}





