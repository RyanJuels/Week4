package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Gains;

/**
 * Servlet implementation class calcNewRate
 */
@WebServlet("/calcNewRate")
public class calcNewRate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcNewRate() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userAmt = request.getParameter("amtAccount");
		String userRate = request.getParameter("accountRate");
		
		Gains tenYear = new Gains(Double.parseDouble(userAmt), Double.parseDouble(userRate));
		request.setAttribute("userGains", tenYear);
		getServletContext().getRequestDispatcher("/resultsOfTenYears.jsp").forward(request, response);
	}

}
