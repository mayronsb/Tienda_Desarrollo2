
package com.tienda.controller;

import com.tienda.services.ItemService;
import com.tienda.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarritoController {
 
    @Autowired
    private ItemService itemService;
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/")
    private String inicio(Model model){
        var productos = productoService.getProductos(true);
        model.addAttribute("productos", productos);
        return "/index";
    }

    
    
}
