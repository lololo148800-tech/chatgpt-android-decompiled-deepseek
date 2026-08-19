package p026Ao;

import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Ao.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C0658G {

    /* JADX INFO: renamed from: a */
    public final byte[] f1924a;

    /* JADX INFO: renamed from: b */
    public int f1925b;

    /* JADX INFO: renamed from: c */
    public int f1926c;

    /* JADX INFO: renamed from: d */
    public boolean f1927d;

    /* JADX INFO: renamed from: e */
    public final boolean f1928e;

    /* JADX INFO: renamed from: f */
    public C0658G f1929f;

    /* JADX INFO: renamed from: g */
    public C0658G f1930g;

    public C0658G() {
        this.f1924a = new byte[8192];
        this.f1928e = true;
        this.f1927d = false;
    }

    /* JADX INFO: renamed from: a */
    public final C0658G m1364a() {
        C0658G c0658g = this.f1929f;
        if (c0658g == this) {
            c0658g = null;
        }
        C0658G c0658g2 = this.f1930g;
        AbstractC16544l.m18091d(c0658g2);
        c0658g2.f1929f = this.f1929f;
        C0658G c0658g3 = this.f1929f;
        AbstractC16544l.m18091d(c0658g3);
        c0658g3.f1930g = this.f1930g;
        this.f1929f = null;
        this.f1930g = null;
        return c0658g;
    }

    /* JADX INFO: renamed from: b */
    public final void m1365b(C0658G segment) {
        AbstractC16544l.m18094g(segment, "segment");
        segment.f1930g = this;
        segment.f1929f = this.f1929f;
        C0658G c0658g = this.f1929f;
        AbstractC16544l.m18091d(c0658g);
        c0658g.f1930g = segment;
        this.f1929f = segment;
    }

    /* JADX INFO: renamed from: c */
    public final C0658G m1366c() {
        this.f1927d = true;
        return new C0658G(this.f1924a, this.f1925b, this.f1926c, true, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m1367d(C0658G sink, int i10) {
        AbstractC16544l.m18094g(sink, "sink");
        if (!sink.f1928e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f1926c;
        int i12 = i11 + i10;
        byte[] bArr = sink.f1924a;
        if (i12 > 8192) {
            if (sink.f1927d) {
                throw new IllegalArgumentException();
            }
            int i13 = sink.f1925b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC17678l.m19305l(bArr, 0, bArr, i13, i11);
            sink.f1926c -= sink.f1925b;
            sink.f1925b = 0;
        }
        int i14 = sink.f1926c;
        int i15 = this.f1925b;
        AbstractC17678l.m19305l(this.f1924a, i14, bArr, i15, i15 + i10);
        sink.f1926c += i10;
        this.f1925b += i10;
    }

    public C0658G(byte[] data, int i10, int i11, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(data, "data");
        this.f1924a = data;
        this.f1925b = i10;
        this.f1926c = i11;
        this.f1927d = z6;
        this.f1928e = z10;
    }
}
