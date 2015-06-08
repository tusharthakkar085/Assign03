/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0653602
 */
public class product {
    private int prodId;
    private String prodName;
    private String prodDesc;
    private int prodQuantity;

    public product(int prodId, String prodName, String prodDesc, int prodQuantity) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodQuantity = prodQuantity;
    }
    
    public int getProductId() {
        return prodId;
    }

    public void setProductId(int productId) {
        this.prodId = productId;
    }
    
    public String getName() {
        return prodName;
    }
    
    public void setName(String name) {
        this.prodName = name;
    }
    
    public String getDescription() {
        return prodDesc;
    }
    
    public void setDescription(String description) {
        this.prodDesc = description;
    }

    public int getQuantity() {
        return prodQuantity;
    }

    public void setQuantity(int quantity) {
        this.prodQuantity = quantity;
    }
    
}
