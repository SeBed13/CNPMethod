import java.sql.SQLOutput;
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
    if(twoNumbers == 01){
        System.out.println("County: Alba");
    } else if (twoNumbers == 02) {
        System.out.println("County: Arad");
    } else if (twoNumbers == 03) {
        System.out.println("County: Arges");
    } else if (twoNumbers == 04) {
        System.out.println("County: Bacau");
    } else if (twoNumbers == 05) {
        System.out.println("County: Bihor");
    } else if (twoNumbers == 06) {
        System.out.println("County: Bistrita-Nasaud");
    } else if (twoNumbers == 07) {
        System.out.println("County: Botosani");
    } else if (twoNumbers == 8) {
        System.out.println("County: Brasov");
    } else if (twoNumbers == 9) {
        System.out.println("County: Braila");
    }else if (twoNumbers == 10) {
        System.out.println("County: Buzau");
    } else if (twoNumbers == 11) {
        System.out.println("County: Caras-Severin");
    } else if (twoNumbers == 12) {
        System.out.println("County: Cluj");
    } else if (twoNumbers == 13) {
        System.out.println("County: Constanta");
    } else if (twoNumbers == 14) {
        System.out.println("County: Covasna");
    } else if (twoNumbers == 15) {
        System.out.println("County: Dambovita");
    } else if (twoNumbers == 16) {
        System.out.println("County: Dolj");
    } else if (twoNumbers == 17) {
        System.out.println("County: Galati");
    } else if (twoNumbers == 18) {
        System.out.println("County: Gorj");
    } else if (twoNumbers == 19){
        System.out.println("County: Harghita");
    } else if (twoNumbers == 20) {
        System.out.println("County: Hunedoara");
    } else if (twoNumbers == 21) {
        System.out.println("County: Ialomita");
    } else if (twoNumbers == 22) {
        System.out.println("County: Iasi");
    } else if (twoNumbers == 23) {
        System.out.println("County: Ilfov");
    } else if (twoNumbers == 24) {
        System.out.println("County: Maramures");
    } else if (twoNumbers == 25) {
        System.out.println("County: Mehedinti");
    } else if (twoNumbers == 26) {
        System.out.println("County: Mures");
    } else if (twoNumbers == 27) {
        System.out.println("County: Neamt");
    } else if (twoNumbers == 28) {
        System.out.println("County: Olt");
    } else if (twoNumbers == 29) {
        System.out.println("County: Prahova");
    } else if (twoNumbers == 30) {
        System.out.println("County: Satu Mare");
    } else if (twoNumbers == 31) {
        System.out.println("County: Salaj");
    } else if (twoNumbers == 32) {
        System.out.println("County: Sibiu");
    } else if (twoNumbers == 33) {
        System.out.println("County: Suceava");
    } else if (twoNumbers == 34) {
        System.out.println("County: Teleorman");
    } else if (twoNumbers == 35) {
        System.out.println("County: Timis");
    } else if (twoNumbers == 36) {
        System.out.println("County: Tulcea");
    } else if (twoNumbers == 37) {
        System.out.println("County: Vaslui");
    } else if (twoNumbers == 38) {
        System.out.println("County: Valcea");
    } else if (twoNumbers == 39) {
        System.out.println("County: Vrancea");
    } else if (twoNumbers == 40) {
        System.out.println("County: Bucuresti");
    } else if (twoNumbers == 41) {
        System.out.println("County: Bucuresti - Sector 1");
    } else if (twoNumbers == 42) {
        System.out.println("County: Bucuresti - Sector 2");
    } else if (twoNumbers == 43) {
        System.out.println("County: Bucuresti - Sector 3");
    } else if (twoNumbers == 44) {
        System.out.println("County: Bucuresti - Sector 4");
    } else if (twoNumbers == 45) {
        System.out.println("County: Bucuresti - Sector 5");
    } else if (twoNumbers == 46) {
        System.out.println("County: Bucuresti - Sector 6");
    } else if (twoNumbers == 51) {
        System.out.println("County: Calarasi");
    } else if (twoNumbers == 52) {
        System.out.println("County: Giurgiu");
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
        System.out.println("Current day is:" + currentDate);
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
    public static String genderByCNP(String socialNumber){
        char firstCharacter = socialNumber.charAt(0);
        String sex;
        if (firstCharacter == '1' || firstCharacter == '3' || firstCharacter == '5' || firstCharacter == '7') {
            sex = "Male";
        } else if (firstCharacter == '2' || firstCharacter == '4' || firstCharacter == '6' || firstCharacter == '8') {
            sex = "Female";
        } else {
            sex = "Alien";
        }
        return sex;
    }
    public static void main(String[] args) {
       String socialNumber = "1960320086324";
        isCNPValid(socialNumber.length());
        System.out.println("CNP:" + socialNumber);
        System.out.println("Sex: " + genderByCNP(socialNumber));
        String county = countyOfBirth(Integer.parseInt(socialNumber.substring(7, 9)));
        System.out.println("Date of birth: " + getBirthDateFromCNPAsString(socialNumber));

        System.out.println("Current age is: " + age(socialNumber) + " years old.");




         }



}





