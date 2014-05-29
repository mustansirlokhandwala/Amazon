/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.Person.Address;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class WarehouseDirectory {
    
    private ArrayList<WareHouse> wareHouseList;

    public WarehouseDirectory() {
        wareHouseList = new ArrayList<>();
    }

    public ArrayList<WareHouse> getWareHouseList() {
        return wareHouseList;
    }
    
    public WareHouse createandAddWareHouse(String name , Address address){
        WareHouse wh = new WareHouse(name, address);
        wareHouseList.add(wh);
        return wh;
    }
    
    
}
