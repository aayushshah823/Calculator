import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Aayush Shah
 * @version Frac Calc Project
 */
public class FracCalcTest {

 /**
  * Testing 2 + 2. Note that this test passes in the skeleton code because
  * Fraction.toString() is hard-coded to return "4".
  */
 @Test
 public void testTwoPlusTwo() {
  Fraction result = FracCalc.calculate("2 + 2");
  assertEquals(
    "2 + 2 should equal 4", // message to display if test fails
    "4",                    // "expected" (correct) output
    result.toString()       // actual output
  );
 }
 
 @Test
 public void testOneHalfPlusOneHalf() {
  Fraction result = FracCalc.calculate("1/2 + 1/2");
  assertEquals(
    "1/2 + 1/2 should equal 1", // message to display if test fails
    "1",                        // "expected" (correct) output
    result.toString()           // actual output
  );
  
 }
 
 @Test
 public void testOneAndAHolfPlusOneAndAHalf() {
  Fraction result = FracCalc.calculate("1_1/2 + 1_1/2");
  assertEquals(
    "1_1/2 + 1_1/2 should equal 3", // message to display if test fails
    "3",                            // "expected" (correct) output
    result.toString()               // actual output
  );
  
 }
 
 @Test
 public void test1() {
  Fraction result = FracCalc.calculate("3/8 + 1/5");
  assertEquals(
    "3/8 + 1/5 should equal 23/40", // message to display if test fails
    "23/40",      // "expected" (correct) output
    result.toString()    // actual output
  );
    
 }
 
 @Test
 public void test2() {
  Fraction result = FracCalc.calculate("1/2 + 2/5");
  assertEquals(
    "1/2 + 2/5 should equal 9/10", // message to display if test fails
    "9/10",       // "expected" (correct) output
    result.toString()   // actual output
  );
    
 }
 
 @Test
 public void test3() {
  Fraction result = FracCalc.calculate("3/2 + 5/2");
  assertEquals(
    "3/2 + 5/2 should equal 4",   // message to display if test fails
    "4",      // "expected" (correct) output
    result.toString()   // actual output
  );
    
 }
 
 @Test
 public void test4() {
  Fraction result = FracCalc.calculate("1/4 * 1/10");
  assertEquals(
    "1/4 * 1/10 should equal 1/40", // message to display if test fails
    "1/40",       // "expected" (correct) output
    result.toString()    // actual output
  );
    
 }
 
 @Test
 public void test5() {
  Fraction result = FracCalc.calculate("7/2 * 5/3");
  assertEquals(
    "7/2 * 5/3 should equal 5_5/6", // message to display if test fails
    "5_5/6",      // "expected" (correct) output
    result.toString()    // actual output
  );
    
 }
 
 @Test
 public void test6() {
  Fraction result = FracCalc.calculate("3/7 / 4/9");
  assertEquals(
    "3/7 / 4/9 should equal 27/28", // message to display if test fails
    "27/28",      // "expected" (correct) output
    result.toString()    // actual output
  );
    
 }
 
 @Test
 public void test7() {
  Fraction result = FracCalc.calculate("2_1/4 - 1");
  assertEquals(
    "2_1/4 - 1 should equal 1_1/4", // message to display if test fails
    "1_1/4",      // "expected" (correct) output
    result.toString()    // actual output
  );
    
 }
 
 @Test
 public void test8() {
  Fraction result = FracCalc.calculate("-3/4 + 1_1/2");
  assertEquals(
    "-3/4 + 1_1/2) should equal 3/4", // message to display if test fails
    "3/4",       // "expected" (correct) output
    result.toString()     // actual output
  );
    
 }
 
 @Test
 public void test9() {
  Fraction result = FracCalc.calculate("13/2 + 5/4");
  assertEquals(
    "13/2 + 5/6 should equal 7_3/4", // message to display if test fails
    "7_3/4",      // "expected" (correct) output
    result.toString()    // actual output
  );
    
 }
 
 @Test
 public void test10() {
  Fraction result = FracCalc.calculate("3_3/4 + 1/2");
  assertEquals(
    "3_3/4 + 1/2 should equal 4_1/4", // message to display if test fails
    "4_1/4",       // "expected" (correct) output
    result.toString()    // actual output
  );
    
 }
 

}