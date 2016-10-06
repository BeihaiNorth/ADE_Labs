/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author leslie
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierDirectory;
    
    public SupplierDirectory(){
        supplierDirectory= new ArrayList<Supplier>();
        
    }

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }
    
    public Supplier addSupplier(){
        Supplier supplier = new Supplier();
        supplierDirectory.add(supplier);
        return supplier;
    }
    
    public void removeSupplier(Supplier supplier)
    {
        supplierDirectory.remove(supplier);
    }
    
    public Supplier searchSupplier(String supplierName)
    {
        for (Supplier supplier : supplierDirectory) {
            if (supplierName.equals(supplier.getSupplierName())) {
                return supplier;
            }
        }
        return null;
    }
}
