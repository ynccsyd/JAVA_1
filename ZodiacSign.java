import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (e.g., April 15): ");
        String date = scanner.nextLine();

        String sign;

        if (date.contains("January") || date.contains("February")) {
            sign = date.contains("January") ? "Capricorn" : "Aquarius";
        } else if (date.contains("March") || date.contains("April")) {
            sign = date.contains("March") ? "Pisces" : "Aries";
        } else if (date.contains("May") || date.contains("June")) {
            sign = date.contains("May") ? "Taurus" : "Gemini";
        } else if (date.contains("July") || date.contains("August")) {
            sign = date.contains("July") ? "Cancer" : "Leo";
        } else if (date.contains("September") || date.contains("October")) {
            sign = date.contains("September") ? "Virgo" : "Libra";
        } else {
            sign = date.contains("October") ? "Scorpio" : "Sagittarius";
        }

        System.out.println("Your zodiac sign is: " + sign);

        scanner.close();
    }
}

/// ******************////////

// import java.util.Scanner;

// public class ZodiacSign {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter your birthdate (e.g., April 15): ");
// String date = scanner.nextLine();

// String[] months = {"January", "February", "March", "April", "May", "June",
// "July", "August", "September", "October", "November", "December"};
// int[] endDayOfMonth = {20, 21, 22, 22, 22, 23, 23, 23, 22, 21, 21, 20};

// String sign = "";
// String month = "";
// int day = 0;

// for (int i = 0; i < months.length; i++) {
// if (date.contains(months[i])) {
// month = months[i];
// day = Integer.parseInt(date.replaceAll("[^0-9]", ""));
// break;
// }
// }

// if (day >= 21 && (month.equals("March") || month.equals("April"))) {
// sign = "Aries";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("April")] &&
// (month.equals("April") || month.equals("May"))) {
// sign = "Taurus";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("May")] &&
// (month.equals("May") || month.equals("June"))) {
// sign = "Gemini";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("June")] &&
// (month.equals("June") || month.equals("July"))) {
// sign = "Cancer";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("July")] &&
// (month.equals("July") || month.equals("August"))) {
// sign = "Leo";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("August")] &&
// (month.equals("August") || month.equals("September"))) {
// sign = "Virgo";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("September")]
// && (month.equals("September") || month.equals("October"))) {
// sign = "Libra";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("October")] &&
// (month.equals("October") || month.equals("November"))) {
// sign = "Scorpio";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("November")] &&
// (month.equals("November") || month.equals("December"))) {
// sign = "Sagittarius";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("December")] &&
// (month.equals("December") || month.equals("January"))) {
// sign = "Capricorn";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("January")] &&
// (month.equals("January") || month.equals("February"))) {
// sign = "Aquarius";
// } else if (day <= endDayOfMonth[Arrays.asList(months).indexOf("February")] &&
// (month.equals("February") || month.equals("March"))) {
// sign = "Pisces";
// } else {
// sign = "Invalid date";
// }

// System.out.println("Your zodiac sign is: " + sign);

// scanner.close();
// }
// }
