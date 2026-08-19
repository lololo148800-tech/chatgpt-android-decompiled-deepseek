package p365Oi;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jp.C16279d;
import kotlin.jvm.internal.AbstractC16544l;
import kp.AbstractC16648c;
import p001A.AbstractC0010F;
import p148Fi.AbstractC2792U0;
import p148Fi.C2864y0;
import p200Hm.C3506e;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p413Qo.AbstractC6765c;
import p523V9.AbstractC8160o6;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9162L;
import p571X9.AbstractC9387w3;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p998rp.C19265d;
import p998rp.C19280s;

/* JADX INFO: renamed from: Oi.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6258f {

    /* JADX INFO: renamed from: a */
    public final int f20340a;

    /* JADX INFO: renamed from: b */
    public final int f20341b;

    /* JADX INFO: renamed from: c */
    public final List f20342c;

    /* JADX INFO: renamed from: d */
    public final float f20343d;

    /* JADX INFO: renamed from: e */
    public final C2864y0 f20344e;

    /* JADX INFO: renamed from: f */
    public final float[][] f20345f;

    /* JADX INFO: renamed from: g */
    public final float[][] f20346g;

    /* JADX INFO: renamed from: h */
    public float f20347h;

    /* JADX INFO: renamed from: i */
    public float f20348i;

    public C6258f(int i10, int i11, List gainMultipliers, float f10) {
        AbstractC16544l.m18094g(gainMultipliers, "gainMultipliers");
        this.f20340a = i10;
        this.f20341b = i11;
        this.f20342c = gainMultipliers;
        this.f20343d = f10;
        this.f20344e = AbstractC2792U0.m3712c("VoiceMagnitudeProcessor");
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Desired band count must be greater than zero (it is ", Separators.RPAREN).toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i11, "Desired magnitudes count must be greater than zero (it is ", Separators.RPAREN).toString());
        }
        if (gainMultipliers.size() != i10) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(gainMultipliers.size(), "Gain multipliers count must match the desired band count (it is ", Separators.RPAREN).toString());
        }
        Iterator it = gainMultipliers.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            if (fFloatValue <= 0.0f) {
                throw new IllegalArgumentException(("Gain multiplier must be greater than zero (it is " + fFloatValue + Separators.RPAREN).toString());
            }
        }
        int i12 = this.f20340a;
        float[][] fArr = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = this.f20341b;
            float[] fArr2 = new float[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                fArr2[i15] = 0.0f;
            }
            fArr[i13] = fArr2;
        }
        this.f20345f = fArr;
        int i16 = this.f20340a;
        float[][] fArr3 = new float[i16][];
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f20341b;
            float[] fArr4 = new float[i18];
            for (int i19 = 0; i19 < i18; i19++) {
                fArr4[i19] = 0.0f;
            }
            fArr3[i17] = fArr4;
        }
        this.f20346g = fArr3;
    }

    /* JADX INFO: renamed from: a */
    public static float[] m6746a(float[][] fArr) {
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        float[] fArr3 = new float[length];
        int i10 = 0;
        for (float[] fArr4 : fArr) {
            for (float f10 : fArr4) {
                fArr3[i10] = f10;
                i10++;
            }
        }
        return fArr3;
    }

    /* JADX INFO: renamed from: c */
    public static float[] m6747c(float f10, int i10, float[] fArr) {
        float[] fArrCopyOfRange;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iCeil = (int) Math.ceil(fArr.length / i10);
        if (iCeil < 1) {
            iCeil = 1;
        }
        C3506e c3506eM8928s = AbstractC8301I.m8928s(new C3508g(0, fArr.length - 1, 1), iCeil);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3506eM8928s, 10));
        C3507f it = c3506eM8928s.iterator();
        while (it.f10596o0) {
            int iMo4199a = it.mo4199a();
            int i11 = iMo4199a + iCeil;
            int length = fArr.length;
            if (i11 > length) {
                i11 = length;
            }
            C3508g indices = AbstractC8301I.m8929t(iMo4199a, i11);
            AbstractC16544l.m18094g(indices, "indices");
            if (indices.isEmpty()) {
                fArrCopyOfRange = new float[0];
            } else {
                int i12 = indices.f10592Z + 1;
                AbstractC9387w3.m9957a(i12, fArr.length);
                fArrCopyOfRange = Arrays.copyOfRange(fArr, indices.f10591Y, i12);
                AbstractC16544l.m18093f(fArrCopyOfRange, "copyOfRange(...)");
            }
            Float[] fArr2 = new Float[fArrCopyOfRange.length];
            int length2 = fArrCopyOfRange.length;
            for (int i13 = 0; i13 < length2; i13++) {
                fArr2[i13] = Float.valueOf(fArrCopyOfRange[i13]);
            }
            Float[] fArr3 = fArr2;
            if (fArr3.length > 1) {
                Arrays.sort(fArr3);
            }
            List listM19296c = AbstractC17678l.m19296c(fArr2);
            int size = listM19296c.size() / 2;
            float fAbs = Math.abs(listM19296c.size() % 2 == 0 ? (((Number) listM19296c.get(size - 1)).floatValue() + ((Number) listM19296c.get(size)).floatValue()) / 2 : ((Number) listM19296c.get(size)).floatValue()) * f10;
            arrayList.add(Float.valueOf(fAbs / (1 + fAbs)));
        }
        return AbstractC17680n.m19320A0(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final float[] m6748b(float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f20340a;
        float[][] fArr = new float[i10][];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f20341b;
            float[] fArr2 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                fArr2[i14] = 0.0f;
            }
            fArr[i12] = fArr2;
        }
        int i15 = 0;
        float fM19289L = 0.0f;
        float fM19289L2 = 0.0f;
        while (true) {
            int i16 = 1;
            if (i15 >= i10) {
                break;
            }
            float[] fArr3 = this.f20345f[i15];
            float[][] fArr4 = this.f20346g;
            float[] fArr5 = fArr4[i15];
            float f15 = this.f20347h;
            float f16 = 2;
            float f17 = fM19289L;
            float fSin = ((f15 / f16) + ((float) Math.sin(f15))) / 1.0f;
            float fAbs = Math.abs(fSin - ((float) Math.floor(fSin + 0.5f))) * f16;
            AbstractC16544l.m18094g(fArr3, "<this>");
            C3508g c3508g = new C3508g(i11, fArr3.length - 1, 1);
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508g, 10));
            C3507f it = c3508g.iterator();
            float f18 = 0.0f;
            float f19 = 0.0f;
            while (it.f10596o0) {
                int iMo4199a = it.mo4199a();
                float f20 = (3 * fAbs) + i16 + iMo4199a;
                int length = fArr3.length;
                float f21 = fAbs;
                C3507f c3507f = it;
                double d10 = f20;
                int iFloor = ((int) Math.floor(d10)) % length;
                int iCeil = ((int) Math.ceil(d10)) % length;
                if (iFloor < 0) {
                    iFloor += length;
                }
                if (iCeil < 0) {
                    iCeil += length;
                }
                float f22 = f20 - ((int) f20);
                if (f20 < 0.0f) {
                    int i17 = iFloor;
                    iFloor = iCeil;
                    iCeil = i17;
                }
                float fM9712b = AbstractC9162L.m9712b(fArr3[iFloor], fArr3[iCeil], f22);
                float f23 = fArr5[iMo4199a];
                f18 += fM9712b;
                f19 += f23;
                float f24 = (f10 - 60.0f) / 60.0f;
                int i18 = i10;
                float fM9712b2 = AbstractC9162L.m9712b((float) Math.sqrt(0.13f), 0.13f, AbstractC8301I.m8920k(f24, 0.0f, 1.0f));
                float f25 = this.f20343d;
                float f26 = fM9712b2 * f25;
                float fM9712b3 = AbstractC9162L.m9712b(0.13f, 0.09f, AbstractC8301I.m8920k(f24, 0.0f, 1.0f)) * f25;
                if (fM9712b <= f23) {
                    f26 = fM9712b3;
                }
                arrayList.add(Float.valueOf(AbstractC9162L.m9712b(f23, fM9712b, f26)));
                fAbs = f21;
                it = c3507f;
                i10 = i18;
                i16 = 1;
            }
            int i19 = i10;
            float[] fArrM19320A0 = AbstractC17680n.m19320A0(arrayList);
            float f27 = f19 - f18;
            if (f27 > 0.0f) {
                float f28 = this.f20347h;
                float f29 = 1;
                if (f19 < 0.0f) {
                    f13 = 1.0f;
                    f14 = 0.9f;
                    f19 = 0.0f;
                } else {
                    f13 = 1.0f;
                    if (f19 > 1.0f) {
                        f19 = 1.0f;
                    }
                    f14 = 0.9f;
                }
                double d11 = f29 - (f19 * f14);
                this.f20347h = ((((f29 - ((float) (Math.cos((((double) (f29 - f13)) * 115.0d) * d11) * Math.exp((-5.43656365691809d) * d11)))) * 10) * f27) / f10) + f28;
            }
            fArr[i15] = fArrM19320A0;
            fArr4[i15] = fArrM19320A0;
            fM19289L2 += AbstractC17678l.m19289L(fArrM19320A0);
            fM19289L = AbstractC17678l.m19289L(fArr5) + f17;
            i15++;
            i10 = i19;
            i11 = 0;
        }
        float f30 = fM19289L;
        float f31 = f30 - fM19289L2;
        if (f31 > 0.0f) {
            float f32 = this.f20347h;
            float f33 = 1;
            if (f30 < 0.0f) {
                f12 = 0.0f;
                f11 = 1.0f;
            } else {
                f11 = 1.0f;
                f12 = f30 > 1.0f ? 1.0f : f30;
            }
            double d12 = f33 - (f12 * 0.9f);
            this.f20347h = ((((f33 - ((float) (Math.cos((((double) (f33 - f11)) * 115.0d) * d12) * Math.exp(d12 * (-5.43656365691809d))))) * 10) * f31) / f10) + f32;
        }
        return m6746a(fArr);
    }

    /* JADX WARN: Code duplicated, block: B:222:0x077d A[LOOP:7: B:221:0x077b->B:222:0x077d, LOOP_END] */
    /* JADX INFO: renamed from: d */
    public final void m6749d(float[] fArr) {
        long j10;
        long j11;
        int[] iArr;
        long j12;
        C19265d c19265d;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        C19265d c19265d2;
        long j20;
        float[] fArr2;
        int length;
        float[] fArr3;
        int i10;
        int i11;
        float[] fArr4;
        int i12;
        int i13;
        float[] fArr5;
        int i14;
        if (fArr.length == 0) {
            AbstractC8160o6.m8726a(this.f20344e, "Received an empty buffer", null, 6);
            fArr3 = new float[240];
            for (int i15 = 0; i15 < 240; i15++) {
                fArr3[i15] = 0.08f;
            }
        } else {
            long length2 = fArr.length;
            C16279d c16279d = new C16279d();
            if (length2 < 1) {
                throw new IllegalArgumentException("n must be greater than 0");
            }
            long j21 = length2 * 2;
            boolean z6 = j21 > ((long) 1073741824);
            c16279d.f50444v = z6;
            int i16 = (int) length2;
            c16279d.f50423a = i16;
            c16279d.f50424b = length2;
            int[] iArr2 = C16279d.f50422w;
            if (z6) {
                if (length2 > 0 && (length2 & (length2 - 1)) == 0) {
                    c16279d.f50443u = 1;
                    C19280s c19280s = new C19280s(((long) AbstractC6765c.m7193a((1 << ((int) (((long) (AbstractC6765c.m7196d(length2 + 0.5f) / AbstractC6765c.m7196d(2.0d))) / 2))) + 2)) + 2, true);
                    c16279d.f50428f = c19280s;
                    C19265d c19265d3 = new C19265d(length2, true);
                    c16279d.f50430h = c19265d3;
                    long j22 = j21 >> 2;
                    c16279d.f50432j = j22;
                    AbstractC16648c.m18463I(j22, c19280s, c19265d3);
                    long j23 = length2 >> 2;
                    c16279d.f50434l = j23;
                    AbstractC16648c.m18461G(j23, c19265d3, j22, c19280s);
                } else {
                    if (AbstractC16648c.m18459E(length2, iArr2) >= 211) {
                        c16279d.f50443u = 3;
                        long j24 = j21 - 1;
                        if (j24 < 1) {
                            throw new IllegalArgumentException("x must be greater or equal 1");
                        }
                        if ((j24 & (j21 - 2)) != 0) {
                            long j25 = j24 | (j24 >>> 1);
                            long j26 = j25 | (j25 >>> 2);
                            long j27 = j26 | (j26 >>> 4);
                            long j28 = j27 | (j27 >>> 8);
                            long j29 = j28 | (j28 >>> 16);
                            j24 = (j29 | (j29 >>> 32)) + 1;
                        }
                        long j30 = j24;
                        c16279d.f50426d = j30;
                        long j31 = j30 * 2;
                        C19265d c19265d4 = new C19265d(j31, true);
                        c16279d.f50440r = c19265d4;
                        c16279d.f50442t = new C19265d(j31, true);
                        C19280s c19280s2 = new C19280s(((long) AbstractC6765c.m7193a((1 << ((int) (((long) (AbstractC6765c.m7196d(j30 + 0.5f) / AbstractC6765c.m7196d(2.0d))) / 2))) + 2)) + 2, true);
                        c16279d.f50428f = c19280s2;
                        C19265d c19265d5 = new C19265d(j30, true);
                        c16279d.f50430h = c19265d5;
                        long j32 = j31 >> 2;
                        c16279d.f50432j = j32;
                        AbstractC16648c.m18463I(j32, c19280s2, c19265d5);
                        long j33 = j30 >> 2;
                        c16279d.f50434l = j33;
                        AbstractC16648c.m18461G(j33, c19265d5, j32, c19280s2);
                        float f10 = 3.1415927f / length2;
                        c19265d4.m20341c(1.0f, 0L);
                        c19265d4.m20341c(0.0f, 1L);
                        int i17 = 1;
                        long j34 = 0;
                        while (i17 < length2) {
                            int i18 = i17 * 2;
                            long j35 = j34 + ((long) (i18 - 1));
                            if (j35 >= j21) {
                                j35 -= j21;
                            }
                            long j36 = j35;
                            double d10 = j35 * f10;
                            c19265d4.m20341c((float) AbstractC6765c.m7194b(d10), i18);
                            c19265d4.m20341c((float) AbstractC6765c.m7199g(d10), i18 + 1);
                            i17++;
                            j34 = j36;
                        }
                        long j37 = c16279d.f50426d;
                        float f11 = 1.0f / j37;
                        float fM20340b = c19265d4.m20340b(0L) * f11;
                        C19265d c19265d6 = c16279d.f50442t;
                        c19265d6.m20341c(fM20340b, 0L);
                        c19265d6.m20341c(c19265d4.m20340b(1L) * f11, 1L);
                        int i19 = 2;
                        while (true) {
                            long j38 = i19;
                            if (j38 >= j21) {
                                break;
                            }
                            c19265d6.m20341c(c19265d4.m20340b(j38) * f11, j38);
                            long j39 = i19 + 1;
                            c19265d6.m20341c(c19265d4.m20340b(j39) * f11, j39);
                            long j40 = (j37 * 2) - j38;
                            c19265d6.m20341c(c19265d6.m20340b(j38), j40);
                            c19265d6.m20341c(c19265d6.m20340b(j39), j40 + 1);
                            i19 += 2;
                            f11 = f11;
                        }
                        AbstractC16648c.m18467d(j37 * 2, c16279d.f50442t, c16279d.f50428f, c16279d.f50432j, c16279d.f50430h);
                    } else {
                        c16279d.f50443u = 2;
                        long j41 = length2 * 4;
                        c16279d.f50436n = new C19265d(j41 + 15, true);
                        c16279d.f50438p = new C19265d(15 + j21, true);
                        if (length2 == 1) {
                            iArr = iArr2;
                            j15 = 1;
                        } else {
                            long j42 = length2;
                            long j43 = 0;
                            long j44 = 0;
                            long j45 = 0;
                            loop30: while (true) {
                                long j46 = j43 + 1;
                                if (j46 <= 4) {
                                    j44 = iArr2[(int) j43];
                                    j10 = 2;
                                } else {
                                    j10 = 2;
                                    j44 += 2;
                                }
                                while (true) {
                                    long j47 = j42 / j44;
                                    if (j42 - (j44 * j47) != 0) {
                                        j43 = j46;
                                    } else {
                                        int[] iArr3 = iArr2;
                                        j11 = 1;
                                        long j48 = j45 + 1;
                                        iArr = iArr3;
                                        j12 = j21;
                                        c19265d = c16279d.f50436n;
                                        c19265d.m20341c(j44, j45 + j10 + j41);
                                        if (j44 != j10 || j48 == 1) {
                                            j13 = j44;
                                            j14 = j48;
                                        } else {
                                            long j49 = j10;
                                            while (j49 <= j48) {
                                                long j50 = j44;
                                                long j51 = (j48 - j49) + j10 + j41;
                                                c19265d.m20341c(c19265d.m20340b(j51), j51 + 1);
                                                j49++;
                                                j48 = j48;
                                                j44 = j50;
                                            }
                                            j13 = j44;
                                            j14 = j48;
                                            c19265d.m20341c(2.0f, j41 + j10);
                                        }
                                        if (j47 == 1) {
                                            break loop30;
                                        }
                                        j10 = 2;
                                        iArr2 = iArr;
                                        j21 = j12;
                                        j45 = j14;
                                        j44 = j13;
                                        length2 = length2;
                                        j42 = j47;
                                    }
                                }
                            }
                            float f12 = length2;
                            c19265d.m20341c(f12, j41);
                            long j52 = j14;
                            c19265d.m20341c(j52, j41 + 1);
                            float f13 = 6.2831855f / f12;
                            long j53 = 1;
                            long j54 = 1;
                            long j55 = 1;
                            while (j53 <= j52) {
                                j53 += j11;
                                long j56 = j52;
                                long jM20340b = (long) c19265d.m20340b(j53 + j41);
                                long j57 = j54 * jM20340b;
                                long j58 = length2 / j57;
                                long j59 = j58 + j58 + 2;
                                long j60 = jM20340b - j11;
                                long j61 = j11;
                                long j62 = j55;
                                long j63 = 0;
                                while (j61 <= j60) {
                                    long j64 = j53;
                                    c19265d.m20341c(1.0f, (j62 - j11) + j12);
                                    long j65 = j62 + j12;
                                    c19265d.m20341c(0.0f, j65);
                                    C19265d c19265d7 = c19265d;
                                    long j66 = j63 + j54;
                                    float f14 = j66 * f13;
                                    float f15 = 0.0f;
                                    long j67 = 4;
                                    while (j67 <= j59) {
                                        j62 += 2;
                                        f15 += 1.0f;
                                        float f16 = f13;
                                        long j68 = j54;
                                        long j69 = j62 + j12;
                                        double d11 = f15 * f14;
                                        c19265d7.m20341c((float) AbstractC6765c.m7194b(d11), j69 - 1);
                                        c19265d7.m20341c((float) AbstractC6765c.m7199g(d11), j69);
                                        j67 += 2;
                                        f13 = f16;
                                        f14 = f14;
                                        j54 = j68;
                                        length2 = length2;
                                        j41 = j41;
                                    }
                                    float f17 = f13;
                                    long j70 = j54;
                                    long j71 = length2;
                                    long j72 = j41;
                                    if (jM20340b > 5) {
                                        long j73 = j62 + j12;
                                        j16 = 1;
                                        c19265d7.m20341c(c19265d7.m20340b(j73 - 1), j65 - 1);
                                        c19265d7.m20341c(c19265d7.m20340b(j73), j65);
                                    } else {
                                        j16 = 1;
                                    }
                                    j61 += j16;
                                    j63 = j66;
                                    jM20340b = jM20340b;
                                    f13 = f17;
                                    j53 = j64;
                                    length2 = j71;
                                    j11 = j16;
                                    c19265d = c19265d7;
                                    j54 = j70;
                                    j41 = j72;
                                }
                                j52 = j56;
                                j54 = j57;
                                j55 = j62;
                            }
                            j15 = j11;
                        }
                        long j74 = c16279d.f50424b;
                        if (j74 != j15) {
                            long j75 = 2;
                            long j76 = j74 * 2;
                            long j77 = j74;
                            long j78 = 0;
                            long j79 = 0;
                            long j80 = 0;
                            loop24: while (true) {
                                long j81 = j78 + j15;
                                j79 = j81 <= 4 ? iArr[(int) j78] : j79 + j75;
                                while (true) {
                                    long j82 = j77 / j79;
                                    if (j77 - (j79 * j82) != 0) {
                                        j78 = j81;
                                        j15 = 1;
                                    } else {
                                        j17 = 1;
                                        j18 = j80 + 1;
                                        long j83 = j80 + j75 + j76;
                                        j19 = j80;
                                        c19265d2 = c16279d.f50438p;
                                        c19265d2.m20341c(j79, j83);
                                        if (j79 != j75 || j18 == 1) {
                                            j20 = j79;
                                        } else {
                                            long j84 = j75;
                                            while (j84 <= j18) {
                                                long j85 = (j18 - j84) + j75 + j76;
                                                c19265d2.m20341c(c19265d2.m20340b(j85), j85 + 1);
                                                j84++;
                                                j79 = j79;
                                            }
                                            j20 = j79;
                                            c19265d2.m20341c(2.0f, j76 + j75);
                                        }
                                        if (j82 == 1) {
                                            break loop24;
                                        }
                                        j75 = 2;
                                        j80 = j18;
                                        j79 = j20;
                                        j77 = j82;
                                    }
                                }
                            }
                            float f18 = j74;
                            c19265d2.m20341c(f18, j76);
                            c19265d2.m20341c(j18, j76 + 1);
                            float f19 = 6.2831855f / f18;
                            long j86 = 0;
                            if (j19 != 0) {
                                long j87 = 0;
                                long j88 = 1;
                                long j89 = 1;
                                while (j89 <= j19) {
                                    j89 += j17;
                                    long jM20340b2 = (long) c19265d2.m20340b(j89 + j76);
                                    long j90 = j88 * jM20340b2;
                                    long j91 = j74 / j90;
                                    long j92 = jM20340b2 - j17;
                                    long j93 = j86;
                                    long j94 = 1;
                                    while (j94 <= j92) {
                                        long j95 = j93 + j88;
                                        long j96 = j88;
                                        float f20 = j95 * f19;
                                        long j97 = 3;
                                        long j98 = j87;
                                        float f21 = 0.0f;
                                        while (j97 <= j91) {
                                            j98 += 2;
                                            float f22 = f21 + 1.0f;
                                            long j99 = j95;
                                            long j100 = j98 + j74;
                                            double d12 = f22 * f20;
                                            c19265d2.m20341c((float) AbstractC6765c.m7194b(d12), j100 - 2);
                                            c19265d2.m20341c((float) AbstractC6765c.m7199g(d12), j100 - 1);
                                            j97 += 2;
                                            f20 = f20;
                                            j95 = j99;
                                            j74 = j74;
                                            f21 = f22;
                                        }
                                        j87 += j91;
                                        j94++;
                                        j88 = j96;
                                        j93 = j95;
                                        j74 = j74;
                                        j86 = 0;
                                    }
                                    j88 = j90;
                                    j17 = 1;
                                }
                            }
                        }
                    }
                    fArr2 = fArr;
                }
                c16279d.m17822k(fArr2, 0);
                length = fArr2.length / 2;
                fArr3 = new float[length];
                for (i10 = 0; i10 < length; i10++) {
                    int i20 = i10 * 2;
                    float f23 = fArr2[i20];
                    float f24 = fArr2[i20 + 1];
                    fArr3[i10] = (f24 * f24) + (f23 * f23);
                }
            } else if (length2 > 0 && ((length2 - 1) & length2) == 0) {
                c16279d.f50443u = 1;
                int[] iArr4 = new int[((int) AbstractC6765c.m7193a((1 << (((int) (AbstractC6765c.m7196d(length2 + 0.5f) / AbstractC6765c.m7196d(2.0d))) / 2)) + 2)) + 2];
                c16279d.f50427e = iArr4;
                float[] fArr6 = new float[i16];
                c16279d.f50429g = fArr6;
                int i21 = (i16 * 2) >> 2;
                c16279d.f50431i = i21;
                AbstractC16648c.m18462H(i21, fArr6, iArr4);
                int i22 = i16 >> 2;
                c16279d.f50433k = i22;
                AbstractC16648c.m18460F(i22, fArr6, i21, iArr4);
            } else if (AbstractC16648c.m18459E(length2, iArr2) >= 211) {
                c16279d.f50443u = 3;
                int i23 = i16 * 2;
                int i24 = i23 - 1;
                if (i24 < 1) {
                    throw new IllegalArgumentException("x must be greater or equal 1");
                }
                if (((i23 - 2) & i24) != 0) {
                    int i25 = i24 | (i24 >>> 1);
                    int i26 = i25 | (i25 >>> 2);
                    int i27 = i26 | (i26 >>> 4);
                    int i28 = i27 | (i27 >>> 8);
                    i24 = (i28 | (i28 >>> 16)) + 1;
                }
                c16279d.f50425c = i24;
                int i29 = i24 * 2;
                float[] fArr7 = new float[i29];
                c16279d.f50439q = fArr7;
                c16279d.f50441s = new float[i29];
                int[] iArr5 = new int[((int) AbstractC6765c.m7193a((1 << (((int) (AbstractC6765c.m7196d(i24 + 0.5f) / AbstractC6765c.m7196d(2.0d))) / 2)) + 2)) + 2];
                c16279d.f50427e = iArr5;
                float[] fArr8 = new float[i24];
                c16279d.f50429g = fArr8;
                int i30 = i29 >> 2;
                c16279d.f50431i = i30;
                AbstractC16648c.m18462H(i30, fArr8, iArr5);
                int i31 = i24 >> 2;
                c16279d.f50433k = i31;
                AbstractC16648c.m18460F(i31, fArr8, i30, iArr5);
                float f25 = 3.1415927f / i16;
                fArr7[0] = 1.0f;
                fArr7[1] = 0.0f;
                int i32 = 0;
                for (int i33 = 1; i33 < i16; i33++) {
                    int i34 = i33 * 2;
                    int i35 = (i34 - 1) + i32;
                    if (i35 >= i23) {
                        i35 -= i23;
                    }
                    i32 = i35;
                    double d13 = i32 * f25;
                    fArr7[i34] = (float) AbstractC6765c.m7194b(d13);
                    fArr7[i34 + 1] = (float) AbstractC6765c.m7199g(d13);
                }
                int i36 = c16279d.f50425c;
                float f26 = 1.0f / i36;
                float f27 = fArr7[0] * f26;
                float[] fArr9 = c16279d.f50441s;
                fArr9[0] = f27;
                fArr9[1] = fArr7[1] * f26;
                for (int i37 = 2; i37 < i23; i37 += 2) {
                    fArr9[i37] = fArr7[i37] * f26;
                    int i38 = i37 + 1;
                    fArr9[i38] = fArr7[i38] * f26;
                    int i39 = (i36 * 2) - i37;
                    fArr9[i39] = fArr9[i37];
                    fArr9[i39 + 1] = fArr9[i38];
                }
                AbstractC16648c.m18466c(i36 * 2, c16279d.f50441s, c16279d.f50427e, c16279d.f50431i, c16279d.f50429g);
            } else {
                c16279d.f50443u = 2;
                int i40 = i16 * 4;
                c16279d.f50435m = new float[i40 + 15];
                int i41 = i16 * 2;
                c16279d.f50437o = new float[i41 + 15];
                if (i16 != 1) {
                    int i42 = i16;
                    int i43 = 0;
                    int i44 = 0;
                    int i45 = 0;
                    loop10: while (true) {
                        int i46 = i43 + 1;
                        i44 = i46 <= 4 ? iArr2[i43] : i44 + 2;
                        while (true) {
                            int i47 = i42 / i44;
                            if (i42 - (i44 * i47) != 0) {
                                i43 = i46;
                            } else {
                                i13 = i45 + 1;
                                fArr5 = c16279d.f50435m;
                                fArr5[i45 + 2 + i40] = i44;
                                int i48 = 2;
                                if (i44 != 2) {
                                    i14 = 1;
                                } else if (i13 != 1) {
                                    int i49 = 2;
                                    while (i49 <= i13) {
                                        int i50 = (i13 - i49) + i48 + i40;
                                        fArr5[i50 + 1] = fArr5[i50];
                                        i49++;
                                        i48 = 2;
                                    }
                                    fArr5[i40 + 2] = 2.0f;
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                }
                                if (i47 == i14) {
                                    break loop10;
                                }
                                i42 = i47;
                                i45 = i13;
                            }
                        }
                    }
                    float f28 = i16;
                    fArr5[i40] = f28;
                    fArr5[i40 + 1] = i13;
                    float f29 = 6.2831855f / f28;
                    int i51 = 1;
                    int i52 = 1;
                    int i53 = 1;
                    while (i51 <= i13) {
                        int i54 = i51 + 1;
                        int i55 = (int) fArr5[i54 + i40];
                        int i56 = i52 * i55;
                        int i57 = i16 / i56;
                        int i58 = i57 + i57 + 2;
                        int i59 = i55 - 1;
                        int i60 = 1;
                        int i61 = 0;
                        while (i60 <= i59) {
                            float f30 = 1.0f;
                            fArr5[(i53 - 1) + i41] = 1.0f;
                            int i62 = i53 + i41;
                            fArr5[i62] = 0.0f;
                            int i63 = i13;
                            int i64 = i61 + i52;
                            int i65 = i52;
                            float f31 = i64 * f29;
                            float f32 = f29;
                            int i66 = 4;
                            float f33 = 0.0f;
                            while (i66 <= i58) {
                                int i67 = i53 + 2;
                                f33 += f30;
                                int i68 = i67 + i41;
                                float f34 = f31;
                                double d14 = f33 * f31;
                                fArr5[i68 - 1] = (float) AbstractC6765c.m7194b(d14);
                                fArr5[i68] = (float) AbstractC6765c.m7199g(d14);
                                i66 += 2;
                                i64 = i64;
                                f31 = f34;
                                i59 = i59;
                                i53 = i67;
                                f30 = 1.0f;
                            }
                            int i69 = i64;
                            int i70 = i59;
                            if (i55 > 5) {
                                int i71 = i53 + i41;
                                fArr5[i62 - 1] = fArr5[i71 - 1];
                                fArr5[i62] = fArr5[i71];
                            }
                            i60++;
                            i52 = i65;
                            i13 = i63;
                            f29 = f32;
                            i61 = i69;
                            i59 = i70;
                        }
                        i52 = i56;
                        i51 = i54;
                    }
                }
                int i72 = c16279d.f50423a;
                if (i72 != 1) {
                    int i73 = i72 * 2;
                    int i74 = i72;
                    int i75 = 0;
                    int i76 = 0;
                    int i77 = 0;
                    loop16: while (true) {
                        int i78 = i75 + 1;
                        i76 = i78 <= 4 ? iArr2[i75] : i76 + 2;
                        while (true) {
                            int i79 = i74 / i76;
                            if (i74 - (i76 * i79) != 0) {
                                i75 = i78;
                            } else {
                                i11 = i77 + 1;
                                fArr4 = c16279d.f50437o;
                                fArr4[i77 + 2 + i73] = i76;
                                int i80 = 2;
                                if (i76 != 2) {
                                    i12 = 1;
                                } else if (i11 != 1) {
                                    int i81 = 2;
                                    while (i81 <= i11) {
                                        int i82 = (i11 - i81) + i80 + i73;
                                        fArr4[i82 + 1] = fArr4[i82];
                                        i81++;
                                        i80 = 2;
                                    }
                                    fArr4[i73 + 2] = 2.0f;
                                    i12 = 1;
                                } else {
                                    i12 = 1;
                                }
                                if (i79 == i12) {
                                    break loop16;
                                }
                                i77 = i11;
                                i74 = i79;
                            }
                        }
                    }
                    float f35 = i72;
                    fArr4[i73] = f35;
                    fArr4[i73 + 1] = i11;
                    float f36 = 6.2831855f / f35;
                    if (i77 != 0) {
                        int i83 = 0;
                        int i84 = 1;
                        int i85 = 1;
                        while (i84 <= i77) {
                            i84++;
                            int i86 = (int) fArr4[i84 + i73];
                            int i87 = i85 * i86;
                            int i88 = i72 / i87;
                            int i89 = i86 - 1;
                            int i90 = 0;
                            int i91 = 1;
                            while (i91 <= i89) {
                                i90 += i85;
                                float f37 = i90 * f36;
                                int i92 = i83;
                                int i93 = i84;
                                int i94 = 3;
                                float f38 = 0.0f;
                                while (i94 <= i88) {
                                    i92 += 2;
                                    f38 += 1.0f;
                                    int i95 = i85;
                                    int i96 = i92 + i72;
                                    double d15 = f38 * f37;
                                    fArr4[i96 - 2] = (float) AbstractC6765c.m7194b(d15);
                                    fArr4[i96 - 1] = (float) AbstractC6765c.m7199g(d15);
                                    i94 += 2;
                                    i85 = i95;
                                    i72 = i72;
                                    i73 = i73;
                                    i77 = i77;
                                }
                                i83 += i88;
                                i91++;
                                i84 = i93;
                            }
                            i85 = i87;
                        }
                    }
                }
            }
            fArr2 = fArr;
            c16279d.m17822k(fArr2, 0);
            length = fArr2.length / 2;
            fArr3 = new float[length];
            while (i10 < length) {
                int i210 = i10 * 2;
                float f210 = fArr2[i210];
                float f211 = fArr2[i210 + 1];
                fArr3[i10] = (f211 * f211) + (f210 * f210);
            }
        }
        float length3 = 24000.0f / (fArr3.length * 2);
        int length4 = fArr3.length;
        float[] fArr10 = new float[length4];
        for (int i97 = 0; i97 < length4; i97++) {
            fArr10[i97] = i97 * length3;
        }
        int i98 = this.f20340a;
        int i99 = i98 + 1;
        float[] fArr11 = new float[i99];
        for (int i100 = 0; i100 < i99; i100++) {
            fArr11[i100] = 20.0f * ((float) Math.pow(600.0f, i100 / i98));
        }
        List[] listArr = new List[i98];
        for (int i101 = 0; i101 < i98; i101++) {
            listArr[i101] = new ArrayList();
        }
        for (int i102 = 0; i102 < length4; i102++) {
            float f39 = fArr10[i102];
            for (int i103 = 0; i103 < i98; i103++) {
                if (f39 >= fArr11[i103] && f39 < fArr11[i103 + 1]) {
                    listArr[i103].add(Float.valueOf(fArr3[i102]));
                    break;
                }
            }
        }
        for (int i104 = 0; i104 < i98; i104++) {
            this.f20345f[i104] = m6747c(((Number) this.f20342c.get(i104)).floatValue(), this.f20341b, AbstractC17680n.m19320A0(listArr[i104]));
        }
        float[] fArrM6747c = m6747c(1.0f, 1, fArr3);
        if (fArrM6747c.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        this.f20348i = fArrM6747c[0];
    }
}
