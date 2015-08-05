/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldeng.controller;

import com.ldeng.model.EntityManagerUtil;
import com.ldeng.model.Item;
import com.ldeng.service.ItemService;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Le
 */
@WebServlet(name = "UpdateItemServlet", urlPatterns = {"/UpdateItem"})
public class UpdateItemServlet extends HttpServlet {

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

        Integer id = Integer.parseInt(request.getParameter("id"));

        EntityManager entityManager = EntityManagerUtil.getEntityManager();
        request.setAttribute("item", entityManager.find(Item.class, id));

        RequestDispatcher rd = request.getRequestDispatcher("updateItem.jsp");
        rd.forward(request, response);

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

        Item item = new Item();
        Integer id = Integer.parseInt(request.getParameter("id"));
        item.setName(request.getParameter("name"));
        item.setPrice(Float.parseFloat(request.getParameter("price")));
        item.setType(request.getParameter("type"));
        item.setDesc(request.getParameter("desc"));

        ItemService itemService = new ItemService();
        itemService.updateItem(item, id);

        request.setAttribute("item", item);

        RequestDispatcher rd = request.getRequestDispatcher("updateItemSuccessful.jsp");
        rd.forward(request, response);

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
