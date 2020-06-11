public class SwitchDemoFallThrough {

    public static void main(String[] args) {

        int month = 3;
        String monthName = null;

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;

            // Skipped a few months here to fit on slide!

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;
            default:
                break;
        }

        System.out.println("Month Name: " + monthName);

    }
}