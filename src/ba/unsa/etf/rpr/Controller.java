package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;


public class Controller {
    public TextField drzavaNaziv;
    public Button stampaj;
    public Button pronadjiGlavniGrad;
    public Button obrisiDrzavu;
    public Button ispisGradova;
    public Menu file,help,view,jezik;
    public Main Main;
    public Label statusMsg;


    public void obrisiDrzavu(ActionEvent actionEvent) {
        Grad glavniGrad = GeografijaDAO.getInstance().glavniGrad(drzavaNaziv.getText());
        GeografijaDAO.getInstance().obrisiDrzavu(drzavaNaziv.getText());
        if(GeografijaDAO.getInstance().nadjiDrzavu(drzavaNaziv.getText())==null)statusMsg.setText("Drzava ne postoji ili je obrisana!");
        else statusMsg.setText("Drzava nije obrisana!");
    }

    public void ispisiGradove(ActionEvent actionEvent) {
        String s="Gradovi: "+Main.ispisiGradove();
        System.out.println(s);
        statusMsg.setText("Ispisujem gradove.");

    }

    public void pronadiDrzave(ActionEvent actionEvent) {

    }

    public void stampaj(ActionEvent actionEvent) {

    }

    public void glavniGrad(ActionEvent actionEvent) {
        Grad glavniGrad = GeografijaDAO.getInstance().glavniGrad(drzavaNaziv.getText());
        String imeGrada=glavniGrad.getNaziv();
        statusMsg.setText("Glavni grad unesene drzave: "+ imeGrada);
    }

    public void saveAs(ActionEvent actionEvent) {
    }

    public void jezik(ActionEvent actionEvent) {
    }
}
