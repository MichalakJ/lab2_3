/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

/**
 *
 * @author student
 */
public class SequenceSearcherDubler implements SequenceSearcher{
    private static int searchCalled = 0;
    public SearchResult search(int i, int[] ints) {
        searchCalled++;
        SearchResultDubler result = new SearchResultDubler();
        
        for(int j=0; j<ints.length; j++){
            if(ints[j]==i){
                result.setFound(true);
                result.setPostion(j);
            }
        }
        return result;
    }

    public int getSearchCalled(){
        return searchCalled;
    }
    public void resetCounter(){
        searchCalled = 0;
    }
    
}
