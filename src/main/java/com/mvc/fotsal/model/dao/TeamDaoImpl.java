package com.mvc.fotsal.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.fotsal.model.dto.MercenaryDto;
import com.mvc.fotsal.model.dto.TeamDto;

@Repository
public class TeamDaoImpl implements TeamDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public TeamDto teamDetail(TeamDto dto) {
		return null;
	}

	@Override
	public List<TeamDto> selectList() {
		return null;
	}

	@Override
	public TeamDto selectOne(int team_no) {
		return null;
	}
	
	@Override
	public int insert(TeamDto dto) {
		return 0;
	}

	@Override
	public int update(TeamDto dto) {
		return 0;
	}

	@Override
	public int delete(int team_no) {
		return 0;
	}

	

}
