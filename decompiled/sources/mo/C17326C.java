package mo;

import p005A3.C0326m;
import p228J.C3847l0;

/* JADX INFO: renamed from: mo.C */
/* JADX INFO: loaded from: classes2.dex */
public final class C17326C {

    /* JADX INFO: renamed from: a */
    public C17358y f55160a;

    /* JADX INFO: renamed from: b */
    public EnumC17357x f55161b;

    /* JADX INFO: renamed from: d */
    public String f55163d;

    /* JADX INFO: renamed from: e */
    public C17347n f55164e;

    /* JADX INFO: renamed from: g */
    public AbstractC17329F f55166g;

    /* JADX INFO: renamed from: h */
    public C17327D f55167h;

    /* JADX INFO: renamed from: i */
    public C17327D f55168i;

    /* JADX INFO: renamed from: j */
    public C17327D f55169j;

    /* JADX INFO: renamed from: k */
    public long f55170k;

    /* JADX INFO: renamed from: l */
    public long f55171l;

    /* JADX INFO: renamed from: m */
    public C0326m f55172m;

    /* JADX INFO: renamed from: c */
    public int f55162c = -1;

    /* JADX INFO: renamed from: f */
    public C3847l0 f55165f = new C3847l0(3);

    /* JADX INFO: renamed from: b */
    public static void m18983b(String str, C17327D c17327d) {
        if (c17327d != null) {
            if (c17327d.f55179s0 != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c17327d.f55180t0 != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c17327d.f55181u0 != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c17327d.f55182v0 != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C17327D m18984a() {
        int i10 = this.f55162c;
        if (i10 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f55162c).toString());
        }
        C17358y c17358y = this.f55160a;
        if (c17358y == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC17357x enumC17357x = this.f55161b;
        if (enumC17357x == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f55163d;
        if (str != null) {
            return new C17327D(c17358y, enumC17357x, str, i10, this.f55164e, this.f55165f.m4577d(), this.f55166g, this.f55167h, this.f55168i, this.f55169j, this.f55170k, this.f55171l, this.f55172m);
        }
        throw new IllegalStateException("message == null");
    }
}
