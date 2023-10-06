package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;
import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping()
    private String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "listUser";
    }

    @GetMapping("/new")
    private String getFormNewUser(Model model, User user) {
        model.addAttribute("user", user);
        model.addAttribute("roles", roleService.getAllRole());
        return "new";
    }

    @PostMapping("/save")
    private String saveUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "new";
        }
        userService.saveUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/edit")
    private String getFormEditUser(@RequestParam("id") int id, Model model) {
        model.addAttribute("user", userService.showUserById(id));
        model.addAttribute("roles", roleService.getAllRole());
        return "edit";
    }

    @GetMapping("/delete")
    private String deleteUser(@RequestParam("id") int id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }

    @PostMapping("/update")
    public String updateUser(@RequestParam("id") int id, @ModelAttribute("user") @Valid User user
            , BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit";
        }
        userService.updateUser(id, user);
        return "redirect:/admin";
    }
}
