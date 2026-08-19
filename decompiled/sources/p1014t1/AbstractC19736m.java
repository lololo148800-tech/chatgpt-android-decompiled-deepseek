package p1014t1;

import android.view.MotionEvent;
import androidx.compose.p650ui.input.pointer.PointerHoverIconModifierElement;
import p001A.C0093v0;
import p049Bm.InterfaceC1436k;
import p635a1.InterfaceC10459q;
import p759g1.C13800b;
import p759g1.C13803e;
import sk.C19662a;

/* JADX INFO: renamed from: t1.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19736m {

    /* JADX INFO: renamed from: a */
    public static final C19724a f62474a = new C19724a(1000);

    /* JADX INFO: renamed from: b */
    public static final C19724a f62475b;

    /* JADX INFO: renamed from: c */
    public static final StackTraceElement[] f62476c;

    static {
        new C19724a(1007);
        new C19724a(1008);
        f62475b = new C19724a(1002);
        f62476c = new StackTraceElement[0];
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m20679a(C19738o c19738o) {
        return !c19738o.f62485h && c19738o.f62481d;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m20680b(C19738o c19738o) {
        return (c19738o.m20692b() || !c19738o.f62485h || c19738o.f62481d) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m20681c(C19738o c19738o) {
        return c19738o.f62485h && !c19738o.f62481d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m20682d(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m20683e(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m20684f(C19738o c19738o, long j10) {
        long j11 = c19738o.f62480c;
        float fM15306g = C13800b.m15306g(j11);
        float fM15307h = C13800b.m15307h(j11);
        return fM15306g < 0.0f || fM15306g > ((float) ((int) (j10 >> 32))) || fM15307h < 0.0f || fM15307h > ((float) ((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m20685g(C19738o c19738o, long j10, long j11) {
        if (!m20683e(c19738o.f62486i, 1)) {
            return m20684f(c19738o, j10);
        }
        long j12 = c19738o.f62480c;
        float fM15306g = C13800b.m15306g(j12);
        float fM15307h = C13800b.m15307h(j12);
        return fM15306g < (-C13803e.m15333e(j11)) || fM15306g > C13803e.m15333e(j11) + ((float) ((int) (j10 >> 32))) || fM15307h < (-C13803e.m15331c(j11)) || fM15307h > C13803e.m15331c(j11) + ((float) ((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC10459q m20686h(InterfaceC10459q interfaceC10459q, C19724a c19724a) {
        return interfaceC10459q.mo428M(new PointerHoverIconModifierElement(c19724a, false));
    }

    /* JADX INFO: renamed from: i */
    public static final long m20687i(C19738o c19738o, boolean z6) {
        long jM15310k = C13800b.m15310k(c19738o.f62480c, c19738o.f62484g);
        if (z6 || !c19738o.m20692b()) {
            return jM15310k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: j */
    public static final void m20688j(C19729f c19729f, long j10, InterfaceC1436k interfaceC1436k, boolean z6) {
        C0093v0 c0093v0 = c19729f.f62461b;
        MotionEvent motionEvent = c0093v0 != null ? (MotionEvent) ((C19662a) c0093v0.f405p0).f62321Z : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z6) {
            motionEvent.setAction(3);
        }
        motionEvent.offsetLocation(-C13800b.m15306g(j10), -C13800b.m15307h(j10));
        interfaceC1436k.invoke(motionEvent);
        motionEvent.offsetLocation(C13800b.m15306g(j10), C13800b.m15307h(j10));
        motionEvent.setAction(action);
    }
}
