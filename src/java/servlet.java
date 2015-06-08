
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0653602
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) {

        try (PrintWriter out = response.getWriter()) {
            
            database.getQuantityForId();
            
        } catch (IOException ex) {
            System.err.println("Something Went Wrong: " + ex.getMessage());
        }
    }
    
}
