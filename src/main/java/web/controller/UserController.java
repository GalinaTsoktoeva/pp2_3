package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;
import org.springframework.stereotype.Controller;


@Controller
public class UserController {
    private final UserService serv;

    @Autowired
    public UserController(UserService service) {
        this.serv = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ListUsers(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", this.serv.listUser());
        return "index";
    }

    @GetMapping("/add")
    public String showNewUserForm(Model model) {
        User User = new User();
        model.addAttribute("user", User);
        return "add-user";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String removeUser(@RequestParam(name = "id") long id) {
        this.serv.deleteUser(id);
        return "redirect:/";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        serv.updateUser(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String editUser(@RequestParam(name="id") Long id, Model model) {
        model.addAttribute("user", this.serv.getUserById(id));

        return "update";
    }
}