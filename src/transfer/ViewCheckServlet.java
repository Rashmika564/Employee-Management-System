package transfer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewCheckServlet")
public class ViewCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ViewCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Transfer> RtransferDetails = TransferDBUtil.getCheckedTransferDetails();
		request.setAttribute("RtransferDetails", RtransferDetails);
		
		if(RtransferDetails.size() != 0) {
			Transfer tr = RtransferDetails.get(0);
			String eid = tr.getEmpID();
		
			List<Employee> emploDetails = TransferDBUtil.getEmployeeDetails(eid);
			request.setAttribute("emploDetails", emploDetails);
		}
		
			RequestDispatcher dis2 = request.getRequestDispatcher("CheckTransfer.jsp");
			dis2.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
