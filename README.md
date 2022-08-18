## comento_Backend

# 4주차
- API 명세서 (https://app.swaggerhub.com/apis/BIK1111_1/SW_Utilization_Status_API/1.0.0)





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
