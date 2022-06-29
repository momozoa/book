package exception;

public class IDFormatTest {

	private String userID;
	private String userPW;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		
		if (userID == null) {
			throw new IDFormatException("null �� �Է��Ͽ����ϴ�.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�̻� 20�� �����Դϴ�.");
		}
		
		this.userID = userID;
		
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) throws PWFormatException {

		if(userPW == null){
			throw new PWFormatException("��й�ȣ�� null �� �� �����ϴ�");
		}
		else if( userPW.length() < 5){
			throw new PWFormatException("��й�ȣ�� 5�� �̻� �Դϴ�");
		}
		else if (userPW.matches("[a-zA-Z]+")){
			throw new PWFormatException("��й�ȣ�� ���ڸ� �����ؾ� �մϴ�.");
		}
		
		this.userPW = userPW;
	}	
	
	
	
	

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		String password =null;
		
		try {
			test.setUserPW(password);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}

		password = "abcd";
		try {
			test.setUserPW(password);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}

		
		password = "abcdef";
		try {
			test.setUserPW(password);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
