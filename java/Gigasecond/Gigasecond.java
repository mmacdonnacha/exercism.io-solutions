import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private final int GIGASECOND = 1_000_000_000;
    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
        return birthDateTime.plusSeconds(GIGASECOND);
    }

}
