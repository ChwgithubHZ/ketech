package com.ketech.bq.ketech.dataconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/******************
 * @描述: 解密
 * @createBy:lailai
 * @data:2019/3/25 15:34
 */
public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private final static Logger logger = LoggerFactory.getLogger(MyPropertyPlaceholderConfigurer.class);

    public MyPropertyPlaceholderConfigurer(){

    }

    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if(isEncryptPropertyVal(propertyName)){
            if(propertyValue.equals("436659832D4FFFABEE4389066B7778F2")){
                // 公司
                return new String(EncryptUtil.decryptData("bGFpbGFqZGJjOm15c3FsOi8vMTkyLjE2OC4wLjgzOjMzMDYva2V0ZWNoP2NoYXJhY3RlckVuY29k" +
                        "aW5nPXV0Zjgmc2VydmVyVGltZXpvbmU9R01UJTJCOCZ1c2VTU0w9dHJ1ZWkxMjM0" ,"lailai1234"));
            }
            if(propertyValue.equals("A1A2F246FC707E724F8A4DFE4B34DCBC")){
                //正式服务器
                return new String(EncryptUtil.decryptData("bGFpbGFqZGJjOm15c3FsOi8vMTI3LjAuMC4xOjMzMDYva2VkdT91c2VVbmljb2RlPXRydWUmY2hh" +
                        "cmFjdGVyRW5jb2Rpbmc9dXRmOCZzZXJ2ZXJUaW1lem9uZT1HTVQlMkI4JnVzZVNTTD1mYWxzZWkx" +
                        "MjM0","lailai1234"));
            }
            if(propertyValue.equals("CD3D3F667C062528BA1248AC7BF075A1")){
                return new String(EncryptUtil.decryptData("bGFpbGFrZXRlY2hpMTIzNA==","lailai1234"));
            }
            if(propertyValue.equals("C8CECB514DCAB45F091FBD2045A146F5")){
                return new String(EncryptUtil.decryptData("bGFpbGFoVUIhdERaIXhWJGVsZEBycHUlaTEyMzQ=","lailai1234"));
            }
            if(propertyValue.equals("D65667653587081E201C42BD0A4FBBAF")){
                return new String(EncryptUtil.decryptData("bGFpbGFqZGJjOm9yYWNsZTp0aGluOkAxMC4yNTQuMi4xMTk6MTUyMTpvcmNsaTEyMzQ=" ,"lailai1234"));
            }
            if(propertyValue.equals("DEC8AB92BC47250CEE361E1351B9C6D1")){
                return new String(EncryptUtil.decryptData("bGFpbGFjIyNzZGZ6aTEyMzQ=","lailai1234"));
            }
            if(propertyValue.equals("DB083C13DFDBCE7FBB87B87B8088CF86")){
                return new String(EncryptUtil.decryptData("bGFpbGFzZGZ6aTEyMzQ=","lailai1234"));
            }
            return propertyValue;
        }else{
            return propertyValue;
        }
//        return super.convertProperty(propertyName, propertyValue);
    }


    /**
     * 判断属性值是否需要解密
     * @param propertyName
     * @return
     */
    private boolean isEncryptPropertyVal(String propertyName) {
        if (propertyName.contains("spring.datasource.vos.url") || propertyName.contains("spring.datasource.vos.username") | propertyName.contains("spring.datasource.vos.password")
                || propertyName.contains("spring.datasource.fz.url") || propertyName.contains("spring.datasource.fz.username") | propertyName.contains("spring.datasource.fz.password") ) {
            return true;
        } else {
            return false;
        }
    }

}
