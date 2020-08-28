package aaa.com.Service;

import aaa.com.Entity.Client;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ClientService {
    PageInfo<Client> showPageInfo(Integer pageNum, Integer pageSize);

    List<Client> listAll();

    Integer update(Client client);
}
