package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.ijse.BO.BOFactory;
import lk.ijse.BO.UserBO;
import lk.ijse.DTO.UserDTO;

public class userController {

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtName;

    UserBO userBO = (UserBO) BOFactory.getBoFactory().getBo(BOFactory.BoType.User);

    @FXML
    void btnDeleteAction(ActionEvent event) {

    }

    @FXML
    void btnResetAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) throws Exception {
        String address = txtAddress.getText();
        String name = txtName.getText();

        UserDTO user = new UserDTO();
        user.setAddress(address);
        user.setName(name);

        boolean response  = userBO.save(user);

    }

    @FXML
    void btnUpdateAction(ActionEvent event) {

    }

}
