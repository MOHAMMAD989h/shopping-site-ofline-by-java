package com.example.site;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private TextField inputField;

    @FXML
    private TextArea chatArea;

    @FXML
    private Button sendButton;

    @FXML
    public void initialize() {
        sendButton.setOnAction(event -> sendMessage());
        chatArea.setEditable(false);
    }

    public void sendMessage() {
        String userMessage = inputField.getText();
        if (!userMessage.isEmpty()) {
            chatArea.appendText("شما: " + userMessage + "\n");

            if (!isRelatedToLenovo(userMessage)) {
                chatArea.appendText("⚠ این چت‌بات فقط درباره محصولات لنوو اطلاعات دارد!\n");
                inputField.clear();
                return;
            }

            try {
                String botResponse = ChatbotService.getAIResponse(userMessage);
                chatArea.appendText("چت‌بات: " + botResponse + "\n");
            } catch (Exception e) {
                chatArea.appendText("⚠ خطا در ارتباط با چت‌بات!\n");
            }

            inputField.clear();
        }
    }
    private boolean isRelatedToLenovo(String message) {
        String[] keywords = {"لنوو", "Lenovo", "لپ‌تاپ", "ThinkPad", "IdeaPad", "Yoga", "Legion", "کامپیوتر", "کیبورد", "مانیتور"};

        for (String keyword : keywords) {
            if (message.toLowerCase().contains(keyword.toLowerCase())) {
                return true; // پیام مرتبط است
            }
        }
        return false; // پیام بی‌ربط است
    }

    HelloController controller = new HelloController();

    public void homeToProfile(ActionEvent actionEvent) {
        controller.openNewWindow("profile1.fxml","Profile",actionEvent);
    }

    public void sabadpage(ActionEvent actionEvent) {
        controller.openNewWindow("sabad.fxml","Cart",actionEvent);
    }


    public void why(ActionEvent actionEvent) {
        controller.openNewWindow("why.fxml","Why",actionEvent);
    }

    public void backpage(ActionEvent actionEvent) {
        controller.openNewWindow("hello-view.fxml","Home",actionEvent);
    }
}
