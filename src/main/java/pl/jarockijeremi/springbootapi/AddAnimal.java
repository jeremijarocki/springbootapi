package pl.jarockijeremi.springbootapi;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("dodaj_zwierzątko")
public class AddAnimal extends VerticalLayout {

    private AnimalRepo animalRepo;

    private TextField animalName = new TextField("Podaj imię zwierzęcia");
    private TextField animalAge = new TextField("Podaj wiek zwierzęcia");
    private Button button = new Button("Naciśnij, by zapisać zwierzaczka w bazie danych");
    private Label label = new Label();

    @Autowired
    public AddAnimal(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;

        add(animalName,animalAge,button);



    }
}

