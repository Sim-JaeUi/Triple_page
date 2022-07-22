package com.project.triple.model.entity.Air;

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
        name="seq_aircraft",
        sequenceName = "seq_aircraft",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "se1_aircraft")
    private Long idx;
    private Integer aircraftNum;
    private String aircraftName;
    private String madeBy;
    private Integer aircraftCapacity;
    private Integer normalSeat;
    private Integer economySeat;
    private Integer specialSeat;
    private Integer familySeat;
    private Integer vipSeat;
    private Integer airlineId;
}
