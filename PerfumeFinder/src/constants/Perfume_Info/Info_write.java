package constants.Perfume_Info;
import java.*;

public class Info_write {
	
	public Perfume_info_super PerfumeList[];
	
	public Perfume_info_super info(){
	PerfumeList = new Perfume_info_super[Perfume_info_super.Perfume_Kind];
	
	PerfumeList[0] = new Perfume_info_super("�����", 3000, "ž", "�̵�",
		"���̽�",  "�귣��", "�̹���"); //��������
	PerfumeList[1] = new Perfume_info_super("�׿�", 3000, "ž", "�̵�",
		"���̽�",  "�귣��", "�̹���"); //��������
	return null;
	
	
	}
	
}

