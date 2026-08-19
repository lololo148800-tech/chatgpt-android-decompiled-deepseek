package p112E6;

import android.gov.nist.core.Separators;
import java.io.Closeable;
import java.io.IOException;
import p026Ao.AbstractC0668b;
import p026Ao.C0653B;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0677k;
import p959q8.C18639a;

/* JADX INFO: renamed from: E6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2352k implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0677k f7299Y;

    /* JADX INFO: renamed from: Z */
    public final C0678l f7300Z;

    /* JADX INFO: renamed from: o0 */
    public final C0678l f7301o0;

    /* JADX INFO: renamed from: p0 */
    public int f7302p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f7303q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f7304r0;

    /* JADX INFO: renamed from: s0 */
    public C2351j f7305s0;

    /* JADX INFO: renamed from: t0 */
    public final C0653B f7306t0;

    public C2352k(InterfaceC0677k interfaceC0677k, String str) {
        this.f7299Y = interfaceC0677k;
        C0675i c0675i = new C0675i();
        c0675i.m1444l1("--");
        c0675i.m1444l1(str);
        this.f7300Z = c0675i.m1417C0(c0675i.f1970Z);
        C0675i c0675i2 = new C0675i();
        c0675i2.m1444l1("\r\n--");
        c0675i2.m1444l1(str);
        this.f7301o0 = c0675i2.m1417C0(c0675i2.f1970Z);
        C0678l c0678l = C0678l.f1971p0;
        this.f7306t0 = AbstractC0668b.m1407g(C18639a.m19996n("\r\n--" + str + "--"), C18639a.m19996n(Separators.NEWLINE), C18639a.m19996n("--"), C18639a.m19996n(Separators.f31991SP), C18639a.m19996n(Separators.f31990HT));
    }

    /* JADX INFO: renamed from: a */
    public final long m3436a(long j10) {
        C0678l c0678l = this.f7301o0;
        long jMo1372d = c0678l.mo1372d();
        InterfaceC0677k interfaceC0677k = this.f7299Y;
        interfaceC0677k.mo1362s(jMo1372d);
        long jMo1351Z = interfaceC0677k.mo1353b().mo1351Z(c0678l);
        return jMo1351Z == -1 ? Math.min(j10, (interfaceC0677k.mo1353b().f1970Z - ((long) c0678l.mo1372d())) + 1) : Math.min(j10, jMo1351Z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7303q0) {
            return;
        }
        this.f7303q0 = true;
        this.f7305s0 = null;
        this.f7299Y.close();
    }
}
