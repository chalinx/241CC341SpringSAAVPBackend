/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.isw.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor 
@NoArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private String code;
    private String descripcion;
    private String urlImagen;
    private Double precio;
    private LocalDateTime fechaCreacion;
    private LocalDateTime actualizafecha;
    
    private Integer userId;
    private Integer categoryId;
}
