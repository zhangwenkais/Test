package aaa.com.Controller;

import aaa.com.Entity.House_info;
import aaa.com.Service.impl.HouseImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {
    @Resource
    HouseImpl Impl;
    @RequestMapping("/show")
    public List<House_info> list(String province,String city,String county,Model model){
        List<House_info> list = Impl.showHouse(province,city,county);
        System.out.println(province);
        System.out.println(county);
        System.out.println(city);
        model.addAttribute("list",list);
        System.out.println(list);
        return list;
    }
}
