package p740f4;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1016t3.C19753C;
import p1016t3.InterfaceC19752B;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p372P3.C6318J;
import p589Y3.C9643a;
import p594Y9.AbstractC9997x4;

/* JADX INFO: renamed from: f4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13534c extends AbstractC9997x4 {

    /* JADX INFO: renamed from: a */
    public final C20811m f42829a = new C20811m();

    /* JADX INFO: renamed from: b */
    public final C6318J f42830b = new C6318J();

    /* JADX INFO: renamed from: c */
    public C20816r f42831c;

    @Override // p594Y9.AbstractC9997x4
    /* JADX INFO: renamed from: d */
    public final C19753C mo10641d(C9643a c9643a, ByteBuffer byteBuffer) {
        InterfaceC19752B c13537f;
        int i10;
        int i11;
        long j10;
        ArrayList arrayList;
        long j11;
        long j12;
        boolean z6;
        boolean z10;
        boolean z11;
        int iM21371z;
        int iM21365t;
        int iM21365t2;
        long jM21367v;
        boolean z12;
        List list;
        long j13;
        long j14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i12;
        int i13;
        int iM21365t3;
        boolean z17;
        int i14 = 32;
        boolean z18 = true;
        C20816r c20816r = this.f42831c;
        if (c20816r == null || c9643a.f29065v0 != c20816r.m21384e()) {
            C20816r c20816r2 = new C20816r(c9643a.f2228s0);
            this.f42831c = c20816r2;
            c20816r2.m21380a(c9643a.f2228s0 - c9643a.f29065v0);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C20811m c20811m = this.f42829a;
        c20811m.m21342D(iLimit, bArrArray);
        C6318J c6318j = this.f42830b;
        c6318j.m6878o(iLimit, bArrArray);
        c6318j.m6883t(39);
        long jM6872i = (((long) c6318j.m6872i(1)) << 32) | ((long) c6318j.m6872i(32));
        c6318j.m6883t(20);
        int iM6872i = c6318j.m6872i(12);
        int iM6872i2 = c6318j.m6872i(8);
        c20811m.m21345G(14);
        if (iM6872i2 == 0) {
            c13537f = new C13537f();
        } else if (iM6872i2 != 255) {
            long j15 = 1;
            long jM21367v2 = -9223372036854775807L;
            if (iM6872i2 == 4) {
                int iM21365t4 = c20811m.m21365t();
                ArrayList arrayList2 = new ArrayList(iM21365t4);
                int i15 = 0;
                while (i15 < iM21365t4) {
                    long jM21367v3 = c20811m.m21367v();
                    boolean z19 = (c20811m.m21365t() & 128) != 0 ? z18 : false;
                    ArrayList arrayList3 = new ArrayList();
                    if (z19) {
                        i10 = i14;
                        i11 = i15;
                        j10 = j15;
                        arrayList = arrayList3;
                        j11 = -9223372036854775807L;
                        j12 = -9223372036854775807L;
                        z6 = false;
                        z10 = false;
                        z11 = false;
                        iM21371z = 0;
                        iM21365t = 0;
                        iM21365t2 = 0;
                    } else {
                        int iM21365t5 = c20811m.m21365t();
                        boolean z20 = (iM21365t5 & 128) != 0 ? z18 : false;
                        boolean z21 = (iM21365t5 & 64) != 0 ? z18 : false;
                        boolean z22 = (iM21365t5 & i14) != 0 ? z18 : false;
                        long jM21367v4 = z21 ? c20811m.m21367v() : -9223372036854775807L;
                        if (z21) {
                            i11 = i15;
                        } else {
                            int iM21365t6 = c20811m.m21365t();
                            ArrayList arrayList4 = new ArrayList(iM21365t6);
                            int i16 = 0;
                            while (i16 < iM21365t6) {
                                arrayList4.add(new C13538g(c20811m.m21365t(), c20811m.m21367v()));
                                i16++;
                                i15 = i15;
                            }
                            i11 = i15;
                            arrayList3 = arrayList4;
                        }
                        if (z22) {
                            long jM21365t = c20811m.m21365t();
                            z12 = (jM21365t & 128) != 0;
                            j10 = 1;
                            i10 = 32;
                            jM21367v = ((((jM21365t & 1) << 32) | c20811m.m21367v()) * 1000) / 90;
                        } else {
                            i10 = 32;
                            j10 = 1;
                            jM21367v = -9223372036854775807L;
                            z12 = false;
                        }
                        j12 = jM21367v;
                        z11 = z12;
                        arrayList = arrayList3;
                        z6 = z20;
                        z10 = z21;
                        j11 = jM21367v4;
                        iM21371z = c20811m.m21371z();
                        iM21365t = c20811m.m21365t();
                        iM21365t2 = c20811m.m21365t();
                    }
                    arrayList2.add(new C13539h(jM21367v3, z19, z6, z10, arrayList, j11, z11, j12, iM21371z, iM21365t, iM21365t2));
                    i15 = i11 + 1;
                    z18 = true;
                    i14 = i10;
                    j15 = j10;
                }
                c13537f = new C13540i(arrayList2);
            } else if (iM6872i2 == 5) {
                C20816r c20816r3 = this.f42831c;
                long jM21367v5 = c20811m.m21367v();
                boolean z23 = (c20811m.m21365t() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z23) {
                    list = listEmptyList;
                    j13 = -9223372036854775807L;
                    j14 = -9223372036854775807L;
                    z13 = false;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    i12 = 0;
                    i13 = 0;
                    iM21365t3 = 0;
                } else {
                    int iM21365t7 = c20811m.m21365t();
                    boolean z24 = (iM21365t7 & 128) != 0;
                    boolean z25 = (iM21365t7 & 64) != 0;
                    boolean z26 = (iM21365t7 & 32) != 0;
                    boolean z27 = (iM21365t7 & 16) != 0;
                    long jM15085a = (!z25 || z27) ? -9223372036854775807L : C13541j.m15085a(jM6872i, c20811m);
                    if (!z25) {
                        int iM21365t8 = c20811m.m21365t();
                        ArrayList arrayList5 = new ArrayList(iM21365t8);
                        for (int i17 = 0; i17 < iM21365t8; i17++) {
                            int iM21365t9 = c20811m.m21365t();
                            long jM15085a2 = !z27 ? C13541j.m15085a(jM6872i, c20811m) : -9223372036854775807L;
                            arrayList5.add(new C13535d(jM15085a2, iM21365t9, c20816r3.m21381b(jM15085a2)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z26) {
                        long jM21365t2 = c20811m.m21365t();
                        z17 = (jM21365t2 & 128) != 0;
                        jM21367v2 = ((((jM21365t2 & 1) << 32) | c20811m.m21367v()) * 1000) / 90;
                    } else {
                        z17 = false;
                    }
                    int iM21371z2 = c20811m.m21371z();
                    int iM21365t10 = c20811m.m21365t();
                    z16 = z17;
                    i12 = iM21371z2;
                    list = listEmptyList;
                    iM21365t3 = c20811m.m21365t();
                    i13 = iM21365t10;
                    z13 = z24;
                    j14 = jM21367v2;
                    j13 = jM15085a;
                    z15 = z27;
                    z14 = z25;
                }
                c13537f = new C13536e(jM21367v5, z23, z13, z14, z15, j13, c20816r3.m21381b(j13), list, z16, j14, i12, i13, iM21365t3);
            } else if (iM6872i2 != 6) {
                c13537f = null;
            } else {
                C20816r c20816r4 = this.f42831c;
                long jM15085a3 = C13541j.m15085a(jM6872i, c20811m);
                c13537f = new C13541j(jM15085a3, c20816r4.m21381b(jM15085a3));
            }
        } else {
            long jM21367v6 = c20811m.m21367v();
            int i18 = iM6872i - 4;
            byte[] bArr = new byte[i18];
            c20811m.m21350e(bArr, 0, i18);
            c13537f = new C13532a(jM21367v6, bArr, jM6872i);
        }
        return c13537f == null ? new C19753C(new InterfaceC19752B[0]) : new C19753C(c13537f);
    }
}
