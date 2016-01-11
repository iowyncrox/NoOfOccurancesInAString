import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		String name = "sunnysunnysunnyynnusynnus sunny unny nn non nn syunn";
		ArrayList<Integer> list = new ArrayList<>();
		int total = 0;
		int count = 0;
		while (count < name.length()) {
			if (name.indexOf("nn", count) == -1) {
				break;
			}
			count = name.indexOf("nn", count);
			list.add(count);
			++count;
			++total;
		}
		System.out.println(total);
		System.out.println(list.toString());
	}
}
