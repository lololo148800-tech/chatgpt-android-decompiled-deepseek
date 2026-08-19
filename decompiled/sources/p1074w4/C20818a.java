package p1074w4;

import android.gov.nist.javax.sip.parser.TokenTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p350O1.C6061j;
import p372P3.C6330l;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;

/* JADX INFO: renamed from: w4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20818a implements InterfaceC20819b {

    /* JADX INFO: renamed from: m */
    public static final int[] f66120m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f66121n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, TokenTypes.SERVER, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final InterfaceC6335q f66122a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6316H f66123b;

    /* JADX INFO: renamed from: c */
    public final C6061j f66124c;

    /* JADX INFO: renamed from: d */
    public final int f66125d;

    /* JADX INFO: renamed from: e */
    public final byte[] f66126e;

    /* JADX INFO: renamed from: f */
    public final C20811m f66127f;

    /* JADX INFO: renamed from: g */
    public final int f66128g;

    /* JADX INFO: renamed from: h */
    public final C19788o f66129h;

    /* JADX INFO: renamed from: i */
    public int f66130i;

    /* JADX INFO: renamed from: j */
    public long f66131j;

    /* JADX INFO: renamed from: k */
    public int f66132k;

    /* JADX INFO: renamed from: l */
    public long f66133l;

    public C20818a(InterfaceC6335q interfaceC6335q, InterfaceC6316H interfaceC6316H, C6061j c6061j) throws C19755E {
        this.f66122a = interfaceC6335q;
        this.f66123b = interfaceC6316H;
        this.f66124c = c6061j;
        int i10 = c6061j.f19745o0;
        int iMax = Math.max(1, i10 / 10);
        this.f66128g = iMax;
        C20811m c20811m = new C20811m((byte[]) c6061j.f19748r0);
        c20811m.m21358m();
        int iM21358m = c20811m.m21358m();
        this.f66125d = iM21358m;
        int i11 = c6061j.f19744Z;
        int i12 = c6061j.f19746p0;
        int i13 = (((i12 - (i11 * 4)) * 8) / (c6061j.f19747q0 * i11)) + 1;
        if (iM21358m != i13) {
            throw C19755E.m20712a(null, "Expected frames per block: " + i13 + "; got: " + iM21358m);
        }
        int iM21405f = AbstractC20817s.m21405f(iMax, iM21358m);
        this.f66126e = new byte[iM21405f * i12];
        this.f66127f = new C20811m(iM21358m * 2 * i11 * iM21405f);
        int i14 = ((i12 * i10) * 8) / iM21358m;
        C19787n c19787n = new C19787n();
        c19787n.f62714l = AbstractC19754D.m20711i("audio/raw");
        c19787n.f62709g = i14;
        c19787n.f62710h = i14;
        c19787n.f62715m = iMax * 2 * i11;
        c19787n.f62728z = i11;
        c19787n.f62694A = i10;
        c19787n.f62695B = 2;
        this.f66129h = new C19788o(c19787n);
    }

    @Override // p1074w4.InterfaceC20819b
    /* JADX INFO: renamed from: a */
    public final void mo21426a(long j10) {
        this.f66130i = 0;
        this.f66131j = j10;
        this.f66132k = 0;
        this.f66133l = 0L;
    }

    @Override // p1074w4.InterfaceC20819b
    /* JADX INFO: renamed from: b */
    public final void mo21427b(int i10, long j10) {
        this.f66122a.mo3045F(new C20822e(this.f66124c, this.f66125d, i10, j10));
        this.f66123b.mo4971d(this.f66129h);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x0143  */
    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:44:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0117 A[EDGE_INSN: B:48:0x0117->B:35:0x0117 BREAK  A[LOOP:1: B:17:0x004b->B:34:0x010b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // p1074w4.InterfaceC20819b
    /* JADX INFO: renamed from: c */
    public final boolean mo21428c(C6330l c6330l, long j10) throws EOFException, InterruptedIOException {
        byte[] bArr;
        int i10;
        boolean z6;
        int i11;
        int i12;
        C20811m c20811m;
        int i13;
        int i14;
        int i15;
        int i16;
        byte[] bArr2;
        int i17;
        int i18;
        int iM21408i;
        int[] iArr;
        int i19;
        int i20;
        int iM21408i2;
        int i21;
        byte b;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = this.f66132k;
        C6061j c6061j = this.f66124c;
        int i28 = i27 / (c6061j.f19744Z * 2);
        int i29 = this.f66128g;
        int i30 = this.f66125d;
        int iM21405f = AbstractC20817s.m21405f(i29 - i28, i30);
        int i31 = c6061j.f19746p0;
        int i32 = iM21405f * i31;
        boolean z10 = j10 == 0;
        while (true) {
            bArr = this.f66126e;
            if (z10 && (i25 = this.f66130i) < i32) {
                i26 = c6330l.read(bArr, this.f66130i, (int) Math.min(i32 - i25, j10));
                if (i26 == -1) {
                    break;
                }
                this.f66130i += i26;
                bArr = this.f66126e;
                if (z10) {
                }
            }
            i10 = this.f66130i / i31;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    c20811m = this.f66127f;
                    if (i12 < i10) {
                        break;
                    }
                    i15 = 0;
                    while (true) {
                        i16 = c6061j.f19744Z;
                        if (i15 < i16) {
                            bArr2 = c20811m.f66092a;
                            int i33 = (i15 * 4) + (i12 * i31);
                            i17 = (i16 * 4) + i33;
                            i18 = (i31 / i16) - 4;
                            iM21408i = (short) ((bArr[i33] & 255) | ((bArr[i33 + 1] & 255) << 8));
                            int i34 = bArr[i33 + 2] & 255;
                            boolean z11 = z10;
                            int iMin = Math.min(i34, 88);
                            iArr = f66121n;
                            i19 = iArr[iMin];
                            i20 = ((i12 * i30 * i16) + i15) * 2;
                            bArr2[i20] = (byte) (iM21408i & 255);
                            bArr2[i20 + 1] = (byte) (iM21408i >> 8);
                            iM21408i2 = iMin;
                            int i35 = i29;
                            i21 = 0;
                            while (i21 < i18 * 2) {
                                b = bArr[((i21 / 8) * i16 * 4) + i17 + ((i21 / 2) % 4)];
                                byte[] bArr3 = bArr;
                                i22 = b & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i19) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                iM21408i = AbstractC20817s.m21408i(iM21408i + i24, -32768, 32767);
                                i20 = (i16 * 2) + i20;
                                bArr2[i20] = (byte) (iM21408i & 255);
                                bArr2[i20 + 1] = (byte) (iM21408i >> 8);
                                iM21408i2 = AbstractC20817s.m21408i(iM21408i2 + f66120m[i23], 0, 88);
                                i19 = iArr[iM21408i2];
                                i21++;
                                i17 = i17;
                                bArr = bArr3;
                            }
                            i15++;
                            z10 = z11;
                            i29 = i35;
                        }
                    }
                    i12++;
                }
                i13 = i29;
                z6 = z10;
                int i36 = i30 * i10 * 2 * c6061j.f19744Z;
                c20811m.m21344F(0);
                c20811m.m21343E(i36);
                this.f66130i -= i10 * i31;
                int i37 = c20811m.f66094c;
                this.f66123b.mo4970c(i37, c20811m);
                i14 = this.f66132k + i37;
                this.f66132k = i14;
                if (i14 / (c6061j.f19744Z * 2) >= i13) {
                    m21429d(i13);
                }
            } else {
                z6 = z10;
            }
            if (z6 && (i11 = this.f66132k / (c6061j.f19744Z * 2)) > 0) {
                m21429d(i11);
            }
            return z6;
        }
        while (true) {
            bArr = this.f66126e;
            if (z10) {
            }
            i10 = this.f66130i / i31;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    c20811m = this.f66127f;
                    if (i12 < i10) {
                        break;
                        break;
                    }
                    i15 = 0;
                    while (true) {
                        i16 = c6061j.f19744Z;
                        if (i15 < i16) {
                            bArr2 = c20811m.f66092a;
                            int i38 = (i15 * 4) + (i12 * i31);
                            i17 = (i16 * 4) + i38;
                            i18 = (i31 / i16) - 4;
                            iM21408i = (short) ((bArr[i38] & 255) | ((bArr[i38 + 1] & 255) << 8));
                            int i39 = bArr[i38 + 2] & 255;
                            boolean z12 = z10;
                            int iMin2 = Math.min(i39, 88);
                            iArr = f66121n;
                            i19 = iArr[iMin2];
                            i20 = ((i12 * i30 * i16) + i15) * 2;
                            bArr2[i20] = (byte) (iM21408i & 255);
                            bArr2[i20 + 1] = (byte) (iM21408i >> 8);
                            iM21408i2 = iMin2;
                            int i310 = i29;
                            i21 = 0;
                            while (i21 < i18 * 2) {
                                b = bArr[((i21 / 8) * i16 * 4) + i17 + ((i21 / 2) % 4)];
                                byte[] bArr4 = bArr;
                                i22 = b & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i19) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                iM21408i = AbstractC20817s.m21408i(iM21408i + i24, -32768, 32767);
                                i20 = (i16 * 2) + i20;
                                bArr2[i20] = (byte) (iM21408i & 255);
                                bArr2[i20 + 1] = (byte) (iM21408i >> 8);
                                iM21408i2 = AbstractC20817s.m21408i(iM21408i2 + f66120m[i23], 0, 88);
                                i19 = iArr[iM21408i2];
                                i21++;
                                i17 = i17;
                                bArr = bArr4;
                            }
                            i15++;
                            z10 = z12;
                            i29 = i310;
                        }
                    }
                    i12++;
                }
                i13 = i29;
                z6 = z10;
                int i311 = i30 * i10 * 2 * c6061j.f19744Z;
                c20811m.m21344F(0);
                c20811m.m21343E(i311);
                this.f66130i -= i10 * i31;
                int i312 = c20811m.f66094c;
                this.f66123b.mo4970c(i312, c20811m);
                i14 = this.f66132k + i312;
                this.f66132k = i14;
                if (i14 / (c6061j.f19744Z * 2) >= i13) {
                    m21429d(i13);
                }
            } else {
                z6 = z10;
            }
            if (z6) {
                m21429d(i11);
            }
            return z6;
            this.f66130i += i26;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21429d(int i10) {
        long j10 = this.f66131j;
        long j11 = this.f66133l;
        C6061j c6061j = this.f66124c;
        long j12 = c6061j.f19745o0;
        int i11 = AbstractC20817s.f66106a;
        long jM21396J = j10 + AbstractC20817s.m21396J(j11, 1000000L, j12, RoundingMode.FLOOR);
        int i12 = i10 * 2 * c6061j.f19744Z;
        this.f66123b.mo4968a(jM21396J, 1, i12, this.f66132k - i12, null);
        this.f66133l += (long) i10;
        this.f66132k -= i12;
    }
}
