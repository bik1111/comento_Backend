## comento_Backend

# 4주차
- API 명세서 (https://app.swaggerhub.com/apis/BIK1111_1/SW_Utilization_Status_API/1.0.0) <br>
주소값 localhost:8031//sqlyearStatisitc?{year} 에 해당하는 데이터를 대표로 작성.

- API 수정 가이드
https://spiral-sturgeon-2b1.notion.site/SW-API-be6893ac2dfc4ec29677032c1e24f7a3


## 결과

<SQL 작성문>

<img width="960" alt="스크린샷 2022-08-20 오전 1 56 46" src="https://user-images.githubusercontent.com/76617139/185669601-0fbccbe4-2bbc-47eb-8207-c2904e06c724.png">

### <settingTest.java>

<img width="813" alt="스크린샷 2022-08-20 오전 1 58 16" src="https://user-images.githubusercontent.com/76617139/185669812-399a7c4c-9d10-4d57-b522-f56cbb0011d3.png">

```
<StatisticServiceImpl.java>
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
    public HashMap<String, Object> dptloginNum(String month) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
        	retVal = uMapper.selectdptLogin(month);
            retVal.put("month", month);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
```

## 1. 년 별 접속자 수

<img width="492" alt="스크린샷 2022-08-19 오후 11 13 12" src="https://user-images.githubusercontent.com/76617139/185637867-059752b6-dee9-4a69-8ec7-f4c4c5b431a0.png">

## 2. 월 별 접속자 수 

<img width="530" alt="스크린샷 2022-08-19 오후 11 12 57" src="https://user-images.githubusercontent.com/76617139/185637812-f1bf2347-9633-446e-9206-8cbea4754017.png">


## 3. 일 별 접속자 수 

<img width="444" alt="스크린샷 2022-08-19 오후 11 10 25" src="https://user-images.githubusercontent.com/76617139/185637290-bfaad298-0103-4ab6-993f-27f40938976a.png">



## 4. 일 별 평균 접속자 수

<img width="588" alt="스크린샷 2022-08-19 오후 11 10 07" src="https://user-images.githubusercontent.com/76617139/185637227-c79f4f83-d985-43b1-b9cc-474ee41098e4.png">

## 5. 부서별 접속자 수

<img width="458" alt="스크린샷 2022-08-20 오전 2 14 04" src="https://user-images.githubusercontent.com/76617139/185672238-16457b55-e07c-464a-a37e-f6ceab2c0e4f.png">



---

# 3주차
- 2주차 API 과제 수정완료. (https://spiral-sturgeon-2b1.notion.site/API-be6893ac2dfc4ec29677032c1e24f7a3)
- 스프링 부트 환경설정 수정 완료. (https://spiral-sturgeon-2b1.notion.site/Spring-Boot-fa3dab0038424ed2bed356cc8aa0775a)

< 통계 API 구축 SQL 작성 >
```
1. 월별 접속자 수
SELECT COUNT(userID)
FROM requestInfo
//데이터 중 일부만 보고 싶을 떄 사용 (WHERE)
WHER createDate = BETWEEN '2008010000' AND '20080311259')

 2. 일자별 접속자 수
SECLET COUNT(userID)
FROM requestIfo
WHERE createDate = BETWEEN '20080100' AND '2008011259'


3. 평균 하루 로그인 수 (월간)
ex) 200801
SELECT COUNT(userID) 
FROM reuestInfo
WHERE createDate = 200801

4. 휴일은 포함한 로그인 수 (월간)
///


5. 부서별 로그인 수 (월별)
ex) 광고부
SELECT department
FROM requestInfo
```



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
