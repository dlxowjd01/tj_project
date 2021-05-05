package com.tj.project.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tj.project.model.ProgrammingVO;

@Repository
public abstract class ProgrammingDAOImpl implements ProgrammingDAO{
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public int insertProgramming(ProgrammingVO vo) throws Exception {

		/** ID Generation Service */
		int lastpno = vo.getPno()+1;
		vo.setPno(lastpno);

		return sqlSession.insert("com.tj.project.service.programmingMapper.insertProgramming",vo);
	}

	/**
	 * 글을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
	@Override
	public int updateProgramming(ProgrammingVO vo) throws Exception {
		return sqlSession.update("com.tj.project.service.programmingMapper.updateProgramming",vo);
	}

	/**
	 * 글을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
	@Override
	public int deleteProgramming(int pno) throws Exception {
		return sqlSession.delete("com.tj.project.service.programmingMapper.deleteProgramming", pno);
	}

	/**
	 * 글을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SampleVO
	 * @return 조회한 글
	 * @exception Exception
	 */
	@Override
	public ProgrammingVO selectProgramming(int pno) throws Exception {
		ProgrammingVO resultVO = sqlSession.selectOne("com.tj.project.service.programmingMapper.selectProgramming",pno);

		return resultVO;
	}

	/**
	 * 글 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	@Override
	public List<ProgrammingVO> selectProgrammingList() throws Exception {
		return sqlSession.selectList("com.tj.project.service.programmingMapper.selectProgrammingList");
	}

	/**
	 * 글 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 글 총 갯수
	 * @exception
	 */
}
