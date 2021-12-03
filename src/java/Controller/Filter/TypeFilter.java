/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Filter;

import DAO.DummyPage;
import DAO.Filter.BrandDao;
import DAO.Filter.TypeDao;
import DAO.ProductsDao;
import entity.Brand;
import entity.Products;
import entity.Type;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Quang Nhat
 */
public class TypeFilter extends HttpServlet {

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
            String page = request.getParameter("page");
            if (page == null || page.length() == 0) {
                page = "1";
            }
            int pageindex = Integer.parseInt(page);
            int pagesize = 2;
            DummyPage db = new DummyPage();
            ArrayList<Products> dummies = (ArrayList<Products>) db.getDummies(pagesize, pageindex);

            int totalRecords = db.countDummies();
            int totalpage = totalRecords % pagesize == 0 ? totalRecords / pagesize : totalRecords / pagesize + 1;

            request.setAttribute("totalpage", totalpage);
            request.setAttribute("pageindex", pageindex);
            request.setAttribute("dummies", dummies);

            /* TODO output your page here. You may use following sample code. */
            int id = Integer.parseInt(request.getParameter("id"));
            List<Products> ls = new ProductsDao().getAllbyTypeID(id);
            List<Type> lt = new TypeDao().getAll();
            List<Brand> lb = new BrandDao().getAll();

            request.setAttribute("listBrand", lb);
            request.setAttribute("listProducts", ls);
            request.setAttribute("listType", lt);
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
