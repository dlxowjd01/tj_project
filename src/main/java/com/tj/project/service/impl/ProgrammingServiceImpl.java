package com.tj.project.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tj.project.model.ProgrammingVO;
import com.tj.project.service.ProgrammingService;

@Service
public class ProgrammingServiceImpl implements ProgrammingService {

	@Inject
	private ProgrammingService programmingService;
	
	@Override
	public int insertProgramming(ProgrammingVO vo) throws Exception {
		return 0;
	}

	@Override
	public int updateProgramming(ProgrammingVO vo) throws Exception {
		return 0;
	}

	@Override
	public int deleteProgramming(int pon) throws Exception {
		return 0;
	}

	@Override
	public ProgrammingVO selectProgramming(int pno) throws Exception {
		return null;
	}

	@Override
	public List<ProgrammingVO> selectProgrammingList() throws Exception {
		return programmingService.selectProgrammingList();
	}

}
