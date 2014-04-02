package utils.yihao.json;

public class JsonFormatUtil {
	public static String replacenull2blank(String jsonStr){
		String reStr = jsonStr.replaceAll(":\\s*null", ":"+"\"\"");
		return reStr.replaceAll("\"null\"", "\"\"");
		
	}
}
