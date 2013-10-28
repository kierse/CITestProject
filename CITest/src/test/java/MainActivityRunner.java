import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.runners.model.InitializationError;
import java.io.File;

public class MainActivityRunner extends RobolectricTestRunner {
    public MainActivityRunner(Class testClass) throws InitializationError {
        super(testClass, new File("src/main"));
    }
}