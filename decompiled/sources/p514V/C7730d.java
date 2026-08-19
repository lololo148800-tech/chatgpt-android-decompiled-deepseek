package p514V;

import android.hardware.camera2.CaptureRequest;
import java.util.UUID;
import p1138z.C21572a;
import p178H.InterfaceC3177w;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.EnumC3803G;
import p228J.EnumC3804G0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p326N.InterfaceC5569k;

/* JADX INFO: renamed from: V.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7730d implements InterfaceC3798D0, InterfaceC3177w {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24379Y;

    /* JADX INFO: renamed from: Z */
    public final C3825a0 f24380Z;

    public C7730d(C3825a0 c3825a0) {
        Object objMo39b;
        this.f24379Y = 0;
        this.f24380Z = c3825a0;
        Object objMo39b2 = null;
        try {
            objMo39b = c3825a0.mo39b(InterfaceC5569k.f18065a0);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        Class cls = (Class) objMo39b;
        if (cls != null && !cls.equals(C7729c.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        this.f24380Z.m4561x(InterfaceC3800E0.f11493G, EnumC3804G0.f11511q0);
        C3828c c3828c = InterfaceC5569k.f18065a0;
        C3825a0 c3825a1 = this.f24380Z;
        c3825a1.m4561x(c3828c, C7729c.class);
        try {
            objMo39b2 = c3825a1.mo39b(InterfaceC5569k.f18064W);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo39b2 == null) {
            c3825a1.m4561x(InterfaceC5569k.f18064W, C7729c.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7996a(CaptureRequest.Key key, Object obj) {
        EnumC3803G enumC3803G = EnumC3803G.f11504o0;
        this.f24380Z.m4560t(C21572a.m21847d0(key), enumC3803G, obj);
    }

    @Override // p178H.InterfaceC3177w
    /* JADX INFO: renamed from: o */
    public final C3825a0 mo3780o() {
        switch (this.f24379Y) {
            case 0:
                break;
        }
        return this.f24380Z;
    }

    @Override // p228J.InterfaceC3798D0
    /* JADX INFO: renamed from: x */
    public InterfaceC3800E0 mo3781x() {
        return new C7731e(C3835f0.m4568a(this.f24380Z));
    }

    public C7730d() {
        this.f24379Y = 1;
        this.f24380Z = C3825a0.m4558d();
    }
}
