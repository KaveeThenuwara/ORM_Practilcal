package lk.ijse.BO.Impl;

import lk.ijse.BO.UserBO;
import lk.ijse.DAO.DAOFactory;
import lk.ijse.DAO.UserDAO;
import lk.ijse.DAO.impl.UserDAOImpl;
import lk.ijse.DTO.UserDTO;
import lk.ijse.Entity.User;

public class UserBOImpl implements UserBO {
    UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DaoType.User);
    @Override
    public boolean save(UserDTO user) throws Exception {
        return userDAO.save(new User(user.getId(),user.getName(),user.getAddress()));
    }
}
