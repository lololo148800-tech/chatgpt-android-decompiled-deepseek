package so;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0657F;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.C0686t;
import p026Ao.InterfaceC0663L;
import p888m8.C17198c;
import p974qo.C18795k;

/* JADX INFO: renamed from: so.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC19696a implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final C0686t f62386Y;

    /* JADX INFO: renamed from: Z */
    public boolean f62387Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17198c f62388o0;

    public AbstractC19696a(C17198c c17198c) {
        this.f62388o0 = c17198c;
        this.f62386Y = new C0686t(((C0657F) c17198c.f54903d).f1921Y.mo1326h());
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public long mo1325H(C0675i sink, long j10) throws IOException {
        C17198c c17198c = this.f62388o0;
        AbstractC16544l.m18094g(sink, "sink");
        try {
            return ((C0657F) c17198c.f54903d).mo1325H(sink, j10);
        } catch (IOException e10) {
            ((C18795k) c17198c.f54902c).m20080l();
            m20660a();
            throw e10;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20660a() {
        C17198c c17198c = this.f62388o0;
        int i10 = c17198c.f54900a;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + c17198c.f54900a);
        }
        C0686t c0686t = this.f62386Y;
        C0665N c0665n = c0686t.f1996e;
        c0686t.f1996e = C0665N.f1937d;
        c0665n.mo1390a();
        c0665n.mo1391b();
        c17198c.f54900a = 6;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f62386Y;
    }
}
