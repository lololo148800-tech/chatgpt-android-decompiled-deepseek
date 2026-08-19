package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p282L4.InterfaceC4934b;
import p525Vb.C8258a;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC4934b {
    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: a */
    public final List mo5546a() {
        return Collections.emptyList();
    }

    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: b */
    public final Object mo5547b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C8258a();
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: B4.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f2262Y.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0811f(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new C8258a();
    }
}
