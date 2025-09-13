package lk.ijse.BO;

import lk.ijse.DTO.UserDTO;

public interface UserBO extends SuperBO {
    public boolean save (UserDTO user) throws Exception;
}
