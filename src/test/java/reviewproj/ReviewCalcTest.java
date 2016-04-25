package reviewproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReviewCalcTest {

	@Test
	public void testAdd() {
		CalcReview r = new CalcReview();
		r.add(10,  20);
		assertEquals(30, r.getResult());	
	}

	@Test
	public void testSub(){
		CalcReview r=new CalcReview();
		r.sub(10, 20);
		assertEquals(-10,r.getResult());
	}
}
