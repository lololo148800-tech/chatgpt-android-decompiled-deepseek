package p488Tn;

import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Tn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C7524g {

    /* JADX INFO: renamed from: a */
    public final byte[] f23854a;

    /* JADX INFO: renamed from: b */
    public int f23855b;

    /* JADX INFO: renamed from: c */
    public int f23856c;

    /* JADX INFO: renamed from: d */
    public AbstractC7527j f23857d;

    /* JADX INFO: renamed from: e */
    public boolean f23858e;

    /* JADX INFO: renamed from: f */
    public C7524g f23859f;

    /* JADX INFO: renamed from: g */
    public C7524g f23860g;

    public C7524g() {
        this.f23854a = new byte[8192];
        this.f23858e = true;
        this.f23857d = null;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int m7827a() {
        return this.f23854a.length - this.f23856c;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int m7828b() {
        return this.f23856c - this.f23855b;
    }

    /* JADX INFO: renamed from: c */
    public final C7524g m7829c() {
        C7524g c7524g = this.f23859f;
        C7524g c7524g2 = this.f23860g;
        if (c7524g2 != null) {
            AbstractC16544l.m18091d(c7524g2);
            c7524g2.f23859f = this.f23859f;
        }
        C7524g c7524g3 = this.f23859f;
        if (c7524g3 != null) {
            AbstractC16544l.m18091d(c7524g3);
            c7524g3.f23860g = this.f23860g;
        }
        this.f23859f = null;
        this.f23860g = null;
        return c7524g;
    }

    /* JADX INFO: renamed from: d */
    public final void m7830d(C7524g segment) {
        AbstractC16544l.m18094g(segment, "segment");
        segment.f23860g = this;
        segment.f23859f = this.f23859f;
        C7524g c7524g = this.f23859f;
        if (c7524g != null) {
            c7524g.f23860g = segment;
        }
        this.f23859f = segment;
    }

    /* JADX INFO: renamed from: e */
    public final C7524g m7831e() {
        AbstractC7527j c7523f = this.f23857d;
        if (c7523f == null) {
            C7524g c7524g = AbstractC7525h.f23861a;
            c7523f = new C7523f();
            this.f23857d = c7523f;
        }
        int i10 = this.f23855b;
        int i11 = this.f23856c;
        C7523f.f23852c.incrementAndGet((C7523f) c7523f);
        return new C7524g(this.f23854a, i10, i11, c7523f);
    }

    /* JADX INFO: renamed from: f */
    public final void m7832f(C7524g sink, int i10) {
        AbstractC16544l.m18094g(sink, "sink");
        if (!sink.f23858e) {
            throw new IllegalStateException("only owner can write");
        }
        if (sink.f23856c + i10 > 8192) {
            AbstractC7527j abstractC7527j = sink.f23857d;
            if (abstractC7527j != null && ((C7523f) abstractC7527j).f23853b > 0) {
                throw new IllegalArgumentException();
            }
            int i11 = sink.f23856c;
            int i12 = sink.f23855b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f23854a;
            AbstractC17678l.m19305l(bArr, 0, bArr, i12, i11);
            sink.f23856c -= sink.f23855b;
            sink.f23855b = 0;
        }
        int i13 = sink.f23856c;
        int i14 = this.f23855b;
        AbstractC17678l.m19305l(this.f23854a, i13, sink.f23854a, i14, i14 + i10);
        sink.f23856c += i10;
        this.f23855b += i10;
    }

    public C7524g(byte[] bArr, int i10, int i11, AbstractC7527j abstractC7527j) {
        this.f23854a = bArr;
        this.f23855b = i10;
        this.f23856c = i11;
        this.f23857d = abstractC7527j;
        this.f23858e = false;
    }
}
