# comento_bootcamp

## Week2 - api Docs 작성하기

작성한 api docs는 아래 링크에서 확인하실 수 있습니다.

https://boiling-brick-4a4.notion.site/SW-API-919f87d945f9409cae39aa6e8a6a69fd

### What I Learend

Path Variable? - url 경로를 이용해서 데이터를 서버로 넘기는것.

```
@RequestMapping(value = "/user/email/{email}", method=RequestMethod.GET)
def someController(@PathVariable String email)

```

위와 같은 코드에서 {email} 에 들어가는 String을 mapping을 통해서 spring controller로 받아 올 수 있음.

API?

https://boiling-brick-4a4.notion.site/RESTful-API-d6890c6b804f4f1d9380f2a69cf91b86


## Week1 - 개발환경 마련하기

### 개발환경
Eclipse(2021.12 + JDK 1.8)로 구성했습니다.

주요 라이브러리 정보

Spring : 5.1.8

Maven-eclipse-plugin : 2.9

Maven-compile-plugin : 2.5.1



### 겪었던 문제점

Eclipse 설치 문제 - JAVA EE 를 사용해서 해결

Oracle JDK가 개발자 서명 문제로 m1 mac에서 동작안함.

intelliJ 이용해서 JDK를 다운로드 받고, 해당 JDK를 사용해서 성공.


### 성공화면

![1주차 성공화면](./images/week1_webpage.jpg)
