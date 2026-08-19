package p112E6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.InterfaceC0663L;

/* JADX INFO: renamed from: E6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2351j implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2352k f7298Y;

    public C2351j(C2352k c2352k) {
        this.f7298Y = c2352k;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) {
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        C2352k c2352k = this.f7298Y;
        if (!AbstractC16544l.m18089b(c2352k.f7305s0, this)) {
            throw new IllegalStateException("closed");
        }
        long jM3436a = c2352k.m3436a(j10);
        if (jM3436a == 0) {
            return -1L;
        }
        return c2352k.f7299Y.mo1325H(sink, jM3436a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2352k c2352k = this.f7298Y;
        if (AbstractC16544l.m18089b(c2352k.f7305s0, this)) {
            c2352k.f7305s0 = null;
        }
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f7298Y.f7299Y.mo1326h();
    }
}
