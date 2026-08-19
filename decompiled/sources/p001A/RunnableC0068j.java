package p001A;

import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import io.sentry.android.ndk.SentryNdk;
import livekit.org.webrtc.EglBase10Impl;
import livekit.org.webrtc.EglBase14Impl;
import p202I.C3530f;

/* JADX INFO: renamed from: A.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0068j implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f302Y;

    public /* synthetic */ RunnableC0068j(int i10) {
        this.f302Y = i10;
    }

    /* JADX INFO: renamed from: a */
    private final void m249a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m250b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m251c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f302Y) {
            case 0:
                break;
            case 1:
                Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                break;
            case 2:
            case 3:
                break;
            case 4:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f36002a;
                break;
            case 5:
                SentryNdk.lambda$static$0();
                break;
            case 6:
                EglBase10Impl.EglConnection.lambda$new$1();
                break;
            default:
                EglBase14Impl.EglConnection.lambda$new$1();
                break;
        }
    }

    public /* synthetic */ RunnableC0068j(C3530f c3530f) {
        this.f302Y = 2;
    }
}
