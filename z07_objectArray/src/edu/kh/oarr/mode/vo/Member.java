package edu.kh.oarr.mode.vo; // 2023-03-07 1번

public class Member {
	
	// 필드(== 멤버 변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // 지역(서울, 경기, 충북 ...)
	
	// 생성자
	public Member() {} // 기본 생성자
	
	public Member(String memberId, String memberPw, String memberName, 
				  int memberAge, String region) {  // 매개변수 생성자
		
		// 전달받은 값을 현재 필드에 초기화
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
		
	}
	
	// 메소드
	// getter / setter
	
	// memberID
	public String getMemberId() {
		return memberId; // this.memberId라고 써도 가능하나 구분 필요X라서 쓰지 않음
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId; // 매개변수에 전달받은 값을 현재 필드에 memberId에 넣겠다
		return;
		// 모든 메소드는 종료 시 호출한 곳으로 돌아가는 
		// return 구문이 작성 되어야만 하지만
		// 단, void일 경우 생략 가능하다.
		// -> 생략 시 컴파일러가 자동 추가 
	}
	
	// memberPw
	public String getMemberPw() {
		return memberPw;
	}
	
	public void setMemberPw(String memberPw) {
		
		this.memberPw = memberPw;
	}
	
	// memberName
	public String getMemberName() {
		
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		
		this.memberName = memberName;
	}
	
	// memberAge
	
	public int getMemberAge() {
		return memberAge;
	}
	
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	// region
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	

}
