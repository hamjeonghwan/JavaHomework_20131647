package my.day14;

public class Testlotto {
	public static void main(String[] args) {
	
		int lottoNum[] = new int[6];				//�ζ� ��ȣ�� ���� �迭�� �����Ѵ�
		
		for(int i=0;  i <lottoNum.length;i++) {		//�迭�� �ζ� ��ȣ�� ��� ���� for���� ����Ѵ�.
			lottoNum[i]=(int)(Math.random()*45)+1;	//�迭[i] ��°�� �ζǹ�ȣ(����)�� ��´�.
				//ó�� �ߺ� for������ �� �� i�� ++�� 1 �̵ȴ�.
			for(int j=0;  j <i; j++) {				//�� for������ ���� �ζ� ��ȣ�� 
									                	//�ߺ��Ǵ��� Ȯ���ϴ� for���̴�.
				if(lottoNum[j]==lottoNum[i]) {		//�ʱ⿣ �迭[0]�� �迭[1]�� ���� ���Ѵ�
					
					System.out.println(j+"�ߺ��߰�"+lottoNum[j]+"��ȣ�� �ߺ��Ǿ� ������");
					System.out.println(i+"�ߺ��߰�"+lottoNum[i]+"��ȣ�� �ߺ��Ǿ� ������");
					i--;							//���� �ߺ��Ǵ� ���� ������ �ٽ� �ζ� ��ȣ�� �����ϱ� ����
					break;							//i�� --�� ���ְ� break�� ���� ���� �ܰ�� ����.
				}									
			}
		}

	for(int i=0;  i < lottoNum.length; i++) {
			System.out.println(lottoNum[i]);
		}
	}
}

