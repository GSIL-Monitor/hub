package tuniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tuniu.bean.FirstRestBean;

import javax.validation.Valid;


/**
 * Created by songweiliang on 2017/8/11.
 */
@Controller
@RequestMapping("/main")
public class MainConTroller {

    @RequestMapping(value="/test",method={RequestMethod.GET,RequestMethod.POST})
    public String firstRest(@Valid FirstRestBean bean, Errors errors){
        if(errors.hasErrors()){
            System.out.println(errors.getAllErrors());
            return "test";
        }
        System.out.println("start server");
        return "test";
    }

}


