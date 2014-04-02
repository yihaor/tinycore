package utils.yihao.json;
import java.io.PrintWriter;
import org.apache.struts2.ServletActionContext;

public class JsonReponseUtil {
	public static void Json2Reponse(String jsonStr) throws Exception{
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		PrintWriter out = ServletActionContext.getResponse().getWriter();
		out.print(jsonStr);
		out.flush();
		out.close();
	}
}
