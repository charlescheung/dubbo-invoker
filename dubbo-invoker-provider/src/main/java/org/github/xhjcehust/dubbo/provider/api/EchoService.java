package org.github.xhjcehust.dubbo.provider.api;

import org.github.xhjcehust.dubbo.provider.model.Pojo;

/**
 * @author xiaohengjin<xiaohengjin@corp.netease.com>
 * @date 2019/8/10
 */
public interface EchoService {

    String echoString(String str1,String str2);

    Pojo echoPojo(Pojo pojo);

}