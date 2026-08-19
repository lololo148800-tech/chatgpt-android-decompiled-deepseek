package p1071w0;

import p1095x1.InterfaceC21098s;
import p204I1.C3578I;
import p523V9.AbstractC8088f6;
import p759g1.C13800b;
import p759g1.C13801c;

/* JADX INFO: renamed from: w0.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20710G0 {

    /* JADX INFO: renamed from: a */
    public final C3578I f65650a;

    /* JADX INFO: renamed from: b */
    public InterfaceC21098s f65651b = null;

    /* JADX INFO: renamed from: c */
    public InterfaceC21098s f65652c;

    public C20710G0(C3578I c3578i, InterfaceC21098s interfaceC21098s) {
        this.f65650a = c3578i;
        this.f65652c = interfaceC21098s;
    }

    /* JADX INFO: renamed from: a */
    public final long m21215a(long j10) {
        C13801c c13801cMo21528y;
        InterfaceC21098s interfaceC21098s = this.f65651b;
        C13801c c13801c = C13801c.f43585e;
        if (interfaceC21098s != null) {
            if (interfaceC21098s.mo21522h()) {
                InterfaceC21098s interfaceC21098s2 = this.f65652c;
                c13801cMo21528y = interfaceC21098s2 != null ? interfaceC21098s2.mo21528y(interfaceC21098s, true) : null;
            } else {
                c13801cMo21528y = c13801c;
            }
            if (c13801cMo21528y != null) {
                c13801c = c13801cMo21528y;
            }
        }
        float fM15306g = C13800b.m15306g(j10);
        float fM15306g2 = c13801c.f43586a;
        if (fM15306g >= fM15306g2) {
            float fM15306g3 = C13800b.m15306g(j10);
            fM15306g2 = c13801c.f43588c;
            if (fM15306g3 <= fM15306g2) {
                fM15306g2 = C13800b.m15306g(j10);
            }
        }
        float fM15307h = C13800b.m15307h(j10);
        float fM15307h2 = c13801c.f43587b;
        if (fM15307h >= fM15307h2) {
            float fM15307h3 = C13800b.m15307h(j10);
            fM15307h2 = c13801c.f43589d;
            if (fM15307h3 <= fM15307h2) {
                fM15307h2 = C13800b.m15307h(j10);
            }
        }
        return AbstractC8088f6.m8536b(fM15306g2, fM15307h2);
    }

    /* JADX INFO: renamed from: b */
    public final int m21216b(long j10, boolean z6) {
        if (z6) {
            j10 = m21215a(j10);
        }
        return this.f65650a.f10893b.m4313e(m21218d(j10));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21217c(long j10) {
        long jM21218d = m21218d(m21215a(j10));
        float fM15307h = C13800b.m15307h(jM21218d);
        C3578I c3578i = this.f65650a;
        int iM4311c = c3578i.f10893b.m4311c(fM15307h);
        return C13800b.m15306g(jM21218d) >= c3578i.m4258h(iM4311c) && C13800b.m15306g(jM21218d) <= c3578i.m4259i(iM4311c);
    }

    /* JADX INFO: renamed from: d */
    public final long m21218d(long j10) {
        InterfaceC21098s interfaceC21098s;
        InterfaceC21098s interfaceC21098s2 = this.f65651b;
        if (interfaceC21098s2 == null) {
            return j10;
        }
        if (!interfaceC21098s2.mo21522h()) {
            interfaceC21098s2 = null;
        }
        if (interfaceC21098s2 == null || (interfaceC21098s = this.f65652c) == null) {
            return j10;
        }
        InterfaceC21098s interfaceC21098s3 = interfaceC21098s.mo21522h() ? interfaceC21098s : null;
        return interfaceC21098s3 == null ? j10 : interfaceC21098s2.mo21521e(interfaceC21098s3, j10);
    }

    /* JADX INFO: renamed from: e */
    public final long m21219e(long j10) {
        InterfaceC21098s interfaceC21098s;
        InterfaceC21098s interfaceC21098s2 = this.f65651b;
        if (interfaceC21098s2 == null) {
            return j10;
        }
        if (!interfaceC21098s2.mo21522h()) {
            interfaceC21098s2 = null;
        }
        if (interfaceC21098s2 == null || (interfaceC21098s = this.f65652c) == null) {
            return j10;
        }
        InterfaceC21098s interfaceC21098s3 = interfaceC21098s.mo21522h() ? interfaceC21098s : null;
        return interfaceC21098s3 == null ? j10 : interfaceC21098s3.mo21521e(interfaceC21098s2, j10);
    }
}
