/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ClasesController implements Initializable {

    @FXML
    private MenuItem miVerAlumnos;
    @FXML
    private MenuItem miCrearAlumno;
    @FXML
    private MenuItem miNuevaClase;
    @FXML
    private MenuItem miEditarClase;
    @FXML
    private MenuItem miVerPagos;
    @FXML
    private MenuItem miPagoManual;
    @FXML
    private MenuItem miAyuda;
    @FXML
    private MenuItem miAbout;
    @FXML
    private ComboBox<?> cmbAlumno;
    @FXML
    private Label dtpFechaInicio;
    @FXML
    private Label dtpFechaFin;
    @FXML
    private RadioButton rdbClassgap;
    @FXML
    private RadioButton rdbOnline;
    @FXML
    private RadioButton rdbPresencial;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnFiltrar;
    @FXML
    private TextField txtGanado;
    @FXML
    private TableColumn<?, ?> colId;
    @FXML
    private TableColumn<?, ?> colAlumno;
    @FXML
    private TableColumn<?, ?> colFechaClase;
    @FXML
    private TableColumn<?, ?> colHInicio;
    @FXML
    private TableColumn<?, ?> colHFin;
    @FXML
    private TableColumn<?, ?> colPrecio;
    @FXML
    private RadioButton rdbTodosOrigen;
    @FXML
    private RadioButton rdbTodosEstados;
    @FXML
    private RadioButton rdbRealizadas;
    @FXML
    private RadioButton rdbPendientes;
    @FXML
    private MenuItem miGraficaPago;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        ToggleGroup origen = new ToggleGroup();
        
        this.rdbTodosOrigen.setToggleGroup(origen);
        this.rdbClassgap.setToggleGroup(origen);
        this.rdbOnline.setToggleGroup(origen);
        this.rdbPresencial.setToggleGroup(origen);
        
        ToggleGroup estados = new ToggleGroup();
        this.rdbTodosEstados.setToggleGroup(estados);
        this.rdbPendientes.setToggleGroup(estados);
        this.rdbRealizadas.setToggleGroup(estados);

        this.rdbTodosOrigen.setSelected(true);
        this.rdbTodosEstados.setSelected(true);
        
    }    

    @FXML
    private void abrirVerAlumnos(ActionEvent event) {
    }

    @FXML
    private void crearAlumno(ActionEvent event) {
    }

    @FXML
    private void crearClase(ActionEvent event) {
    }

    @FXML
    private void editarClase(ActionEvent event) {
    }

    @FXML
    private void verPagos(ActionEvent event) {
    }

    @FXML
    private void abrirPagoManual(ActionEvent event) {
    }

    @FXML
    private void abrirAyuda(ActionEvent event) {
    }

    @FXML
    private void abrirAbout(ActionEvent event) {
    }

    @FXML
    private void abrirGraficaPago(ActionEvent event) {
    }
    
}
