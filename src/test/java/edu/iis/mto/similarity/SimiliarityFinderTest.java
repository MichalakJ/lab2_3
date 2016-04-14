/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.similarity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author student
 */
public class SimiliarityFinderTest {
    private SimilarityFinder finder;
    SequenceSearcherDubler searcher;
    @Before
    public void setUpforTest(){
        searcher = new SequenceSearcherDubler();
        finder = new SimilarityFinder(searcher);
        searcher.resetCounter();
    }
    @Test
    public void givenTwoEmptySequences_whenCalculateJackardSimiliarity_ThenResultIsOne(){
        int seq1[] = {};
        int seq2[] = {};
        double result = finder.calculateJackardSimilarity(seq1, seq2);
        assertThat(result,equalTo(1.0));
    }
    @Test
    public void givenNonEmptySequences_whenCalculateJackardSimilarity_thenResultisCorrect(){
        int seq1[] = {1,2,3};
        int seq2[] = {3,4,5};
        double result = finder.calculateJackardSimilarity(seq1, seq2);
        System.out.println(result);
        assertThat(result,equalTo(1.0/5.0));
    }
    @Test
    public void givenSequenceWithThreeElements_whenCalculateJackardSimilaritiy_thenSearchCalledThreeTimes(){
        int seq1[] = {1,2,3};
        int seq2[] = {3,4,5};
        double result = finder.calculateJackardSimilarity(seq1, seq2);
        assertThat(searcher.getSearchCalled(), equalTo(3));
    }
}
