package java.hometask2.oop;

public enum Role {
    GUEST("Guest"),
    ADMIN("Admin"),
    CUSTOMER("Customer")
    ; 
    
    private final String role;

    Role (String role) {
        this.role = role;
    }
    
    public String getRole() {
        return this.role;
    }
    
}
