package com.project.triple.model.entity.Reservation;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_reservation",
        sequenceName = "seq_reservation",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_reservation")
    private Long idx;
    private String ticketType;
    private String ticketNum;
    private String revName;
    private String email;
    private String hp;
    private String emergencyHp;

}
