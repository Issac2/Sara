package com.somnus.sara.biz.sample.service;

import com.somnus.sara.message.sample.MerAccountQueryRequest;
import com.somnus.sara.message.sample.MerAccountQueryResponse;
import com.somnus.sara.message.sample.MeracctRequest;

public interface MerAccountService {
	
	/**
	 * 根据交易账户号查询交易账户
	 * @param acctCode
	 * @return
	 */
	MerAccountQueryResponse selectByAcctcode(MerAccountQueryRequest request);

	void createMeracct(MeracctRequest request) throws Exception;
	
}
