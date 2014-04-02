package db.yihao.token.dao;

import db.yihao.token.Token;

public interface TokenDAO {
	public void saveToken(Token token)throws Exception;
	public void updateToken(Token token)throws Exception;
	public void deleteToken(Token token)throws Exception;
	public Token findTokenByTokenString(String tokenStr)throws Exception;

}
