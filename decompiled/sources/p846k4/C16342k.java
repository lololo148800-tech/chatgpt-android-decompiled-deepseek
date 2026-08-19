package p846k4;

import bb.AbstractC11278C;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Arrays;
import p007A5.C0376k;
import p084D4.C1920j;
import p1016t3.AbstractC19754D;
import p1016t3.C19753C;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p167Gb.C3032c;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.C6344z;

/* JADX INFO: renamed from: k4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16342k extends AbstractC16341j {

    /* JADX INFO: renamed from: n */
    public C1920j f50710n;

    /* JADX INFO: renamed from: o */
    public int f50711o;

    /* JADX INFO: renamed from: p */
    public boolean f50712p;

    /* JADX INFO: renamed from: q */
    public C6344z f50713q;

    /* JADX INFO: renamed from: r */
    public C3032c f50714r;

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: a */
    public final void mo17944a(long j10) {
        this.f50703g = j10;
        this.f50712p = j10 != 0;
        C6344z c6344z = this.f50713q;
        this.f50711o = c6344z != null ? c6344z.f20599e : 0;
    }

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: b */
    public final long mo17923b(C20811m c20811m) {
        byte b = c20811m.f66092a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C1920j c1920j = this.f50710n;
        AbstractC20800b.m21321i(c1920j);
        boolean z6 = ((C0376k[]) c1920j.f5620r0)[(b >> 1) & (255 >>> (8 - c1920j.f5617o0))].f1278Z;
        C6344z c6344z = (C6344z) c1920j.f5618p0;
        int i10 = !z6 ? c6344z.f20599e : c6344z.f20600f;
        long j10 = this.f50712p ? (this.f50711o + i10) / 4 : 0;
        byte[] bArr = c20811m.f66092a;
        int length = bArr.length;
        int i11 = c20811m.f66094c + 4;
        if (length < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
            c20811m.m21342D(bArrCopyOf.length, bArrCopyOf);
        } else {
            c20811m.m21343E(i11);
        }
        byte[] bArr2 = c20811m.f66092a;
        int i12 = c20811m.f66094c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f50712p = true;
        this.f50711o = i10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0390 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x0391  */
    /* JADX WARN: Type inference failed for: r1v49, types: [byte[], java.io.Serializable] */
    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: c */
    public final boolean mo17924c(C20811m c20811m, long j10, C15358g1 c15358g1) throws C19755E {
        C1920j c1920j;
        C6344z c6344z;
        long jFloor;
        if (this.f50710n != null) {
            ((C19788o) c15358g1.f47945Y).getClass();
            return false;
        }
        C6344z c6344z2 = this.f50713q;
        int i10 = 4;
        if (c6344z2 != null) {
            C3032c c3032c = this.f50714r;
            if (c3032c == null) {
                this.f50714r = AbstractC6320b.m6903s(c20811m, true, true);
            } else {
                int i11 = c20811m.f66094c;
                byte[] bArr = new byte[i11];
                System.arraycopy(c20811m.f66092a, 0, bArr, 0, i11);
                int i12 = 5;
                AbstractC6320b.m6904t(5, c20811m, false);
                int iM21365t = c20811m.m21365t() + 1;
                C6318J c6318j = new C6318J(c20811m.f66092a);
                c6318j.m6883t(c20811m.f66093b * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    int i15 = 16;
                    if (i13 >= iM21365t) {
                        C6344z c6344z3 = c6344z2;
                        byte[] bArr2 = bArr;
                        int i16 = 6;
                        int iM6872i = c6318j.m6872i(6) + 1;
                        for (int i17 = 0; i17 < iM6872i; i17++) {
                            if (c6318j.m6872i(16) != 0) {
                                throw C19755E.m20712a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iM6872i2 = c6318j.m6872i(6) + 1;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 >= iM6872i2) {
                                int iM6872i3 = c6318j.m6872i(i16) + 1;
                                int i20 = 0;
                                while (i20 < iM6872i3) {
                                    if (c6318j.m6872i(16) > 2) {
                                        throw C19755E.m20712a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c6318j.m6883t(24);
                                    c6318j.m6883t(24);
                                    c6318j.m6883t(24);
                                    int iM6872i4 = c6318j.m6872i(i16) + 1;
                                    int i21 = 8;
                                    c6318j.m6883t(8);
                                    int[] iArr = new int[iM6872i4];
                                    for (int i22 = 0; i22 < iM6872i4; i22++) {
                                        iArr[i22] = ((c6318j.m6871h() ? c6318j.m6872i(5) : 0) * 8) + c6318j.m6872i(3);
                                    }
                                    int i23 = 0;
                                    while (i23 < iM6872i4) {
                                        int i24 = 0;
                                        while (i24 < i21) {
                                            if ((iArr[i23] & (1 << i24)) != 0) {
                                                c6318j.m6883t(i21);
                                            }
                                            i24++;
                                            i21 = 8;
                                        }
                                        i23++;
                                        i21 = 8;
                                    }
                                    i20++;
                                    i16 = 6;
                                }
                                int iM6872i5 = c6318j.m6872i(i16) + 1;
                                int i25 = 0;
                                while (i25 < iM6872i5) {
                                    int iM6872i6 = c6318j.m6872i(16);
                                    if (iM6872i6 != 0) {
                                        AbstractC20800b.m21324l("VorbisUtil", "mapping type other than 0 not supported: " + iM6872i6);
                                        c6344z = c6344z3;
                                    } else {
                                        int iM6872i7 = c6318j.m6871h() ? c6318j.m6872i(4) + 1 : 1;
                                        boolean zM6871h = c6318j.m6871h();
                                        c6344z = c6344z3;
                                        int i26 = c6344z.f20595a;
                                        if (zM6871h) {
                                            int iM6872i8 = c6318j.m6872i(8) + 1;
                                            for (int i27 = 0; i27 < iM6872i8; i27++) {
                                                int i28 = i26 - 1;
                                                c6318j.m6883t(AbstractC6320b.m6896l(i28));
                                                c6318j.m6883t(AbstractC6320b.m6896l(i28));
                                            }
                                        }
                                        if (c6318j.m6872i(2) != 0) {
                                            throw C19755E.m20712a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM6872i7 > 1) {
                                            for (int i29 = 0; i29 < i26; i29++) {
                                                c6318j.m6883t(4);
                                            }
                                        }
                                        for (int i30 = 0; i30 < iM6872i7; i30++) {
                                            c6318j.m6883t(8);
                                            c6318j.m6883t(8);
                                            c6318j.m6883t(8);
                                        }
                                    }
                                    i25++;
                                    c6344z3 = c6344z;
                                }
                                C6344z c6344z4 = c6344z3;
                                int iM6872i9 = c6318j.m6872i(6);
                                int i31 = iM6872i9 + 1;
                                C0376k[] c0376kArr = new C0376k[i31];
                                for (int i32 = 0; i32 < i31; i32++) {
                                    boolean zM6871h2 = c6318j.m6871h();
                                    c6318j.m6872i(16);
                                    c6318j.m6872i(16);
                                    c6318j.m6872i(8);
                                    c0376kArr[i32] = new C0376k(zM6871h2, 7);
                                }
                                if (!c6318j.m6871h()) {
                                    throw C19755E.m20712a(null, "framing bit after modes not set as expected");
                                }
                                c1920j = new C1920j(c6344z4, c3032c, bArr2, c0376kArr, AbstractC6320b.m6896l(iM6872i9));
                                break;
                            }
                            int iM6872i10 = c6318j.m6872i(i15);
                            if (iM6872i10 == 0) {
                                int i33 = 8;
                                c6318j.m6883t(8);
                                c6318j.m6883t(16);
                                c6318j.m6883t(16);
                                c6318j.m6883t(6);
                                c6318j.m6883t(8);
                                int iM6872i11 = c6318j.m6872i(4) + 1;
                                int i34 = 0;
                                while (i34 < iM6872i11) {
                                    c6318j.m6883t(i33);
                                    i34++;
                                    i33 = 8;
                                }
                            } else {
                                if (iM6872i10 != 1) {
                                    throw C19755E.m20712a(null, "floor type greater than 1 not decodable: " + iM6872i10);
                                }
                                int iM6872i12 = c6318j.m6872i(5);
                                int[] iArr2 = new int[iM6872i12];
                                int i35 = -1;
                                for (int i36 = 0; i36 < iM6872i12; i36++) {
                                    int iM6872i13 = c6318j.m6872i(4);
                                    iArr2[i36] = iM6872i13;
                                    if (iM6872i13 > i35) {
                                        i35 = iM6872i13;
                                    }
                                }
                                int i37 = i35 + 1;
                                int[] iArr3 = new int[i37];
                                int i38 = 0;
                                while (i38 < i37) {
                                    iArr3[i38] = c6318j.m6872i(i19) + 1;
                                    int iM6872i14 = c6318j.m6872i(i14);
                                    int i39 = 8;
                                    if (iM6872i14 > 0) {
                                        c6318j.m6883t(8);
                                    }
                                    int i40 = 0;
                                    while (i40 < (1 << iM6872i14)) {
                                        c6318j.m6883t(i39);
                                        i40++;
                                        i39 = 8;
                                    }
                                    i38++;
                                    i19 = 3;
                                    i14 = 2;
                                }
                                c6318j.m6883t(i14);
                                int iM6872i15 = c6318j.m6872i(4);
                                int i41 = 0;
                                int i42 = 0;
                                for (int i43 = 0; i43 < iM6872i12; i43++) {
                                    i41 += iArr3[iArr2[i43]];
                                    while (i42 < i41) {
                                        c6318j.m6883t(iM6872i15);
                                        i42++;
                                    }
                                }
                            }
                            i18++;
                            i16 = 6;
                            i15 = 16;
                            i14 = 2;
                        }
                    } else {
                        if (c6318j.m6872i(24) != 5653314) {
                            throw C19755E.m20712a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c6318j.f20466c * 8) + c6318j.f20468e));
                        }
                        int iM6872i16 = c6318j.m6872i(16);
                        int iM6872i17 = c6318j.m6872i(24);
                        if (c6318j.m6871h()) {
                            c6318j.m6883t(i12);
                            for (int iM6872i18 = 0; iM6872i18 < iM6872i17; iM6872i18 += c6318j.m6872i(AbstractC6320b.m6896l(iM6872i17 - iM6872i18))) {
                            }
                        } else {
                            boolean zM6871h3 = c6318j.m6871h();
                            for (int i44 = 0; i44 < iM6872i17; i44++) {
                                if (!zM6871h3) {
                                    c6318j.m6883t(i12);
                                } else if (c6318j.m6871h()) {
                                    c6318j.m6883t(i12);
                                }
                            }
                        }
                        int iM6872i19 = c6318j.m6872i(i10);
                        if (iM6872i19 > 2) {
                            throw C19755E.m20712a(null, "lookup type greater than 2 not decodable: " + iM6872i19);
                        }
                        if (iM6872i19 == 1 || iM6872i19 == 2) {
                            c6318j.m6883t(32);
                            c6318j.m6883t(32);
                            int iM6872i20 = c6318j.m6872i(i10) + 1;
                            c6318j.m6883t(1);
                            if (iM6872i19 != 1) {
                                jFloor = ((long) iM6872i17) * ((long) iM6872i16);
                            } else if (iM6872i16 != 0) {
                                jFloor = (long) Math.floor(Math.pow(iM6872i17, 1.0d / ((double) iM6872i16)));
                            } else {
                                jFloor = 0;
                            }
                            c6318j.m6883t((int) (jFloor * ((long) iM6872i20)));
                        } else {
                            c6344z2 = c6344z2;
                            bArr = bArr;
                        }
                        i13++;
                        c6344z2 = c6344z2;
                        bArr = bArr;
                        i10 = 4;
                        i12 = 5;
                    }
                }
            }
            this.f50710n = c1920j;
            if (c1920j == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            C6344z c6344z5 = (C6344z) c1920j.f5618p0;
            arrayList.add((byte[]) c6344z5.f20601g);
            arrayList.add((byte[]) c1920j.f5616Z);
            C19753C c19753cM6900p = AbstractC6320b.m6900p(AbstractC11278C.m12692u((String[]) ((C3032c) c1920j.f5619q0).f9127Z));
            C19787n c19787n = new C19787n();
            c19787n.f62714l = AbstractC19754D.m20711i("audio/vorbis");
            c19787n.f62709g = c6344z5.f20598d;
            c19787n.f62710h = c6344z5.f20597c;
            c19787n.f62728z = c6344z5.f20595a;
            c19787n.f62694A = c6344z5.f20596b;
            c19787n.f62717o = arrayList;
            c19787n.f62712j = c19753cM6900p;
            c15358g1.f47945Y = new C19788o(c19787n);
            return true;
        }
        AbstractC6320b.m6904t(1, c20811m, false);
        c20811m.m21357l();
        int iM21365t2 = c20811m.m21365t();
        int iM21357l = c20811m.m21357l();
        int iM21354i = c20811m.m21354i();
        if (iM21354i <= 0) {
            iM21354i = -1;
        }
        int iM21354i2 = c20811m.m21354i();
        int i45 = iM21354i2 <= 0 ? -1 : iM21354i2;
        c20811m.m21354i();
        int iM21365t3 = c20811m.m21365t();
        int iPow = (int) Math.pow(2.0d, iM21365t3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iM21365t3 & 240) >> 4);
        c20811m.m21365t();
        ?? CopyOf = Arrays.copyOf(c20811m.f66092a, c20811m.f66094c);
        C6344z c6344z6 = new C6344z();
        c6344z6.f20595a = iM21365t2;
        c6344z6.f20596b = iM21357l;
        c6344z6.f20597c = iM21354i;
        c6344z6.f20598d = i45;
        c6344z6.f20599e = iPow;
        c6344z6.f20600f = iPow2;
        c6344z6.f20601g = CopyOf;
        this.f50713q = c6344z6;
        c1920j = null;
        this.f50710n = c1920j;
        if (c1920j == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        C6344z c6344z7 = (C6344z) c1920j.f5618p0;
        arrayList2.add((byte[]) c6344z7.f20601g);
        arrayList2.add((byte[]) c1920j.f5616Z);
        C19753C c19753cM6900p2 = AbstractC6320b.m6900p(AbstractC11278C.m12692u((String[]) ((C3032c) c1920j.f5619q0).f9127Z));
        C19787n c19787n2 = new C19787n();
        c19787n2.f62714l = AbstractC19754D.m20711i("audio/vorbis");
        c19787n2.f62709g = c6344z7.f20598d;
        c19787n2.f62710h = c6344z7.f20597c;
        c19787n2.f62728z = c6344z7.f20595a;
        c19787n2.f62694A = c6344z7.f20596b;
        c19787n2.f62717o = arrayList2;
        c19787n2.f62712j = c19753cM6900p2;
        c15358g1.f47945Y = new C19788o(c19787n2);
        return true;
    }

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: d */
    public final void mo17925d(boolean z6) {
        super.mo17925d(z6);
        if (z6) {
            this.f50710n = null;
            this.f50713q = null;
            this.f50714r = null;
        }
        this.f50711o = 0;
        this.f50712p = false;
    }
}
