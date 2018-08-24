package queue;

import java.util.Scanner;

public class Main {

	LinkedQueue lq = new LinkedQueue();
	
	public void run() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			
			System.out.println("1.[Queue] ���� �߰�");
			System.out.println("2.[Queue] ���� N�� ����");
			System.out.println("3.[Queue] ���� �� �� ����");
			System.out.println("4.[Queue] ������ ���");
			System.out.println("5.[Queue] ���� ���");
			System.out.println("6.[Queue] ù ��° �� ���");
			System.out.println("7.����");
			
			int menu = scan.nextInt();
			if(menu==7) break;
			
			switch(menu) {
			case 1:
				System.out.print("�߰� �� ���� �Է��ϼ���:");
				Object addData = scan.next();
				lq.add(addData);
				break;
			case 2:
				System.out.print("���� �� ������ �Է��ϼ���:");
				int delNum = scan.nextInt();
				for(int i=0;i<delNum;i++) {
					lq.remove();
				}
				break;
			case 3:
				System.out.println(lq.remove()+"�� �����Ǿ����ϴ�.");
				break;
			case 4:
				System.out.print("������:");
				System.out.println(lq.size());
				break;
			case 5:
				System.out.print(lq.checkNode());
				System.out.println("");
				
				break;
			case 6:
				System.out.println(lq.peek());
				
				break;
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}
