import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class calGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calGrade calculator = new calGrade();

        // รับข้อมูลจากผู้ใช้
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Christian Era (Year): ");
        int year = scanner.nextInt();

        System.out.print("Enter Software Testing Score: ");
        int score = scanner.nextInt();

        // คำนวณอายุและเกรด
        int age = calculator.calculateAge(year);
        String grade = calculator.calculateGrade(score);

        // เขียนผลลัพธ์ลงไฟล์
        String outputPath = "Textfile.txt";
        try {
            FileWriter writer = new FileWriter(outputPath);
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Software Testing Grade: " + grade + "\n");
            writer.close();
            System.out.println("Output written to " + outputPath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // เมธอดคำนวณอายุ
    public int calculateAge(int year) {
        return 2024 - year; // คำนวณอายุจากปีคริสต์ศักราช
    }

    // เมธอดคำนวณเกรดจากคะแนน
    public String calculateGrade(int score) {
        if (score >= 80) return "A";
        else if (score >= 75) return "B+";
        else if (score >= 70) return "B";
        else if (score >= 65) return "C+";
        else if (score >= 60) return "C";
        else if (score >= 55) return "D+";
        else if (score >= 50) return "D";
        else return "F";
    }
}
