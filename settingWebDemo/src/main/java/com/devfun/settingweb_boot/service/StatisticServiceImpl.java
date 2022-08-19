package com.devfun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> monthloginNum (String month) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
        	retVal = uMapper.selectMonthLogin(month);
            retVal.put("month", month);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> dateloginNum (String date) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
        	retVal = uMapper.selectDateLogin(date);
            retVal.put("date", date);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("date", date);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> avgDatelogin(String yearMonth) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
        	retVal = uMapper.selectavgDateLogin(yearMonth);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    @Override
    public HashMap<String, Object> dptloginNum(String dpt) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
        	retVal = uMapper.selectdptLogin(dpt);
            retVal.put("dpt", dpt);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("dpt", dpt);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
}