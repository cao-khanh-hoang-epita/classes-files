package Demo;

import java.io.IOException;
import java.util.List;
import service.PayService;
import Demo.Students;

public class Main {
    public static void main(String[] args) {
        PayService payService = new PayService();

        try {
            // Read data from the CSV file
            List<Students> students = payService.read();

            // Sort students by year
            payService.sortByYear(students);

            // Print the sorted students
            for (Students student : students) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the CSV file: " + e.getMessage());
        }
    }
}
