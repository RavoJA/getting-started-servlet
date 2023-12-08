package jar.dev.servlet.controller;

import jar.dev.servlet.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "user", urlPatterns = {"/save-user", "/user-by-id"})
public class UserServlet extends HttpServlet {

    User userOld = new User(9L, "Franck", "Andohaniato", "H");
    static List<User> userList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        super.init();
        userList.add(userOld);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String adress = req.getParameter("address");
        String sexe = req.getParameter("sexe");

        User user = new User(10L, name, adress, sexe);

        userList.add(user);

        System.out.println(" User azo " + user.toString());

        req.setAttribute("users", userList);


        req.getRequestDispatcher("WEB-INF/view/UserList.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        User existedUser = null;
        for (User user: userList ) {
            if (user.getId().equals(Long.valueOf(id))) {
                existedUser = user;
            }
        }
        req.setAttribute("user", existedUser);

        req.getRequestDispatcher("WEB-INF/view/UserForm.jsp").forward(req, resp);
    }
}
