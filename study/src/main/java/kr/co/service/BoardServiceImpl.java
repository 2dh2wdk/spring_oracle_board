package kr.co.service;

import javax.inject.Inject;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.dao.BoardDAO;
import kr.co.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO dao;
	
	//게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}
	
	@Override
	public List<BoardVO> list() throws Exception {
		
		return dao.list();
	}
	
	@Override
	public BoardVO read(int bno) throws Exception {
		
		return dao.read(bno);
	}
}
