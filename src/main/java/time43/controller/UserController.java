package time43.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import time43.domain.User;
import time43.mappers.UserMapper;
import time43.model.UserDTO;
import time43.repository.UserRepository;

import javax.validation.Valid;

@Controller
public class UserController {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @GetMapping("/novo-usuario")
    public String newUser(Model model) {
        UserDTO userDTO = new UserDTO();
        model.addAttribute("user", userDTO);
        return "user/register-user";
    }

    @PostMapping("/novo-usuario")
    public String registerUser(@Valid UserDTO userDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "user/register-user";
        } else {
            User newUser = userRepository.save(userMapper.toDomain(userDTO));
            return "redirect:/usuario/" + newUser.getId();
        }
    }

    @GetMapping("/usuario/{userId}")
    public ModelAndView getUserById(@PathVariable("userId") Long userId) {
        ModelAndView modelAndView = new ModelAndView("user/user");
        User user = userRepository.findById(userId).get();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

}
