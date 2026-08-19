package p553Wh;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p092Dc.C1991h;
import p1143z4.C21795y;
import p1155zi.EnumC21895B;
import p229J0.C3952M3;
import p229J0.EnumC3898D3;

/* JADX INFO: renamed from: Wh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C8870f {

    /* JADX INFO: renamed from: a */
    public final EnumC21895B f27148a;

    /* JADX INFO: renamed from: b */
    public final C21795y f27149b;

    /* JADX INFO: renamed from: c */
    public final C3952M3 f27150c;

    /* JADX INFO: renamed from: d */
    public final C3952M3 f27151d;

    /* JADX INFO: renamed from: e */
    public final C1991h f27152e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0571F f27153f;

    public C8870f(EnumC21895B appType, C21795y navController, C3952M3 snackbarHostState, C3952M3 globalSnackbarHostState, C1991h resolver, InterfaceC0571F snackbarScope) {
        AbstractC16544l.m18094g(appType, "appType");
        AbstractC16544l.m18094g(navController, "navController");
        AbstractC16544l.m18094g(snackbarHostState, "snackbarHostState");
        AbstractC16544l.m18094g(globalSnackbarHostState, "globalSnackbarHostState");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(snackbarScope, "snackbarScope");
        this.f27148a = appType;
        this.f27149b = navController;
        this.f27150c = snackbarHostState;
        this.f27151d = globalSnackbarHostState;
        this.f27152e = resolver;
        this.f27153f = snackbarScope;
    }

    /* JADX INFO: renamed from: b */
    public static void m9547b(C8870f c8870f, int i10) {
        EnumC3898D3 enumC3898D3 = EnumC3898D3.f11877Y;
        c8870f.getClass();
        m9548c(c8870f, c8870f.f27152e.m3160b(i10), enumC3898D3, 12);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9548c(C8870f c8870f, String str, EnumC3898D3 enumC3898D3, int i10) {
        if ((i10 & 2) != 0) {
            enumC3898D3 = EnumC3898D3.f11877Y;
        }
        c8870f.m9549a(str, enumC3898D3, null, C8867c.f27138Z);
    }

    /* JADX INFO: renamed from: a */
    public final void m9549a(String message, EnumC3898D3 duration, String str, InterfaceC1426a onActionPerformed) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(duration, "duration");
        AbstractC16544l.m18094g(onActionPerformed, "onActionPerformed");
        AbstractC0575H.m1156D(this.f27153f, null, null, new C8869e(this, message, str, duration, onActionPerformed, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8870f)) {
            return false;
        }
        C8870f c8870f = (C8870f) obj;
        return this.f27148a == c8870f.f27148a && AbstractC16544l.m18089b(this.f27149b, c8870f.f27149b) && AbstractC16544l.m18089b(this.f27150c, c8870f.f27150c) && AbstractC16544l.m18089b(this.f27151d, c8870f.f27151d) && AbstractC16544l.m18089b(this.f27152e, c8870f.f27152e) && AbstractC16544l.m18089b(this.f27153f, c8870f.f27153f);
    }

    public final int hashCode() {
        return this.f27153f.hashCode() + ((this.f27152e.hashCode() + ((this.f27151d.hashCode() + ((this.f27150c.hashCode() + ((this.f27149b.hashCode() + (this.f27148a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
