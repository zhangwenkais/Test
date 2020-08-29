package aaa.com.Controller;

import aaa.com.Entity.Client;
import aaa.com.Service.impl.ClientServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//跨域请求
@CrossOrigin
@RestController
@RequestMapping("/client")
public class ClientsController {
    @Resource
    ClientServiceImpl Impl;

    @ResponseBody
    @PostMapping("showPageInfo/{pageNum}")
    public PageInfo<Client> showPageInfo(@PathVariable("pageNum") Integer pageNum,
                                         @RequestParam(name = "pageSize",defaultValue="5")Integer pageSize){
        System.out.println("分页查询");
        PageInfo<Client> clientPageInfo = Impl.showPageInfo(pageNum,pageSize);
        System.out.println(clientPageInfo);
        return clientPageInfo;
    }

    @ResponseBody
    @RequestMapping(value = "listAll")
    public List<Client> listAll() {
        System.out.println("查询出来了");
        List<Client> list = Impl.listAll();
        System.out.println(list);
        return list;
    }


    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Integer update(@RequestBody Client client){
        System.out.println("修改成功");
        Integer i = Impl.update(client);
        System.out.println(i);
        return i;
    }
}
