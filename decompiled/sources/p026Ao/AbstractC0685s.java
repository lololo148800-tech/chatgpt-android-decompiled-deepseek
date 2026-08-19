package p026Ao;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.s */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0685s implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0663L f1995Y;

    public AbstractC0685s(InterfaceC0663L delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f1995Y = delegate;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public long mo1325H(C0675i sink, long j10) {
        AbstractC16544l.m18094g(sink, "sink");
        return this.f1995Y.mo1325H(sink, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1995Y.close();
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f1995Y.mo1326h();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f1995Y + ')';
    }
}
