package br.com.desafio.notification.dto;


import br.com.desafio.notification.constant.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;


public record GuestDTO(String name, String phone, String email, PaymentsDetailsDTO payment) {

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", paymentMethod=" + payment;
    }
}
