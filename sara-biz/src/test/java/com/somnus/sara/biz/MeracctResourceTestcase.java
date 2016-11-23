package com.somnus.sara.biz;

import org.junit.Test;

import com.somnus.sara.biz.sample.resource.MerAccountResource;
import com.somnus.sara.message.Message;
import com.somnus.sara.message.sample.MeracctRequest;
import com.somnus.sara.support.holder.ApplicationContextHolder;
import com.somnus.rest.core.support.JsonUtils;

public class MeracctResourceTestcase extends AbstractTestSupport {
	
	@Test
    public void createMeracct() throws Exception {
		MeracctRequest request = new MeracctRequest();
    	request.setSysCode("test");
    	request.setFrontName("test");
    	request.setFrontTime("test");
    	
    	request.setAcctCode("1020550026");
    	request.setMerCode("100091");
    	request.setAcctName("开发环境T1-0427");
    	request.setCurrency("156");
    	request.setBankCode("1103");
    	request.setBankName("华夏银行");
    	request.setBankKey("11");
    	request.setBranchCode("1111");
    	request.setBranchName("陆家嘴支行");
    	request.setBankAcctNo("1103");
    	request.setBankAcctName("11111");
    	request.setStatus("1");
    	
    	System.out.println("个人开户请求>>>:"+ JsonUtils.toString(request));
    	MerAccountResource meracctResource = ApplicationContextHolder.getBean(MerAccountResource.class);
    	Message message = meracctResource.createMeracct(request);
        System.out.println("个人开户响应<<<:"+JsonUtils.toString(message));
    }
	
}
