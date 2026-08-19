package p704dc;

import cc.C11699d;
import java.util.concurrent.atomic.AtomicReference;
import p165G9.C3020f;
import p501Ub.C7604f;
import p571X9.C9297h3;
import p571X9.EnumC9267c3;
import p571X9.EnumC9273d3;
import p571X9.EnumC9285f3;
import p571X9.EnumC9291g3;
import p615Z6.C10252z0;

/* JADX INFO: renamed from: dc.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13066g {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f41507a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static C9297h3 m14802a(C11699d c11699d) {
        EnumC9285f3 enumC9285f3;
        C10252z0 c10252z0 = new C10252z0();
        int i10 = c11699d.f35492a;
        if (i10 != 1) {
            enumC9285f3 = i10 != 2 ? EnumC9285f3.UNKNOWN_LANDMARKS : EnumC9285f3.ALL_LANDMARKS;
        } else {
            enumC9285f3 = EnumC9285f3.NO_LANDMARKS;
        }
        c10252z0.f30454Y = enumC9285f3;
        c10252z0.f30455Z = EnumC9267c3.NO_CLASSIFICATIONS;
        c10252z0.f30456o0 = EnumC9291g3.FAST;
        c10252z0.f30457p0 = EnumC9273d3.NO_CONTOURS;
        c10252z0.f30458q0 = Boolean.FALSE;
        c10252z0.f30459r0 = Float.valueOf(c11699d.f35493b);
        return new C9297h3(c10252z0);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14803b() {
        AtomicReference atomicReference = f41507a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z6 = C3020f.m3865a(C7604f.m7950c().m7952b(), "com.google.mlkit.dynamite.face") > 0;
        atomicReference.set(Boolean.valueOf(z6));
        return z6;
    }
}
