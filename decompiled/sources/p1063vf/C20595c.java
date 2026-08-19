package p1063vf;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.InterfaceC0315b;
import p1016t3.AbstractC19756F;
import p1016t3.C19751A;
import p1016t3.C19753C;
import p1016t3.C19757G;
import p1016t3.C19758H;
import p1016t3.C19760J;
import p1016t3.C19770U;
import p1016t3.C19773X;
import p1016t3.C19794u;
import p1016t3.C19797x;
import p1016t3.InterfaceC19759I;
import p103Dn.C2153Q0;
import p1053v3.C20422c;
import p523V9.AbstractC8160o6;
import p909nm.AbstractC17659D;
import pf.AbstractC18404t;
import pf.C18399o;
import pf.C18400p;
import pf.C18401q;
import pf.C18402r;
import pf.C18403s;

/* JADX INFO: renamed from: vf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20595c implements InterfaceC19759I {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20603k f65352Y;

    public C20595c(C20603k c20603k) {
        this.f65352Y = c20603k;
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo2753a(int i10) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo2754b(C20422c c20422c) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo2755c(C19751A c19751a) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo2756d(C19753C c19753c) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo2757e(boolean z6) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: f */
    public final void mo2758f(int i10, boolean z6) {
        Object value;
        Object c18403s;
        C2153Q0 c2153q0 = this.f65352Y.f65371e;
        do {
            value = c2153q0.getValue();
            c18403s = (AbstractC18404t) value;
            if (c18403s instanceof C18403s) {
                c18403s = new C18403s(z6);
            }
        } while (!c2153q0.m3250k(value, c18403s));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void mo2759g(float f10) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: h */
    public final void mo2760h(int i10) {
        C20603k c20603k = this.f65352Y;
        if (i10 == 1) {
            C2153Q0 c2153q0 = c20603k.f65371e;
            C18402r c18402r = C18402r.f58700a;
            c2153q0.getClass();
            c2153q0.m3251l(null, c18402r);
            return;
        }
        if (i10 == 2) {
            C2153Q0 c2153q1 = c20603k.f65371e;
            C18399o c18399o = C18399o.f58697a;
            c2153q1.getClass();
            c2153q1.m3251l(null, c18399o);
            return;
        }
        if (i10 == 3) {
            C2153Q0 c2153q2 = c20603k.f65371e;
            C18403s c18403s = new C18403s(c20603k.f65377k.m2241a0());
            c2153q2.getClass();
            c2153q2.m3251l(null, c18403s);
            return;
        }
        if (i10 != 4) {
            return;
        }
        C2153Q0 c2153q3 = c20603k.f65371e;
        C18400p c18400p = C18400p.f58698a;
        c2153q3.getClass();
        c2153q3.m3251l(null, c18400p);
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: i */
    public final void mo2761i(AbstractC19756F error) {
        C2153Q0 c2153q0;
        Object value;
        C19794u c19794u;
        Uri uri;
        AbstractC16544l.m18094g(error, "error");
        C20603k c20603k = this.f65352Y;
        C19797x c19797xM4513B = c20603k.f65377k.m4513B();
        String string = (c19797xM4513B == null || (c19794u = c19797xM4513B.f62786b) == null || (uri = c19794u.f62779a) == null) ? null : uri.toString();
        if (string != null) {
            AbstractC8160o6.m8731f(c20603k.f65370d, string.concat(" is corrupted. Removing from cache."), null, null, 6);
            C20608p c20608p = c20603k.f65369c;
            do {
                c2153q0 = c20608p.f65398q0;
                value = c2153q0.getValue();
            } while (!c2153q0.m3250k(value, AbstractC17659D.m19245g((Map) value, string)));
            ((InterfaceC0315b) c20608p.f65399r0.getValue()).mo922h(string);
        }
        C2153Q0 c2153q1 = c20603k.f65371e;
        int i10 = error.f62561Y;
        if (i10 == 0) {
            String message = error.getMessage();
            if (message == null) {
                message = "Unknown Source Error";
            }
            C18401q c18401q = new C18401q(message);
            c2153q1.getClass();
            c2153q1.m3251l(null, c18401q);
            return;
        }
        if (i10 != 1) {
            String message2 = error.getMessage();
            if (message2 == null) {
                message2 = "Unknown Error";
            }
            C18401q c18401q2 = new C18401q(message2);
            c2153q1.getClass();
            c2153q1.m3251l(null, c18401q2);
            return;
        }
        String message3 = error.getMessage();
        if (message3 == null) {
            message3 = "Unknown Renderer Error";
        }
        C18401q c18401q3 = new C18401q(message3);
        c2153q1.getClass();
        c2153q1.m3251l(null, c18401q3);
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo2763k(int i10, C19760J c19760j, C19760J c19760j2) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo2764l(C19758H c19758h) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo2765m(C19773X c19773x) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo2766n(C19757G c19757g) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo2767o(int i10) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo2768p(C19770U c19770u) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo2769q(AbstractC19756F abstractC19756F) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void mo2771s(boolean z6) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void mo2772t(List list) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void mo2773u(int i10, boolean z6) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void mo2774v(C19797x c19797x, int i10) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void mo2775w(int i10, int i11) {
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void mo2776x(boolean z6) {
    }
}
