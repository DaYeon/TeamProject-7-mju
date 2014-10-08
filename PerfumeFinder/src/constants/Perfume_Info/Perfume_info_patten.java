package constants.Perfume_Info;

public class Perfume_info_patten {  //��� ������ ���� �θ�Ŭ����
	
	public static final int Perfume_Kind = 10;		//��� ���� ����
	private String Perfume_Name;					//��� �̸�
	private int Perfume_Price;							//��� ����
	private String Perfume_Top[];						//ž��Ʈ ���
	private String Perfume_Middle[];					//�̵��Ʈ ���
	private  String Perfume_Base[];					//���̽���Ʈ ���
	private  String Perfume_image;					//�̹������ϸ�
	private String Perfume_Brand;					//�귣�� �̸�
	private String User_Sex;							//����� ����
	Perfume_info_patten(String Tname, int Tprice, String Ttop[], String Tmiddle[],
			String Tbase[],  String Tbrand, String Timage, String Tsex){		//������
		this.Perfume_Name = Tname;
		this.Perfume_Price = Tprice;
		for(int i = 0; i <= 10; i++){
			this.Perfume_Top[i] = Ttop[i];
			this.Perfume_Middle[i] = Tmiddle[i];
			this.Perfume_Base[i] = Tbase[i];
		}
		this.Perfume_Brand = Tbrand;
		this.User_Sex = Tsex;
	}
	public String[] getPerfume_Top() {
		return Perfume_Top;
	}

	public String[] getPerfume_Middle() {
		return Perfume_Middle;
	}

	public String[] getPerfume_Base() {
		return Perfume_Base;
	}

	public String getUser_Sex() {
		return User_Sex;
	}

	public void setUser_Sex(String user_Sex) {
		User_Sex = user_Sex;
	}

	public static int getPerfumeKind() {   
		return Perfume_Kind;
	}

	public String getPerfume_Name() {
		return Perfume_Name;
	}
	public int getPerfume_Price() {
		return Perfume_Price;
	}
	public String getPerfume_image() {
		return Perfume_image;
	}
	public String getPerfume_Brand() {
		return Perfume_Brand;
	}
	
}
