package com.springai.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final OpenAiApiClient openAiApiClient;

    @Autowired
    public AiService(OpenAiApiClient openAiApiClient) {
        this.openAiApiClient = openAiApiClient;
    }

    public String generateText(String prompt) {
        // Implement AI logic here
        return openAiApiClient.generateText(prompt);
    }
}