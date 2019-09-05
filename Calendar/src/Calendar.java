public class Calendar {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        String mnth = "";
        int m = 0;
        int d = 1;
        int y = 0;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        System.out.println(d0);

        switch (month) {
            case 1:
                mnth = "January";
                m = 31;
                break;
            case 2:
                mnth = "February";
                m = 28;
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    m = 29;
                }
                break;
            case 3:
                mnth = "March";
                m = 31;
                break;
            case 4:
                mnth = "April";
                m = 30;
                break;
            case 5:
                mnth = "May";
                m = 31;
                break;
            case 6:
                mnth = "June";
                m = 30;
                break;
            case 7:
                mnth = "July";
                m = 31;
                break;
            case 8:
                mnth = "August";
                m = 31;
                break;
            case 9:
                mnth = "September";
                m = 30;
                break;
            case 10:
                mnth = "October";
                m = 31;
                break;
            case 11:
                mnth = "November";
                m = 30;
                break;
            case 12:
                mnth = "December";
                m = 31;
                break;
        }

        System.out.println("---------------------");
        System.out.println("    " + mnth + " " + year);
        System.out.println("---------------------");
        System.out.println(" Su Mo Tu We Th Fr Sa");

        if (d0 % 7 >= 0){
             if (d0 == 1) {
                System.out.print("   ");
            } else if (d0%7 == 2) {
                System.out.print("      ");
            } else if (d0%7 == 3) {
                System.out.print("         ");
            } else if (d0%7 == 4) {
                System.out.print("            ");
            } else if (d0%7 == 5) {
                System.out.print("               ");
            } else if (d0%7 == 6) {
                System.out.print("                  ");
            }
        }
        for(int i = 1; i <= m; i++) {
            if( i < 10){
                System.out.print("  "+i);
            }
            else{
                System.out.print(" "+i);
            }
            if((d0 + i)%7==0)
            {
                System.out.print("\n");
            }
        }
        if((d0 + m)%7==0){
            System.out.println("---------------------");
        }
        else{
            System.out.println("\n---------------------");
        }
}
}




