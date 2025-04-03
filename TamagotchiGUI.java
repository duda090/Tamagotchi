import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TamagotchiGUI extends Application {

    Tamagotchi tamagotchi;

    public TamagotchiGUI() {
        tamagotchi = new Tamagotchi(); // Criando um novo Tamagotchi
    }

    @Override
    public void start(Stage primaryStage) {
        // Criando os botões para interação com o Tamagotchi
        Button btnAlimentar = new Button("Alimentar");
        Button btnBrincar = new Button("Brincar");
        Button btnDormir = new Button("Dormir");
        Button btnEnvelhecer = new Button("Envelhecer");
        Button btnVerificarStatus = new Button("Verificar Status");

        // Definindo as ações dos botões
        btnAlimentar.setOnAction(e -> {
            tamagotchi.alimentar();
            tamagotchi.verificarStatus();
        });

        btnBrincar.setOnAction(e -> {
            tamagotchi.brincar();
            tamagotchi.verificarStatus();
        });

        btnDormir.setOnAction(e -> {
            tamagotchi.dormir();
            tamagotchi.verificarStatus();
        });

        btnEnvelhecer.setOnAction(e -> {
            tamagotchi.envelhecer();
            tamagotchi.verificarStatus();
        });

        btnVerificarStatus.setOnAction(e -> tamagotchi.verificarStatus());

        // Organizando os botões em um layout
        VBox vbox = new VBox(10, btnAlimentar, btnBrincar, btnDormir, btnEnvelhecer, btnVerificarStatus);
        vbox.setSpacing(10);

        // Criando a cena
        Scene scene = new Scene(vbox, 300, 200);

        // Configurando a janela
        primaryStage.setTitle("Tamagotchi GUI");
        primaryStage.setScene(scene);
        primaryStage.show(); // Exibe a janela
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação JavaFX
    }
}
