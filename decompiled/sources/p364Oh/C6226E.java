package p364Oh;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p857kl.C16450Q;
import p909nm.C17690x;

/* JADX INFO: renamed from: Oh.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6226E {

    /* JADX INFO: renamed from: a */
    public final String f20269a;

    /* JADX INFO: renamed from: b */
    public final C16450Q f20270b;

    /* JADX INFO: renamed from: c */
    public final Map f20271c;

    /* JADX INFO: renamed from: d */
    public final String f20272d;

    /* JADX INFO: renamed from: e */
    public final int f20273e;

    /* JADX INFO: renamed from: f */
    public final String f20274f;

    /* JADX INFO: renamed from: g */
    public final boolean f20275g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1436k f20276h;

    public C6226E(int i10, String userAgent, String str, String auth0RedirectUrl) {
        C17690x c17690x = C17690x.f56481Y;
        C6229c c6229c = C6229c.f20290q0;
        AbstractC16544l.m18094g(userAgent, "userAgent");
        AbstractC16544l.m18094g(auth0RedirectUrl, "auth0RedirectUrl");
        this.f20269a = userAgent;
        this.f20270b = null;
        this.f20271c = c17690x;
        this.f20272d = str;
        this.f20273e = i10;
        this.f20274f = auth0RedirectUrl;
        this.f20275g = false;
        this.f20276h = c6229c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6226E)) {
            return false;
        }
        C6226E c6226e = (C6226E) obj;
        return AbstractC16544l.m18089b(this.f20269a, c6226e.f20269a) && AbstractC16544l.m18089b(this.f20270b, c6226e.f20270b) && this.f20271c.equals(c6226e.f20271c) && this.f20272d.equals(c6226e.f20272d) && this.f20273e == c6226e.f20273e && AbstractC16544l.m18089b(this.f20274f, c6226e.f20274f) && this.f20275g == c6226e.f20275g && this.f20276h.equals(c6226e.f20276h);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f20269a.hashCode() * 31) - 974720240) * 31) - 151608184) * 31) - 2016431656) * 31;
        C16450Q c16450q = this.f20270b;
        return this.f20276h.hashCode() + ((((((this.f20274f.hashCode() + ((((((((((((((((((((this.f20272d.hashCode() + ((((this.f20271c.hashCode() + ((((((iHashCode + (c16450q == null ? 0 : c16450q.hashCode())) * 31) - 2102700921) * 31) + 61764567) * 31)) * 31) + 2500706) * 31)) * 31) - 204257049) * 31) + this.f20273e) * 31) - 874893720) * 31) - 1534734836) * 31) - 1534734836) * 31) - 1378602247) * 31) + 631155627) * 31) - 1764357211) * 31) + 1034916490) * 31)) * 31) + 331217014) * 31) + (this.f20275g ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
