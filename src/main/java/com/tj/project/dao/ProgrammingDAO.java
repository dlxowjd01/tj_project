package com.tj.project.dao;

import java.util.List;

import com.tj.project.model.ProgrammingVO;

public interface ProgrammingDAO {
	
	public List<ProgrammingVO> selectProgrammingList() throws Exception;

	

	public ProgrammingVO selectProgramming(int bid) throws Exception;

	

	public int insertProgramming(ProgrammingVO vo) throws Exception;

	

	public int updateProgramming(ProgrammingVO vo) throws Exception;

	

	public int deleteProgramming(int pno) throws Exception;


}
