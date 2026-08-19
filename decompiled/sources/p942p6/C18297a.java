package p942p6;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.InterfaceC0661J;

/* JADX INFO: renamed from: p6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18297a implements InterfaceC0661J {

    /* JADX INFO: renamed from: Y */
    public long f58410Y;

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
        this.f58410Y += j10;
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() {
    }
}
