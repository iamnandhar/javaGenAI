package com.springai.learn;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final AiService aiService;

    @Autowired
    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateText(@RequestBody String prompt) {
        String result = aiService.generateText(prompt);
        return ResponseEntity.ok(result);
    }
}
