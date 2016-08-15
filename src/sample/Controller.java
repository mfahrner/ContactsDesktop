package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;




public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void addContact() {
        if (!textName.getText().equals("") && !textPhone.getText().equals("") && !textEmail.getText().equals("")) {
            contacts.add(new Contact(textName.getText(), textPhone.getText(), textEmail.getText()));

        } else if (textName.getText().equals("") && textPhone.getText().equals("") && textEmail.getText().equals("")) {

        }
    }

    public void removeContact() {
        Contact item = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(item);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }

    @FXML
    ListView list;

    @FXML
    TextField textName;

    @FXML
    TextField textPhone;

    @FXML
    TextField textEmail;
}
