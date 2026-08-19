package p377P9;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: P9.d */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC6378d extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6378d(Looper looper, int i10) {
        super(looper);
        switch (i10) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
