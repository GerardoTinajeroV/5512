
package com.mycompany.determinaredad;

class Persona {
    
     int edad;
    
    public Persona(int edad) {
        this.edad = edad;
    }
    
    public boolean Mayordedad() {
        return edad >= 18;
    }
    
}
