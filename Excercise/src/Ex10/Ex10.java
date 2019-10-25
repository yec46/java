package Ex10;

import java.util.List;

/*
 * 날짜: 2019.10.25
 * 이름: 박성
 */

public class Ex10 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
						
		}
	}

}
