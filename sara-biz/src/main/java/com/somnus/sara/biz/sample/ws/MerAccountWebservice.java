package com.somnus.sara.biz.sample.ws;

import javax.jws.WebService;
import javax.validation.Valid;

import com.somnus.sara.message.Message;
import com.somnus.sara.message.sample.MerAccountQueryRequest;
import com.somnus.sara.message.sample.MerAccountQueryResponse;
import com.somnus.sara.message.sample.MeracctRequest;

@WebService
public interface MerAccountWebservice {

	MerAccountQueryResponse selectByAcctcode(@Valid MerAccountQueryRequest request);

	Message createMeracct(@Valid MeracctRequest request);
}
