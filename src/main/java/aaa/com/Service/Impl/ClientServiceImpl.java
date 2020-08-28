package aaa.com.Service.Impl;

import aaa.com.Dao.ClientDao;
import aaa.com.Entity.Client;
import aaa.com.Service.ClientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Resource
    ClientDao clientDao;

    public PageInfo<Client> showPageInfo(Integer pageNum, Integer pageSize) {
        System.out.println("分页");
        PageHelper.startPage(pageNum,pageSize);
        List<Client> list = clientDao.listAll();
        System.out.println("list"+list);
        PageInfo<Client> pageInfo = new PageInfo<Client>(list);
        System.out.println(pageInfo);
        return pageInfo;
    }

    public List<Client> listAll(){
        return clientDao.listAll();
    }

    public Integer update(Client client){
        return clientDao.update(client);
    }
}
