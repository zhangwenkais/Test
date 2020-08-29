package aaa.com.Service.impl;

import aaa.com.Dao.HouseDao;
import aaa.com.Entity.House_info;
import aaa.com.Service.HouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("HouseService")
public class HouseImpl implements HouseService {
    @Resource
    HouseDao dao;

    public List<House_info> showHouse(String province,String city,String county) {
        return dao.showHouse(province, city, county);

    }
}
