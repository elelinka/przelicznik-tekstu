package com.example.przeliczniktekstu.servlet;

import com.example.przeliczniktekstu.service.TextCounterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/text")
public class TextCounterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        TextCounterService service = new TextCounterService();

        request.setCharacterEncoding("UTF-8");

        String content = request.getParameter("content");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<i>" + content + "</i><br>");
        int allCharsCounter = content.length();
        writer.println("<h3>Ilość wszystkich znaków: " + allCharsCounter + "</h3>");
        int wordsCounter = service.countWords(content);
        writer.println("<h3>Ilość wszystkich słów: " + wordsCounter + "</h3>");
        int charsWithoutSpacesCounter = service.countCharsWithoutSpaces(content);
        writer.println("<h3>Ilość znaków bez spacji: " + charsWithoutSpacesCounter + "</h3>");
        boolean isPalindrome = service.isPalindrome(content);
        writer.println("<h3>Palindrom: " + isPalindrome + "</h3>");
    }
}