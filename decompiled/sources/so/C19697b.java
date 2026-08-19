package so;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0656E;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.C0686t;
import p026Ao.InterfaceC0661J;
import p888m8.C17198c;

/* JADX INFO: renamed from: so.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C19697b implements InterfaceC0661J {

    /* JADX INFO: renamed from: Y */
    public final C0686t f62389Y;

    /* JADX INFO: renamed from: Z */
    public boolean f62390Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17198c f62391o0;

    public C19697b(C17198c c17198c) {
        this.f62391o0 = c17198c;
        this.f62389Y = new C0686t(((C0656E) c17198c.f54904e).f1918Y.mo1335h());
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.f62390Z) {
            return;
        }
        this.f62390Z = true;
        ((C0656E) this.f62391o0.f54904e).mo1333c0("0\r\n\r\n");
        C17198c c17198c = this.f62391o0;
        C0686t c0686t = this.f62389Y;
        c17198c.getClass();
        C0665N c0665n = c0686t.f1996e;
        c0686t.f1996e = C0665N.f1937d;
        c0665n.mo1390a();
        c0665n.mo1391b();
        this.f62391o0.f54900a = 3;
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Flushable
    public final synchronized void flush() {
        if (this.f62390Z) {
            return;
        }
        ((C0656E) this.f62391o0.f54904e).flush();
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: h */
    public final C0665N mo1335h() {
        return this.f62389Y;
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i source, long j10) {
        AbstractC16544l.m18094g(source, "source");
        if (this.f62390Z) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return;
        }
        C17198c c17198c = this.f62391o0;
        C0656E c0656e = (C0656E) c17198c.f54904e;
        if (c0656e.f1920o0) {
            throw new IllegalStateException("closed");
        }
        c0656e.f1919Z.m1438h1(j10);
        c0656e.m1330a();
        C0656E c0656e2 = (C0656E) c17198c.f54904e;
        c0656e2.mo1333c0(Separators.NEWLINE);
        c0656e2.mo1338n0(source, j10);
        c0656e2.mo1333c0(Separators.NEWLINE);
    }
}
