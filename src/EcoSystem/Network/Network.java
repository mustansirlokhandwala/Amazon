/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Network;

import EcoSystem.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class Network {
    
    private static int networkCounter;
    private String name;
    private int networkId;
    private EnterpriseDirectory enterpriseDirectory;
    private NetworkDirectory networkDirectory;

    public Network(String name) {
        this.name = name;
        networkId = networkCounter;
        ++networkCounter;
                
        enterpriseDirectory = new EnterpriseDirectory();
        networkDirectory = new NetworkDirectory();
    }

    public int getNetworkId() {
        return networkId;
    }
    

    public String getName() {
        return name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
