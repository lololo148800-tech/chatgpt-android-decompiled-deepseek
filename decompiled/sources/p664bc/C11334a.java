package p664bc;

import ac.C10539a;
import android.os.SystemClock;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import p1060v9.AbstractC20502t;
import p813ij.C15026j;

/* JADX INFO: renamed from: bc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11334a {

    /* JADX INFO: renamed from: c */
    public static final C15026j f34266c = new C15026j("StreamingFormatChecker", "");

    /* JADX INFO: renamed from: a */
    public final LinkedList f34267a = new LinkedList();

    /* JADX INFO: renamed from: b */
    public long f34268b = -1;

    /* JADX INFO: renamed from: a */
    public final void m12769a(C10539a c10539a) {
        if (c10539a.f31260g != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f34267a;
        linkedList.add(Long.valueOf(jElapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l4 = (Long) linkedList.peekFirst();
            AbstractC20502t.m21157h(l4);
            if (jElapsedRealtime - l4.longValue() < 5000) {
                long j10 = this.f34268b;
                if (j10 == -1 || jElapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f34268b = jElapsedRealtime;
                    C15026j c15026j = f34266c;
                    if (Log.isLoggable((String) c15026j.f46724Y, 5)) {
                        String str = (String) c15026j.f46725Z;
                        AbstractC15256t.m16482t("StreamingFormatChecker", str != null ? str.concat("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.") : "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                    }
                }
            }
        }
    }
}
