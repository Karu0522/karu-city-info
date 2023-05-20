package city;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Name n = new Name();
		Scanner sc = new Scanner(System.in);
		String name;
		while(true)
		{
			System.out.print("도시 이름을 입력하세요: ");
			name = sc.next();
			if(n.check(name))
			{
				n.output(name);
			}
			else
			{
				System.out.println("존재하지 않는 도시입니다.");
			}
		}
	}
}
