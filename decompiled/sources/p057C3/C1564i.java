package p057C3;

import java.util.HashMap;
import java.util.Iterator;
import livekit.org.webrtc.WebrtcBuildVersion;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p305M3.C5285e;

/* JADX INFO: renamed from: C3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1564i {

    /* JADX INFO: renamed from: a */
    public final C5285e f4365a;

    /* JADX INFO: renamed from: b */
    public final long f4366b;

    /* JADX INFO: renamed from: c */
    public final long f4367c;

    /* JADX INFO: renamed from: d */
    public final long f4368d;

    /* JADX INFO: renamed from: e */
    public final long f4369e;

    /* JADX INFO: renamed from: f */
    public final int f4370f;

    /* JADX INFO: renamed from: g */
    public final long f4371g;

    /* JADX INFO: renamed from: h */
    public final HashMap f4372h;

    /* JADX INFO: renamed from: i */
    public long f4373i;

    public C1564i() {
        C5285e c5285e = new C5285e();
        m2426a("bufferForPlaybackMs", 2500, 0, WebrtcBuildVersion.maint_version);
        m2426a("bufferForPlaybackAfterRebufferMs", 5000, 0, WebrtcBuildVersion.maint_version);
        m2426a("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        m2426a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        m2426a("maxBufferMs", 50000, 50000, "minBufferMs");
        m2426a("backBufferDurationMs", 0, 0, WebrtcBuildVersion.maint_version);
        this.f4365a = c5285e;
        long j10 = 50000;
        this.f4366b = AbstractC20817s.m21390D(j10);
        this.f4367c = AbstractC20817s.m21390D(j10);
        this.f4368d = AbstractC20817s.m21390D(2500);
        this.f4369e = AbstractC20817s.m21390D(5000);
        this.f4370f = -1;
        this.f4371g = AbstractC20817s.m21390D(0);
        this.f4372h = new HashMap();
        this.f4373i = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static void m2426a(String str, int i10, int i11, String str2) {
        AbstractC20800b.m21315c(str + " cannot be less than " + str2, i10 >= i11);
    }

    /* JADX INFO: renamed from: b */
    public final int m2427b() {
        Iterator it = this.f4372h.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((C1562h) it.next()).f4359b;
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2428c(C1533K c1533k) {
        int i10;
        C1562h c1562h = (C1562h) this.f4372h.get(c1533k.f4168a);
        c1562h.getClass();
        C5285e c5285e = this.f4365a;
        synchronized (c5285e) {
            i10 = c5285e.f17406d * c5285e.f17404b;
        }
        boolean z6 = i10 >= m2427b();
        float f10 = c1533k.f4170c;
        long j10 = this.f4367c;
        long jMin = this.f4366b;
        if (f10 > 1.0f) {
            jMin = Math.min(AbstractC20817s.m21418s(f10, jMin), j10);
        }
        long jMax = Math.max(jMin, 500000L);
        long j11 = c1533k.f4169b;
        if (j11 < jMax) {
            c1562h.f4358a = !z6;
            if (z6 && j11 < 500000) {
                AbstractC20800b.m21332t("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || z6) {
            c1562h.f4358a = false;
        }
        return c1562h.f4358a;
    }

    /* JADX INFO: renamed from: d */
    public final void m2429d() {
        if (!this.f4372h.isEmpty()) {
            this.f4365a.m5823a(m2427b());
            return;
        }
        C5285e c5285e = this.f4365a;
        synchronized (c5285e) {
            if (c5285e.f17403a) {
                c5285e.m5823a(0);
            }
        }
    }
}
