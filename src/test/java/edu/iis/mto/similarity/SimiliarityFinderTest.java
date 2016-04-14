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
    @Before
    public void setUpforTest(){
        SequenceSearcherDubler searcher = new SequenceSearcherDubler();
        finder = new SimilarityFinder(searcher);
    }
    @Test
    public void givenTwoEmptySequences_whenCalculateJackardSimiliarity_ThenResultIsOne(){
        int seq1[] = {};
        int seq2[] = {};
        double result = finder.calculateJackardSimilarity(seq1, seq2);
        assertThat(result,equalTo(1.0));
    }
}
