package javatutorials;
import java.io.File;

public class subFileTest {

	public static void getFileList(String path) {

		File dir = new File(path);
		File[] fileList = dir.listFiles();

		for (int i = 0; i < fileList.length; i++) {
			File file = fileList[i];

			if (file.isFile()) {
				System.out.println("\t 파일이름 = " + file.getName());
			}

		}

	}

	public static void main(String[] args) {
		String path;
		path = "C:\\";
		// TODO Auto-generated method stub
		getFileList(path);

	}

}
