package ma.xproce.inventoryservice.Dao.web;

import ma.xproce.inventoryservice.Dao.Services.VedioManager;
import ma.xproce.inventoryservice.Dao.entities.Creator;
import ma.xproce.inventoryservice.Dao.entities.Vedio;
import ma.xproce.inventoryservice.Dao.repsoitories.VedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class VedioController {
    @Autowired
        private VedioManager vedioManager;
    @GetMapping("/index")
    public String acceuil(Model model) {

        List<Vedio> vedios = vedioManager.getAllVedio();
        model.addAttribute("listVedios",vedios);
        return "index";
    }
    @GetMapping("/detailsVedios")
    public String detailVedios(Model model, @RequestParam(name = "id")Integer id) {
        Vedio vedio = vedioManager.getVedioById(id);
        model.addAttribute("vedioWithDetails", vedio);
        return "detailsVedio";
    }

    @GetMapping("/ajouterVedio")
    private String ajouterVedio(Model model) {return "ajouterVedio"; }
    @PostMapping("ajouterVedio")
    public String modifierVedio(Model model, @RequestParam(name = "url")String url, @RequestParam(name = "description")String description, @RequestParam(name = "datepublication") Date datePublication) {
        Vedio vedio = new Vedio();
        vedio.setUrl(vedio.getUrl());
        vedio.setDescription(vedio.getDescription());
        vedio.setDatePublication(vedio.getDatePublication());
        Creator creator = vedio.getCreator();
        vedio.setCreator(creator);
        vedioManager.addVedio(vedio);
        return "redirect:getlistVedio";
    }
}
