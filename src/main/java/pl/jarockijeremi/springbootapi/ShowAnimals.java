package pl.jarockijeremi.springbootapi;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("pokaż_zwierzątka")
public class ShowAnimals extends VerticalLayout {

    private AnimalRepo animalRepo;
    Label label = new Label();

    @Autowired
    public ShowAnimals(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;

        label.setText(animalRepo.findAll().toString());
    }
}
