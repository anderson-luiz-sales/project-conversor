package Projects;

public class convertData {

    public static void main(String[] args) {

        String data = "1982-12-12T00:00:00";

        String year = data.substring(0, 4);
        System.out.println(year);

        String month = data.substring(5, 7);
        System.out.println(month);

        String day = data.substring(8, 10);
        System.out.println(day);

        String formatData = year + "-" + month + "-" + day;
        System.out.println(formatData);
    }

//    private String formatDate(String data) {
//        String day = data.substring(0,4);
//        String month = data.substring(5,7);
//        String year = data.substring(8,10);
//
//        return year + "-" + month + "-" + day;
//    }
}
