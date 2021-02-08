package WeekDays;
import java.util.Scanner;

class WeekDayAbstractOverride {

        public static void main(String[] args) {
            while(true) {
                Scanner in = new Scanner(System.in);
                System.out.print("Please input day(input 0 for break): ");
                String day = in.nextLine();
                if(day.equals("0")){break;}
                day = day.toUpperCase();
                switch (day) {
                    case "MONDAY":
                        Day.MONDAY.printNext();
                        break;
                    case "TUESDAY":
                        Day.TUESDAY.printNext();
                        break;
                    case "WEDNESDAY":
                        Day.WEDNESDAY.printNext();
                        break;
                    case "THURSDAY":
                        Day.THURSDAY.printNext();
                        break;
                    case "FRIDAY":
                        Day.FRIDAY.printNext();
                        break;
                    case "SATURDAY":
                        Day.SATURDAY.printNext();
                        break;
                    case "SUNDAY":
                        Day.SUNDAY.printNext();
                        break;
                    default: System.out.print("Please enter correct value\n");
                        break;
                }
            }
        }
    }

    enum Day {
        MONDAY {
            @Override
            void printNext() {
                System.out.println(Day.valueOf(TUESDAY.toString()));
            }
        },
        TUESDAY {
            @Override
            void printNext() {
                System.out.println(Day.valueOf(WEDNESDAY.toString()));
            }
        },
        WEDNESDAY {
            @Override
            void printNext() {
                System.out.println(Day.valueOf(THURSDAY.toString()));
            }
        },
        THURSDAY {
            @Override
            void printNext() {
                System.out.println(Day.valueOf(FRIDAY.toString()));
            }
        },
        FRIDAY {
            @Override
            void printNext() {
                System.out.println(Day.valueOf(SATURDAY.toString()));
            }
        },
        SATURDAY {
            @Override
            void printNext() {
                System.out.println(Day.valueOf(SUNDAY.toString()));
            }
        },
        SUNDAY {
            @Override
            void printNext() {
                System.out.println(Day.valueOf(MONDAY.toString()));
            }
        };

        abstract void printNext();
    };



