## comento_Backend

# 3주차
- 2주차 API 과제 수정완료. (https://spiral-sturgeon-2b1.notion.site/API-be6893ac2dfc4ec29677032c1e24f7a3)
- 3주차 spring boot 환경설정 (Maven 기반의 Spring Boot)

<h3>결과</h3>

1. 스프링부트 환경설정을 진행하면서 test 코드에 대한 결과는 얻지못함.

```
<test.jsp>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html> 
<html lang="ko">
     <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
         <title>View Test Page</title> 
     </head> 
 <body> 
     <h2>설정 테스트 ${name}</h2> 
     <div>JSP 뿌리기</div> 
     <c:forEach var="item" items="${list}" varStatus="idx"> 
         ${idx.index} : ${item} <br /> 
     </c:forEach>
  </body> 
</html>
```
```
<settingTest>

package com.devfun.settingweb_boot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
```

<img width="1404" alt="스크린샷 2022-08-12 오후 12 55 36" src="https://user-images.githubusercontent.com/76617139/184282326-31dea2e7-0903-409c-9ad2-8b9057bbe0ec.png">
<img width="653" alt="스크린샷 2022-08-12 오후 12 55 46" src="https://user-images.githubusercontent.com/76617139/184282348-5e6b5880-e0c1-4d80-bdc7-3b2ad88ada5d.png">


<img width="440" alt="스크린샷 2022-08-12 오후 12 50 56" src="https://user-images.githubusercontent.com/76617139/184281860-535bb486-e56e-4433-b859-cc1621f101df.png">



-----

# 2주차

API 가이드 문서 초안 작성

https://spiral-sturgeon-2b1.notion.site/API-be6893ac2dfc4ec29677032c1e24f7a3

-----

# 1주차
### Java, Eclipse

- 맥북 M1 칩 이라 호환되는 java,이클립스 버전을 찾느라 애 먹음
- 결국 구글링 후 openJDK 사이트 이용 

<img width="360" alt="스크린샷 2022-07-29 오후 11 17 58" src="https://user-images.githubusercontent.com/76617139/181779828-0f3c82a5-ed16-4e8f-a017-6fdd79409bac.png">


### Spring

현재  Spring Boot 만 다운로드되고 Spring이 다운로드 되지 않는 상황


<img width="578" alt="스크린샷 2022-07-29 오후 11 42 45" src="https://user-images.githubusercontent.com/76617139/181784477-289074dc-a1ee-4018-8288-fdb1dfb022c5.png">


### 톰캣 

- 다운로드는 완료됬으나 서버 설정시 apache가 목록에 뜨지 않음.

<img width="553" alt="스크린샷 2022-07-29 오후 11 43 58" src="https://user-images.githubusercontent.com/76617139/181784829-ffe3c856-2810-4b5c-a173-09c349fc5008.png">
