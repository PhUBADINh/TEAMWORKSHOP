import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TeamB {
    public static void main(String[] args) {
        String inputFile = "Textfile.txt";

        try {
            // อ่านข้อมูลจากไฟล์
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String name = reader.readLine().split(":")[1].trim();
            int age = Integer.parseInt(reader.readLine().split(":")[1].trim());
            String grade = reader.readLine().split(":")[1].trim();
            reader.close();

            // แปลงอายุเป็นปีพุทธศักราช
            int buddhistEra = convertToBuddhistEra(age);

            // แปลงเกรดเป็นอันดับ
            String rank = convertToRank(grade);

            // แสดงผลลัพธ์บน CMD
            System.out.println("Name : " + name);
            System.out.println("Buddhist Era : " + buddhistEra);
            System.out.println("Software Testing Rank : " + rank);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // แปลงอายุเป็นปีพุทธศักราช
    public static int convertToBuddhistEra(int age) {
        int currentYear = 2024;
        int birthYear = currentYear - age;
        return birthYear + 543; // เพิ่ม 543 ปีเพื่อแปลงเป็นปีพุทธศักราช
    }

    // แปลงเกรดเป็นอันดับ
    public static String convertToRank(String grade) {
        switch (grade) {
            case "A":
                return "High Distinction";
            case "B+":
                return "Distinction";
            case "B":
                return "Distinction";
            case "C+":
                return "Good";
            case "C":
                return "Good";
            case "D+":
                return "Normal";
            case "D":
                return "Normal";
            default:
                return "Failed";
        }
    }
}
