package se.kth.carInspection.view;

import se.kth.carInspection.model.Inspection;
import se.kth.carInspection.model.StatisticsObserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tmpuser-10215
 */
public class InspectionStatsView implements StatisticsObserver  {
    private int passed;
    private int failed;
    public void evaluate (Inspection inspection){
        if(inspection.getStatus().getStatus()) passed++;
        else failed ++;
    }

    /**
     * @return the passed
     */
    public int getPassed() {
        return passed;
    }

    /**
     * @return the failed
     */
    public int getFailed() {
        return failed;
    }
    
    public int getTotal() {
        return failed+passed;
    }

    
}
