package p026Ao;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0673g implements InterfaceC0661J {
    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: h */
    public final C0665N mo1335h() {
        return C0665N.f1937d;
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i source, long j10) throws EOFException {
        AbstractC16544l.m18094g(source, "source");
        source.skip(j10);
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() {
    }
}
