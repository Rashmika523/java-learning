package DesignPatterns.Adapter;

public class Initialize {
    public static void main(String[] args) {

        AppServer legacyUI = new LegacyAppUI();
        legacyUI.displayData(new XMLData());

    }
}
