import junit.framework.TestCase;

public class HzjComplexTest extends TestCase {

    HzjComplex c1 = new HzjComplex(1.0,2.0);
    HzjComplex c2 = new HzjComplex(2.0,2.0);
    HzjComplex c3 = new HzjComplex(2.0,0.0);

        public void testComplexAdd() {
            assertEquals("3.0+4.0i", c1.ComplexAdd(c3).toString());
            assertEquals("3.0+2.0i", c1.ComplexAdd(c3).toString());
            assertEquals("4.0+2.0i", c2.ComplexAdd(c3).toString());
        }


        public void testComplexSub() {
            assertEquals("-1.0", c1.ComplexSub(c2).toString());
            assertEquals("-1.0+2.0i", c1.ComplexSub(c3).toString());
            assertEquals("0.0+2.0i", c2.ComplexSub(c3).toString());
        }


        public void testComplexMulti() {
            assertEquals("-2.0+6.0i", c1.ComplexMulti(c2).toString());
            assertEquals("2.0+4.0i", c1.ComplexMulti(c3).toString());
            assertEquals("4.0+4.0i", c2.ComplexMulti(c3).toString());
        }


        public void testComplexComplexDiv() {
            assertEquals("0.75+0.75i", c1.ComplexDiv(c2).toString());
            assertEquals("1.0+0.5i", c1.ComplexDiv(c3).toString());
            assertEquals("1.0+1.0i", c2.ComplexDiv(c3).toString());
        }

        public void testEquals() {
            assertEquals(false,c1.equals(c2));
            assertEquals(false,c1.equals(c3));
            assertEquals(false,c2.equals(c3));
            assertEquals(true,c1.equals(c1));
        }

    }
