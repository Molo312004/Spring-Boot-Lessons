package com.molier.store;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.molier.CartItem;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {

        List<Items> items = List.of(
                new Pen("Bold Pen", 10),
                new Pen("Gel Pen", 15),
                new Pen("Red Pen", 12)
        );

        model.addAttribute("items", items);

        return "index"; // <-- important
    }

    @GetMapping("/add-to-cart")
    public String addToCart(
            @RequestParam String name,
            @RequestParam double price,
            HttpSession session){
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

        if(cart == null){
            cart = new ArrayList<>();
        }
        cart.add(new CartItem(name, price));
        session.setAttribute("cart", cart);
        return "redirect:/cart";
    }   

    @GetMapping("/cart")
    public String viewCart(Model model, HttpSession session){
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

        if(cart == null){
            cart = new ArrayList<>();
        }
        model.addAttribute("cart", cart);
        int total = 0;
        for(CartItem item : cart){
            total += item.getPrice();
        }
        model.addAttribute("total", total);
        return "cart";
    }

}
