## comento_Backend

# 4주차
- API 명세서 (https://app.swaggerhub.com/apis/BIK1111_1/SW_Utilization_Status_API/1.0.0). - 주소값 localhost:8031//sqlyearStatisitc?{year} 에 해당하는 데이터를 대표로 작성.
- API 개발을 위한 SQL 작성
```
1. 월별 접속자 수
select count(userID)
from requestInfo
where createDate BETWEEN 2001010000 AND 2002012359;

2. 일자별 접속자 수
select count(userID)
from requestInfo
where createDate BETWEEN 2006150000 AND 2006152359;

3. 평균 하루 로그인 수 
select ROUND(count(*)/ DAY(LAST_DAY(STR_TO_DATE(createDate, '%y%m%d%h%i')))) as avgRequest,  count(*) as totCnt
from statistc.requestinfo ri
where left(ri.createDate, 4) = #{yearMonth};


4. 휴일을 포함한 로그인 수

//  https://green-joo.tistory.com/8?category=1056095 추후 참고..

5. 부서별 로그인 수
SELECT requestID
SUM(COUNT(*)) OVER(ORDER BY createDate) //누적접속건수
FROM requestInfo
GROUB BY requestID
ORDERBY requestID
```

- 결과

1. 년 별 접속자 수

<img width="476" alt="스크린샷 2022-08-19 오후 11 00 33" src="https://user-images.githubusercontent.com/76617139/185635861-c3b91a54-0032-4cd3-802c-945dbd20ec92.png">

2. 월 별 접속자 수 

<img width="629" alt="스크린샷 2022-08-19 오후 4 58 42" src="https://user-images.githubusercontent.com/76617139/185635937-7acd7841-a037-4763-8b20-13d85f04820d.png">

3. 일 별 접속자 수 

<img width="465" alt="스크린샷 2022-08-19 오후 11 04 07" src="https://user-images.githubusercontent.com/76617139/185636099-42482db7-2d71-4be3-a9fd-884d79328c76.png">


4. 일 별 평균 접속자 수

<img width="696" alt="스크린샷 2022-08-19 오후 3 51 44" src="https://user-images.githubusercontent.com/76617139/185636000-38fcfe6f-211b-43bf-8790-dd77579ae17b.png">



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
