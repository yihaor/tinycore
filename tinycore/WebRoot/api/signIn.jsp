<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
  <head>
	<title>SignIn</title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>
	<meta http-equiv="description" content="this is testing"/>
  </head>
  <body>
	<s:form action="/JSignIn.do">
	<s:textfield name="email" label="账号"/>
	<s:textfield name="pwd" label="密码"/>
	<s:textfield name="country" label="国家" value="中国"/>
	<s:textfield name="language" label="语言" value="中文简体"/>
	<s:textfield name="token" label="授权" value="1cat1coffee"/>
	<s:submit value="提交"/>
	</s:form>
  </body>
  </html>
