/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Network;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class NetworkDirectory {
    
    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    
    public void createandAddNetwork(String name){
        Network n = new Network(name);
        networkList.add(n);
        
    }
    
}
