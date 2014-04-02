package bb6.yihao.signin.actions;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;

import org.apache.commons.codec.digest.DigestUtils;

import utils.yihao.json.JsonFormatUtil;
import utils.yihao.json.JsonReponseUtil;
import utils.yihao.security.digester.PasswordHash;
import net.sf.json.JSONObject;
import bb6.yihao.token.services.TokenService;
import db.yihao.token.Token;

import com.opensymphony.xwork2.ActionSupport;


public class ApiSignInAction extends ActionSupport {
	public String email;
	public String pwd;
	public String country;
	public String language;
	public String token;
	public TokenService tokenService;

	public void doReply() throws Exception {
		if( (!"".equals(email) && email!=null)
				&&(!"".equals(pwd) && pwd!=null)
				&&"1cat1coffee".equals(token)
				)
			{
				LinkedHashMap<String, String> userKeyMap = new LinkedHashMap<String, String>();
				userKeyMap.put("email", email);
				userKeyMap.put("token", token);
				userKeyMap.put("country", country);
				userKeyMap.put("language", language);
				JSONObject reJO = JSONObject.fromObject(userKeyMap);
				System.out.println("sha512: "+DigestUtils.sha512Hex(pwd));
				System.out.println(JsonFormatUtil.replacenull2blank(reJO.toString()));
				String jsonReply = JsonFormatUtil.replacenull2blank(reJO.toString());
				JsonReponseUtil.Json2Reponse(jsonReply);
				System.out.println("------------------>>>Welcome here!"+email);
			}
	}

	public String doExecute() throws Exception {
		// TODO Auto-generated method stub
		String result = "input";
		System.out.println("------------------>>>Welcome here!");
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		cal.add(cal.MONTH, 3);
		Date expiryTime = cal.getTime();
		System.out.println("----------expiryTime: "+expiryTime);
		Token t = tokenService.createToken("yh-123", expiryTime);
		System.out.println("----------token: "+t.getTokenId());
		return result;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public TokenService getTokenService() {
		return tokenService;
	}

	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}
	

}
