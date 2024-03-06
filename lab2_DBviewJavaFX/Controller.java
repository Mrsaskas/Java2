package com.example.dbviewjavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.sql.*;

import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Button showid;

    @FXML
    private TableView<TableModel> tableid;

    @FXML
    private TableColumn<TableModel,String>city;


    @FXML
    private TableColumn<TableModel,String>lat;

    @FXML
    private TableColumn<TableModel,String>lng;

    @FXML
    private TableColumn<TableModel,String>country;

    @FXML
    private TableColumn<TableModel,String>iso2;

    @FXML
    private TableColumn<TableModel,String>admin_name;

    @FXML
    private TableColumn<TableModel,String>capital;

    @FXML
    private TableColumn<TableModel,String>population;

    @FXML
    private TableColumn<TableModel,String>population_proper;



    @FXML
    public void closebut(ActionEvent event)
    {
        System.exit(0);
    }






    ObservableList<TableModel> listview = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        city.setCellValueFactory(new PropertyValueFactory<>("city"));
        lat.setCellValueFactory(new PropertyValueFactory<>("lat"));
        lng.setCellValueFactory(new PropertyValueFactory<>("lng"));
        country.setCellValueFactory(new PropertyValueFactory<>("country"));
        iso2.setCellValueFactory(new PropertyValueFactory<>("iso2"));
        admin_name.setCellValueFactory(new PropertyValueFactory<>("admin_name"));
        capital.setCellValueFactory(new PropertyValueFactory<>("capital"));
        population.setCellValueFactory(new PropertyValueFactory<>("population"));
        population_proper.setCellValueFactory(new PropertyValueFactory<>("population_proper"));


        try{

            ConnectionDB cn = new ConnectionDB();
            Connection cnl = cn.fileconnection();

            String sql = "SELECT * FROM ua_cityes";
            Statement s = cnl.createStatement();
            ResultSet r = s.executeQuery(sql);

            while(r.next())
            {
                listview.add(new TableModel(
                        r.getString("city"),
                        r.getString("lat"),
                        r.getString("lng"),
                        r.getString("country"),
                        r.getString("iso2"),
                        r.getString("admin_name"),
                        r.getString("capital"),
                        r.getString("population"),
                        r.getString("population_proper")));
            }

            tableid.setItems(listview);

        }
        catch (Exception e){

        }

    }


}