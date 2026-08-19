package p1159zo;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import p026Ao.AbstractC0668b;
import p026Ao.C0675i;
import p026Ao.C0679m;
import p026Ao.C0689w;

/* JADX INFO: renamed from: zo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C22215a implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f70402Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f70403Z;

    /* JADX INFO: renamed from: o0 */
    public final C0675i f70404o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f70405p0;

    /* JADX INFO: renamed from: q0 */
    public final Closeable f70406q0;

    public C22215a(boolean z6, int i10) {
        this.f70402Y = i10;
        switch (i10) {
            case 1:
                this.f70403Z = z6;
                C0675i c0675i = new C0675i();
                this.f70404o0 = c0675i;
                Inflater inflater = new Inflater(true);
                this.f70405p0 = inflater;
                this.f70406q0 = new C0689w(AbstractC0668b.m1403c(c0675i), inflater);
                break;
            default:
                this.f70403Z = z6;
                C0675i c0675i2 = new C0675i();
                this.f70404o0 = c0675i2;
                Deflater deflater = new Deflater(-1, true);
                this.f70405p0 = deflater;
                this.f70406q0 = new C0679m(AbstractC0668b.m1402b(c0675i2), deflater, 0);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f70402Y) {
            case 0:
                ((C0679m) this.f70406q0).close();
                break;
            default:
                ((C0689w) this.f70406q0).close();
                break;
        }
    }
}
