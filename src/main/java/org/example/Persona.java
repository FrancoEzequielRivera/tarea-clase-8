package org.example;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor
public class Persona {
    @Getter @Setter @NonNull
    private String nombre;
    @Getter @Setter @NonNull
    private String apellido;
    @Getter @Setter @NonNull
    private LocalDate fecha;
}
