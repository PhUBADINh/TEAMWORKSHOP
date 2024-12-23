import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamATest {

    @Test
    public void testConvertToBuddhistEra() {
        
        assertEquals(2547, TeamB.convertToBuddhistEra(20)); 
        assertEquals(2541, TeamB.convertToBuddhistEra(26)); 
    }

    @Test
    public void testConvertToRank() {
        
        assertEquals("High Distinction", TeamB.convertToRank("A")); 
        assertEquals("Distinction", TeamB.convertToRank("B+"));    
        assertEquals("Distinction", TeamB.convertToRank("B"));     
        assertEquals("Good", TeamB.convertToRank("C+"));           
        assertEquals("Good", TeamB.convertToRank("C"));            
        assertEquals("Normal", TeamB.convertToRank("D+"));         
        assertEquals("Normal", TeamB.convertToRank("D"));          
        assertEquals("Failed", TeamB.convertToRank("F"));          
    }
}
