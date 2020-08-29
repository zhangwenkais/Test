package aaa.com.Service.impl;

import aaa.com.Dao.ClientDao;
import aaa.com.Entity.Client;
import aaa.com.Service.ClientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("ClientService")
public class ClientServiceImpl implements ClientService {
    @Resource
    ClientDao dao;

    public Client Login(String cusName, String pwd) {
        return dao.Login(cusName,pwd);
    }

    public int Zhuce(Client client) {
        return dao.Zhuce(client);
    }

    public List<Client> findById(Integer cus_id) {
        return dao.findById(cus_id);
    }

    public Integer UpdatePwd(String pwd) {
        return dao.UpdatePwd(pwd);
    }

    public Integer UpdateUser(Client client) {
        return dao.UpdateUser(client);
    }

    @Override
    public PageInfo<Client> showPageInfo(Integer pageNum, Integer pageSize) {
        System.out.println("分页");
        PageHelper.startPage(pageNum,pageSize);
        List<Client> list = dao.listAll();
        System.out.println("list"+list);
        PageInfo<Client> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo);
        return pageInfo;
    }

    @Override
    public List<Client> listAll() {
        return dao.listAll();
    }

    @Override
    public Integer update(Client client) {
        return dao.update(client);
    }


}
