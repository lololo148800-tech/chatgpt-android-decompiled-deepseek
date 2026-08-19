package mo;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0676j;
import p571X9.AbstractC9282f0;

/* JADX INFO: renamed from: mo.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C17354u extends AbstractC17325B {

    /* JADX INFO: renamed from: e */
    public static final C17352s f55304e;

    /* JADX INFO: renamed from: f */
    public static final C17352s f55305f;

    /* JADX INFO: renamed from: g */
    public static final byte[] f55306g;

    /* JADX INFO: renamed from: h */
    public static final byte[] f55307h;

    /* JADX INFO: renamed from: i */
    public static final byte[] f55308i;

    /* JADX INFO: renamed from: a */
    public final C0678l f55309a;

    /* JADX INFO: renamed from: b */
    public final List f55310b;

    /* JADX INFO: renamed from: c */
    public final C17352s f55311c;

    /* JADX INFO: renamed from: d */
    public long f55312d;

    static {
        Pattern pattern = C17352s.f55296e;
        f55304e = AbstractC9282f0.m9857c("multipart/mixed");
        AbstractC9282f0.m9857c("multipart/alternative");
        AbstractC9282f0.m9857c("multipart/digest");
        AbstractC9282f0.m9857c("multipart/parallel");
        f55305f = AbstractC9282f0.m9857c("multipart/form-data");
        f55306g = new byte[]{58, 32};
        f55307h = new byte[]{13, 10};
        f55308i = new byte[]{45, 45};
    }

    public C17354u(C0678l boundaryByteString, C17352s type, List list) {
        AbstractC16544l.m18094g(boundaryByteString, "boundaryByteString");
        AbstractC16544l.m18094g(type, "type");
        this.f55309a = boundaryByteString;
        this.f55310b = list;
        Pattern pattern = C17352s.f55296e;
        this.f55311c = AbstractC9282f0.m9857c(type + "; boundary=" + boundaryByteString.m1452r());
        this.f55312d = -1L;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: a */
    public final long mo4142a() throws EOFException {
        long j10 = this.f55312d;
        if (j10 != -1) {
            return j10;
        }
        long jM19030e = m19030e(null, true);
        this.f55312d = jM19030e;
        return jM19030e;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: b */
    public final C17352s mo4143b() {
        return this.f55311c;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: d */
    public final void mo4145d(InterfaceC0676j interfaceC0676j) throws EOFException {
        m19030e(interfaceC0676j, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final long m19030e(InterfaceC0676j interfaceC0676j, boolean z6) throws EOFException {
        C0675i c0675i;
        InterfaceC0676j c0675i2;
        if (z6) {
            c0675i2 = new C0675i();
            c0675i = c0675i2;
        } else {
            c0675i = 0;
            c0675i2 = interfaceC0676j;
        }
        List list = this.f55310b;
        int size = list.size();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            C0678l c0678l = this.f55309a;
            byte[] bArr = f55308i;
            byte[] bArr2 = f55307h;
            if (i10 >= size) {
                AbstractC16544l.m18091d(c0675i2);
                c0675i2.mo1327A0(bArr);
                c0675i2.mo1332b0(c0678l);
                c0675i2.mo1327A0(bArr);
                c0675i2.mo1327A0(bArr2);
                if (!z6) {
                    return j10;
                }
                AbstractC16544l.m18091d(c0675i);
                long j11 = j10 + c0675i.f1970Z;
                c0675i.m1429a();
                return j11;
            }
            C17353t c17353t = (C17353t) list.get(i10);
            C17348o c17348o = c17353t.f55302a;
            AbstractC16544l.m18091d(c0675i2);
            c0675i2.mo1327A0(bArr);
            c0675i2.mo1332b0(c0678l);
            c0675i2.mo1327A0(bArr2);
            int size2 = c17348o.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c0675i2.mo1333c0(c17348o.m19014m(i11)).mo1327A0(f55306g).mo1333c0(c17348o.m19018s(i11)).mo1327A0(bArr2);
            }
            AbstractC17325B abstractC17325B = c17353t.f55303b;
            C17352s c17352sMo4143b = abstractC17325B.mo4143b();
            if (c17352sMo4143b != null) {
                c0675i2.mo1333c0("Content-Type: ").mo1333c0(c17352sMo4143b.f55298a).mo1327A0(bArr2);
            }
            long jMo4142a = abstractC17325B.mo4142a();
            if (jMo4142a != -1) {
                c0675i2.mo1333c0("Content-Length: ").mo1329Q0(jMo4142a).mo1327A0(bArr2);
            } else if (z6) {
                AbstractC16544l.m18091d(c0675i);
                c0675i.m1429a();
                return -1L;
            }
            c0675i2.mo1327A0(bArr2);
            if (z6) {
                j10 += jMo4142a;
            } else {
                abstractC17325B.mo4145d(c0675i2);
            }
            c0675i2.mo1327A0(bArr2);
            i10++;
        }
    }
}
