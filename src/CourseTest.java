import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
public class CourseTest {
    @Test
    public void vehiculeIsNot2roues(){
        Vehicule vehicule = new Vehicule();
        assertFalse(vehicule.estDeuxroues());
    }
}