package com.teamtreehouse;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Prompter storyPrompt = new Prompter();
        String story = null;
        try {
            story = storyPrompt.promptForTemplate();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Template tmpl = new Template(story);
        storyPrompt.run(tmpl);
    }
}
