module org.example.practicahibernate1an_eduardo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.practicahibernate1an_eduardo to javafx.fxml;
    exports org.example.practicahibernate1an_eduardo;
}