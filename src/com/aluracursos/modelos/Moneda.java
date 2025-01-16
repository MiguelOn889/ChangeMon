package com.aluracursos.modelos;
// clase record llamada Moneda que tiene los atributos siguientes
public record Moneda(String time_last_update_utc,
                     String base_code,
                     String target_code,
                     double conversion_rate,
                     double conversion_result) {

    @Override
    public String toString() {
        return this.base_code;
    }
}
