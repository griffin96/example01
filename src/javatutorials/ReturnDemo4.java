package javatutorials;

public class ReturnDemo4 {

	public static String[] getMembers() {
		String[] members = { "������", "������", "���̶�" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
		for (int i = 0; i < members.length; i++) {
			if("������".equals(members[i])) {
				System.out.println("�������� ������ " + (i + 1) + "���Դϴ�.");
				
			}

		}
	}

}
