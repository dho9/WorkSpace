package edu.kh.oarr.run; // 2023-03-07 1번

import edu.kh.oarr.mode.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		
		service.displayMenu();
		
	}
}
