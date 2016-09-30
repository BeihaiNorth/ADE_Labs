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
public class ProductDirectory {
    
    private ArrayList<Product> productDirectory;
    
    public ProductDirectory(){
        this.productDirectory = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ArrayList<Product> productDirectory) {
        this.productDirectory = productDirectory;
    }
    
    public ProductDirectory getSubDirectory(String categoryName){
        ProductDirectory subProductDirectory = new ProductDirectory();
        for (Product product : productDirectory) {
            if (product.getUnderCatalog().equals(categoryName)) {
                subProductDirectory.productDirectory.add(product);
            }
        }
        return subProductDirectory;
    }
    
    public ProductDirectory getVendorDirectory(String vendorName){
        ProductDirectory vendorDirectory = new ProductDirectory();
        for (Product product : productDirectory) {
            if (product.getVendor().equals(vendorName)) {
                vendorDirectory.productDirectory.add(product);
            }
        }
        return vendorDirectory;
    }
    
    public Product addProduct(){
        Product product = new Product();
        productDirectory.add(product);
        return product;
    }
    
    public void deleteProduct(){
        
    }

    
    
}
