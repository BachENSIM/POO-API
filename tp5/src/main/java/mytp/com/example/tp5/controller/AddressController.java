package mytp.com.example.tp5.controller;

import mytp.com.example.tp5.model.Address;
import mytp.com.example.tp5.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/addresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresses";
    }

    /*  @GetMapping("/address")
    public String addressForm(Model model) {
        model.addAttribute("addr",new Address());
     String content = (String) model.getAttribute("address");
        new Address().setContent(content);
        return "address";
    }*/

   @GetMapping("/address")
   public String submitForm() {
       //take the data from the page address and send it into page meteo
       return "address";
    }


}
