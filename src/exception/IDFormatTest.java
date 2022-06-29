package exception;

public class IDFormatTest {

	private String userID;
	private String userPW;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		
		if (userID == null) {
			throw new IDFormatException("null 값 입력하였습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8이상 20자 이하입니다.");
		}
		
		this.userID = userID;
		
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) throws PWFormatException {

		if(userPW == null){
			throw new PWFormatException("비밀번호는 null 일 수 없습니다");
		}
		else if( userPW.length() < 5){
			throw new PWFormatException("비밀번호는 5자 이상 입니다");
		}
		else if (userPW.matches("[a-zA-Z]+")){
			throw new PWFormatException("비밀번호는 숫자를 포함해야 합니다.");
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
