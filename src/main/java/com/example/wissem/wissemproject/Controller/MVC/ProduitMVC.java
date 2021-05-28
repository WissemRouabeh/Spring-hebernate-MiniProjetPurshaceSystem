package com.example.wissem.wissemproject.Controller.MVC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.wissem.wissemproject.dao.entities.Produit;
import com.example.wissem.wissemproject.service.produit.IProduitService;

@Controller
@RequestMapping("/mvc/produit")
public class ProduitMVC {
	@Autowired
    @Qualifier("produitServiceImpl")
    private IProduitService service;

    //Here we return ModelAndView object to springs' dispatcher servlet
    //It will redirect us to the view we set to the ModelAndView object
    // and populate it with the model object that we pass with addObject("attrName", "attrValue") method
    @GetMapping("/all")
    public ModelAndView allCustomers() {
        List<Produit> allProduits = service.getAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("produits-page");
        mv.addObject("produits", allProduits);
        return mv;
    }
}
