import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calGradeTest {

    @Test
    public void testCalculateAge() {
        calGrade tester = new calGrade();
        assertEquals(26, tester.calculateAge(1998)); // Expected age for someone born in 1998
        assertEquals(20, tester.calculateAge(2004)); // Expected age for someone born in 2004
    }

    @Test
    public void testCalculateGrade() {
        calGrade tester = new calGrade();
        assertEquals("A", tester.calculateGrade(85));  // Score 85 should return grade A
        assertEquals("B+", tester.calculateGrade(75)); // Score 75 should return grade B+
        assertEquals("B", tester.calculateGrade(70));  // Score 70 should return grade B
        assertEquals("C+", tester.calculateGrade(65)); // Score 65 should return grade C+
        assertEquals("C", tester.calculateGrade(60));  // Score 60 should return grade C
        assertEquals("D+", tester.calculateGrade(55)); // Score 55 should return grade D+
        assertEquals("D", tester.calculateGrade(50));  // Score 50 should return grade D
        assertEquals("F", tester.calculateGrade(45));  // Score 45 should return grade F
    }
}
