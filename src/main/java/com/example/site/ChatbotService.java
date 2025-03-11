package com.example.site;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.json.JSONObject;
import java.io.InputStream;

public class ChatbotService {
    public static String getAIResponse(String message) {
        try {
            URL url = new URL("http://localhost:11434/api/generate");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // ساختار صحیح JSON
            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put("model", "partai/dorna-llama3");

            String systemPrompt = "شما یک هوش مصنوعی تخصصی برای فروشگاه لنوو هستید. فقط به سوالاتی که مربوط به محصولات لنوو هستند پاسخ بده. " +
                    "اگر سوالی نامرتبط دریافت کردی، پاسخ بده: «من فقط درباره محصولات لنوو اطلاعات دارم و نمی‌توانم به سوالات دیگر پاسخ دهم.»";

            String finalPrompt = systemPrompt + "\n\nکاربر: " + message + "\nچت‌بات:";

            jsonRequest.put("prompt", finalPrompt);
            jsonRequest.put("stream", false);

            try (OutputStream os = conn.getOutputStream()) {
                os.write(jsonRequest.toString().getBytes(StandardCharsets.UTF_8));
            }

            int responseCode = conn.getResponseCode();
            InputStream inputStream = (responseCode == 200) ? conn.getInputStream() : conn.getErrorStream();

            Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
            String response = scanner.useDelimiter("\\A").next();
            scanner.close();

            if (responseCode != 200) {
                return "⚠ خطا: سرور پاسخ مناسب نداد (" + responseCode + ")";
            }

            return extractResponse(response);
        } catch (Exception e) {
            e.printStackTrace();
            return "⚠ خطا در ارتباط با سرور هوش مصنوعی!";
        }
    }

    private static String extractResponse(String jsonResponse) {
        try {
            JSONObject json = new JSONObject(jsonResponse);
            return json.getString("response");
        } catch (Exception e) {
            return "❌ خطا در پردازش پاسخ!";
        }
    }
}


