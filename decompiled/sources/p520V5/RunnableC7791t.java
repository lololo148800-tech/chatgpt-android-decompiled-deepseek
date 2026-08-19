package p520V5;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;
import p698d6.C13030c;

/* JADX INFO: renamed from: V5.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7791t implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24627Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7794w f24628Z;

    public /* synthetic */ RunnableC7791t(C7794w c7794w, int i10) {
        this.f24627Y = i10;
        this.f24628Z = c7794w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24627Y) {
            case 0:
                Drawable drawable = this.f24628Z;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                C7794w c7794w = this.f24628Z;
                Semaphore semaphore = c7794w.f24657X0;
                C13030c c13030c = c7794w.f24634A0;
                if (c13030c == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c13030c.mo14783s(c7794w.f24660Z.m15915a());
                    if (C7794w.f24631d1 && c7794w.f24654U0) {
                        if (c7794w.f24659Y0 == null) {
                            c7794w.f24659Y0 = new Handler(Looper.getMainLooper());
                            c7794w.f24661Z0 = new RunnableC7791t(c7794w, 0);
                        }
                        c7794w.f24659Y0.post(c7794w.f24661Z0);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
        }
    }
}
