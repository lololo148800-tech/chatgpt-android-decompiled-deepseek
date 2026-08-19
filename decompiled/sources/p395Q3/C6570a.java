package p395Q3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p372P3.C6329k;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: Q3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6570a implements InterfaceC6333o {

    /* JADX INFO: renamed from: p */
    public static final int[] f21236p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: q */
    public static final int[] f21237q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f21238r;

    /* JADX INFO: renamed from: s */
    public static final byte[] f21239s;

    /* JADX INFO: renamed from: t */
    public static final int f21240t;

    /* JADX INFO: renamed from: c */
    public boolean f21243c;

    /* JADX INFO: renamed from: d */
    public long f21244d;

    /* JADX INFO: renamed from: e */
    public int f21245e;

    /* JADX INFO: renamed from: f */
    public int f21246f;

    /* JADX INFO: renamed from: g */
    public boolean f21247g;

    /* JADX INFO: renamed from: h */
    public long f21248h;

    /* JADX INFO: renamed from: j */
    public int f21250j;

    /* JADX INFO: renamed from: k */
    public long f21251k;

    /* JADX INFO: renamed from: l */
    public InterfaceC6335q f21252l;

    /* JADX INFO: renamed from: m */
    public InterfaceC6316H f21253m;

    /* JADX INFO: renamed from: n */
    public InterfaceC6310B f21254n;

    /* JADX INFO: renamed from: o */
    public boolean f21255o;

    /* JADX INFO: renamed from: b */
    public final int f21242b = 0;

    /* JADX INFO: renamed from: a */
    public final byte[] f21241a = new byte[1];

    /* JADX INFO: renamed from: i */
    public int f21249i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f21237q = iArr;
        int i10 = AbstractC20817s.f66106a;
        Charset charset = AbstractC10531d.f31242c;
        f21238r = "#!AMR\n".getBytes(charset);
        f21239s = "#!AMR-WB\n".getBytes(charset);
        f21240t = iArr[8];
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final int m7152b(C6330l c6330l) throws C19755E {
        boolean z6;
        c6330l.f20550r0 = 0;
        byte[] bArr = this.f21241a;
        c6330l.mo3047d(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C19755E.m20712a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i10 = (b >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z6 = this.f21243c) && (i10 < 10 || i10 > 13)) || (!z6 && (i10 < 12 || i10 > 14)))) {
            return z6 ? f21237q[i10] : f21236p[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f21243c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw C19755E.m20712a(null, sb2.toString());
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        return m7153d((C6330l) interfaceC6334p);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7153d(C6330l c6330l) {
        c6330l.f20550r0 = 0;
        byte[] bArr = f21238r;
        byte[] bArr2 = new byte[bArr.length];
        c6330l.mo3047d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f21243c = false;
            c6330l.mo3052j(bArr.length);
            return true;
        }
        c6330l.f20550r0 = 0;
        byte[] bArr3 = f21239s;
        byte[] bArr4 = new byte[bArr3.length];
        c6330l.mo3047d(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f21243c = true;
        c6330l.mo3052j(bArr3.length);
        return true;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        this.f21244d = 0L;
        this.f21245e = 0;
        this.f21246f = 0;
        if (j10 != 0) {
            InterfaceC6310B interfaceC6310B = this.f21254n;
            if (interfaceC6310B instanceof C6329k) {
                C6329k c6329k = (C6329k) interfaceC6310B;
                this.f21251k = (Math.max(0L, j10 - c6329k.f20539b) * 8000000) / ((long) c6329k.f20542e);
                return;
            }
        }
        this.f21251k = 0L;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E {
        int i10;
        int i11;
        int iMo4973f;
        int i12;
        AbstractC20800b.m21321i(this.f21253m);
        int i13 = AbstractC20817s.f66106a;
        if (((C6330l) interfaceC6334p).f20548p0 == 0 && !m7153d((C6330l) interfaceC6334p)) {
            throw C19755E.m20712a(null, "Could not find AMR header.");
        }
        if (!this.f21255o) {
            this.f21255o = true;
            boolean z6 = this.f21243c;
            String str = z6 ? "audio/amr-wb" : "audio/3gpp";
            int i14 = z6 ? 16000 : 8000;
            InterfaceC6316H interfaceC6316H = this.f21253m;
            C19787n c19787n = new C19787n();
            c19787n.f62714l = AbstractC19754D.m20711i(str);
            c19787n.f62715m = f21240t;
            c19787n.f62728z = 1;
            c19787n.f62694A = i14;
            interfaceC6316H.mo4971d(new C19788o(c19787n));
        }
        if (this.f21246f == 0) {
            try {
                int iM7152b = m7152b((C6330l) interfaceC6334p);
                this.f21245e = iM7152b;
                this.f21246f = iM7152b;
                if (this.f21249i == -1) {
                    this.f21248h = ((C6330l) interfaceC6334p).f20548p0;
                    this.f21249i = iM7152b;
                }
                if (this.f21249i == iM7152b) {
                    this.f21250j++;
                }
                iMo4973f = this.f21253m.mo4973f(interfaceC6334p, this.f21246f, true);
                if (iMo4973f == -1) {
                    i10 = -1;
                } else {
                    i12 = this.f21246f - iMo4973f;
                    this.f21246f = i12;
                    if (i12 <= 0) {
                        this.f21253m.mo4968a(this.f21251k + this.f21244d, 1, this.f21245e, 0, null);
                        this.f21244d += 20000;
                    }
                    i10 = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo4973f = this.f21253m.mo4973f(interfaceC6334p, this.f21246f, true);
            if (iMo4973f == -1) {
                i10 = -1;
            } else {
                i12 = this.f21246f - iMo4973f;
                this.f21246f = i12;
                if (i12 <= 0) {
                    this.f21253m.mo4968a(this.f21251k + this.f21244d, 1, this.f21245e, 0, null);
                    this.f21244d += 20000;
                }
                i10 = 0;
            }
        }
        C6330l c6330l = (C6330l) interfaceC6334p;
        if (!this.f21247g) {
            int i15 = this.f21242b;
            if ((i15 & 1) != 0) {
                long j10 = c6330l.f20547o0;
                if (j10 == -1 || !((i11 = this.f21249i) == -1 || i11 == this.f21245e)) {
                    C6338t c6338t = new C6338t(-9223372036854775807L);
                    this.f21254n = c6338t;
                    this.f21252l.mo3045F(c6338t);
                    this.f21247g = true;
                } else if (this.f21250j >= 20 || i10 == -1) {
                    C6329k c6329k = new C6329k(j10, this.f21248h, (int) ((((long) i11) * 8000000) / 20000), i11, (i15 & 2) != 0);
                    this.f21254n = c6329k;
                    this.f21252l.mo3045F(c6329k);
                    this.f21247g = true;
                }
            } else {
                C6338t c6338t2 = new C6338t(-9223372036854775807L);
                this.f21254n = c6338t2;
                this.f21252l.mo3045F(c6338t2);
                this.f21247g = true;
            }
        }
        return i10;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f21252l = interfaceC6335q;
        this.f21253m = interfaceC6335q.mo3044D(0, 1);
        interfaceC6335q.mo3061s();
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
