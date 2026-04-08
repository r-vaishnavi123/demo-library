package com.library.service.library_service.controller;


import java.util.ArrayList;


import java.util.List;


import org.springframework.web.bind.annotation.*;


@RestController


@RequestMapping("/members")


public class MemberController {


    private List<String> members = new ArrayList<>();


    @PostMapping


    public String addMember(@RequestBody String memberName) {


        members.add(memberName);


        return "Member added: " + memberName;


    }


    @GetMapping


    public List<String> getMembers() {


        return members;


    }


    @GetMapping("/{id}")


    public String getMemberById(@PathVariable int id) {


        if (id < members.size()) {


            return members.get(id);


        }


        return "Member not found";


    }


}
 
