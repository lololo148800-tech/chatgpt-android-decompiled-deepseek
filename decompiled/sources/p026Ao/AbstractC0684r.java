package p026Ao;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0684r implements InterfaceC0661J {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0661J f1994Y;

    public AbstractC0684r(InterfaceC0661J delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f1994Y = delegate;
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f1994Y.close();
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Flushable
    public void flush() {
        this.f1994Y.flush();
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: h */
    public final C0665N mo1335h() {
        return this.f1994Y.mo1335h();
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public void mo1338n0(C0675i source, long j10) {
        AbstractC16544l.m18094g(source, "source");
        this.f1994Y.mo1338n0(source, j10);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f1994Y + ')';
    }
}
