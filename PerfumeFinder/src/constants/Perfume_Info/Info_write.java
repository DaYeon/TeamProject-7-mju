package constants.Perfume_Info;

public class Info_write {
	
	public Perfume_info_patten PerfumeList[];
	
	public void info(){ //��� ����
	PerfumeList = new Perfume_info_patten[Perfume_info_patten.Perfume_Kind]; 
	
	PerfumeList[0] = new Perfume_info_patten("�����", 3000, new String[]{"ž"}, 
								new String[]{ "�̵�"}, new String[]{"���̽�"},  "�귣��", "�̹���.jpg", "��"); //��������
	PerfumeList[1] = new Perfume_info_patten("�󺥴�", 3000, new String[]{"ž"}, 
								new String[]{"�̵�"}, new String[]{"���̽�"},  "�귣��", "�̹���.png", "��"); //�󺥴����
	}
	
}

