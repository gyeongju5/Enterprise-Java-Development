import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s1 = request.getParameter("user");
        String s2 = request.getParameter("pass");
        String s3 = getServletContext().getInitParameter(("user"));
        String s4 = getServletContext().getInitParameter(("pass"));

        PrintWriter out = response.getWriter();

        if ( s1.equals(s3) && s2.equals(s4) ) {
            out.println("<html></body>Log in Succeeded!</body></html>");
        } else {
            out.println("<html></body>Log in Failed. Try Again!</body></html>");
        }
    }
}
