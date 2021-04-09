package edu.dmacc.week11validation.controllers;

import edu.dmacc.week11validation.beans.Friend;
import edu.dmacc.week11validation.repo.FriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


/**
 * Rumbi Chinhamhora rchinhamhora
 * CIS 175 - Spring 2021
 * Apr 5, 2021
 */
@Controller
public class FriendController {
    @Autowired
    FriendRepo repo;

    @GetMapping("/")
    String friendsList( Model model) {
        List<Friend> friends = repo.findAll();
        model.addAttribute("friends", friends);
        return "friends";
    }

    @GetMapping("/input")
    String addNewFriend(Model model) {
        Friend newFriend = new Friend();
        model.addAttribute("newFriend", newFriend);
        return "input";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateFriend( @PathVariable("id") long id, Model model) {
        Friend friend = repo.findById(id).orElse(null);
        model.addAttribute("newFriend", friend);
        return "input";
    }

    @PostMapping("/update/{id}")
    public String reviseFriend( Friend friend, Model model) {
        repo.save(friend);
        return friendsList(model);
    }

    @GetMapping("/delete/{id}")
    public String deleteFriend( @PathVariable("id") long id, Model model) {
        repo.findById(id).ifPresent(repo :: delete);
        return friendsList(model);
    }
}