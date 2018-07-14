package com.twilio.sdk.twilio;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static final String ACCOUNT_SID = "ACe887ae8260540522719bba56939200bb";
	  public static final String AUTH_TOKEN = "aac45902ba5a3023b0b8a805c9a5caee";
	  
    public static void main( String[] args )
    {
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("**********"),
            new PhoneNumber("+12566661432"), 
            "Hi, This is a test run for twilio -Nishita").create();

        System.out.println(message.getSid());
    }
}
