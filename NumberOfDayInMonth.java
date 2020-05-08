public class NumberOfDayInMonth {
    public static void main(String[] args){
        System.out.println(GetDaysInMonth(1, -2020));

    }
    public static boolean isLeapYear (int Year) {
        if (Year <= 0)  {
            System.out.println("Not 1");
            return false;
        }
        if (Year >= 9999) {
            System.out.println("Not 2");
            return false;
        }
        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.println("yeas ");
                    return true;
                }
            }
            else {
                System.out.println("yeas ");
                return true;
            }

        }
        else System.out.print(Year);
        return false;

    }

    public static int GetDaysInMonth(int month, int year){
        if ((month < 1) | (month > 12)) return -1;
        if ((year < 1) | (year > 9999)) return -1;
        if (isLeapYear(year) == true) {
           if (month == 2) return 29;
        }
        if ((month == 1) | (month == 3) | (month == 5) | (month == 7) | (month == 9) | (month == 11)) return 31;
        if (month == 2) return 28;
        return 30;
    }
}
