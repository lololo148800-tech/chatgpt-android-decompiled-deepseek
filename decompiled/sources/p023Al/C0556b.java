package p023Al;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p026Ao.AbstractC0668b;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p972qm.C18777j;

/* JADX INFO: renamed from: Al.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0556b extends InputStream {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1766Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1767Z;

    public /* synthetic */ C0556b(Object obj, int i10) {
        this.f1766Y = i10;
        this.f1767Z = obj;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        switch (this.f1766Y) {
            case 1:
                return (int) Math.min(((C0675i) this.f1767Z).f1970Z, Integer.MAX_VALUE);
            case 2:
                C0657F c0657f = (C0657F) this.f1767Z;
                if (c0657f.f1923o0) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c0657f.f1922Z.f1970Z, Integer.MAX_VALUE);
            case 3:
                return ((C0556b) this.f1767Z).available();
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1766Y) {
            case 0:
                AbstractC15070F.m16174b((InterfaceC15088n) this.f1767Z);
                break;
            case 1:
                break;
            case 2:
                ((C0657F) this.f1767Z).close();
                break;
            default:
                super.close();
                ((C0556b) this.f1767Z).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        switch (this.f1766Y) {
            case 0:
                InterfaceC15088n interfaceC15088n = (InterfaceC15088n) this.f1767Z;
                if (interfaceC15088n.mo1141e()) {
                    return -1;
                }
                if (interfaceC15088n.mo1139c().mo7821g()) {
                    AbstractC0575H.m1161I(C18777j.f59682Y, new C0555a(interfaceC15088n, null));
                }
                if (interfaceC15088n.mo1141e()) {
                    return -1;
                }
                return interfaceC15088n.mo1139c().readByte() & 255;
            case 1:
                C0675i c0675i = (C0675i) this.f1767Z;
                if (c0675i.f1970Z > 0) {
                    return c0675i.readByte() & 255;
                }
                return -1;
            case 2:
                C0657F c0657f = (C0657F) this.f1767Z;
                if (c0657f.f1923o0) {
                    throw new IOException("closed");
                }
                C0675i c0675i2 = c0657f.f1922Z;
                if (c0675i2.f1970Z == 0 && c0657f.f1921Y.mo1325H(c0675i2, 8192L) == -1) {
                    return -1;
                }
                return c0675i2.readByte() & 255;
            default:
                return ((C0556b) this.f1767Z).read();
        }
    }

    public String toString() {
        switch (this.f1766Y) {
            case 1:
                return ((C0675i) this.f1767Z) + ".inputStream()";
            case 2:
                return ((C0657F) this.f1767Z) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] b, int i10, int i11) throws Throwable {
        switch (this.f1766Y) {
            case 0:
                AbstractC16544l.m18094g(b, "b");
                InterfaceC15088n interfaceC15088n = (InterfaceC15088n) this.f1767Z;
                if (interfaceC15088n.mo1141e()) {
                    return -1;
                }
                if (interfaceC15088n.mo1139c().mo7821g()) {
                    AbstractC0575H.m1161I(C18777j.f59682Y, new C0555a(interfaceC15088n, null));
                }
                int iMo7814N = interfaceC15088n.mo1139c().mo7814N(b, i10, Math.min(AbstractC15070F.m16180h(interfaceC15088n), i11) + i10);
                if (iMo7814N >= 0) {
                    return iMo7814N;
                }
                return interfaceC15088n.mo1141e() ? -1 : 0;
            case 1:
                AbstractC16544l.m18094g(b, "sink");
                return ((C0675i) this.f1767Z).read(b, i10, i11);
            case 2:
                AbstractC16544l.m18094g(b, "data");
                C0657F c0657f = (C0657F) this.f1767Z;
                if (!c0657f.f1923o0) {
                    AbstractC0668b.m1405e(b.length, i10, i11);
                    C0675i c0675i = c0657f.f1922Z;
                    if (c0675i.f1970Z == 0 && c0657f.f1921Y.mo1325H(c0675i, 8192L) == -1) {
                        return -1;
                    }
                    return c0675i.read(b, i10, i11);
                }
                throw new IOException("closed");
            default:
                AbstractC16544l.m18094g(b, "b");
                return ((C0556b) this.f1767Z).read(b, i10, i11);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1136a() {
    }
}
