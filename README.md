# JSP
3월 9일 서블릿 매핑 수업<br>
서버 포트 연결 오류로 인한 혼선으로 고생<br><br>
3월 14일 서블릿을 이용한 로그인 연동 실습<br>
네임 오류 등의 자잘한 실수 (주의 요망)<br><br>
3월 16일 Get & Post 방식의 메소드를 이용한 서블릿 실행 실습<br>
주소는 숨겨지도록 하고, 공백 작성은 불가능하도록 기능 추가<br><br>
3월 21일 Oracle 기반 데이터를 Eclipse를 이용해 불러와 웹에 띄우는 작업 실습<br>
Oracle XE 프로그램의 연동이 되지 않아 1시간 정도 곤란을 겪음 <br><br>
tomcat xml 파일 수정 & smt를 psmt로 수정하여 불필요한 코드를 줄이는 작업을 수행 <br><br>
3월 28일 Oracle 데이터베이스 연동 후 테이블의 내용을 로그인을 통해 추가 및 삭제하는 기능 추가<br><br>
3월 30일 실습<br>refresh, redirect, location, dispatch를 이용한 fowarding<br>redirect을 이용한 서블릿 데이터 전송<br>dispatch를 사용한 binding foward
<br> Chapter07의 클래스와 서블릿을 이용한 viewServlet <br><br>
4월 4일 실습<br>
Servlet 바인딩 기능을 이용한 Servlet 생성 및 데이터 요청을 통한 회원정보 출력 <br>
ServletContext 매개변수 설정 기능을 이용하면 xml파일을 사용하여 간편하게 데이터 수정이 가능<br>
xml이 아닌 file을 생성하여 실행하는 방식도 존재(파일을 읽어내고, while문을 이용하여 구분자를 설정) <br> 
ServletConfig 구현 , Servlet에서 사용할 설정 정보 초기화 기능 <br>
@WebServlet 애너테이션을 이용한 버전 <br><br>
4월 6일 실습 <br>
load-on-startup 기능을 사용한 실습<br> 
init() 메소드 호출의 단점을 보완하기 위해 만들어진 기능<br> 
애너테이션을 이용하는 방식<br>
애너테이션으로 설정한 loadOnStartup 속성을 추가하여 우선순위를 1로 설정<br>
web.xml이 아닌 ServletContext 객체에서 메뉴 항목을 가져온 후 출력하므로 init() 메소드 방식보다 빨리 출력이 가능 <br>
<hidden> 태그와 URL Rewriting을 이용한 웹 페이지 연동 <br>
<hidden> 태그의 value 속성에 정보를 저장 후  서블릿으로 전송 <br>
서블릿 클래스에서 getParameter() 메소드를 통해 값을 가져 옴 <br> <br>
Url Rewriting을 이용한 세션 트래킹<br>
GET 방식으로 한글을 전송하기 위하여 인코딩<br>
<a> 태그를 이용해 링크 클릭 시 서블릿 /second로 다시 로그인 정보를 전송하도록 설정<br><br>
4월 11일 실습<br>
서블릿에서 쿠키 생성<br>
쿠키를 파일에 저장하는 것이 아닌, 브라우저가 사용하는 메모리에 저장하는 Session 쿠키 생성<br>
쿠키를 이용해 팝업창을 제한하는 기능 구현<br> <br>
4월 13일 실습
>> JABC 연동 오류로 인하여 실행에 실패 <br>
>> 추후 해결방안 모색 후 업데이트 <br><br.
4월 16일 업데이트
Chapter09의 오류를 server.xml에 naming을 추가하는 것으로 임시방편 해결 <br>
서블릿 세션에서 api 이용<br>
getSession() : 세션이 없으면 새로 생성하고, 있으면 기존 세션을 가져오는 클래스 생성 <br>
다른 브라우저로 열 경우에는 다른 세션 id가 출력<br>
setMaxInactiveInterval() : 세션 유효시간을 5초로 지정하여 5초가 지나면 다른 id를 출력하도록 하는 클래스 생성 <br>
invalidate() : 강제로 세션을 삭제하는 클래스 생성 <br>
재요청 시 다른 id 출력 <br> 
세션을 이용하여 로그인 상태를 유지하는 클래스 생성<br>
사용자가 로그인 시 데이터베이스에서 한 번만 회원정보 조회 후 로그인 상태를 세션에 저장 <br>
각 웹 페이지를 열 때마다 세션에 접근해 앞 페이지에서 로그인을 했는지 
