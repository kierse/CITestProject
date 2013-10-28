import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import org.junit.Test;

import com.themis.citest2.MainActivity;

public class MainActivityTest extends
        ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mainActivity;
    private TextView textView;

    @SuppressWarnings("deprecation")
    public MainActivityTest() {
        super("com.themis.CITest2", MainActivity.class);
    }

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        textView = (TextView) mainActivity.findViewById(com.themis.citest2.R.id.helloWorldTextView);
    }

    @Test
    public void testInitialConditions () {
        assertNotNull(mainActivity);
        assertNotNull(textView);
        assertEquals(true, false);
    }

    public void testMainActivityView () {
        String text = textView.getText().toString();
        assertEquals("Hello world!", text);
    }

}