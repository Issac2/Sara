package com.somnus.sara.biz.sample.resource;

import javax.validation.Valid;

import com.somnus.sara.message.Message;
import com.somnus.sara.message.sample.MerAccountQueryRequest;
import com.somnus.sara.message.sample.MerAccountQueryResponse;
import com.somnus.sara.message.sample.MeracctRequest;

public interface MerAccountResource {
	
	MerAccountQueryResponse selectByAcctcode(@Valid MerAccountQueryRequest request);
	
	Message createMeracct(@Valid MeracctRequest request);
}
