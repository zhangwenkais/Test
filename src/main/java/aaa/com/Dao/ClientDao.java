package aaa.com.Dao;

import aaa.com.Entity.Client;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDao {
    PageInfo<Client> showPageInfo(Integer pageNum, Integer pageSize);

    List<Client> listAll();

    Integer update(Client client);
}
