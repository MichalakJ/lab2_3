/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;

/**
 *
 * @author student
 */
public class SearchResultDubler implements SearchResult{

    private boolean found = false;
    private int position = -1;
    public boolean isFound() {
        return found;
    }

    public int getPosition() {
        return position;
    }
    public void setFound(boolean found){
        this.found=found;
    }
    public void setPostion(int position){
        this.position=position;
    }
    
}
