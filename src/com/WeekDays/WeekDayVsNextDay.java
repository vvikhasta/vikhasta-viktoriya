package WeekDays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class WeekDayVsNextDay {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Please input day: ");
            String day = in.nextLine();
            A a = new A();
            a.printDay(day);

        }
    }

     abstract class Days {
        abstract void printDay(String day);
    }

    class A extends Days {
        @Override
        void printDay(String day) {
            day = day.toUpperCase();

            List<String> listDays = new ArrayList<>();
            for (WeekDay days : WeekDay.values()) {
                listDays.add(days.toString());
            }
            if (listDays.contains(day)) {
                int enteredDayId = listDays.indexOf(day);

                if (enteredDayId == 6) {
                    System.out.print("Next day is: " + listDays.get(0));
                } else {
                    System.out.print("Next day is: " + listDays.get(enteredDayId + 1));
                }
            } else {
                System.out.print("Day value is not correct, possible values are: " + listDays);
            }
        }
    }



