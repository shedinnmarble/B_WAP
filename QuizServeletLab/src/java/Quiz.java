
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 985219
 */
public class Quiz {
      private static String[] questions = {
        "3,1,4,1,5",
        "1,1,2,3,5",
        "1,4,9,16,25",
        "2,3,5,7,11",
        "1,2,4,8,16"
    };
    private static int[] answers = {9, 8, 36, 13, 32};

    private static void generateForm(HttpServletRequest request, HttpServletResponse response, int questionIndex, boolean end) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String score = request.getSession().getAttribute("score").toString();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet QuizServelet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form method=" + "post" + " >");
            out.println("<h1>The Number Quiz</h1>");
            out.println("<p>Your current score is "+score+".</P>");

            if (end == true) {
                out.println("<p>you have completed the Number Quiz, with a score of " + score + " out of 5</p>");
            } else {
                out.println("<p>Guess the next number in the sequence.</p>");
                out.println("<p>" + questions[questionIndex] + "</p>");
                out.println("<p>Your answer:<input type=\"text\" name=\"answer\" /></p>");
                out.println("<input type=\"submit\" value=\"submit\" />");
            }

            out.println("<input type=\"hidden\" value=\"" + questionIndex + "\" name=\"qIndex\" />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
    //get qIndex and Answer
        //check current answer and index is eaual
        //if is equal, then correct
        //if QIndex==answers.length-1  end this quiz and show the score
        int qIndex = Integer.parseInt(request.getParameter("qIndex"));
        int answer = Integer.parseInt(request.getParameter("answer"));
        if (answers[qIndex] == answer) {
            HttpSession s = request.getSession();
            int currentScore = Integer.parseInt(s.getAttribute("score").toString());
            s.setAttribute("score", ++currentScore);
        }
        if (qIndex != answers.length - 1) {
            generateForm(request, response, ++qIndex, false);
        } else {
           generateForm(request, response, ++qIndex, true);
        }
    }
}
