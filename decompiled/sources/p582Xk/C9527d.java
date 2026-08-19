package p582Xk;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p059C5.C1601s;
import sl.C19666a;

/* JADX INFO: renamed from: Xk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C9527d implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final C19666a f28670Y;

    /* JADX INFO: renamed from: Z */
    public final Object f28671Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f28672o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC1426a f28673p0;

    public C9527d(C19666a key, Object config, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(config, "config");
        this.f28670Y = key;
        this.f28671Z = config;
        this.f28672o0 = interfaceC1436k;
        this.f28673p0 = new C1601s(11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28673p0.invoke();
    }
}
