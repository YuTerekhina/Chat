module rugb.chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens rugb.chat to javafx.fxml;
    exports rugb.chat;
}