package javatutorials;

public class ReturnDemo4 {

	public static String[] getMembers() {
		String[] members = { "최진혁", "최유빈", "한이람" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
		for (int i = 0; i < members.length; i++) {
			if("최유빈".equals(members[i])) {
				System.out.println("최유빈의 순서는 " + (i + 1) + "번입니다.");
				
			}

		}
	}

}
