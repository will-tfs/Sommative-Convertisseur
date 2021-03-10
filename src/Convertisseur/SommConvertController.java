package Convertisseur;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SommConvertController implements Initializable
{
	@FXML
	private TextField txtf1;
	  
    @FXML
    private ImageView IMG;

    @FXML
    private TextField txtf4;

    @FXML
    private TextField txtf5;

    @FXML
    private TextField txtf2;

    @FXML
    private TextField txtf3;

    @FXML
    private ComboBox<String> cb1;
    ObservableList<String> list1=FXCollections.observableArrayList("Celsius (c)", "Farhenheit (f)");
    double [] Temperature= {1.0, 33.8};

   
    @FXML
    private TextArea txt4;

    @FXML
    private ComboBox<String> cb2;
    

    @FXML
    private TextArea txt5;

    @FXML
    private TextArea txt2;

    @FXML
    private ComboBox<String> cb3;
    ObservableList<String> list2=FXCollections.observableArrayList("Centimetre (cm)","Metre (m)","Kilometre (km)", "Pouce (Inch)", "Pied (ft)", "Mile (Mi)");
    double [] Distance= {1.0, 0.01, 0.000001, 0.393701, 0.0328084, 0.00000621 };
    
    @FXML
    private TextArea txt3;

    @FXML
    private ComboBox<String> cb4;
   

    @FXML
    private ComboBox<String> cb5;
    ObservableList<String> list3=FXCollections.observableArrayList("Pounds per Square Inch (PSI)", "Athmosphere (ATM)");
    double [] Pression= {14.7, 1.0};

    
    @FXML
    private TextArea txt1;

    @FXML
    private ComboBox<String> cb6;

    
    @FXML
    private TextField txtf8;

    @FXML
    private ComboBox<String> cb8;
    ObservableList<String> list4=FXCollections.observableArrayList("Volts (V)", "Amperes (AMPS)");
    double [] Current= {1.0, 12.0 };
    
    @FXML
    private ComboBox<String> cb7;

    @FXML
    private TextField txtf6;

    @FXML
    private Button btn1;
    
    @FXML
    private TextField txtf7;

	@Override
	public void initialize(URL location, ResourceBundle ressource) {
	{
		cb2.setItems(list1);
		cb1.setItems(list1);
		cb4.setItems(list2);
		cb3.setItems(list2);
		cb6.setItems(list3);
		cb5.setItems(list3);
		cb8.setItems(list4);
		cb7.setItems(list4);
	}
	}
	public void convertir0(TextField txtf1, TextField txtf2, ComboBox cb1, ComboBox  cb2)
	{
		int item1=cb1.getSelectionModel().getSelectedIndex();
		int item2=cb2.getSelectionModel().getSelectedIndex();
		double taux=Temperature [item2]/Temperature[item1];
		double res=taux*(Double.parseDouble(txtf1.getText()));
		txtf2.setText(String.format("%.6f",res));
	}
	
	public void convertir(TextField txtf3, TextField txtf4, ComboBox cb3, ComboBox  cb4)
	{
		int item1=cb3.getSelectionModel().getSelectedIndex();
		int item2=cb4.getSelectionModel().getSelectedIndex();
		double taux=Distance [item2]/Distance[item1];
		double res=taux*(Double.parseDouble(txtf3.getText()));
		txtf4.setText(String.format("%.6f",res));	
	}
	
	public void convertir2(TextField txtf5, TextField txtf6, ComboBox cb5, ComboBox  cb6)
	{
		int item1=cb5.getSelectionModel().getSelectedIndex();
		int item2=cb6.getSelectionModel().getSelectedIndex();
		double taux=Pression [item2]/Pression[item1];
		double res=taux*(Double.parseDouble(txtf5.getText()));
		txtf6.setText(String.format("%.6f",res));
		
	}
	public void convertir3(TextField txtf7, TextField txtf8, ComboBox cb7, ComboBox  cb8)
	{
		int item1=cb7.getSelectionModel().getSelectedIndex();
		int item2=cb8.getSelectionModel().getSelectedIndex();
		double taux=Current [item2]/Current[item1];
		double res=taux*(Double.parseDouble(txtf7.getText()));
		txtf8.setText(String.format("%.6f",res));
	}
	
	@FXML
	void calculer()
	{
		try
		{
			int nbr = Integer.parseInt(txtf3.getText());
		} catch (NumberFormatException e)
		{
			Alert alert=new Alert(AlertType.ERROR);
			alert.setHeaderText("Attention ERREUR");
			alert.setTitle("Error");
			alert.setContentText("Seulment les nombres sont permise");
			alert.show();
	}	
			
		}
	
	@FXML
	public void quitter ()
	 {
		 System.exit(0);
	 }
}