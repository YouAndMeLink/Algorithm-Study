import java.util.Scanner;

public class ���簢��������Ż��_1085 { //���� �� Main���� Ŭ������ ����

	public static void main(String[] args) {
		int x, y, w, h;
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		sc.close();
		//���μ��� ���̰� w,h�� ���簢�� �� x,y��ǥ�� �ִ� ����� ���簢���� ��� �ִܰŸ�
		//�Ѽ��� ���ð����� �ִܰŸ� ���� 4����(x, y, w-x, h-y)
		if(1<=w && h<=1000 && 1<=x && x<=w-1 && 1<=y && y<=h-1) {
			if(w-x>=x && h-y>=x && y>=x) { //x
				System.out.print(x);
			}
			else if(w-x>=y && h-y>=y && x>=y){ //y
				System.out.print(y);
			}
			else if(x>=w-x && h-y>=w-x && y>=w-x){ //w-x
				System.out.print(w-x);
			}
			else{ //h-y
				System.out.print(h-y);
			}
		}
	}
}