/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.isw.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class OrderProduct {
    
    private Integer id;
    private BigDecimal cantidad;
    private BigDecimal precio;
    private Integer productId;
    
    public BigDecimal getTotalItem(){
        return this.precio.multiply(cantidad);
    }
    
    
    
    
    
    
    
}
