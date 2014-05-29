/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workQueueList;

    public WorkQueue() {
        workQueueList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkQueueList() {
        return workQueueList;
    }

    public void setWorkQueueList(ArrayList<WorkRequest> workQueueList) {
        this.workQueueList = workQueueList;
    }
     
    public void addWorkRequest(WorkRequest wr){
        this.workQueueList.add(wr);
        
    }
    
    
    
}
