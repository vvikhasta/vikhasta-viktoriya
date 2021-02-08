package WeekDays;
import java.util.Scanner;

public class WeekDayHomeTask {
    public static void main(String[] args) {
        boolean endType = false;
        WeekDay inputDay = WeekDay.MONDAY;


        Scanner in = new Scanner(System.in);
        System.out.println("Let us begin...");

        while (!endType) {
            System.out.print("  Input any day of the week to see next day or end to exit: ");

            boolean validInput;
            do {

                String inDay = in.nextLine().toLowerCase();
                validInput = true;
                switch (inDay) {
                    case "monday": inputDay = WeekDay.MONDAY; break;
                    case "tuesday": inputDay = WeekDay.TUESDAY; break;
                    case "wednesday": inputDay = WeekDay.WEDNESDAY; break;
                    case "thursday": inputDay = WeekDay.THURSDAY; break;
                    case "friday": inputDay = WeekDay.FRIDAY; break;
                    case "saturday": inputDay = WeekDay.SATURDAY; break;
                    case "sunday": inputDay = WeekDay.SUNDAY; break;
                    case "end": inputDay = WeekDay.END; break;


                    default:
                        System.out.println("  Invalid input, try again...");
                        System.out.print("  Input any day of the week to see next day or end to exit: ");
                        validInput = false;
                }
            } while (!validInput);



                // Check result
                if (inputDay == WeekDay.MONDAY) {
                    System.out.println("Next day is Tuesday");

                } else if (inputDay == WeekDay.TUESDAY) {
                    System.out.println("Next day is Wednesday");

                } else if (inputDay == WeekDay.WEDNESDAY) {
                    System.out.println("Next day is Thursday");

                } else if (inputDay == WeekDay.THURSDAY) {
                    System.out.println("Next day is Friday");

                } else if (inputDay == WeekDay.FRIDAY) {
                    System.out.println("Next day is Saturday");

                } else if (inputDay == WeekDay.SATURDAY) {
                    System.out.println("Next day is Sunday");

                } else if (inputDay == WeekDay.SUNDAY) {
                    System.out.println("Next day is Monday");

                }
                else if (inputDay == WeekDay.END) {
                    System.out.println("  Bye!");
                    endType = true;
                }
            }
        }

    }
