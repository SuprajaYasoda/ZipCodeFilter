/**
 * 
 */
package com.nisum.zipcode.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nisum.zipcode.filter.CodeRange;
import com.nisum.zipcode.filter.ZIPCodeIntervals;

/**
 * @author kchamarthy
 * @param <CodeRange>
 *
 */
class ZipCodeIntervalsTest {

	public ZIPCodeIntervals zipCodeIntervals;
	
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testZipCodeRangesFalse() {
		
		zipCodeIntervals = new ZIPCodeIntervals();
		CodeRange zipRanges[] = new CodeRange[3];
		
		zipRanges[0] = new CodeRange(94133,94133); 
		zipRanges[1] = new CodeRange(94200,94299); 
		zipRanges[2] = new CodeRange(94226,94399); 
		System.out.println("");
		Stack<CodeRange> stack = zipCodeIntervals.zipCodeRanges(zipRanges);
		assertFalse(stack.size() > 0);
		
	}
	
	@Test
	void testZipCodeRangesTrue() {
		
		zipCodeIntervals = new ZIPCodeIntervals();
		CodeRange zipRanges[] = new CodeRange[3];
		
		zipRanges[0] = new CodeRange(94133,94133); 
		zipRanges[1] = new CodeRange(94200,94299); 
		zipRanges[2] = new CodeRange(94600,94699); 
		
		//System.out.println("");
		
		Stack<CodeRange> stack = zipCodeIntervals.zipCodeRanges(zipRanges);
		assertTrue(stack.size() == 0);
		
	}


}
