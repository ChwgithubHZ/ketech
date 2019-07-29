package com.ketech.bq.ketech.dataconfig;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/*********
 * 描述：数据简单加密类
 * @author sdfzzx-8
 *
 */
public class EncryptUtil {
	
	    private static BASE64Encoder encoder = new BASE64Encoder();

	    /**
	     * @param @param  data
	     * @param @return 设定文件
	     * @return String    返回类型
	     * @throws
	     * @Title: toBase64
	     * @Description: TODO(加密)
	     */
	    public static String encryptData(byte[] data,String key) {
	        byte[] keyb = key.getBytes();
	        byte[] tmp = new byte[data.length + keyb.length];
	        System.arraycopy(keyb, 0, tmp, 0, (keyb.length/2));
	        System.arraycopy(data, 0, tmp, (keyb.length/2), data.length);
	        System.arraycopy(keyb, (keyb.length/2), tmp, (tmp.length-(keyb.length/2)), (keyb.length/2));
	        String result = encoder.encodeBuffer(tmp);
	        return result;
	    }

	    /**
	     * @param @param  data
	     * @param @return 设定文件
	     * @return byte[]    返回类型
	     * @throws
	     * @Title: outBase64
	     * @Description: TODO(解密)
	     */
	    public static byte[] decryptData(String data,String key) {
	        byte[] keyb = key.getBytes();
	        byte[] b = null;
	        BASE64Decoder decoder = new BASE64Decoder();
	        try {
	            b = decoder.decodeBuffer(data);
	            byte[] tmp = new byte[b.length - keyb.length];
	            System.arraycopy(b, (keyb.length/2), tmp, 0, b.length -(keyb.length));
	            return tmp;
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return b;
	    }
	    
	    
	    @SuppressWarnings("restriction")
		public static String baseDecoder(String data){
	    	BASE64Decoder  decoder = new BASE64Decoder();
	    	String jsonStr ="";
	    	try {
				byte[] json = decoder.decodeBuffer(data);
				jsonStr = new String(json);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}	    	
         	return jsonStr;
	    }

	public static void main(String[] args) throws IOException{

//		    byte[] data_json = ObjectSerialize.serialize(json);
//		地址  jdbc:mysql://192.168.0.83:3306/ketech?characterEncoding=utf8&useSSL=true
//		用户名：ketech
//		密码：hUB!tDZ!xV$eld@rpu%
		String data1 = new String("jdbc:mysql://192.168.0.83:3306/ketech?characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=true");
		String json_arg0=EncryptUtil.encryptData(data1.getBytes(),"lailai1234");
		System.out.println(json_arg0);

		byte[] bb=EncryptUtil.decryptData(json_arg0,"lailai1234");
		String data = new String(bb);
		System.out.println(data);
	}


}
