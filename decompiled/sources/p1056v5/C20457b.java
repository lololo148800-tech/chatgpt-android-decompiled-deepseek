package p1056v5;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Bitmap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import mo.C17327D;
import mo.C17336c;
import mo.C17348o;
import mo.C17352s;
import p007A5.AbstractC0371f;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;
import p228J.C3847l0;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9252a0;
import p571X9.AbstractC9282f0;

/* JADX INFO: renamed from: v5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20457b {

    /* JADX INFO: renamed from: a */
    public final Object f64933a;

    /* JADX INFO: renamed from: b */
    public final Object f64934b;

    /* JADX INFO: renamed from: c */
    public final long f64935c;

    /* JADX INFO: renamed from: d */
    public final long f64936d;

    /* JADX INFO: renamed from: e */
    public final boolean f64937e;

    /* JADX INFO: renamed from: f */
    public final C17348o f64938f;

    public C20457b(C0657F c0657f) {
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        final int i10 = 0;
        this.f64933a = AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: v5.a

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C20457b f64932Z;

            {
                this.f64932Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C20457b c20457b = this.f64932Z;
                switch (i10) {
                    case 0:
                        C17336c c17336c = C17336c.f55214n;
                        return AbstractC9252a0.m9827b(c20457b.f64938f);
                    default:
                        String strM19012f = c20457b.f64938f.m19012f(SIPHeaderNames.CONTENT_TYPE);
                        if (strM19012f == null) {
                            return null;
                        }
                        Pattern pattern = C17352s.f55296e;
                        return AbstractC9282f0.m9858d(strM19012f);
                }
            }
        });
        final int i11 = 1;
        this.f64934b = AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: v5.a

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C20457b f64932Z;

            {
                this.f64932Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C20457b c20457b = this.f64932Z;
                switch (i11) {
                    case 0:
                        C17336c c17336c = C17336c.f55214n;
                        return AbstractC9252a0.m9827b(c20457b.f64938f);
                    default:
                        String strM19012f = c20457b.f64938f.m19012f(SIPHeaderNames.CONTENT_TYPE);
                        if (strM19012f == null) {
                            return null;
                        }
                        Pattern pattern = C17352s.f55296e;
                        return AbstractC9282f0.m9858d(strM19012f);
                }
            }
        });
        this.f64935c = Long.parseLong(c0657f.m1350W(Long.MAX_VALUE));
        this.f64936d = Long.parseLong(c0657f.m1350W(Long.MAX_VALUE));
        this.f64937e = Integer.parseInt(c0657f.m1350W(Long.MAX_VALUE)) > 0;
        int i12 = Integer.parseInt(c0657f.m1350W(Long.MAX_VALUE));
        C3847l0 c3847l0 = new C3847l0(3);
        for (int i13 = 0; i13 < i12; i13++) {
            String strM1350W = c0657f.m1350W(Long.MAX_VALUE);
            Bitmap.Config config = AbstractC0371f.f1262a;
            int iM21678L = AbstractC21322p.m21678L(strM1350W, ':', 0, false, 6);
            if (iM21678L == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strM1350W).toString());
            }
            String strSubstring = strM1350W.substring(0, iM21678L);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            String string = AbstractC21322p.m21711s0(strSubstring).toString();
            String strSubstring2 = strM1350W.substring(iM21678L + 1);
            AbstractC16544l.m18093f(strSubstring2, "substring(...)");
            c3847l0.m4576c(string, strSubstring2);
        }
        this.f64938f = c3847l0.m4577d();
    }

    /* JADX INFO: renamed from: a */
    public final void m21108a(C0656E c0656e) {
        c0656e.mo1329Q0(this.f64935c);
        c0656e.mo1328M(10);
        c0656e.mo1329Q0(this.f64936d);
        c0656e.mo1328M(10);
        c0656e.mo1329Q0(this.f64937e ? 1L : 0L);
        c0656e.mo1328M(10);
        C17348o c17348o = this.f64938f;
        c0656e.mo1329Q0(c17348o.size());
        c0656e.mo1328M(10);
        int size = c17348o.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0656e.mo1333c0(c17348o.m19014m(i10));
            c0656e.mo1333c0(": ");
            c0656e.mo1333c0(c17348o.m19018s(i10));
            c0656e.mo1328M(10);
        }
    }

    public C20457b(C17327D c17327d) {
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        final int i10 = 0;
        this.f64933a = AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: v5.a

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C20457b f64932Z;

            {
                this.f64932Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C20457b c20457b = this.f64932Z;
                switch (i10) {
                    case 0:
                        C17336c c17336c = C17336c.f55214n;
                        return AbstractC9252a0.m9827b(c20457b.f64938f);
                    default:
                        String strM19012f = c20457b.f64938f.m19012f(SIPHeaderNames.CONTENT_TYPE);
                        if (strM19012f == null) {
                            return null;
                        }
                        Pattern pattern = C17352s.f55296e;
                        return AbstractC9282f0.m9858d(strM19012f);
                }
            }
        });
        final int i11 = 1;
        this.f64934b = AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: v5.a

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C20457b f64932Z;

            {
                this.f64932Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C20457b c20457b = this.f64932Z;
                switch (i11) {
                    case 0:
                        C17336c c17336c = C17336c.f55214n;
                        return AbstractC9252a0.m9827b(c20457b.f64938f);
                    default:
                        String strM19012f = c20457b.f64938f.m19012f(SIPHeaderNames.CONTENT_TYPE);
                        if (strM19012f == null) {
                            return null;
                        }
                        Pattern pattern = C17352s.f55296e;
                        return AbstractC9282f0.m9858d(strM19012f);
                }
            }
        });
        this.f64935c = c17327d.f55183w0;
        this.f64936d = c17327d.f55184x0;
        this.f64937e = c17327d.f55177q0 != null;
        this.f64938f = c17327d.f55178r0;
    }
}
