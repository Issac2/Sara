package com.somnus.sara.biz.sample.ws.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.somnus.sara.biz.sample.service.MerAccountService;
import com.somnus.sara.biz.sample.ws.MerAccountWebservice;
import com.somnus.sara.message.Message;
import com.somnus.sara.message.sample.MerAccountQueryRequest;
import com.somnus.sara.message.sample.MerAccountQueryResponse;
import com.somnus.sara.message.sample.MeracctRequest;
import com.somnus.sara.support.common.Constants;
import com.somnus.sara.support.common.MessageUtil;
import com.somnus.sara.support.exceptions.BizException;
import com.somnus.rest.core.support.JsonUtils;

@WebService(endpointInterface = "com.somnus.sara.biz.sample.ws.MerAccountWebservice", serviceName = "merAccountResource")
public class MerAccountWebserviceImpl implements MerAccountWebservice{
	
	private transient Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MerAccountService merAccountService;

	@Override
	public MerAccountQueryResponse selectByAcctcode(MerAccountQueryRequest request) {
		log.info(Constants.REQUEST_MSG, JsonUtils.toString(request));
		MerAccountQueryResponse response = new MerAccountQueryResponse();
		try {
			response = merAccountService.selectByAcctcode(request);
			//返回成功报文
            MessageUtil.createCommMsg(response);
		} catch (BizException e) {
			log.error(Constants.BUSINESS_ERROR, e);
			// 组织错误报文
			MessageUtil.errRetrunInAction(response,e);
		} catch (Exception ex) {
			log.error(Constants.EXCEPTION_ERROR, ex);
			// 组织错误报文
			MessageUtil.createErrorMsg(response);
		}
		log.info(Constants.REPONSE_MSG, JsonUtils.toString(response));
		return response;
	}
	
	@Override
    public Message createMeracct(MeracctRequest request) {
        log.info(Constants.REQUEST_MSG, JsonUtils.toString(request));
        Message message = new Message();
        try {
        	merAccountService.createMeracct(request);
            //返回成功报文
            message = MessageUtil.createCommMsg();
        } catch (BizException e) {
            log.error(Constants.BUSINESS_ERROR, e);
            // 组织错误报文
            message = MessageUtil.errRetrunInAction(e);
        } catch (Exception ex) {
            log.error(Constants.EXCEPTION_ERROR, ex);
            // 组织错误报文
            message = MessageUtil.createErrorMsg();
        }
        log.info(Constants.REPONSE_MSG, JsonUtils.toString(message));
        return message;
    }

}
