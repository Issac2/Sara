package com.somnus.sara.biz.sample.dao;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.somnus.sara.message.sample.MerAccount;
import com.somnus.sara.support.mybatis.annotation.MyBatisRepository;

@MyBatisRepository
public interface MerAccountDao {

	/**
	 * 根据交易账户号查询交易账户
	 * 
	 * @param acctCode
	 * @return
	 */
	PageList<MerAccount> selectByAcctcode(String acctCode, PageBounds pageBounds);

	List<MerAccount> selectByAcctcode(String acctCode);

	void insert(MerAccount meraccount);

}
