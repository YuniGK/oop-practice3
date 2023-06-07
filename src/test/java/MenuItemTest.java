import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {
    @DisplayName("요리 생성")
    @Test
    void createTest() {
        assertThatCode(() -> new Cook("만두", 5000))//객체 생성
                .doesNotThrowAnyException();//객체 생성 시 오류 발생하지 않는다.
    }
}
