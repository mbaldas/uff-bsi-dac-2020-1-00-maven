package contas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/FazerContasServlet")
public class FazerContasServlet extends HttpServlet{
    
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;
        int product = num1 * num2;
        PrintWriter output = response.getWriter();
        output.println("A soma:"+sum +"\n\nO produto :"+product);
    }
}
