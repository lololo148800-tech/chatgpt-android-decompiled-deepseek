package p1074w4;

import android.util.Pair;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p1016t3.C19755E;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p305M3.C5289i;
import p350O1.C6061j;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p523V9.AbstractC8159o5;

/* JADX INFO: renamed from: w4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20821d implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public InterfaceC6335q f66142a;

    /* JADX INFO: renamed from: b */
    public InterfaceC6316H f66143b;

    /* JADX INFO: renamed from: e */
    public InterfaceC20819b f66146e;

    /* JADX INFO: renamed from: c */
    public int f66144c = 0;

    /* JADX INFO: renamed from: d */
    public long f66145d = -1;

    /* JADX INFO: renamed from: f */
    public int f66147f = -1;

    /* JADX INFO: renamed from: g */
    public long f66148g = -1;

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        return AbstractC8159o5.m8722c((C6330l) interfaceC6334p);
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        this.f66144c = j10 == 0 ? 0 : 4;
        InterfaceC20819b interfaceC20819b = this.f66146e;
        if (interfaceC20819b != null) {
            interfaceC20819b.mo21426a(j11);
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0199  */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E, EOFException, InterruptedIOException {
        byte[] bArr;
        int iM21419t;
        AbstractC20800b.m21321i(this.f66143b);
        int i10 = AbstractC20817s.f66106a;
        int i11 = this.f66144c;
        if (i11 == 0) {
            AbstractC20800b.m21320h(((C6330l) interfaceC6334p).f20548p0 == 0);
            int i12 = this.f66147f;
            if (i12 != -1) {
                ((C6330l) interfaceC6334p).mo3052j(i12);
                this.f66144c = 4;
            } else {
                C6330l c6330l = (C6330l) interfaceC6334p;
                if (!AbstractC8159o5.m8722c(c6330l)) {
                    throw C19755E.m20712a(null, "Unsupported or unrecognized wav file type.");
                }
                c6330l.mo3052j((int) (c6330l.mo3048e() - c6330l.f20548p0));
                this.f66144c = 1;
            }
            return 0;
        }
        long jM21355j = -1;
        if (i11 == 1) {
            C20811m c20811m = new C20811m(8);
            C6330l c6330l2 = (C6330l) interfaceC6334p;
            C5289i c5289iM5830b = C5289i.m5830b(c6330l2, c20811m);
            if (c5289iM5830b.f17430a != 1685272116) {
                c6330l2.f20550r0 = 0;
            } else {
                c6330l2.m6941g(8, false);
                c20811m.m21344F(0);
                C6330l c6330l3 = (C6330l) interfaceC6334p;
                c6330l3.mo3047d(c20811m.f66092a, 0, 8, false);
                jM21355j = c20811m.m21355j();
                c6330l3.mo3052j(((int) c5289iM5830b.f17431b) + 8);
            }
            this.f66145d = jM21355j;
            this.f66144c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC20800b.m21320h(this.f66148g != -1);
                long j10 = this.f66148g - ((C6330l) interfaceC6334p).f20548p0;
                InterfaceC20819b interfaceC20819b = this.f66146e;
                interfaceC20819b.getClass();
                return interfaceC20819b.mo21428c((C6330l) interfaceC6334p, j10) ? -1 : 0;
            }
            ((C6330l) interfaceC6334p).f20550r0 = 0;
            C6330l c6330l4 = (C6330l) interfaceC6334p;
            C5289i c5289iM8725f = AbstractC8159o5.m8725f(1684108385, c6330l4, new C20811m(8));
            c6330l4.mo3052j(8);
            Pair pairCreate = Pair.create(Long.valueOf(c6330l4.f20548p0), Long.valueOf(c5289iM8725f.f17431b));
            this.f66147f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j11 = this.f66145d;
            if (j11 != -1 && jLongValue == 4294967295L) {
                jLongValue = j11;
            }
            long j12 = ((long) this.f66147f) + jLongValue;
            this.f66148g = j12;
            long j13 = c6330l4.f20547o0;
            if (j13 != -1 && j12 > j13) {
                AbstractC20800b.m21332t("WavExtractor", "Data exceeds input length: " + this.f66148g + ", " + j13);
                this.f66148g = j13;
            }
            InterfaceC20819b interfaceC20819b2 = this.f66146e;
            interfaceC20819b2.getClass();
            interfaceC20819b2.mo21427b(this.f66147f, this.f66148g);
            this.f66144c = 4;
            return 0;
        }
        C20811m c20811m2 = new C20811m(16);
        C6330l c6330l5 = (C6330l) interfaceC6334p;
        long j14 = AbstractC8159o5.m8725f(1718449184, c6330l5, c20811m2).f17431b;
        AbstractC20800b.m21320h(j14 >= 16);
        c6330l5.mo3047d(c20811m2.f66092a, 0, 16, false);
        c20811m2.m21344F(0);
        int iM21358m = c20811m2.m21358m();
        int iM21358m2 = c20811m2.m21358m();
        int iM21357l = c20811m2.m21357l();
        c20811m2.m21357l();
        int iM21358m3 = c20811m2.m21358m();
        int iM21358m4 = c20811m2.m21358m();
        int i13 = ((int) j14) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            ((C6330l) interfaceC6334p).mo3047d(bArr, 0, i13, false);
        } else {
            bArr = AbstractC20817s.f66111f;
        }
        byte[] bArr2 = bArr;
        C6330l c6330l6 = (C6330l) interfaceC6334p;
        c6330l6.mo3052j((int) (c6330l6.mo3048e() - c6330l6.f20548p0));
        C6061j c6061j = new C6061j(iM21358m, iM21358m2, iM21357l, iM21358m3, iM21358m4, bArr2);
        if (iM21358m == 17) {
            this.f66146e = new C20818a(this.f66142a, this.f66143b, c6061j);
        } else if (iM21358m == 6) {
            this.f66146e = new C20820c(this.f66142a, this.f66143b, c6061j, "audio/g711-alaw", -1);
        } else if (iM21358m == 7) {
            this.f66146e = new C20820c(this.f66142a, this.f66143b, c6061j, "audio/g711-mlaw", -1);
        } else {
            if (iM21358m == 1) {
                iM21419t = AbstractC20817s.m21419t(iM21358m4);
            } else if (iM21358m == 3) {
                iM21419t = iM21358m4 != 32 ? 0 : 4;
            } else if (iM21358m != 65534) {
                iM21419t = 0;
            } else {
                iM21419t = AbstractC20817s.m21419t(iM21358m4);
            }
            if (iM21419t == 0) {
                throw C19755E.m20713b("Unsupported WAV format type: " + iM21358m);
            }
            this.f66146e = new C20820c(this.f66142a, this.f66143b, c6061j, "audio/raw", iM21419t);
        }
        this.f66144c = 3;
        return 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f66142a = interfaceC6335q;
        this.f66143b = interfaceC6335q.mo3044D(0, 1);
        interfaceC6335q.mo3061s();
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
