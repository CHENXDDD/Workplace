package com.cxd.webservice;

import com.cxd.domian.ResResult;
import com.cxd.domian.User;
import com.cxd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestService {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public ResResult regist(@RequestBody User user){
        userService.save(user);
        try {
            return new ResResult(true,"success");

        } catch (Exception e) {
            e.printStackTrace();
            return new ResResult(false,"false!!!");
        }
    }


    @RequestMapping(value = "/{name}/{password}",method = RequestMethod.POST)
    public User login(@PathVariable("name") String name,@PathVariable("name") String password){

        try {
            return userService.findOne(name, password);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll(){
        return userService.findAll();
    }

}
