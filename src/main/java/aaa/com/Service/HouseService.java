package aaa.com.Service;

import aaa.com.Entity.House_info;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HouseService {
    List<House_info> showHouse(String province, String city, String county);
}
