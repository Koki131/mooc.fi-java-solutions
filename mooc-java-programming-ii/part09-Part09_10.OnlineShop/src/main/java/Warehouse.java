/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
import java.util.*;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        if (!(this.prices.containsKey(product))) {
            return -99;
        }
        return this.prices.get(product);        
    }
    
    public int stock(String product) {
        if (!(this.stock.containsKey(product))) {
            return 0;
        }
        return this.stock.get(product);
    }
    
    public boolean take(String product) {
        if (!(this.stock.containsKey(product))) {
            return false;
        } 
        if (this.stock.get(product) > 0) {
            int item = this.stock.get(product);
            item = item - 1;
            this.stock.put(product, item);
            return true;
        }
        return false;        
    }
    
    public Set<String> products() {
        Set<String> products = this.prices.keySet();
        
        return products;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.prices);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Warehouse other = (Warehouse) obj;
        if (!Objects.equals(this.prices, other.prices)) {
            return false;
        }
        return true;
    }
    
    
}
