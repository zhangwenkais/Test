package aaa.com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("aaa.com.Dao")
public class SpringbootStart {
    public static void main(String[] args) {
        // 运行Spring应用程序
        SpringApplication.run(SpringbootStart.class,args);
    }
}
