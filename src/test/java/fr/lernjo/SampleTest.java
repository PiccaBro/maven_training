package fr.lernjo;
import fr.lernejo.Sample;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {
    private final fr.lernejo.Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "1,1,2",
        "0,-1,-1"
    })
    void add_test(int a,int b, int exp_res) {
        int result = sample.op(Sample.Operation.ADD,a,b);

        Assertions.assertThat(result).isEqualTo(exp_res);
    }
    @ParameterizedTest
    @CsvSource({
        "0,1,0",
        "1,3,3"
    })
    void mult_test(int a, int b, int exp_res){
        int result = sample.op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(result).isEqualTo(exp_res);
    }
    @ParameterizedTest
    @CsvSource({
        "0,1",
        "1,1",
        "3,6"
    })
    void facto_test(int a,int exp_res){
        int result = sample.fact(a);
        Assertions.assertThat(result).isEqualTo(exp_res);
    }
}
