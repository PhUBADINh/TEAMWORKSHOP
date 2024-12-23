import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamATest {

    @Test
    public void testConvertToBuddhistEra() {
        // ทดสอบการแปลงอายุเป็นปีพุทธศักราช
        assertEquals(2547, TeamB.convertToBuddhistEra(20)); // อายุ 20 ปี => ปีพุทธศักราช 2547
        assertEquals(2541, TeamB.convertToBuddhistEra(26)); // อายุ 26 ปี => ปีพุทธศักราช 2541
    }

    @Test
    public void testConvertToRank() {
        // ทดสอบการแปลงเกรดเป็นอันดับ
        assertEquals("High Distinction", TeamB.convertToRank("A")); // เกรด A => High Distinction
        assertEquals("Distinction", TeamB.convertToRank("B+"));    // เกรด B+ => Distinction
        assertEquals("Distinction", TeamB.convertToRank("B"));     // เกรด B => Distinction
        assertEquals("Good", TeamB.convertToRank("C+"));           // เกรด C+ => Good
        assertEquals("Good", TeamB.convertToRank("C"));            // เกรด C => Good
        assertEquals("Normal", TeamB.convertToRank("D+"));         // เกรด D+ => Normal
        assertEquals("Normal", TeamB.convertToRank("D"));          // เกรด D => Normal
        assertEquals("Failed", TeamB.convertToRank("F"));          // เกรด F => Failed
    }
}
