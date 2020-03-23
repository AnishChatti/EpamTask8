package epam.TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveChar_ATest {
/*TODO List
 * ABCD=>BCD	
 * AACD=>CD
 *BACD=>BCD 
 * BBAA=>BBAA
 * AABAA=>BAA
 * A=>""
 * ""=>""
 * AA=>""
 */
	RemoveChar_A removechara;
@BeforeEach
void setup()
{
	removechara =new RemoveChar_A();
}
	
	@Test
	void testSingle_A_AtIndex1() 
	{	
			assertEquals("BCD", removechara.removea("ABCD"));		
			
	}

	@Test
	void testSingle_A_AtIndex2() 
	{	
				
			assertEquals("BCD", removechara.removea("BACD"));		
	}
	@Test
	void test_A_After2Chars()
	{
		assertEquals("BBAA", removechara.removea("BBAA"));
			
	}

	@Test
	void test_A_AllIndices() 
	{	
			assertEquals("BAA", removechara.removea("AABAA"));	
			assertEquals("CD", removechara.removea("AACD"));	
				
	}
	
	@Test
	void testOnly_A_() 
	{	    assertEquals("", removechara.removea("A"));
			assertEquals("", removechara.removea("AA"));	
			assertEquals("A", removechara.removea("AAA"));
			assertEquals("AA", removechara.removea("AAAA"));	
			assertEquals("AAA", removechara.removea("AAAAA"));
	}
	@Test
	void testEmpty() 
	{	
			assertEquals("", removechara.removea(""));		
				
	}
}
