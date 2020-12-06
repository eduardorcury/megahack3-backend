package time43.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import time43.domain.Pub;
import time43.mappers.PubMapper;
import time43.model.PubDTO;
import time43.repository.PubRepository;

import javax.validation.Valid;

@Controller
public class PubController {

    private final PubRepository pubRepository;
    private final PubMapper pubMapper;

    @Autowired
    public PubController(PubRepository pubRepository, PubMapper pubMapper) {
        this.pubRepository = pubRepository;
        this.pubMapper = pubMapper;
    }

    @GetMapping("/novo-bar")
    public String newPub(Model model) {
        PubDTO pubDTO = new PubDTO();
        model.addAttribute("pub", pubDTO);
        return "pub/register-pub";
    }

    @PostMapping("/novo-bar")
    public String registerPub(@Valid PubDTO pubDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "pub/register-pub";
        } else {
            Pub newPub = pubRepository.save(pubMapper.toDomain(pubDTO));
            return "redirect:/bar/" + newPub.getId();
        }
    }

    @GetMapping("/bar/{pubId}")
    public ModelAndView pubPage(@PathVariable("pubId") Long pubId) {
        ModelAndView modelAndView = new ModelAndView("pub/pub");
        Pub pub = pubRepository.findById(pubId).get();
        modelAndView.addObject("pub", pub);
        return modelAndView;
    }

}
