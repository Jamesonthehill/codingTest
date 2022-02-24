package com.dormain.ch07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		//DmbCellPhone 객체 생성 : 자식
			DmbCellPhone dmbCellphone = new DmbCellPhone("자바폰," "검정", 10);
				
			//CellPhone으로부터 상속 받은 필드
			System.out.println("모델: "+ dmbCellPhone.model);
			System.out.println("색상: "+ dmbCellPhone.color);
			
			//CellPhone으로부터 상속받은 메서드 호출
			dmbCellphone.powerOn();
			dmbCellphone.bell();
			dmbCellphone.sendVoice("여보세요");
			dmbCellphone.receiveVoice("안녕하세요 저는 홍길동입니다.");
			dmbCellphone.sendVoice("아~예 반갑습니다.");
			dmbCellphone.hangUp();
		
			//DmbCellPhone의 메소드 호출
			dmbCellPhone.turnOnDmb();
			dmbCellPhone.changeChannelDmb();
			dmbCellPhone.turnOffDmb();
	}

}
