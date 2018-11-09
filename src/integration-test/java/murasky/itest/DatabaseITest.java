package murasky.itest;

import murasky.workit_trackit.WorkItTrackItApplication;
import murasky.workit_trackit.entity.Muscle;
import murasky.workit_trackit.repository.MuscleRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WorkItTrackItApplication.class)
@TestPropertySource(locations = "classpath:application-test.properties")
public class DatabaseITest {

    @Autowired
    private MuscleRespository muscleRespository;

    @Test
    public void verifyMusclesLoadedIntoDatabase(){
        List<Muscle> muscles = muscleRespository.findAll();
        assertThat(muscles).hasSize(4);
    }
}
