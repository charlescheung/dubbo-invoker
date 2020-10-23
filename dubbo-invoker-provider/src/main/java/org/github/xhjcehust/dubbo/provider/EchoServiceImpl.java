package org.github.xhjcehust.dubbo.provider;

import org.apache.dubbo.rpc.RpcContext;
import org.github.xhjcehust.dubbo.provider.api.EchoService;
import org.github.xhjcehust.dubbo.provider.model.Pojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiaohengjin<xiaohengjin@corp.netease.com>
 * @date 2019/8/10
 */
public class EchoServiceImpl implements EchoService {

    private static Logger logger = LoggerFactory.getLogger(EchoServiceImpl.class);

    @Override
    public String echoString(String str1,String str2) {
        logger.info("str1 = {},str2 = {}, context = {}", str1,str2, RpcContext.getContext().getAttachments());
        return str1+str2;
    }

    @Override
    public Pojo echoPojo(Pojo pojo) {
        logger.info("pojo = {}, context = {}", pojo, RpcContext.getContext().getAttachments());
        return pojo;
    }

}