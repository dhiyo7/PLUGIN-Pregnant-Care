import android.app.Application;

import com.plugin.pregnantcarekuwuk.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class font extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/BalooBhai-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()

        );
    }
}
