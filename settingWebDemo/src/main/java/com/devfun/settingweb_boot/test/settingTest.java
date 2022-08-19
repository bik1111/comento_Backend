package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;
 
 
 
@Controller
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/sqlyearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @ResponseBody 
    @RequestMapping("/sqlmonthStatistic")
    public Map<String, Object> sqltest2(String month) throws Exception{ 
       
    	return service.monthloginNum(month);
    }
    
    @ResponseBody 
    @RequestMapping("/sqldateStatistic")
    public Map<String, Object> sqltest3(String date) throws Exception{ 
       
    	return service.dateloginNum(date);
    }
    @ResponseBody 
    @RequestMapping("/sqlAvgdateStatistic")
    public Map<String, Object> sqltest4(String yearMonth) throws Exception{ 
       
    	return service.avgDatelogin(yearMonth);
    }
    
    @ResponseBody 
    @RequestMapping("/sqldptStatistic")
    public Map<String, Object> sqltest5(String dpt) throws Exception{ 
       
    	return service.dptloginNum(dpt);
    }
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}