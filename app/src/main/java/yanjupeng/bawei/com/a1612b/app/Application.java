package yanjupeng.bawei.com.a1612b.app;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Created by Android Studio.
 *
 * @author : pengpeng
 * @Date : 2019/6/5
 * @Time : 19:38
 * @description :
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);

    }
}
