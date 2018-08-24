package queue;

import java.util.Scanner;

public class Main {

	LinkedQueue lq = new LinkedQueue();
	
	public void run() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			
			System.out.println("1.[Queue] 내용 추가");
			System.out.println("2.[Queue] 내용 N개 삭제");
			System.out.println("3.[Queue] 내용 한 개 삭제");
			System.out.println("4.[Queue] 사이즈 출력");
			System.out.println("5.[Queue] 내용 출력");
			System.out.println("6.[Queue] 첫 번째 값 출력");
			System.out.println("7.종료");
			
			int menu = scan.nextInt();
			if(menu==7) break;
			
			switch(menu) {
			case 1:
				System.out.print("추가 할 값을 입력하세요:");
				Object addData = scan.next();
				lq.add(addData);
				break;
			case 2:
				System.out.print("삭제 할 개수를 입력하세요:");
				int delNum = scan.nextInt();
				for(int i=0;i<delNum;i++) {
					lq.remove();
				}
				break;
			case 3:
				System.out.println(lq.remove()+"가 삭제되었습니다.");
				break;
			case 4:
				System.out.print("사이즈:");
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
