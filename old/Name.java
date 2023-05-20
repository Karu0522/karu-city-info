package city;

public class Name {
	String[] korName = {"동화","하윤","도담","호두","유림","규산","해원"};
	String[] engName = {"Donghwa","Hayun","Dodam","Hodu","Yurim","Gyusan","Haewon"};
	String[] chnName = {"東和","河潤","都潭","浩斗","裕林","奎山","海原"};
	String line = "==============================";
	int i;
	public Name()
	{
		
	}
	public boolean check(String n)
	{
		for(i=0;i<korName.length;i++)
		{
			if(korName[i].equals(n) || engName[i].equals(n) || chnName[i].equals(n))
			{
				return true;
			}
		}
		return false;
	}
	public void output(String n)
	{
		if(n.equals("동화") || n.equals("Donghwa") || n.equals("東和"))
		{
			donghwa();
		}
		else if(n.equals("하윤") || n.equals("Hayun") || n.equals("河潤"))
		{
			hayun();
		}
		else if(n.equals("도담") || n.equals("Dodam") || n.equals("都潭"))
		{
			dodam();
		}
		else if(n.equals("호두") || n.equals("Hodu") || n.equals("浩斗"))
		{
			hodu();
		}
		else if(n.equals("유림") || n.equals("Yurim") || n.equals("裕林"))
		{
			yurim();
		}
		else if(n.equals("규산") || n.equals("Gyusan") || n.equals("奎山"))
		{
			gyusan();
		}
		else if(n.equals("해원") || n.equals("Haewon") || n.equals("海原"))
		{
			haewon();
		}
	}
	public void donghwa()
	{
		System.out.println(line);
		System.out.println("                              \r\n"
				+ "                              \r\n"
				+ "             @@@@@            \r\n"
				+ "       @@  @   @   @  @@      \r\n"
				+ "       @@@@    @    @@@@      \r\n"
				+ "      @@    @@ @ @@    @@     \r\n"
				+ "   @@@@@@@@@@@@@@@@@@@@@@@@@  \r\n"
				+ "      @@    @@ @ @@    @@     \r\n"
				+ "       @@@@    @    @@@@      \r\n"
				+ "       @@  @   @   @  @@      \r\n"
				+ "             @@@@@            \r\n"
				+ "                              ");
		System.out.println("동화특별시 / Donghwa Metropolitan Government / 東和特別市");
		System.out.println("하위 행정구역: 중앙구, 해안구, 신월구, 네오구, 데이구, 노바구, 드림구, 라토구, 스노우구, 윈드구, 라온구, 성야구, 하루구, 이성구, 진촌구, 만초구");
		System.out.println("면적: 814km^2 / 인구: 10,493,886명");
		System.out.println(line);
	}
	public void hayun()
	{
		System.out.println(line);
		System.out.println("                              \r\n"
				+ "               @              \r\n"
				+ "          @@       @@         \r\n"
				+ "       @@@@@@     @@@@@@      \r\n"
				+ "    @    @    @ @    @    @   \r\n"
				+ "   @       @  @@   @       @  \r\n"
				+ "    @   @@@@@@@@@@@@@@@   @   \r\n"
				+ "     @@     @ @ @ @     @@    \r\n"
				+ "     @       @   @       @    \r\n"
				+ "      @      @   @      @     \r\n"
				+ "        @@    @@@    @@       \r\n"
				+ "                              ");
		System.out.println("하윤광역시 / Hayun Metropolitan City / 河潤廣域市");
		System.out.println("하위 행정구역: 마루구, 한담구, 해담구, 청산구, 춘야구, 비야구, 가람구, 전목구");
		System.out.println("면적: 605km^2 / 인구: 5,240,906명");
		System.out.println(line);
	}
	public void dodam()
	{
		System.out.println(line);
		System.out.println("                              \r\n"
				+ "                              \r\n"
				+ "    @@@@               @@@@   \r\n"
				+ "    @       @     @       @   \r\n"
				+ "    @         @@@         @   \r\n"
				+ "    @         @ @         @   \r\n"
				+ "    @         @ @         @   \r\n"
				+ "    @         @ @         @   \r\n"
				+ "    @         @@@         @   \r\n"
				+ "    @       @     @       @   \r\n"
				+ "    @@@@               @@@@   \r\n"
				+ "                              ");
		System.out.println("도담광역시 / Dodam Metropolitan City / 都潭廣域市");
		System.out.println("하위 행정구역: 가온구, 지나구, 다온구, 미리내구");
		System.out.println("면적: 665km^2 / 인구: 3,525,884명");
		System.out.println(line);
	}
	public void hodu()
	{
		System.out.println(line);
		System.out.println("                              \r\n"
				+ "                              \r\n"
				+ "          @@@    @@@@         \r\n"
				+ "      @     @    @      @     \r\n"
				+ "    @       @    @        @   \r\n"
				+ "   @        @    @         @  \r\n"
				+ "  @         @@@@@@         @  \r\n"
				+ "   @        @    @         @  \r\n"
				+ "    @       @    @        @   \r\n"
				+ "      @     @    @      @     \r\n"
				+ "          @@@    @@@@         \r\n"
				+ "                              ");
		System.out.println("호두광역시 / Hodu Metropolitan City / 浩斗廣域市");
		System.out.println("하위 행정구역: 미소구, 청목구, 스카이구, 니트로구");
		System.out.println("면적: 470km^2 / 인구: 4,232,901명");
		System.out.println(line);
	}
	public void yurim()
	{
		System.out.println(line);
		System.out.println("                              \r\n"
				+ "               @              \r\n"
				+ "             @   @            \r\n"
				+ "       @  @@@     @@@  @      \r\n"
				+ "       @    @ @ @ @    @      \r\n"
				+ "      @@@ @@@@ @ @@@@ @@@     \r\n"
				+ "   @        @@@@@@@        @  \r\n"
				+ "      @@@@@@@  @  @@@@@@@     \r\n"
				+ "               @              \r\n"
				+ "               @              \r\n"
				+ "               @              \r\n"
				+ "                              ");
		System.out.println("유림시 / Yurim City / 裕林市");
		System.out.println("하위 행정구역: 연화구, 연림구, 나래구, 누리구");
		System.out.println("면적: 941km^2 / 인구: 3,086,913명");
		System.out.println(line);
	}
	public void gyusan()
	{
		System.out.println(line);
		System.out.println("                              \r\n"
				+ "                              \r\n"
				+ "               @              \r\n"
				+ "               @              \r\n"
				+ "          @@@@@@@@@@          \r\n"
				+ "               @              \r\n"
				+ "    @   @@@@@@@@@@@@@@@   @   \r\n"
				+ "    @          @          @   \r\n"
				+ "     @    @@@@@@@@@@     @    \r\n"
				+ "      @@       @       @@     \r\n"
				+ "         @@@   @   @@@        \r\n"
				+ "                              ");
		System.out.println("규산시 / Gyusan City / 奎山市");
		System.out.println("하위 행정구역: 규원구, 규강구, 오인구, 하엽구");
		System.out.println("면적: 4,016km^2 / 인구: 2,783,198명");
		System.out.println(line);
	}
	public void haewon()
	{
		System.out.println(line);
		System.out.println("                              \r\n"
				+ "                              \r\n"
				+ "             @@ @@            \r\n"
				+ "           @       @          \r\n"
				+ "        @@ @@     @@ @@       \r\n"
				+ "      @  @@  @@ @@  @@  @     \r\n"
				+ "   @@@@@@@@@@@@@@@@@@@@@@@@@  \r\n"
				+ "      @     @@ @ @@     @     \r\n"
				+ "        @@@    @    @@@       \r\n"
				+ "           @   @   @          \r\n"
				+ "             @@@@@            \r\n"
				+ "                              ");
		System.out.println("해원시 / Haewon City / 海原市");
		System.out.println("하위 행정구역: 해림구, 해산구, 한림구, 보라구");
		System.out.println("면적: 5,791km^2 / 인구: 2,416,332명");
		System.out.println(line);
	}
	
}
