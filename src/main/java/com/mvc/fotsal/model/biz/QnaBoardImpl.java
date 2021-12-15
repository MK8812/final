package com.mvc.fotsal.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.fotsal.model.dao.QnaBoardDao;
import com.mvc.fotsal.model.dto.QnaBoardDto;

@Service
public class QnaBoardImpl implements QnaBoardBiz{

	@Autowired
	private QnaBoardDao dao;
	
	@Override
	public List<QnaBoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	public QnaBoardDto selectOne(int qna_no) {
		return null;
	}

	@Override
	public int insert(QnaBoardDto dto) {
		return 0;
	}

	@Override
	public int update(QnaBoardDto dto) {
		return 0;
	}

	@Override
	public int delete(int qna_no) {
		return 0;
	}

}