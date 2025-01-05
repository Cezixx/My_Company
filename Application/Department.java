package Application;

public enum Department {
    FRONTEND("Frontend"),
    BACKEND("Backend"),
    SOFTWARE("Oprogramowanie"),
    ADMINISTRATION("Administracja"),
    DIRECTORS("Dyrekcja"),
    CLOUD("Obsługa Chmury");

    private String name;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}