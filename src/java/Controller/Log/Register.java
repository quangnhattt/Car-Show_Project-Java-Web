/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Log;

import DAO.AccountDao;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Quang Nhat
 */
public class Register extends HttpServlet {

    public boolean checkAccountExist(List<Account> accounts, String acc) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccount().equalsIgnoreCase(acc)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String destpage = "register.jsp";

            String acc = request.getParameter("acc");
            String pass = request.getParameter("pass");
            String email = request.getParameter("email");
            String name = request.getParameter("name");

            Account a = new Account(acc, pass, email, name);
            //get DAO
            List<Account> accounts = new AccountDao().getAll();

            if (acc.isEmpty() || pass.isEmpty() || email.isEmpty() || name.isEmpty() || checkAccountExist(accounts, acc)) {
                //regis that bai
                String meswrong = "Đăng kí không thành công";
                request.setAttribute("meswrong", meswrong);
                request.getRequestDispatcher(destpage).forward(request, response);
            } else if (new AccountDao().add(a)) {
                //regis thanh cong
                request.setAttribute("account", a);
                String mesright = "Đăng kí thành công";
                request.setAttribute("mesright", mesright);
                request.getRequestDispatcher(destpage).forward(request, response);
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
