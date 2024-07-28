package DesignPatterns.Adapter;

public class LegacyAppUI implements AppServer{

    @Override
    public void displayData(XMLData xmlData) {
        System.out.println("Xml Data, Old");
    }
}
