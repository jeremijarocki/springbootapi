package pl.jarockijeremi.springbootapi;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("skauj_zwierzątko")

public class DeleteAnimal extends VerticalLayout {

    private AnimalRepo animalRepo;
    Label label = new Label();
    Button button = new Button("Naciśnij by skasować");

    @Autowired
    public DeleteAnimal (AnimalRepo animalRepo){
        this.animalRepo = animalRepo;



    }
}
