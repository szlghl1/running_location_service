package demo.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

/**
 * Created by vagrant on 4/7/17.
 */

@Data
@RequiredArgsConstructor
@Embeddable
public class MedicalInfo {
    private final long bfr;
    private final long fmi;
}
