package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	//支付宝小测试gt
	//dev添加的
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101500692594";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC5XX+TQsPvwHtQSgrPn9FAkkhH3weT/hF9lb4oth8OWULRtv+UYCbzx3WGEYEXC79xVY+Bmt4N+PUFJ2hfrUJLsqaaeYKBelKst19UfLG4ZMZ1H76P7GxPRqWIODNagFWWTP8GNX+YdIcjlAwthP8BbiRzRgqETS1bsOLKH62ZRvuJiS/mi1r/9F1wqgOKP5sMO1BT8VLGDdEh3+lDLyIh4no6DzvDqKqCLegF4DtfgGB0nYt6uMSmyOCcl3ZLCep0/IQdy08aC1pJPHUBtkFkpUfrEafMgV/1fXqNVJ/YswzGVru4a0A3wwOPjMc9HAb3QPL2rJSTKLKeo4LtOkurAgMBAAECggEADv2Ut6AKoHT8g/246hmOnp414joTLtC5MWLOwhQYZtypHrSh7qnn/IcA5hq8SdTVYqD8vgp8Mr0Tc5tAQZyNY/nKp2t0NmxiCz25I+gBp1vfANHUY2dHSxH3iRCidosyYLlRVns1GmsyEpqCcZvz03XI1NmxOAnVxTiE3ru5GlATus6n9uUvwgJLbsd1g61pTbULRIjrC2Wnxr2ht2XiYOIejLhBkg/d28CZ356k3HGpubXh5KaTq7dZTH8o25lBV+um91hBizl1bI9szYqtAW6xahEL3zhtXiUR/NlAMv89SnYf043xEoGmW4yQx8pd7OPh7bbtWgnKibG2JJZ6oQKBgQD3V2uVihqORyJoroYSo/Lhp/+WrawSibwNciuZWo3+zkvjoEY5kDUpfPt3qdapNoB/wGTaw1b+cLL3pFIhdxgj0wfq5mN5LzLm95P0CGbZBgcMT++IYHmph1GACZRO2xlokV+Gyznog+ixzIaS2b73i3EIdGahXAoK4ERpnpzsrQKBgQC/2qure0xZOQLEmQpsZqQzJ6Vc1Wd4DrBIZpqX7OY4chdKuepSqBRBqqg3i7wSTQHl82tUbxl/xeEdh5vSqn73Eik0aRj2yal4Pq7QVeG8aN9mRKaRybipje7rKJgUHkeDqnbOcgi9HWfmFllEmbIukD23Cd0VXc168cCtMWkMtwKBgH73p0hqTlt+9JDcFgL3mjRwMum8WTpi7d/RHcRpEb8dUyOUILhn6IJVoBi7XHAchDYQIzWRVNTkMVqiRW7cXc32BHh2r9WDfxPFP3Pj5De/ulp9pi5Rp+J4jkO1pyYbnp1pEqp1JFLRc9/hZ6t2j2svb2SxrAVk49rVaQj23QM5AoGAK5SZoGdurWnU5iG5i2w5amFcH91eFpiHlLqx7Ubj+Ph5sADRaJtDlrMUaSG1xBZ4Eusbe1+NVEf33gRa8hzGoIsgjwY8pHqko2rhvPN1Rp4v+QQpLj67UtCp8AMVoKRMLG2BdV3T/Fl8q3hyKLIdFpSvYC++Z8caEQ5vbSgnK7sCgYAR8+UjcW1ULvgnfrbXCZcFnF3R5DZ6bZtCClwITgb00vFCKeQnW5inoYHptd9M+BHN7kHgWjQb0meViY8+3YXUmFvgl7zExuE1hW8/nnyksJJpyxd2g/rm1ME5S4HtMpT4XCWpwseAuUGDBgorFh/CbLuXq3sxFoxFSctLF1RfoQ==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgTbSC0fLn+I4SxnDAlVp21kf+2UCjMZ7YMiOoQ/y6e2rxqXjpMoJ8JO04NvL//SwPhMBOvo32Cfo2wrZrUQT8dfTpkjdjm72wl0JUV0YVdPxqB/XGYo3o85msPpyi3rgnb/EWke/xLmjXOZ9IaLmrRTHonDy+qieRP3mjCF8GCs8pko3zlxu0/V5zonw9vhOduBJ9wWGObVQaKvsqVeyk15BNaXAcgFXUNCm3YMgX82l+94rPrhcC0tgETf2Cj4x3hODcASbn4oNmlfD25/inFm1deTLziqs5AbaJ4UQw0Ksg0V03/O4V2Jv8ZMCFwUMqPS1xveDzt9JeXPpz0frOQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

