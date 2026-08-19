package p155G;

import java.util.UUID;
import p001A.C0100z;
import p1009s9.C19506i;
import p178H.C3142e0;
import p178H.C3169s;
import p178H.InterfaceC3177w;
import p228J.AbstractC3817T;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.C3837g0;
import p228J.EnumC3804G0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3818U;
import p326N.InterfaceC5569k;

/* JADX INFO: renamed from: G.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2953e implements InterfaceC3177w, InterfaceC3798D0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8835Y;

    /* JADX INFO: renamed from: Z */
    public final C3825a0 f8836Z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2953e(int i10) {
        Object objMo39b;
        this(C3825a0.m4558d());
        this.f8835Y = i10;
        switch (i10) {
            case 1:
                C3825a0 c3825a0M4558d = C3825a0.m4558d();
                this.f8836Z = c3825a0M4558d;
                Object objMo39b2 = null;
                try {
                    objMo39b = c3825a0M4558d.mo39b(InterfaceC5569k.f18065a0);
                    break;
                } catch (IllegalArgumentException unused) {
                    objMo39b = null;
                }
                Class cls = (Class) objMo39b;
                if (cls != null && !cls.equals(C3169s.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                C3828c c3828c = InterfaceC5569k.f18065a0;
                C3825a0 c3825a0 = this.f8836Z;
                c3825a0.m4561x(c3828c, C3169s.class);
                try {
                    objMo39b2 = c3825a0.mo39b(InterfaceC5569k.f18064W);
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                if (objMo39b2 == null) {
                    c3825a0.m4561x(InterfaceC5569k.f18064W, C3169s.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                return;
            default:
                this.f8836Z = C3825a0.m4558d();
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2953e m3777c(InterfaceC3805H interfaceC3805H) {
        C2953e c2953e = new C2953e(0);
        interfaceC3805H.mo41e(new C0100z(c2953e, 10, interfaceC3805H));
        return c2953e;
    }

    /* JADX INFO: renamed from: a */
    public C3142e0 m3778a() {
        C3837g0 c3837g0 = new C3837g0(C3835f0.m4568a(this.f8836Z));
        AbstractC3817T.m4557e(c3837g0);
        C3142e0 c3142e0 = new C3142e0(c3837g0);
        c3142e0.f9449p = C3142e0.f9447w;
        return c3142e0;
    }

    /* JADX INFO: renamed from: b */
    public C19506i m3779b() {
        return new C19506i(C3835f0.m4568a(this.f8836Z), 8);
    }

    @Override // p178H.InterfaceC3177w
    /* JADX INFO: renamed from: o */
    public C3825a0 mo3780o() {
        switch (this.f8835Y) {
            case 0:
                break;
        }
        return this.f8836Z;
    }

    @Override // p228J.InterfaceC3798D0
    /* JADX INFO: renamed from: x */
    public InterfaceC3800E0 mo3781x() {
        return new C3837g0(C3835f0.m4568a(this.f8836Z));
    }

    public C2953e(C3825a0 c3825a0) {
        Object objMo39b;
        this.f8835Y = 2;
        this.f8836Z = c3825a0;
        Object objMo39b2 = null;
        try {
            objMo39b = c3825a0.mo39b(InterfaceC5569k.f18065a0);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        Class cls = (Class) objMo39b;
        if (cls != null && !cls.equals(C3142e0.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        this.f8836Z.m4561x(InterfaceC3800E0.f11493G, EnumC3804G0.f11508Z);
        C3828c c3828c = InterfaceC5569k.f18065a0;
        C3825a0 c3825a1 = this.f8836Z;
        c3825a1.m4561x(c3828c, C3142e0.class);
        try {
            objMo39b2 = c3825a1.mo39b(InterfaceC5569k.f18064W);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo39b2 == null) {
            this.f8836Z.m4561x(InterfaceC5569k.f18064W, C3142e0.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
        Object objMo39b3 = -1;
        try {
            objMo39b3 = c3825a0.mo39b(InterfaceC3818U.f11566o);
        } catch (IllegalArgumentException unused3) {
        }
        if (((Integer) objMo39b3).intValue() == -1) {
            c3825a0.m4561x(InterfaceC3818U.f11566o, 2);
        }
    }
}
