import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so can doc: ");
        int number = scanner.nextInt();

        // 0 - 9
        if (number >= 0 && number < 10) {

            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            // 10 - 19
        } else if (number >= 10 && number < 20) {

            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }

            // 20 - 99
        } else if (number >= 20 && number < 100) {

            int tens = number / 10;
            int ones = number % 10;

            switch (tens) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }

            switch (ones) {
                case 1:
                    System.out.print(" One");
                    break;
                case 2:
                    System.out.print(" Two");
                    break;
                case 3:
                    System.out.print(" Three");
                    break;
                case 4:
                    System.out.print(" Four");
                    break;
                case 5:
                    System.out.print(" Five");
                    break;
                case 6:
                    System.out.print(" Six");
                    break;
                case 7:
                    System.out.print(" Seven");
                    break;
                case 8:
                    System.out.print(" Eight");
                    break;
                case 9:
                    System.out.print(" Nine");
                    break;
            }

            // 100 - 999
        } else if (number >= 100 && number <= 999) {

            int hundreds = number / 100;
            int remainder = number % 100;

            // Đọc hàng trăm
            switch (hundreds) {
                case 1:
                    System.out.print("One Hundred");
                    break;
                case 2:
                    System.out.print("Two Hundred");
                    break;
                case 3:
                    System.out.print("Three Hundred");
                    break;
                case 4:
                    System.out.print("Four Hundred");
                    break;
                case 5:
                    System.out.print("Five Hundred");
                    break;
                case 6:
                    System.out.print("Six Hundred");
                    break;
                case 7:
                    System.out.print("Seven Hundred");
                    break;
                case 8:
                    System.out.print("Eight Hundred");
                    break;
                case 9:
                    System.out.print("Nine Hundred");
                    break;
            }

            // Nếu còn phần sau hàng trăm
            if (remainder > 0) {
                System.out.print(" and ");
            }

            // Đọc phần còn lại: 1 - 19
            if (remainder >= 1 && remainder < 20) {

                switch (remainder) {
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                    case 10:
                        System.out.print("Ten");
                        break;
                    case 11:
                        System.out.print("Eleven");
                        break;
                    case 12:
                        System.out.print("Twelve");
                        break;
                    case 13:
                        System.out.print("Thirteen");
                        break;
                    case 14:
                        System.out.print("Fourteen");
                        break;
                    case 15:
                        System.out.print("Fifteen");
                        break;
                    case 16:
                        System.out.print("Sixteen");
                        break;
                    case 17:
                        System.out.print("Seventeen");
                        break;
                    case 18:
                        System.out.print("Eighteen");
                        break;
                    case 19:
                        System.out.print("Nineteen");
                        break;
                }

                // Đọc phần còn lại: 20 - 99
            } else if (remainder >= 20) {

                int tens = remainder / 10;
                int ones = remainder % 10;

                switch (tens) {
                    case 2:
                        System.out.print("Twenty");
                        break;
                    case 3:
                        System.out.print("Thirty");
                        break;
                    case 4:
                        System.out.print("Forty");
                        break;
                    case 5:
                        System.out.print("Fifty");
                        break;
                    case 6:
                        System.out.print("Sixty");
                        break;
                    case 7:
                        System.out.print("Seventy");
                        break;
                    case 8:
                        System.out.print("Eighty");
                        break;
                    case 9:
                        System.out.print("Ninety");
                        break;
                }

                switch (ones) {
                    case 1:
                        System.out.print(" One");
                        break;
                    case 2:
                        System.out.print(" Two");
                        break;
                    case 3:
                        System.out.print(" Three");
                        break;
                    case 4:
                        System.out.print(" Four");
                        break;
                    case 5:
                        System.out.print(" Five");
                        break;
                    case 6:
                        System.out.print(" Six");
                        break;
                    case 7:
                        System.out.print(" Seven");
                        break;
                    case 8:
                        System.out.print(" Eight");
                        break;
                    case 9:
                        System.out.print(" Nine");
                        break;
                }
            }

            // Số âm hoặc lớn hơn 999
        } else {
            System.out.println("Out of ability");
        }

        scanner.close();
    }
}
