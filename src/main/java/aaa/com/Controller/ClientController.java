package aaa.com.Controller;

import aaa.com.Entity.Client;
import aaa.com.Service.impl.ClientServiceImpl;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/denglu")
public class ClientController {
    @Resource
    ClientServiceImpl Impl;
    Client client;
    @RequestMapping( "/queryLearnList")
    public String yuan()
    {
        return "../templates/denglus/index";
    }
    @PostMapping("/login")
    public String login(String cusName, String pwd, Model model){

         client = Impl.Login(cusName,pwd);
        System.out.printf("显示："+client);
        if(client == null || !pwd.equals(client.getPwd())) {
            return "../templates/denglus/index";
        }

        model.addAttribute("client",client);
        System.out.println(client);
        return "../templates/denglus/static/index";
        //return "../templates/denglus/Document/Document4";
    }
    @RequestMapping("/show")
    public String show( Model model){
        System.out.println("fdg"+client);
        model.addAttribute("client",client);
        return "../templates/denglus/Document/Document4";
    }

    /**
     * 注册
     * @param client
     * @param session
     * @return
     */
   @PostMapping("register")
    @ResponseBody
    public ResResult register(Client client, HttpSession session, String yanzheng) {
        String verifyCode = (String)session.getAttribute("verifyCode");
        if(!verifyCode.equals(yanzheng)) {
            return new ResResult(false,"验证码不一致");
        }
        Impl.Zhuce(client);
       System.out.println(client);
        return new ResResult();
    }
    @PostMapping("getVerification")
    @ResponseBody
    public ResResult getVerification(String telphone, HttpServletRequest req){
        if(!StringUtils.isEmpty(telphone)){
            try {
                SendSmsResponse sendSmsResponse = ALiNote.sendSms(telphone,req);
                String code = sendSmsResponse.getCode();
                if(!"OK".equals(code)) {
                    return new ResResult(false,"发送验证码时系统内部异常 : 可能原因  手机号不正确");
                }
            } catch (ClientException e) {
                e.printStackTrace();
                return new ResResult(false,"发送验证码时系统内部异常");
            }
        }
        return new ResResult(true,"发送成功");

    }

}
