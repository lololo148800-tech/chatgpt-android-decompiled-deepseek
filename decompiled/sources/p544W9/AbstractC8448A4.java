package p544W9;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.AbstractC21073a0;
import p204I1.C3581L;
import p204I1.C3590f;
import p350O1.C6045C;
import p759g1.C13800b;
import p858ko.C16501d;
import p858ko.C16503f;
import p878lo.C17105n;
import p878lo.C17106o;

/* JADX INFO: renamed from: W9.A4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8448A4 {
    /* JADX INFO: renamed from: a */
    public static C17106o m9056a(C16503f c16503f, C16501d gestureState) {
        AbstractC16544l.m18094g(gestureState, "gestureState");
        long jM15319f = c16503f.f51190d.m15319f();
        long j10 = c16503f.f51188b;
        float f10 = gestureState.f51185b;
        long jM21558d = AbstractC21073a0.m21558d(f10, j10);
        C17105n c17105n = new C17105n(f10, j10);
        long jM9517e = AbstractC8753z4.m9517e(C13800b.m15311l(c16503f.f51189c, gestureState.f51184a) ^ (-9223372034707292160L), AbstractC21073a0.m21558d(f10, j10));
        if (C13800b.m15303d(jM9517e, -9223372034707292160L)) {
            jM9517e = 0;
        }
        return new C17106o(true, jM21558d, c17105n, jM9517e, new C13800b(gestureState.f51186c), jM15319f);
    }

    /* JADX INFO: renamed from: b */
    public static final C3590f m9057b(C6045C c6045c) {
        C3590f c3590f = c6045c.f19682a;
        c3590f.getClass();
        long j10 = c6045c.f19683b;
        return c3590f.subSequence(C3581L.m4270f(j10), C3581L.m4269e(j10));
    }

    /* JADX INFO: renamed from: c */
    public static final C3590f m9058c(C6045C c6045c, int i10) {
        C3590f c3590f = c6045c.f19682a;
        long j10 = c6045c.f19683b;
        return c3590f.subSequence(C3581L.m4269e(j10), Math.min(C3581L.m4269e(j10) + i10, c6045c.f19682a.f10934Y.length()));
    }

    /* JADX INFO: renamed from: d */
    public static final C3590f m9059d(C6045C c6045c, int i10) {
        C3590f c3590f = c6045c.f19682a;
        long j10 = c6045c.f19683b;
        return c3590f.subSequence(Math.max(0, C3581L.m4270f(j10) - i10), C3581L.m4270f(j10));
    }
}
