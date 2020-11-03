package kr.co.service;

import kr.co.vo.BoardVO;
import java.util.List;

public interface BoardService {

	//게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	//게시글 목록 조회
	public List<BoardVO> list() throws Exception;

	//게시물 조회
	public BoardVO read(int bno) throws Exception;
}
