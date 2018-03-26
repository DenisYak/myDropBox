package ru.geekbrains.myDropBox.frontend.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import ru.geekbrains.myDropBox.backend.model.SavedFile;

@SpringUI
public class MainUI extends UI{

    @Override
    public void init (VaadinRequest request) {
        VerticalLayout layoutSource = new VerticalLayout();
        layoutSource.setSizeUndefined();

        Grid<SavedFile> gridFiles = new Grid<>();
        gridFiles.setSizeFull();

        Panel pnlAutheticate = new Panel();
        pnlAutheticate.setSizeUndefined();

        Panel pnlActions = new Panel("Авторизация должна быть тут!");
        pnlActions.setSizeUndefined();

        Upload uploadFile = new Upload();
        uploadFile.setButtonCaption("Загрузить");
        Button btnDelete = new Button("Удалить");
        Button btnDownload = new Button("Скачать");

        HorizontalLayout layoutActions = new HorizontalLayout();
        layoutActions.setSizeUndefined();

        pnlActions.setContent(layoutActions);
        layoutActions.addComponents(uploadFile, btnDelete, btnDownload);
        layoutSource.addComponents(gridFiles, pnlAutheticate, pnlActions);
        this.setContent(layoutSource);




//        Label label = new Label("Hello world");
//        TextField textField = new TextField();
//        Button button = new Button("Click", clickEvent -> {
//            if (authentication.login()) {
//                label.setValue("Притвет");
//            } else {
//                label.setValue("Не привет. Я тебя не знаю");
//            }
//        });
//        VerticalLayout layout = new VerticalLayout(label, textField, button);
//        this.setContent(layout);
    }

}
