package p974qo;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.C0326m;
import p026Ao.C0656E;
import p026Ao.C0657F;

/* JADX INFO: renamed from: qo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C18794j implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final C0657F f59736Y;

    /* JADX INFO: renamed from: Z */
    public final C0656E f59737Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0326m f59738o0;

    public C18794j(C0657F source, C0656E sink, C0326m c0326m) {
        this.f59738o0 = c0326m;
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(sink, "sink");
        this.f59736Y = source;
        this.f59737Z = sink;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f59738o0.m955m(true, true, null);
    }
}
