package jp;

import androidx.work.impl.utils.p651oZ.HhJS;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import kp.AbstractC16648c;
import p001A.AbstractC0010F;
import p413Qo.AbstractC6765c;
import p639a5.RunnableC10503b;
import p775h2.AbstractC14376f;
import p998rp.AbstractC19264c;
import p998rp.AbstractC19279r;
import p998rp.C19265d;
import p998rp.C19280s;
import p998rp.EnumC19278q;

/* JADX INFO: renamed from: jp.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C16279d {

    /* JADX INFO: renamed from: w */
    public static final int[] f50422w = {4, 2, 3, 5};

    /* JADX INFO: renamed from: a */
    public int f50423a;

    /* JADX INFO: renamed from: b */
    public long f50424b;

    /* JADX INFO: renamed from: c */
    public int f50425c;

    /* JADX INFO: renamed from: d */
    public long f50426d;

    /* JADX INFO: renamed from: e */
    public int[] f50427e;

    /* JADX INFO: renamed from: f */
    public C19280s f50428f;

    /* JADX INFO: renamed from: g */
    public float[] f50429g;

    /* JADX INFO: renamed from: h */
    public C19265d f50430h;

    /* JADX INFO: renamed from: i */
    public int f50431i;

    /* JADX INFO: renamed from: j */
    public long f50432j;

    /* JADX INFO: renamed from: k */
    public int f50433k;

    /* JADX INFO: renamed from: l */
    public long f50434l;

    /* JADX INFO: renamed from: m */
    public float[] f50435m;

    /* JADX INFO: renamed from: n */
    public C19265d f50436n;

    /* JADX INFO: renamed from: o */
    public float[] f50437o;

    /* JADX INFO: renamed from: p */
    public C19265d f50438p;

    /* JADX INFO: renamed from: q */
    public float[] f50439q;

    /* JADX INFO: renamed from: r */
    public C19265d f50440r;

    /* JADX INFO: renamed from: s */
    public float[] f50441s;

    /* JADX INFO: renamed from: t */
    public C19265d f50442t;

    /* JADX INFO: renamed from: u */
    public int f50443u;

    /* JADX INFO: renamed from: v */
    public boolean f50444v;

    /* JADX INFO: renamed from: a */
    public final void m17812a(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        int i15 = i11 * i10;
        int i16 = i10 * 2;
        for (int i17 = 0; i17 < i11; i17++) {
            int i18 = (i17 * i16) + i13;
            int i19 = (i17 * i10) + i12;
            int i20 = i19 + i15;
            float f10 = fArr[i19];
            float f11 = fArr[i20];
            fArr2[i18] = f10 + f11;
            fArr2[(i18 + i16) - 1] = f10 - f11;
        }
        int i21 = 2;
        if (i10 < 2) {
            return;
        }
        if (i10 != 2) {
            int i22 = 0;
            while (i22 < i11) {
                i16 = i22 * i10;
                int i23 = i16 * 2;
                int i24 = i23 + i10;
                int i25 = i16 + i15;
                for (int i26 = i21; i26 < i10; i26 += 2) {
                    int i27 = (i26 - 1) + i14;
                    int i28 = i13 + i26 + i23;
                    int i29 = i13 + (i10 - i26) + i24;
                    int i30 = i12 + i26;
                    int i31 = i30 + i16;
                    int i32 = i30 + i25;
                    float f12 = fArr[i31 - 1];
                    float f13 = fArr[i31];
                    float f14 = fArr[i32 - 1];
                    float f15 = fArr[i32];
                    float[] fArr3 = this.f50437o;
                    float f16 = fArr3[i27 - 1];
                    float f17 = fArr3[i27];
                    float f18 = (f17 * f15) + (f16 * f14);
                    float f19 = (f16 * f15) - (f17 * f14);
                    fArr2[i28] = f13 + f19;
                    fArr2[i28 - 1] = f12 + f18;
                    fArr2[i29] = f19 - f13;
                    fArr2[i29 - 1] = f12 - f18;
                }
                i22++;
                i21 = 2;
            }
            if (i10 % 2 == 1) {
                return;
            } else {
                i21 = 2;
            }
        }
        int i33 = i16 * i21;
        for (int i34 = 0; i34 < i11; i34++) {
            int i35 = i13 + i33 + i10;
            int i36 = ((i12 + i10) - 1) + (i34 * i10);
            fArr2[i35] = -fArr[i36 + i15];
            fArr2[i35 - 1] = fArr[i36];
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17813b(long j10, long j11, long j12, long j13, long j14, C19265d c19265d, C19265d c19265d2) {
        long j15;
        long j16;
        long j17 = j11 * j10;
        long j18 = 2;
        long j19 = j10 * 2;
        long j20 = 0;
        while (j20 < j11) {
            long j21 = (j20 * j19) + j13;
            long j22 = (j20 * j10) + j12;
            float fM20340b = c19265d.m20340b(j22);
            float fM20340b2 = c19265d.m20340b(j22 + j17);
            c19265d2.m20341c(AbstractC14376f.m15831J(fM20340b, fM20340b2, c19265d2, j21, fM20340b, fM20340b2), (j21 + j19) - 1);
            j20++;
            j19 = j19;
            j18 = 2;
        }
        long j23 = j18;
        long j24 = j19;
        if (j10 < j23) {
            return;
        }
        if (j10 != j23) {
            j16 = j24;
            long j25 = 0;
            while (j25 < j11) {
                j16 = j25 * j10;
                long j26 = j16 * j23;
                long j27 = j26 + j10;
                long j28 = j16 + j17;
                long j29 = 2;
                while (j29 < j10) {
                    long j30 = (j29 - 1) + j14;
                    long j31 = j13 + j29 + j26;
                    long j32 = j13 + (j10 - j29) + j27;
                    long j33 = j12 + j29;
                    long j34 = j33 + j16;
                    long j35 = j16;
                    long j36 = j33 + j28;
                    long j37 = j17;
                    float fM20340b3 = c19265d.m20340b(j34 - 1);
                    float fM20340b4 = c19265d.m20340b(j34);
                    float fM20340b5 = c19265d.m20340b(j36 - 1);
                    float fM20340b6 = c19265d.m20340b(j36);
                    C19265d c19265d3 = this.f50438p;
                    float fM20340b7 = c19265d3.m20340b(j30 - 1);
                    float fM20340b8 = c19265d3.m20340b(j30);
                    float f10 = (fM20340b8 * fM20340b6) + (fM20340b7 * fM20340b5);
                    float f11 = (fM20340b7 * fM20340b6) - (fM20340b8 * fM20340b5);
                    c19265d2.m20341c(fM20340b4 + f11, j31);
                    c19265d2.m20341c(AbstractC14376f.m15831J(fM20340b3, f10, c19265d2, j31 - 1, f11, fM20340b4), j32);
                    c19265d2.m20341c(fM20340b3 - f10, j32 - 1);
                    j29 += 2;
                    j25 = j25;
                    j17 = j37;
                    j16 = j35;
                }
                j23 = 2;
                j25++;
            }
            j15 = j17;
            if (j10 % j23 == 1) {
                return;
            }
        } else {
            j15 = j17;
            j16 = j24;
        }
        long j38 = j16 * j23;
        for (long j39 = 0; j39 < j11; j39++) {
            long j40 = j13 + j38 + j10;
            long j41 = ((j12 + j10) - 1) + (j39 * j10);
            c19265d2.m20341c(-c19265d.m20340b(j41 + j15), j40);
            c19265d2.m20341c(c19265d.m20340b(j41), j40 - 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17814c(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        byte b;
        char c9;
        int i15 = i14 + i10;
        int i16 = i11 * i10;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            b = -1090519040;
            c9 = 46039;
            if (i18 >= i11) {
                break;
            }
            int i19 = i18 * i10;
            int i20 = ((i18 * 3) + 1) * i10;
            int i21 = i12 + i19;
            int i22 = i21 + i16;
            int i23 = (i16 * 2) + i21;
            float f10 = fArr[i21];
            float f11 = fArr[i22];
            float f12 = fArr[i23];
            float f13 = f11 + f12;
            fArr2[(i19 * 3) + i13] = f10 + f13;
            fArr2[i13 + i20 + i10] = (f12 - f11) * 0.8660254f;
            fArr2[((i13 + i10) - 1) + i20] = (f13 * (-0.5f)) + f10;
            i18++;
        }
        if (i10 == 1) {
            return;
        }
        while (i17 < i11) {
            int i24 = i17 * i10;
            int i25 = i24 * 3;
            int i26 = i24 + i16;
            int i27 = i26 + i16;
            int i28 = i25 + i10;
            int i29 = i28 + i10;
            int i30 = 2;
            while (i30 < i10) {
                int i31 = i30 - 1;
                int i32 = i31 + i14;
                int i33 = i31 + i15;
                float[] fArr3 = this.f50437o;
                float f14 = fArr3[i32 - 1];
                float f15 = fArr3[i32];
                float f16 = fArr3[i33 - 1];
                float f17 = fArr3[i33];
                int i34 = i12 + i30;
                int i35 = i13 + i30;
                int i36 = i34 + i24;
                int i37 = i34 + i26;
                int i38 = i34 + i27;
                float f18 = fArr[i36 - 1];
                float f19 = fArr[i36];
                float f20 = fArr[i37 - 1];
                float f21 = fArr[i37];
                float f22 = fArr[i38 - 1];
                float f23 = fArr[i38];
                float f24 = (f15 * f21) + (f14 * f20);
                float f25 = (f14 * f21) - (f15 * f20);
                float f26 = (f17 * f23) + (f16 * f22);
                float f27 = (f16 * f23) - (f17 * f22);
                float f28 = f24 + f26;
                float f29 = f25 + f27;
                float f30 = (f28 * (-0.5f)) + f18;
                float f31 = (f29 * (-0.5f)) + f19;
                float f32 = (f25 - f27) * 0.8660254f;
                float f33 = (f26 - f24) * 0.8660254f;
                int i39 = i35 + i25;
                int i40 = i13 + (i10 - i30) + i28;
                int i41 = i35 + i29;
                fArr2[i39 - 1] = f18 + f28;
                fArr2[i39] = f19 + f29;
                fArr2[i40 - 1] = f30 - f32;
                fArr2[i40] = f33 - f31;
                fArr2[i41 - 1] = f30 + f32;
                fArr2[i41] = f31 + f33;
                i30 += 2;
                b = -1090519040;
                c9 = 46039;
            }
            i17++;
            c9 = c9;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17815d(long j10, long j11, long j12, long j13, long j14, C19265d c19265d, C19265d c19265d2) {
        long j15;
        long j16 = j14 + j10;
        long j17 = j11 * j10;
        long j18 = 0;
        while (true) {
            j15 = 3;
            if (j18 >= j11) {
                break;
            }
            long j19 = j18 * j10;
            long j20 = ((j18 * 3) + 1) * j10;
            long j21 = j12 + j19;
            long j22 = j21 + j17;
            long j23 = j16;
            long j24 = j21 + (2 * j17);
            float fM20340b = c19265d.m20340b(j21);
            float fM20340b2 = c19265d.m20340b(j22);
            float fM20340b3 = c19265d.m20340b(j24);
            float f10 = fM20340b2 + fM20340b3;
            c19265d2.m20341c(fM20340b + f10, (j19 * 3) + j13);
            c19265d2.m20341c((fM20340b3 - fM20340b2) * 0.8660254f, j13 + j20 + j10);
            c19265d2.m20341c((f10 * (-0.5f)) + fM20340b, ((j13 + j10) - 1) + j20);
            j18++;
            j16 = j23;
        }
        long j25 = j16;
        if (j10 == 1) {
            return;
        }
        long j26 = 0;
        while (j26 < j11) {
            long j27 = j26 * j10;
            long j28 = j27 * j15;
            long j29 = j27 + j17;
            long j30 = j29 + j17;
            long j31 = j28 + j10;
            long j32 = j31 + j10;
            long j33 = 2;
            while (j33 < j10) {
                long j34 = j33 - 1;
                long j35 = j34 + j14;
                long j36 = j34 + j25;
                long j37 = j17;
                C19265d c19265d3 = this.f50438p;
                float fM20340b4 = c19265d3.m20340b(j35 - 1);
                float fM20340b5 = c19265d3.m20340b(j35);
                float fM20340b6 = c19265d3.m20340b(j36 - 1);
                float fM20340b7 = c19265d3.m20340b(j36);
                long j38 = j12 + j33;
                long j39 = j13 + j33;
                long j40 = j38 + j27;
                long j41 = j27;
                long j42 = j38 + j29;
                long j43 = j38 + j30;
                long j44 = j28;
                float fM20340b8 = c19265d.m20340b(j40 - 1);
                float fM20340b9 = c19265d.m20340b(j40);
                float fM20340b10 = c19265d.m20340b(j42 - 1);
                float fM20340b11 = c19265d.m20340b(j42);
                float fM20340b12 = c19265d.m20340b(j43 - 1);
                float fM20340b13 = c19265d.m20340b(j43);
                float f11 = (fM20340b5 * fM20340b11) + (fM20340b4 * fM20340b10);
                float f12 = (fM20340b4 * fM20340b11) - (fM20340b5 * fM20340b10);
                float f13 = (fM20340b7 * fM20340b13) + (fM20340b6 * fM20340b12);
                float f14 = (fM20340b6 * fM20340b13) - (fM20340b7 * fM20340b12);
                float f15 = f11 + f13;
                float f16 = f12 + f14;
                float f17 = (f15 * (-0.5f)) + fM20340b8;
                float f18 = (f16 * (-0.5f)) + fM20340b9;
                float f19 = (f12 - f14) * 0.8660254f;
                float f20 = (f13 - f11) * 0.8660254f;
                long j45 = j39 + j44;
                long j46 = j13 + (j10 - j33) + j31;
                long j47 = j39 + j32;
                c19265d2.m20341c(AbstractC14376f.m15828G(fM20340b8, f15, c19265d2, j45 - 1, fM20340b9, f16), j45);
                c19265d2.m20341c(AbstractC14376f.m15830I(f17, f19, c19265d2, j46 - 1, f20, f18), j46);
                c19265d2.m20341c(AbstractC14376f.m15828G(f17, f19, c19265d2, j47 - 1, f18, f20), j47);
                j33 += 2;
                j28 = j44;
                j17 = j37;
                j27 = j41;
            }
            j26++;
            j15 = 3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m17816e(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        int i15 = i14 + i10;
        int i16 = i15 + i10;
        int i17 = i11 * i10;
        for (int i18 = 0; i18 < i11; i18++) {
            int i19 = i18 * i10;
            int i20 = i19 * 4;
            int i21 = i19 + i17;
            int i22 = i21 + i17;
            int i23 = i22 + i17;
            float f10 = fArr[i12 + i19];
            float f11 = fArr[i12 + i21];
            float f12 = fArr[i12 + i22];
            float f13 = fArr[i12 + i23];
            float f14 = f11 + f13;
            float f15 = f10 + f12;
            int i24 = i13 + i20 + i10 + i10;
            fArr2[i13 + i20] = f14 + f15;
            int i25 = i24 - 1;
            fArr2[i25 + i10 + i10] = f15 - f14;
            fArr2[i25] = f10 - f12;
            fArr2[i24] = f13 - f11;
        }
        int i26 = 2;
        if (i10 < 2) {
            return;
        }
        if (i10 != 2) {
            int i27 = 0;
            while (i27 < i11) {
                int i28 = i27 * i10;
                int i29 = i28 + i17;
                int i30 = i29 + i17;
                int i31 = i30 + i17;
                int i32 = i28 * 4;
                int i33 = i32 + i10;
                int i34 = i33 + i10;
                int i35 = i34 + i10;
                for (int i36 = i26; i36 < i10; i36 += 2) {
                    int i37 = i36 - 1;
                    int i38 = i37 + i14;
                    int i39 = i37 + i15;
                    int i40 = i37 + i16;
                    float[] fArr3 = this.f50437o;
                    float f16 = fArr3[i38 - 1];
                    float f17 = fArr3[i38];
                    float f18 = fArr3[i39 - 1];
                    float f19 = fArr3[i39];
                    float f20 = fArr3[i40 - 1];
                    float f21 = fArr3[i40];
                    int i41 = i12 + i36;
                    int i42 = i13 + i36;
                    int i43 = i13 + (i10 - i36);
                    int i44 = i41 + i28;
                    int i45 = i41 + i29;
                    int i46 = i41 + i30;
                    int i47 = i41 + i31;
                    float f22 = fArr[i44 - 1];
                    float f23 = fArr[i44];
                    float f24 = fArr[i45 - 1];
                    float f25 = fArr[i45];
                    float f26 = fArr[i46 - 1];
                    float f27 = fArr[i46];
                    float f28 = fArr[i47 - 1];
                    float f29 = fArr[i47];
                    float f30 = (f17 * f25) + (f16 * f24);
                    float f31 = (f16 * f25) - (f17 * f24);
                    float f32 = (f19 * f27) + (f18 * f26);
                    float f33 = (f18 * f27) - (f19 * f26);
                    float f34 = (f21 * f29) + (f20 * f28);
                    float f35 = (f20 * f29) - (f21 * f28);
                    float f36 = f30 + f34;
                    float f37 = f34 - f30;
                    float f38 = f31 + f35;
                    float f39 = f31 - f35;
                    float f40 = f23 + f33;
                    float f41 = f23 - f33;
                    float f42 = f22 + f32;
                    float f43 = f22 - f32;
                    int i48 = i42 + i32;
                    int i49 = i43 + i33;
                    int i50 = i42 + i34;
                    int i51 = i43 + i35;
                    fArr2[i48 - 1] = f36 + f42;
                    fArr2[i51 - 1] = f42 - f36;
                    fArr2[i48] = f38 + f40;
                    fArr2[i51] = f38 - f40;
                    fArr2[i50 - 1] = f39 + f43;
                    fArr2[i49 - 1] = f43 - f39;
                    fArr2[i50] = f37 + f41;
                    fArr2[i49] = f37 - f41;
                }
                i27++;
                i26 = 2;
            }
            if (i10 % 2 == 1) {
                return;
            }
        }
        for (int i52 = 0; i52 < i11; i52++) {
            int i53 = i52 * i10;
            int i54 = i53 * 4;
            int i55 = i53 + i17;
            int i56 = i55 + i17;
            int i57 = i56 + i17;
            int i58 = i54 + i10;
            int i59 = i58 + i10;
            int i60 = (i12 + i10) - 1;
            float f44 = fArr[i53 + i60];
            float f45 = fArr[i55 + i60];
            float f46 = fArr[i56 + i60];
            float f47 = fArr[i60 + i57];
            float f48 = (f45 + f47) * (-0.70710677f);
            float f49 = (f45 - f47) * 0.70710677f;
            int i61 = (i13 + i10) - 1;
            fArr2[i54 + i61] = f49 + f44;
            fArr2[i61 + i59] = f44 - f49;
            fArr2[i13 + i58] = f48 - f46;
            fArr2[i13 + i59 + i10] = f48 + f46;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17817f(long j10, long j11, long j12, long j13, long j14, C19265d c19265d, C19265d c19265d2) {
        C19265d c19265d3;
        long j15;
        C19265d c19265d4 = c19265d;
        C19265d c19265d5 = c19265d2;
        long j16 = j14 + j10;
        long j17 = j16 + j10;
        long j18 = j11 * j10;
        long j19 = 0;
        while (j19 < j11) {
            long j20 = j19 * j10;
            long j21 = 4 * j20;
            long j22 = j20 + j18;
            long j23 = j22 + j18;
            float fM20340b = c19265d4.m20340b(j12 + j20);
            float fM20340b2 = c19265d4.m20340b(j12 + j22);
            float fM20340b3 = c19265d4.m20340b(j12 + j23);
            float fM20340b4 = c19265d4.m20340b(j12 + j23 + j18);
            float f10 = fM20340b2 + fM20340b4;
            float f11 = fM20340b + fM20340b3;
            long j24 = j13 + j21 + j10 + j10;
            c19265d5.m20341c(f10 + f11, j13 + j21);
            long j25 = j24 - 1;
            c19265d5.m20341c(AbstractC14376f.m15830I(f11, f10, c19265d2, j25 + j10 + j10, fM20340b, fM20340b3), j25);
            c19265d5.m20341c(fM20340b4 - fM20340b2, j24);
            j19++;
            j17 = j17;
            j16 = j16;
        }
        long j26 = j16;
        long j27 = j17;
        long j28 = 2;
        if (j10 < 2) {
            return;
        }
        if (j10 != 2) {
            long j29 = 0;
            while (j29 < j11) {
                long j30 = j29 * j10;
                long j31 = j30 + j18;
                long j32 = j31 + j18;
                long j33 = j32 + j18;
                long j34 = j30 * 4;
                long j35 = j34 + j10;
                long j36 = j35 + j10;
                long j37 = j36 + j10;
                long j38 = j28;
                while (j38 < j10) {
                    long j39 = j38 - 1;
                    long j40 = j39 + j14;
                    long j41 = j39 + j26;
                    long j42 = j39 + j27;
                    long j43 = j18;
                    long j44 = j29;
                    C19265d c19265d6 = this.f50438p;
                    float fM20340b5 = c19265d6.m20340b(j40 - 1);
                    float fM20340b6 = c19265d6.m20340b(j40);
                    float fM20340b7 = c19265d6.m20340b(j41 - 1);
                    float fM20340b8 = c19265d6.m20340b(j41);
                    float fM20340b9 = c19265d6.m20340b(j42 - 1);
                    float fM20340b10 = c19265d6.m20340b(j42);
                    long j45 = j12 + j38;
                    long j46 = j13 + j38;
                    long j47 = j13 + (j10 - j38);
                    long j48 = j45 + j30;
                    long j49 = j45 + j31;
                    long j50 = j45 + j32;
                    long j51 = j45 + j33;
                    float fM20340b11 = c19265d4.m20340b(j48 - 1);
                    float fM20340b12 = c19265d4.m20340b(j48);
                    float fM20340b13 = c19265d4.m20340b(j49 - 1);
                    float fM20340b14 = c19265d4.m20340b(j49);
                    float fM20340b15 = c19265d4.m20340b(j50 - 1);
                    float fM20340b16 = c19265d4.m20340b(j50);
                    float fM20340b17 = c19265d4.m20340b(j51 - 1);
                    float fM20340b18 = c19265d4.m20340b(j51);
                    float f12 = (fM20340b6 * fM20340b14) + (fM20340b5 * fM20340b13);
                    float f13 = (fM20340b5 * fM20340b14) - (fM20340b6 * fM20340b13);
                    float f14 = (fM20340b8 * fM20340b16) + (fM20340b7 * fM20340b15);
                    float f15 = (fM20340b7 * fM20340b16) - (fM20340b8 * fM20340b15);
                    float f16 = (fM20340b10 * fM20340b18) + (fM20340b9 * fM20340b17);
                    float f17 = (fM20340b9 * fM20340b18) - (fM20340b10 * fM20340b17);
                    float f18 = f12 + f16;
                    float f19 = f16 - f12;
                    float f20 = f13 + f17;
                    float f21 = f13 - f17;
                    float f22 = fM20340b12 + f15;
                    float f23 = fM20340b12 - f15;
                    float f24 = fM20340b11 + f14;
                    float f25 = fM20340b11 - f14;
                    long j52 = j46 + j34;
                    long j53 = j47 + j35;
                    long j54 = j46 + j36;
                    long j55 = j47 + j37;
                    c19265d2.m20341c(f18 + f24, j52 - 1);
                    c19265d2.m20341c(AbstractC14376f.m15856v(f24, f18, c19265d2, j55 - 1, f20, f22), j52);
                    c19265d2.m20341c(f20 - f22, j55);
                    c19265d2.m20341c(f21 + f25, j54 - 1);
                    c19265d2.m20341c(AbstractC14376f.m15856v(f25, f21, c19265d2, j53 - 1, f19, f23), j54);
                    c19265d2.m20341c(f19 - f23, j53);
                    j38 += 2;
                    c19265d5 = c19265d2;
                    j28 = 2;
                    j18 = j43;
                    j29 = j44;
                    j30 = j30;
                    c19265d4 = c19265d;
                }
                j29++;
                c19265d4 = c19265d;
            }
            c19265d3 = c19265d5;
            j15 = j18;
            if (j10 % j28 == 1) {
                return;
            }
        } else {
            c19265d3 = c19265d5;
            j15 = j18;
        }
        long j56 = 0;
        while (j56 < j11) {
            long j57 = j56 * j10;
            long j58 = j57 * 4;
            long j59 = j57 + j15;
            long j60 = j59 + j15;
            long j61 = j60 + j15;
            long j62 = j58 + j10;
            long j63 = j62 + j10;
            long j64 = (j12 + j10) - 1;
            long j65 = j56;
            C19265d c19265d7 = c19265d3;
            float fM20340b19 = c19265d.m20340b(j64 + j57);
            float fM20340b20 = c19265d.m20340b(j64 + j59);
            float fM20340b21 = c19265d.m20340b(j64 + j60);
            float fM20340b22 = c19265d.m20340b(j64 + j61);
            float f26 = (fM20340b20 + fM20340b22) * (-0.70710677f);
            float f27 = (fM20340b20 - fM20340b22) * 0.70710677f;
            long j66 = (j13 + j10) - 1;
            c19265d7.m20341c(f27 + fM20340b19, j66 + j58);
            c19265d7.m20341c(fM20340b19 - f27, j66 + j63);
            c19265d7.m20341c(f26 - fM20340b21, j13 + j62);
            c19265d7.m20341c(f26 + fM20340b21, j13 + j63 + j10);
            c19265d3 = c19265d7;
            j56 = j65 + 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m17818g(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        char c9;
        byte b;
        int i15 = i14 + i10;
        int i16 = i15 + i10;
        int i17 = i16 + i10;
        int i18 = i11 * i10;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            c9 = 30833;
            b = -1085334595;
            if (i20 >= i11) {
                break;
            }
            int i21 = i20 * i10;
            int i22 = i21 * 5;
            int i23 = i22 + i10;
            int i24 = i23 + i10;
            int i25 = i24 + i10;
            int i26 = i21 + i18;
            int i27 = i26 + i18;
            int i28 = i27 + i18;
            int i29 = (i13 + i10) - 1;
            float f10 = fArr[i12 + i21];
            float f11 = fArr[i12 + i26];
            float f12 = fArr[i12 + i27];
            float f13 = fArr[i12 + i28];
            float f14 = fArr[i12 + i28 + i18];
            float f15 = f14 + f11;
            float f16 = f14 - f11;
            float f17 = f13 + f12;
            float f18 = f13 - f12;
            fArr2[i13 + i22] = f10 + f15 + f17;
            fArr2[i29 + i23] = (f17 * (-0.809017f)) + (f15 * 0.309017f) + f10;
            fArr2[i13 + i24] = (f18 * 0.58778524f) + (f16 * 0.95105654f);
            fArr2[i29 + i25] = (f17 * 0.309017f) + (f15 * (-0.809017f)) + f10;
            fArr2[i13 + i25 + i10] = (f16 * 0.58778524f) - (f18 * 0.95105654f);
            i20++;
        }
        if (i10 == 1) {
            return;
        }
        while (i19 < i11) {
            int i30 = i19 * i10;
            int i31 = i30 * 5;
            int i32 = i31 + i10;
            int i33 = i32 + i10;
            int i34 = i33 + i10;
            int i35 = i34 + i10;
            int i36 = i30 + i18;
            int i37 = i36 + i18;
            int i38 = i37 + i18;
            int i39 = i38 + i18;
            int i40 = 2;
            while (i40 < i10) {
                int i41 = i40 - 1;
                int i42 = i41 + i14;
                int i43 = i41 + i15;
                int i44 = i41 + i16;
                int i45 = i41 + i17;
                float[] fArr3 = this.f50437o;
                float f19 = fArr3[i42 - 1];
                float f20 = fArr3[i42];
                float f21 = fArr3[i43 - 1];
                float f22 = fArr3[i43];
                float f23 = fArr3[i44 - 1];
                float f24 = fArr3[i44];
                float f25 = fArr3[i45 - 1];
                float f26 = fArr3[i45];
                int i46 = i12 + i40;
                int i47 = i13 + i40;
                int i48 = i13 + (i10 - i40);
                int i49 = i46 + i30;
                int i50 = i46 + i36;
                int i51 = i46 + i37;
                int i52 = i46 + i38;
                int i53 = i46 + i39;
                float f27 = fArr[i49 - 1];
                float f28 = fArr[i49];
                float f29 = fArr[i50 - 1];
                float f30 = fArr[i50];
                float f31 = fArr[i51 - 1];
                float f32 = fArr[i51];
                float f33 = fArr[i52 - 1];
                float f34 = fArr[i52];
                float f35 = fArr[i53 - 1];
                float f36 = fArr[i53];
                float f37 = (f20 * f30) + (f19 * f29);
                float f38 = (f19 * f30) - (f20 * f29);
                float f39 = (f22 * f32) + (f21 * f31);
                float f40 = (f21 * f32) - (f22 * f31);
                float f41 = (f24 * f34) + (f23 * f33);
                float f42 = (f23 * f34) - (f24 * f33);
                float f43 = (f26 * f36) + (f25 * f35);
                float f44 = (f25 * f36) - (f26 * f35);
                float f45 = f37 + f43;
                float f46 = f43 - f37;
                float f47 = f38 - f44;
                float f48 = f38 + f44;
                float f49 = f39 + f41;
                float f50 = f41 - f39;
                float f51 = f40 - f42;
                float f52 = f40 + f42;
                float f53 = (f49 * (-0.809017f)) + (f45 * 0.309017f) + f27;
                float f54 = (f52 * (-0.809017f)) + (f48 * 0.309017f) + f28;
                float f55 = (f49 * 0.309017f) + (f45 * (-0.809017f)) + f27;
                float f56 = (f52 * 0.309017f) + (f48 * (-0.809017f)) + f28;
                float f57 = (f51 * 0.58778524f) + (f47 * 0.95105654f);
                float f58 = (f50 * 0.58778524f) + (f46 * 0.95105654f);
                float f59 = (f47 * 0.58778524f) - (f51 * 0.95105654f);
                float f60 = (f46 * 0.58778524f) - (f50 * 0.95105654f);
                int i54 = i47 + i31;
                int i55 = i48 + i32;
                int i56 = i47 + i33;
                int i57 = i48 + i34;
                int i58 = i47 + i35;
                fArr2[i54 - 1] = f27 + f45 + f49;
                fArr2[i54] = f28 + f48 + f52;
                fArr2[i56 - 1] = f53 + f57;
                fArr2[i55 - 1] = f53 - f57;
                fArr2[i56] = f54 + f58;
                fArr2[i55] = f58 - f54;
                fArr2[i58 - 1] = f55 + f59;
                fArr2[i57 - 1] = f55 - f59;
                fArr2[i58] = f56 + f60;
                fArr2[i57] = f60 - f56;
                i40 += 2;
                c9 = 30833;
                b = -1085334595;
            }
            i19++;
            c9 = c9;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m17819h(long j10, long j11, long j12, long j13, long j14, C19265d c19265d, C19265d c19265d2) {
        C19265d c19265d3 = c19265d2;
        long j15 = j14 + j10;
        long j16 = j15 + j10;
        long j17 = j16 + j10;
        long j18 = j11 * j10;
        long j19 = 0;
        while (j19 < j11) {
            long j20 = j19 * j10;
            long j21 = 5 * j20;
            long j22 = j21 + j10;
            long j23 = j22 + j10;
            long j24 = j23 + j10;
            long j25 = j20 + j18;
            long j26 = j25 + j18;
            long j27 = j26 + j18;
            long j28 = (j13 + j10) - 1;
            float fM20340b = c19265d.m20340b(j12 + j20);
            float fM20340b2 = c19265d.m20340b(j12 + j25);
            float fM20340b3 = c19265d.m20340b(j12 + j26);
            long j29 = j17;
            float fM20340b4 = c19265d.m20340b(j12 + j27);
            float fM20340b5 = c19265d.m20340b(j12 + j27 + j18);
            float f10 = fM20340b5 + fM20340b2;
            float f11 = fM20340b5 - fM20340b2;
            float f12 = fM20340b4 + fM20340b3;
            float f13 = fM20340b4 - fM20340b3;
            c19265d3.m20341c(fM20340b + f10 + f12, j13 + j21);
            c19265d3.m20341c((f12 * (-0.809017f)) + (f10 * 0.309017f) + fM20340b, j28 + j22);
            c19265d3.m20341c((f13 * 0.58778524f) + (f11 * 0.95105654f), j13 + j23);
            c19265d3.m20341c((f12 * 0.309017f) + (f10 * (-0.809017f)) + fM20340b, j28 + j24);
            c19265d3.m20341c((f11 * 0.58778524f) - (f13 * 0.95105654f), j13 + j24 + j10);
            j19++;
            j17 = j29;
        }
        long j30 = j17;
        if (j10 == 1) {
            return;
        }
        for (long j31 = 0; j31 < j11; j31++) {
            long j32 = j31 * j10;
            long j33 = j32 * 5;
            long j34 = j33 + j10;
            long j35 = j34 + j10;
            long j36 = j35 + j10;
            long j37 = j36 + j10;
            long j38 = j32 + j18;
            long j39 = j38 + j18;
            long j40 = j39 + j18;
            long j41 = j40 + j18;
            long j42 = 2;
            while (j42 < j10) {
                long j43 = j42 - 1;
                long j44 = j43 + j14;
                long j45 = j43 + j15;
                long j46 = j43 + j16;
                long j47 = j43 + j30;
                long j48 = j15;
                long j49 = j16;
                C19265d c19265d4 = this.f50438p;
                float fM20340b6 = c19265d4.m20340b(j44 - 1);
                float fM20340b7 = c19265d4.m20340b(j44);
                float fM20340b8 = c19265d4.m20340b(j45 - 1);
                float fM20340b9 = c19265d4.m20340b(j45);
                float fM20340b10 = c19265d4.m20340b(j46 - 1);
                float fM20340b11 = c19265d4.m20340b(j46);
                float fM20340b12 = c19265d4.m20340b(j47 - 1);
                float fM20340b13 = c19265d4.m20340b(j47);
                long j50 = j12 + j42;
                long j51 = j13 + j42;
                long j52 = j13 + (j10 - j42);
                long j53 = j50 + j32;
                long j54 = j32;
                long j55 = j50 + j38;
                long j56 = j50 + j39;
                long j57 = j50 + j40;
                long j58 = j50 + j41;
                float fM20340b14 = c19265d.m20340b(j53 - 1);
                float fM20340b15 = c19265d.m20340b(j53);
                float fM20340b16 = c19265d.m20340b(j55 - 1);
                float fM20340b17 = c19265d.m20340b(j55);
                float fM20340b18 = c19265d.m20340b(j56 - 1);
                float fM20340b19 = c19265d.m20340b(j56);
                float fM20340b20 = c19265d.m20340b(j57 - 1);
                float fM20340b21 = c19265d.m20340b(j57);
                float fM20340b22 = c19265d.m20340b(j58 - 1);
                float fM20340b23 = c19265d.m20340b(j58);
                float f14 = (fM20340b7 * fM20340b17) + (fM20340b6 * fM20340b16);
                float f15 = (fM20340b6 * fM20340b17) - (fM20340b7 * fM20340b16);
                float f16 = (fM20340b9 * fM20340b19) + (fM20340b8 * fM20340b18);
                float f17 = (fM20340b8 * fM20340b19) - (fM20340b9 * fM20340b18);
                float f18 = (fM20340b11 * fM20340b21) + (fM20340b10 * fM20340b20);
                float f19 = (fM20340b21 * fM20340b10) - (fM20340b11 * fM20340b20);
                float f20 = (fM20340b13 * fM20340b23) + (fM20340b12 * fM20340b22);
                float f21 = (fM20340b12 * fM20340b23) - (fM20340b22 * fM20340b13);
                float f22 = f14 + f20;
                float f23 = f20 - f14;
                float f24 = f15 - f21;
                float f25 = f15 + f21;
                float f26 = f16 + f18;
                float f27 = f18 - f16;
                float f28 = f17 - f19;
                float f29 = f17 + f19;
                float f30 = (f22 * 0.309017f) + fM20340b14 + (f26 * (-0.809017f));
                float f31 = (f29 * (-0.809017f)) + (f25 * 0.309017f) + fM20340b15;
                float f32 = (f22 * (-0.809017f)) + fM20340b14 + (f26 * 0.309017f);
                float f33 = (f29 * 0.309017f) + (f25 * (-0.809017f)) + fM20340b15;
                float f34 = (f28 * 0.58778524f) + (f24 * 0.95105654f);
                float f35 = (f27 * 0.58778524f) + (f23 * 0.95105654f);
                float f36 = (f24 * 0.58778524f) - (f28 * 0.95105654f);
                float f37 = (f23 * 0.58778524f) - (f27 * 0.95105654f);
                long j59 = j51 + j33;
                long j60 = j52 + j34;
                long j61 = j51 + j35;
                long j62 = j52 + j36;
                long j63 = j51 + j37;
                c19265d2.m20341c(f22 + fM20340b14 + f26, j59 - 1);
                c19265d2.m20341c(fM20340b15 + f25 + f29, j59);
                c19265d2.m20341c(f30 + f34, j61 - 1);
                c19265d2.m20341c(AbstractC14376f.m15856v(f30, f34, c19265d2, j60 - 1, f31, f35), j61);
                c19265d2.m20341c(f35 - f31, j60);
                c19265d2.m20341c(f32 + f36, j63 - 1);
                c19265d2.m20341c(AbstractC14376f.m15856v(f32, f36, c19265d2, j62 - 1, f33, f37), j63);
                c19265d2.m20341c(f37 - f33, j62);
                j42 += 2;
                c19265d3 = c19265d2;
                j15 = j48;
                j16 = j49;
                j32 = j54;
                j18 = j18;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m17820i(int i10, int i11, int i12, int i13, float[] fArr, int i14, float[] fArr2, int i15, int i16) {
        float f10;
        int i17;
        int i18;
        int i19 = i11;
        double d10 = 6.2831855f / i19;
        float fM7194b = (float) AbstractC6765c.m7194b(d10);
        float fM7199g = (float) AbstractC6765c.m7199g(d10);
        int i20 = (i19 + 1) / 2;
        int i21 = (i10 - 1) / 2;
        if (i10 != 1) {
            for (int i22 = 0; i22 < i13; i22++) {
                fArr2[i15 + i22] = fArr[i14 + i22];
            }
            for (int i23 = 1; i23 < i19; i23++) {
                int i24 = i23 * i12 * i10;
                for (int i25 = 0; i25 < i12; i25++) {
                    int i26 = (i25 * i10) + i24;
                    fArr2[i15 + i26] = fArr[i14 + i26];
                }
            }
            float[] fArr3 = this.f50437o;
            if (i21 <= i12) {
                int i27 = -i10;
                for (int i28 = 1; i28 < i19; i28++) {
                    i27 += i10;
                    int i29 = i27 - 1;
                    int i30 = i28 * i12 * i10;
                    int i31 = 2;
                    while (i31 < i10) {
                        i29 += 2;
                        int i32 = i29 + i16;
                        int i33 = i14 + i31;
                        int i34 = i15 + i31;
                        float f11 = fArr3[i32 - 1];
                        float f12 = fArr3[i32];
                        int i35 = i27;
                        for (int i36 = 0; i36 < i12; i36++) {
                            int i37 = (i36 * i10) + i30;
                            int i38 = i34 + i37;
                            int i39 = i33 + i37;
                            float f13 = fArr[i39 - 1];
                            float f14 = fArr[i39];
                            fArr2[i38 - 1] = (f12 * f14) + (f11 * f13);
                            fArr2[i38] = (f14 * f11) - (f13 * f12);
                        }
                        i31 += 2;
                        i27 = i35;
                    }
                }
            } else {
                int i40 = -i10;
                int i41 = 1;
                while (i41 < i19) {
                    i40 += i10;
                    int i42 = i41 * i12 * i10;
                    float f15 = fM7199g;
                    int i43 = 0;
                    while (i43 < i12) {
                        int i44 = i40 - 1;
                        int i45 = (i43 * i10) + i42;
                        int i46 = i40;
                        for (int i47 = 2; i47 < i10; i47 += 2) {
                            i44 += 2;
                            int i48 = i44 + i16;
                            float f16 = fArr3[i48 - 1];
                            float f17 = fArr3[i48];
                            int i49 = i15 + i47 + i45;
                            int i50 = i14 + i47 + i45;
                            float f18 = fArr[i50 - 1];
                            float f19 = fArr[i50];
                            fArr2[i49 - 1] = (f17 * f19) + (f16 * f18);
                            fArr2[i49] = (f16 * f19) - (f17 * f18);
                        }
                        i43++;
                        i40 = i46;
                    }
                    i41++;
                    fM7199g = f15;
                }
            }
            f10 = fM7199g;
            i17 = 2;
            if (i21 >= i12) {
                for (int i51 = 1; i51 < i20; i51++) {
                    int i52 = i51 * i12 * i10;
                    int i53 = (i19 - i51) * i12 * i10;
                    int i54 = 0;
                    while (i54 < i12) {
                        int i55 = i54 * i10;
                        int i56 = i55 + i52;
                        int i57 = i55 + i53;
                        int i58 = i53;
                        for (int i59 = 2; i59 < i10; i59 += 2) {
                            int i60 = i14 + i59;
                            int i61 = i15 + i59;
                            int i62 = i60 + i56;
                            int i63 = i60 + i57;
                            int i64 = i61 + i56;
                            int i65 = i61 + i57;
                            float f20 = fArr2[i64 - 1];
                            float f21 = fArr2[i64];
                            float f22 = fArr2[i65 - 1];
                            float f23 = fArr2[i65];
                            fArr[i62 - 1] = f20 + f22;
                            fArr[i62] = f21 + f23;
                            fArr[i63 - 1] = f21 - f23;
                            fArr[i63] = f22 - f20;
                        }
                        i54++;
                        i53 = i58;
                    }
                }
            } else {
                for (int i66 = 1; i66 < i20; i66++) {
                    int i67 = i66 * i12 * i10;
                    int i68 = (i19 - i66) * i12 * i10;
                    int i69 = 2;
                    while (i69 < i10) {
                        int i70 = i14 + i69;
                        int i71 = i15 + i69;
                        int i72 = i21;
                        for (int i73 = 0; i73 < i12; i73++) {
                            int i74 = i73 * i10;
                            int i75 = i74 + i67;
                            int i76 = i74 + i68;
                            int i77 = i70 + i75;
                            int i78 = i70 + i76;
                            int i79 = i71 + i75;
                            int i80 = i71 + i76;
                            float f24 = fArr2[i79 - 1];
                            float f25 = fArr2[i79];
                            float f26 = fArr2[i80 - 1];
                            float f27 = fArr2[i80];
                            fArr[i77 - 1] = f24 + f26;
                            fArr[i77] = f25 + f27;
                            fArr[i78 - 1] = f25 - f27;
                            fArr[i78] = f26 - f24;
                        }
                        i69 += 2;
                        i21 = i72;
                    }
                }
            }
            i18 = i21;
        } else {
            f10 = fM7199g;
            i17 = 2;
            i18 = i21;
            System.arraycopy(fArr2, i15, fArr, i14, i13);
        }
        for (int i81 = 1; i81 < i20; i81++) {
            int i82 = i81 * i12 * i10;
            int i83 = (i19 - i81) * i12 * i10;
            for (int i84 = 0; i84 < i12; i84++) {
                int i85 = i84 * i10;
                int i86 = i85 + i82;
                int i87 = i85 + i83;
                float f28 = fArr2[i15 + i86];
                float f29 = fArr2[i15 + i87];
                fArr[i86 + i14] = f28 + f29;
                fArr[i87 + i14] = f29 - f28;
            }
        }
        int i88 = (i19 - 1) * i13;
        float f30 = 1.0f;
        float f31 = 0.0f;
        int i89 = 1;
        while (i89 < i20) {
            float f32 = (fM7194b * f30) - (f10 * f31);
            f31 = (f31 * fM7194b) + (f30 * f10);
            int i90 = i89 * i13;
            int i91 = (i19 - i89) * i13;
            float f33 = fM7194b;
            for (int i92 = 0; i92 < i13; i92++) {
                int i93 = i15 + i92;
                int i94 = i14 + i92;
                fArr2[i93 + i90] = (fArr[i94 + i13] * f32) + fArr[i94];
                fArr2[i93 + i91] = fArr[i94 + i88] * f31;
            }
            float f34 = f31;
            float f35 = f32;
            int i95 = i17;
            while (i95 < i20) {
                float f36 = (f32 * f35) - (f31 * f34);
                f34 = (f35 * f31) + (f34 * f32);
                int i96 = i95 * i13;
                int i97 = (i19 - i95) * i13;
                int i98 = i88;
                for (int i99 = 0; i99 < i13; i99++) {
                    int i100 = i15 + i99;
                    int i101 = i14 + i99;
                    int i102 = i100 + i90;
                    fArr2[i102] = (fArr[i101 + i96] * f36) + fArr2[i102];
                    int i103 = i100 + i91;
                    fArr2[i103] = (fArr[i101 + i97] * f34) + fArr2[i103];
                }
                i95++;
                i88 = i98;
                f35 = f36;
            }
            i89++;
            f30 = f32;
            fM7194b = f33;
        }
        for (int i104 = 1; i104 < i20; i104++) {
            int i105 = i104 * i13;
            for (int i106 = 0; i106 < i13; i106++) {
                int i107 = i15 + i106;
                fArr2[i107] = fArr2[i107] + fArr[i14 + i106 + i105];
            }
        }
        if (i10 >= i12) {
            for (int i108 = 0; i108 < i12; i108++) {
                int i109 = i108 * i10;
                int i110 = i109 * i19;
                for (int i111 = 0; i111 < i10; i111++) {
                    fArr[i14 + i111 + i110] = fArr2[i15 + i111 + i109];
                }
            }
        } else {
            for (int i112 = 0; i112 < i10; i112++) {
                for (int i113 = 0; i113 < i12; i113++) {
                    int i114 = i113 * i10;
                    fArr[(i114 * i19) + i14 + i112] = fArr2[i15 + i112 + i114];
                }
            }
        }
        int i115 = i19 * i10;
        for (int i116 = 1; i116 < i20; i116++) {
            int i117 = i116 * i12 * i10;
            int i118 = (i19 - i116) * i12 * i10;
            int i119 = i116 * 2 * i10;
            for (int i120 = 0; i120 < i12; i120++) {
                int i121 = i120 * i10;
                int i122 = i120 * i115;
                fArr[((((i14 + i10) - 1) + i119) - i10) + i122] = fArr2[i121 + i117 + i15];
                fArr[i14 + i119 + i122] = fArr2[i121 + i118 + i15];
            }
        }
        if (i10 == 1) {
            return;
        }
        if (i18 >= i12) {
            for (int i123 = 1; i123 < i20; i123++) {
                int i124 = i123 * i12 * i10;
                int i125 = (i19 - i123) * i12 * i10;
                int i126 = i123 * 2 * i10;
                int i127 = 0;
                while (i127 < i12) {
                    int i128 = i127 * i115;
                    int i129 = i127 * i10;
                    int i130 = i115;
                    for (int i131 = i17; i131 < i10; i131 += 2) {
                        int i132 = i14 + i131 + i126 + i128;
                        int i133 = (((i14 + (i10 - i131)) + i126) - i10) + i128;
                        int i134 = i15 + i131 + i129;
                        int i135 = i134 + i124;
                        int i136 = i134 + i125;
                        float f37 = fArr2[i135 - 1];
                        float f38 = fArr2[i135];
                        float f39 = fArr2[i136 - 1];
                        float f40 = fArr2[i136];
                        fArr[i132 - 1] = f37 + f39;
                        fArr[i133 - 1] = f37 - f39;
                        fArr[i132] = f38 + f40;
                        fArr[i133] = f40 - f38;
                    }
                    i127++;
                    i115 = i130;
                }
            }
            return;
        }
        int i137 = 1;
        while (i137 < i20) {
            int i138 = i137 * i12 * i10;
            int i139 = (i19 - i137) * i12 * i10;
            int i140 = i137 * 2 * i10;
            for (int i141 = i17; i141 < i10; i141 += 2) {
                int i142 = i14 + i141;
                int i143 = (i10 - i141) + i14;
                int i144 = i15 + i141;
                for (int i145 = 0; i145 < i12; i145++) {
                    int i146 = i145 * i115;
                    int i147 = i142 + i140 + i146;
                    int i148 = ((i143 + i140) - i10) + i146;
                    int i149 = i144 + (i145 * i10);
                    int i150 = i149 + i138;
                    int i151 = i149 + i139;
                    float f41 = fArr2[i150 - 1];
                    float f42 = fArr2[i150];
                    float f43 = fArr2[i151 - 1];
                    float f44 = fArr2[i151];
                    fArr[i147 - 1] = f41 + f43;
                    fArr[i148 - 1] = f41 - f43;
                    fArr[i147] = f42 + f44;
                    fArr[i148] = f44 - f42;
                }
            }
            i137++;
            i19 = i11;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m17821j(long j10, long j11, long j12, long j13, C19265d c19265d, long j14, C19265d c19265d2, long j15, long j16) {
        float f10;
        float f11;
        int i10;
        long j17 = j10;
        long j18 = j11;
        C19265d c19265d3 = c19265d2;
        double d10 = 6.2831855f / j18;
        float fM7194b = (float) AbstractC6765c.m7194b(d10);
        float fM7199g = (float) AbstractC6765c.m7199g(d10);
        long j19 = (j18 + 1) / 2;
        long j20 = (j17 - 1) / 2;
        if (j17 != 1) {
            for (long j21 = 0; j21 < j13; j21++) {
                c19265d3.m20341c(c19265d.m20340b(j14 + j21), j15 + j21);
            }
            for (long j22 = 1; j22 < j18; j22++) {
                long j23 = j22 * j12 * j17;
                long j24 = 0;
                while (j24 < j12) {
                    long j25 = (j24 * j17) + j23;
                    c19265d3.m20341c(c19265d.m20340b(j14 + j25), j15 + j25);
                    j24++;
                    j23 = j23;
                }
            }
            int i11 = (j20 > j12 ? 1 : (j20 == j12 ? 0 : -1));
            C19265d c19265d4 = this.f50438p;
            if (i11 <= 0) {
                long j26 = -j17;
                long j27 = 1;
                while (j27 < j18) {
                    long j28 = j26 + j17;
                    long j29 = j28 - 1;
                    long j30 = j27 * j12 * j17;
                    long j31 = 2;
                    while (j31 < j17) {
                        j29 += 2;
                        long j32 = j28;
                        long j33 = j29 + j16;
                        long j34 = j14 + j31;
                        long j35 = j15 + j31;
                        float fM20340b = c19265d4.m20340b(j33 - 1);
                        float fM20340b2 = c19265d4.m20340b(j33);
                        long j36 = 0;
                        while (j36 < j12) {
                            long j37 = (j36 * j17) + j30;
                            float f12 = fM7194b;
                            long j38 = j35 + j37;
                            int i12 = i11;
                            long j39 = j34 + j37;
                            float fM20340b3 = c19265d.m20340b(j39 - 1);
                            float fM20340b4 = c19265d.m20340b(j39);
                            c19265d3.m20341c((fM20340b2 * fM20340b4) + (fM20340b * fM20340b3), j38 - 1);
                            c19265d3.m20341c((fM20340b4 * fM20340b) - (fM20340b3 * fM20340b2), j38);
                            j36++;
                            i11 = i12;
                            fM7194b = f12;
                            fM7199g = fM7199g;
                            c19265d4 = c19265d4;
                        }
                        j31 += 2;
                        j28 = j32;
                    }
                    j27++;
                    j18 = j11;
                    j26 = j28;
                }
                f10 = fM7194b;
                f11 = fM7199g;
                i10 = i11;
            } else {
                i10 = i11;
                f10 = fM7194b;
                f11 = fM7199g;
                long j40 = -j17;
                long j41 = 1;
                while (j41 < j11) {
                    j40 += j17;
                    long j42 = j41 * j12 * j17;
                    long j43 = 0;
                    while (j43 < j12) {
                        long j44 = j40 - 1;
                        long j45 = (j43 * j17) + j42;
                        long j46 = 2;
                        while (j46 < j17) {
                            long j47 = j44 + 2;
                            long j48 = j40;
                            long j49 = j47 + j16;
                            long j50 = j42;
                            float fM20340b5 = c19265d4.m20340b(j49 - 1);
                            float fM20340b6 = c19265d4.m20340b(j49);
                            long j51 = j15 + j46 + j45;
                            long j52 = j14 + j46 + j45;
                            float fM20340b7 = c19265d.m20340b(j52 - 1);
                            float fM20340b8 = c19265d.m20340b(j52);
                            i10 = i10;
                            c19265d3.m20341c((fM20340b6 * fM20340b8) + (fM20340b5 * fM20340b7), j51 - 1);
                            c19265d3.m20341c((fM20340b5 * fM20340b8) - (fM20340b6 * fM20340b7), j51);
                            j46 += 2;
                            j17 = j10;
                            j40 = j48;
                            j42 = j50;
                            j41 = j41;
                            j44 = j47;
                        }
                        j43++;
                        j17 = j10;
                    }
                    j41++;
                    j17 = j10;
                }
            }
            if (i10 >= 0) {
                long j53 = 1;
                while (j53 < j19) {
                    long j54 = j53 * j12 * j10;
                    long j55 = (j11 - j53) * j12 * j10;
                    for (long j56 = 0; j56 < j12; j56++) {
                        long j57 = j56 * j10;
                        long j58 = j57 + j54;
                        long j59 = j57 + j55;
                        long j60 = 2;
                        while (j60 < j10) {
                            long j61 = j14 + j60;
                            long j62 = j15 + j60;
                            long j63 = j61 + j58;
                            long j64 = j61 + j59;
                            long j65 = j62 + j58;
                            long j66 = j62 + j59;
                            long j67 = j55;
                            float fM20340b9 = c19265d3.m20340b(j65 - 1);
                            float fM20340b10 = c19265d3.m20340b(j65);
                            float fM20340b11 = c19265d3.m20340b(j66 - 1);
                            float fM20340b12 = c19265d3.m20340b(j66);
                            c19265d.m20341c(AbstractC14376f.m15828G(fM20340b9, fM20340b11, c19265d, j63 - 1, fM20340b10, fM20340b12), j63);
                            c19265d.m20341c(AbstractC14376f.m15830I(fM20340b10, fM20340b12, c19265d, j64 - 1, fM20340b11, fM20340b9), j64);
                            j60 += 2;
                            j55 = j67;
                            j53 = j53;
                            j54 = j54;
                        }
                    }
                    j53++;
                }
            } else {
                long j68 = 1;
                while (j68 < j19) {
                    long j69 = j68 * j12 * j10;
                    long j70 = (j11 - j68) * j12 * j10;
                    for (long j71 = 2; j71 < j10; j71 += 2) {
                        long j72 = j14 + j71;
                        long j73 = j15 + j71;
                        long j74 = 0;
                        while (j74 < j12) {
                            long j75 = j74 * j10;
                            long j76 = j75 + j69;
                            long j77 = j75 + j70;
                            long j78 = j72 + j76;
                            long j79 = j72 + j77;
                            long j80 = j73 + j76;
                            long j81 = j73 + j77;
                            long j82 = j70;
                            float fM20340b13 = c19265d3.m20340b(j80 - 1);
                            float fM20340b14 = c19265d3.m20340b(j80);
                            float fM20340b15 = c19265d3.m20340b(j81 - 1);
                            float fM20340b16 = c19265d3.m20340b(j81);
                            c19265d.m20341c(AbstractC14376f.m15828G(fM20340b13, fM20340b15, c19265d, j78 - 1, fM20340b14, fM20340b16), j78);
                            c19265d.m20341c(AbstractC14376f.m15830I(fM20340b14, fM20340b16, c19265d, j79 - 1, fM20340b15, fM20340b13), j79);
                            j74++;
                            j70 = j82;
                            j68 = j68;
                            j69 = j69;
                        }
                    }
                    j68++;
                }
            }
        } else {
            f10 = fM7194b;
            f11 = fM7199g;
            AbstractC19279r.m20343a(j15, j14, j13, c19265d2, c19265d);
        }
        for (long j83 = 1; j83 < j19; j83++) {
            long j84 = j83 * j12 * j10;
            long j85 = (j11 - j83) * j12 * j10;
            long j86 = 0;
            while (j86 < j12) {
                long j87 = j86 * j10;
                long j88 = j87 + j84;
                long j89 = j87 + j85;
                long j90 = j85;
                float fM20340b17 = c19265d3.m20340b(j15 + j88);
                float fM20340b18 = c19265d3.m20340b(j15 + j89);
                c19265d.m20341c(fM20340b17 + fM20340b18, j14 + j88);
                c19265d.m20341c(fM20340b18 - fM20340b17, j14 + j89);
                j86++;
                j85 = j90;
            }
        }
        long j91 = (j11 - 1) * j13;
        float f13 = 1.0f;
        float f14 = 0.0f;
        long j92 = 1;
        while (j92 < j19) {
            float f15 = (f10 * f13) - (f11 * f14);
            f14 = (f11 * f13) + (f10 * f14);
            long j93 = j92 * j13;
            long j94 = (j11 - j92) * j13;
            long j95 = 0;
            while (j95 < j13) {
                long j96 = j15 + j95;
                long j97 = j92;
                long j98 = j14 + j95;
                c19265d3.m20341c((c19265d.m20340b(j98 + j13) * f15) + c19265d.m20340b(j98), j96 + j93);
                c19265d3.m20341c(c19265d.m20340b(j98 + j91) * f14, j96 + j94);
                j95++;
                j92 = j97;
                j93 = j93;
            }
            long j99 = j92;
            long j100 = j93;
            float f16 = f14;
            float f17 = f15;
            long j101 = 2;
            while (j101 < j19) {
                float f18 = (f15 * f17) - (f14 * f16);
                f16 = (f16 * f15) + (f17 * f14);
                long j102 = j101 * j13;
                long j103 = (j11 - j101) * j13;
                long j104 = 0;
                while (j104 < j13) {
                    long j105 = j15 + j104;
                    long j106 = j14 + j104;
                    long j107 = j91;
                    long j108 = j105 + j100;
                    c19265d3.m20341c((c19265d.m20340b(j106 + j102) * f18) + c19265d3.m20340b(j108), j108);
                    long j109 = j105 + j94;
                    c19265d3.m20341c((c19265d.m20340b(j106 + j103) * f16) + c19265d3.m20340b(j109), j109);
                    j104++;
                    f14 = f14;
                    j91 = j107;
                    j101 = j101;
                }
                j101++;
                f17 = f18;
            }
            j92 = j99 + 1;
            f13 = f15;
            j91 = j91;
        }
        for (long j110 = 1; j110 < j19; j110++) {
            long j111 = j110 * j13;
            for (long j112 = 0; j112 < j13; j112++) {
                long j113 = j15 + j112;
                c19265d3.m20341c(c19265d.m20340b(j14 + j112 + j111) + c19265d3.m20340b(j113), j113);
            }
        }
        if (j10 >= j12) {
            for (long j114 = 0; j114 < j12; j114++) {
                long j115 = j114 * j10;
                long j116 = j115 * j11;
                for (long j117 = 0; j117 < j10; j117++) {
                    c19265d.m20341c(c19265d3.m20340b(j15 + j117 + j115), j14 + j117 + j116);
                }
            }
        } else {
            for (long j118 = 0; j118 < j10; j118++) {
                for (long j119 = 0; j119 < j12; j119++) {
                    long j120 = j119 * j10;
                    c19265d.m20341c(c19265d3.m20340b(j15 + j118 + j120), (j120 * j11) + j14 + j118);
                }
            }
        }
        long j121 = j11 * j10;
        for (long j122 = 1; j122 < j19; j122++) {
            long j123 = j122 * j12 * j10;
            long j124 = (j11 - j122) * j12 * j10;
            long j125 = j122 * 2 * j10;
            long j126 = 0;
            while (j126 < j12) {
                long j127 = j126 * j10;
                long j128 = j126 * j121;
                c19265d.m20341c(c19265d3.m20340b(j15 + j127 + j123), ((((j14 + j10) - 1) + j125) - j10) + j128);
                c19265d.m20341c(c19265d3.m20340b(j15 + j127 + j124), j14 + j125 + j128);
                j126++;
                j124 = j124;
                j123 = j123;
            }
        }
        if (j17 == 1) {
            return;
        }
        if (j20 >= j12) {
            long j129 = 1;
            while (j129 < j19) {
                long j130 = j129 * j12 * j10;
                long j131 = (j11 - j129) * j12 * j10;
                long j132 = j129 * 2 * j10;
                long j133 = 0;
                while (j133 < j12) {
                    long j134 = j133 * j121;
                    long j135 = j133 * j10;
                    long j136 = 2;
                    while (j136 < j10) {
                        long j137 = j14 + j136 + j132 + j134;
                        long j138 = (((j14 + (j10 - j136)) + j132) - j10) + j134;
                        long j139 = j15 + j136 + j135;
                        long j140 = j139 + j130;
                        long j141 = j139 + j131;
                        long j142 = j130;
                        float fM20340b19 = c19265d3.m20340b(j140 - 1);
                        float fM20340b20 = c19265d3.m20340b(j140);
                        float fM20340b21 = c19265d3.m20340b(j141 - 1);
                        float fM20340b22 = c19265d3.m20340b(j141);
                        c19265d.m20341c(fM20340b19 + fM20340b21, j137 - 1);
                        c19265d.m20341c(AbstractC14376f.m15856v(fM20340b19, fM20340b21, c19265d, j138 - 1, fM20340b20, fM20340b22), j137);
                        c19265d.m20341c(fM20340b22 - fM20340b20, j138);
                        j136 += 2;
                        j130 = j142;
                        c19265d3 = c19265d2;
                        j121 = j121;
                    }
                    j133++;
                    c19265d3 = c19265d2;
                }
                j129++;
                c19265d3 = c19265d2;
            }
            return;
        }
        long j143 = j121;
        long j144 = 1;
        while (j144 < j19) {
            long j145 = j144 * j12 * j10;
            long j146 = (j11 - j144) * j12 * j10;
            long j147 = j144 * 2 * j10;
            long j148 = 2;
            while (j148 < j10) {
                long j149 = j14 + j148;
                long j150 = j14 + (j10 - j148);
                long j151 = j15 + j148;
                long j152 = 0;
                while (j152 < j12) {
                    long j153 = j143;
                    long j154 = j152 * j153;
                    long j155 = j149 + j147 + j154;
                    long j156 = ((j150 + j147) - j10) + j154;
                    long j157 = j151 + (j152 * j10);
                    long j158 = j157 + j145;
                    long j159 = j157 + j146;
                    long j160 = j146;
                    float fM20340b23 = c19265d2.m20340b(j158 - 1);
                    float fM20340b24 = c19265d2.m20340b(j158);
                    float fM20340b25 = c19265d2.m20340b(j159 - 1);
                    float fM20340b26 = c19265d2.m20340b(j159);
                    c19265d.m20341c(fM20340b23 + fM20340b25, j155 - 1);
                    c19265d.m20341c(AbstractC14376f.m15856v(fM20340b23, fM20340b25, c19265d, j156 - 1, fM20340b24, fM20340b26), j155);
                    c19265d.m20341c(fM20340b26 - fM20340b24, j156);
                    j152++;
                    j146 = j160;
                    j145 = j145;
                    j143 = j153;
                    j144 = j144;
                }
                j148 += 2;
                j143 = j143;
            }
            j144++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0715  */
    /* JADX WARN: Code duplicated, block: B:184:0x071b A[LOOP:13: B:183:0x0719->B:184:0x071b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x073f A[LOOP:14: B:186:0x073d->B:187:0x073f, LOOP_END] */
    /* JADX INFO: renamed from: k */
    public final void m17822k(float[] fArr, int i10) {
        int i11;
        int i12;
        int i13;
        float[] fArr2;
        int i14;
        float[] fArr3;
        float[] fArr4;
        int i15;
        int i16;
        long j10;
        long j11;
        long j12;
        long j13;
        C19265d c19265d;
        long j14;
        C19265d c19265d2;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        C16279d c16279d;
        C19265d c19265d3;
        C19265d c19265d4;
        int i17 = this.f50443u;
        boolean z6 = this.f50444v;
        if (!z6) {
            int i18 = this.f50423a;
            if (i18 == 1) {
                return;
            }
            int iM24h = AbstractC0010F.m24h(i17);
            if (iM24h == 0) {
                int i19 = this.f50423a;
                if (i19 > 4) {
                    AbstractC16648c.m18476m(i19, fArr, i10, this.f50427e, this.f50431i, this.f50429g);
                    int i20 = i18 >> 1;
                    int i21 = this.f50433k;
                    int i22 = (i21 * 2) / i20;
                    int i23 = 0;
                    for (int i24 = 2; i24 < i20; i24 += 2) {
                        i23 += i22;
                        int i25 = this.f50431i;
                        float[] fArr5 = this.f50429g;
                        float f10 = 0.5f - fArr5[(i25 + i21) - i23];
                        float f11 = fArr5[i25 + i23];
                        int i26 = i10 + i24;
                        int i27 = (i18 - i24) + i10;
                        float f12 = fArr[i26];
                        float f13 = f12 - fArr[i27];
                        int i28 = i26 + 1;
                        int i29 = i27 + 1;
                        float f14 = fArr[i28] + fArr[i29];
                        float f15 = (f10 * f13) - (f11 * f14);
                        float f16 = (f11 * f13) + (f10 * f14);
                        fArr[i26] = f12 - f15;
                        fArr[i28] = f16 - fArr[i28];
                        fArr[i27] = fArr[i27] + f15;
                        fArr[i29] = f16 - fArr[i29];
                    }
                    int i30 = i20 + i10 + 1;
                    fArr[i30] = -fArr[i30];
                } else if (i19 == 4) {
                    float f17 = fArr[i10];
                    int i31 = i10 + 2;
                    float f18 = fArr[i31];
                    int i32 = i10 + 1;
                    int i33 = i10 + 3;
                    float f19 = (-fArr[i32]) + fArr[i33];
                    fArr[i10] = f17 + f18;
                    fArr[i32] = fArr[i32] + fArr[i33];
                    fArr[i31] = f17 - f18;
                    fArr[i33] = f19;
                }
                float f20 = fArr[i10];
                int i34 = i10 + 1;
                float f21 = fArr[i34];
                fArr[i10] = f20 + f21;
                fArr[i34] = f20 - f21;
                return;
            }
            if (iM24h == 1) {
                int i35 = 4;
                if (i18 == 1) {
                    i11 = 1;
                } else {
                    float[] fArr6 = new float[i18];
                    int i36 = i18 * 2;
                    float[] fArr7 = this.f50437o;
                    int i37 = (int) fArr7[i36 + 1];
                    int i38 = i36 - 1;
                    int i39 = i18;
                    int i40 = 1;
                    int i41 = 1;
                    while (i41 <= i37) {
                        int i42 = (int) fArr7[(i37 - i41) + 2 + i36];
                        int i43 = i39 / i42;
                        int i44 = i18 / i39;
                        int i45 = i44 * i43;
                        int i46 = i38 - ((i42 - 1) * i44);
                        int i47 = 1 - i40;
                        if (i42 == 2) {
                            i12 = i41;
                            i13 = i37;
                            fArr2 = fArr7;
                            i14 = i36;
                            if (i47 == 0) {
                                m17812a(i44, i43, i10, 0, i46, fArr, fArr6);
                            } else {
                                m17812a(i44, i43, 0, i10, i46, fArr6, fArr);
                            }
                        } else if (i42 == 3) {
                            i12 = i41;
                            i13 = i37;
                            fArr2 = fArr7;
                            i14 = i36;
                            if (i47 == 0) {
                                m17814c(i44, i43, i10, 0, i46, fArr, fArr6);
                            } else {
                                m17814c(i44, i43, 0, i10, i46, fArr6, fArr);
                            }
                        } else if (i42 != i35) {
                            if (i42 != 5) {
                                i13 = i37;
                                if (i44 == 1) {
                                    i47 = 1 - i47;
                                }
                                if (i47 == 0) {
                                    i12 = i41;
                                    i14 = i36;
                                    fArr2 = fArr7;
                                    m17820i(i44, i42, i43, i45, fArr, i10, fArr6, 0, i46);
                                    i40 = 1;
                                } else {
                                    i12 = i41;
                                    fArr2 = fArr7;
                                    i14 = i36;
                                    m17820i(i44, i42, i43, i45, fArr6, 0, fArr, i10, i46);
                                    i40 = 0;
                                }
                            } else {
                                i12 = i41;
                                i13 = i37;
                                fArr2 = fArr7;
                                i14 = i36;
                                if (i47 == 0) {
                                    m17818g(i44, i43, i10, 0, i46, fArr, fArr6);
                                } else {
                                    m17818g(i44, i43, 0, i10, i46, fArr6, fArr);
                                }
                            }
                            i41 = i12 + 1;
                            i39 = i43;
                            i38 = i46;
                            i37 = i13;
                            fArr7 = fArr2;
                            i36 = i14;
                            i35 = 4;
                        } else {
                            i12 = i41;
                            i13 = i37;
                            fArr2 = fArr7;
                            i14 = i36;
                            if (i47 == 0) {
                                m17816e(i44, i43, i10, 0, i46, fArr, fArr6);
                            } else {
                                m17816e(i44, i43, 0, i10, i46, fArr6, fArr);
                            }
                        }
                        i40 = i47;
                        i41 = i12 + 1;
                        i39 = i43;
                        i38 = i46;
                        i37 = i13;
                        fArr7 = fArr2;
                        i36 = i14;
                        i35 = 4;
                    }
                    i11 = 1;
                    if (i40 != 1) {
                        System.arraycopy(fArr6, 0, fArr, i10, i18);
                    }
                }
                for (int i48 = i18 - i11; i48 >= 2; i48--) {
                    int i49 = i10 + i48;
                    float f22 = fArr[i49];
                    int i50 = i49 - 1;
                    fArr[i49] = fArr[i50];
                    fArr[i50] = f22;
                }
                return;
            }
            if (iM24h != 2) {
                return;
            }
            int i51 = this.f50425c;
            int i52 = i51 * 2;
            float[] fArr8 = new float[i52];
            int i53 = AbstractC19264c.f61066c;
            float[] fArr9 = this.f50439q;
            if (i53 > 1) {
                long j20 = i18;
                if (j20 >= 8192) {
                    int i54 = (i53 < 4 || j20 < 65536) ? 2 : 4;
                    Future[] futureArr = new Future[i54];
                    int i55 = i18 / i54;
                    int i56 = 0;
                    while (i56 < i54) {
                        int i57 = i56 * i55;
                        int i58 = i56 == i54 + (-1) ? i18 : i57 + i55;
                        int i59 = i56;
                        Future[] futureArr2 = futureArr;
                        futureArr2[i59] = AbstractC19264c.m20338c(new RunnableC16276a(this, i57, i58, i10, fArr8, fArr));
                        i56 = i59 + 1;
                        i54 = i54;
                        fArr8 = fArr8;
                        futureArr = futureArr2;
                        fArr9 = fArr9;
                    }
                    Future[] futureArr3 = futureArr;
                    int i60 = i54;
                    fArr3 = fArr9;
                    fArr4 = fArr8;
                    try {
                        AbstractC19264c.m20339d(futureArr3);
                    } catch (InterruptedException e10) {
                        Logger.getLogger(C16279d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
                    } catch (ExecutionException e11) {
                        Logger.getLogger(C16279d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
                    }
                    AbstractC16648c.m18466c(i52, fArr4, this.f50427e, this.f50431i, this.f50429g);
                    int i61 = i51 / i60;
                    int i62 = 0;
                    while (i62 < i60) {
                        int i63 = i62 * i61;
                        futureArr3[i62] = AbstractC19264c.m20338c(new RunnableC10503b(this, i63, i62 == i60 + (-1) ? i51 : i63 + i61, fArr4));
                        i62++;
                    }
                    try {
                        AbstractC19264c.m20339d(futureArr3);
                    } catch (InterruptedException e12) {
                        Logger.getLogger(C16279d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e12);
                    } catch (ExecutionException e13) {
                        Logger.getLogger(C16279d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e13);
                    }
                } else {
                    fArr3 = fArr9;
                    fArr4 = fArr8;
                    for (i15 = 0; i15 < i18; i15++) {
                        int i64 = i15 * 2;
                        int i65 = i64 + 1;
                        int i66 = i10 + i15;
                        fArr4[i64] = fArr[i66] * fArr3[i64];
                        fArr4[i65] = (-fArr[i66]) * fArr3[i65];
                    }
                    AbstractC16648c.m18466c(i52, fArr4, this.f50427e, this.f50431i, this.f50429g);
                    for (i16 = 0; i16 < i51; i16++) {
                        int i67 = i16 * 2;
                        int i68 = i67 + 1;
                        float f23 = fArr4[i67];
                        float[] fArr10 = this.f50441s;
                        float f24 = fArr10[i68];
                        float f25 = fArr4[i68];
                        float f26 = fArr10[i67];
                        fArr4[i67] = (f23 * f26) - (f25 * f24);
                        fArr4[i68] = (f25 * f26) + (f23 * f24);
                    }
                }
            } else {
                fArr3 = fArr9;
                fArr4 = fArr8;
                while (i15 < i18) {
                    int i69 = i15 * 2;
                    int i610 = i69 + 1;
                    int i611 = i10 + i15;
                    fArr4[i69] = fArr[i611] * fArr3[i69];
                    fArr4[i610] = (-fArr[i611]) * fArr3[i610];
                }
                AbstractC16648c.m18466c(i52, fArr4, this.f50427e, this.f50431i, this.f50429g);
                while (i16 < i51) {
                    int i612 = i16 * 2;
                    int i613 = i612 + 1;
                    float f27 = fArr4[i612];
                    float[] fArr11 = this.f50441s;
                    float f28 = fArr11[i613];
                    float f29 = fArr4[i613];
                    float f210 = fArr11[i612];
                    fArr4[i612] = (f27 * f210) - (f29 * f28);
                    fArr4[i613] = (f29 * f210) + (f27 * f28);
                }
            }
            AbstractC16648c.m18476m(i52, fArr4, 0, this.f50427e, this.f50431i, this.f50429g);
            if (i18 % 2 == 0) {
                fArr[i10] = (fArr3[1] * fArr4[1]) + (fArr3[0] * fArr4[0]);
                int i70 = i18 + 1;
                fArr[i10 + 1] = (fArr3[i70] * fArr4[i70]) + (fArr3[i18] * fArr4[i18]);
                for (int i71 = 1; i71 < i18 / 2; i71++) {
                    int i72 = i71 * 2;
                    int i73 = i72 + 1;
                    fArr[i10 + i72] = (fArr3[i73] * fArr4[i73]) + (fArr3[i72] * fArr4[i72]);
                    fArr[i10 + i73] = (fArr3[i72] * fArr4[i73]) + ((-fArr3[i73]) * fArr4[i72]);
                }
                return;
            }
            fArr[i10] = (fArr3[1] * fArr4[1]) + (fArr3[0] * fArr4[0]);
            int i74 = i18 - 1;
            fArr[i10 + 1] = (fArr3[i74] * fArr4[i18]) + ((-fArr3[i18]) * fArr4[i74]);
            for (int i75 = 1; i75 < i74 / 2; i75++) {
                int i76 = i75 * 2;
                int i77 = i76 + 1;
                fArr[i10 + i76] = (fArr3[i77] * fArr4[i77]) + (fArr3[i76] * fArr4[i76]);
                fArr[i10 + i77] = (fArr3[i76] * fArr4[i77]) + ((-fArr3[i77]) * fArr4[i76]);
            }
            fArr[(i10 + i18) - 1] = (fArr3[i18] * fArr4[i18]) + (fArr3[i74] * fArr4[i74]);
            return;
        }
        C19265d c19265d5 = new C19265d();
        c19265d5.f61076Y = EnumC19278q.f61082Z;
        c19265d5.f61078o0 = 4L;
        c19265d5.f61077Z = fArr.length;
        c19265d5.f61068r0 = fArr;
        long j21 = i10;
        if (z6) {
            long j22 = this.f50424b;
            if (j22 != 1) {
                int iM24h2 = AbstractC0010F.m24h(i17);
                if (iM24h2 == 0) {
                    long j23 = j21;
                    long j24 = 0;
                    C16279d c16279d2 = this;
                    long j25 = c16279d2.f50424b;
                    if (j25 > 4) {
                        AbstractC16648c.m18477n(j25, c19265d5, j23, c16279d2.f50428f, c16279d2.f50432j, c16279d2.f50430h);
                        long j26 = j22 >> 1;
                        long j27 = c16279d2.f50434l;
                        long j28 = (j27 * 2) / j26;
                        long j29 = 2;
                        while (j29 < j26) {
                            j24 += j28;
                            long j30 = j28;
                            long j31 = c16279d2.f50432j;
                            long j32 = j27;
                            C19265d c19265d6 = c16279d2.f50430h;
                            float fM20340b = 0.5f - c19265d6.m20340b((j31 + j27) - j24);
                            float fM20340b2 = c19265d6.m20340b(j31 + j24);
                            long j33 = j23 + j29;
                            long j34 = (j22 - j29) + j23;
                            float fM20340b3 = c19265d5.m20340b(j33) - c19265d5.m20340b(j34);
                            long j35 = j33 + 1;
                            long j36 = j23;
                            long j37 = j34 + 1;
                            float fM20340b4 = c19265d5.m20340b(j37) + c19265d5.m20340b(j35);
                            float f30 = (fM20340b * fM20340b3) - (fM20340b2 * fM20340b4);
                            float f31 = (fM20340b2 * fM20340b3) + (fM20340b * fM20340b4);
                            c19265d5.m20341c(c19265d5.m20340b(j33) - f30, j33);
                            c19265d5.m20341c(f31 - c19265d5.m20340b(j35), j35);
                            c19265d5.m20341c(c19265d5.m20340b(j34) + f30, j34);
                            c19265d5.m20341c(f31 - c19265d5.m20340b(j37), j37);
                            j29 += 2;
                            c16279d2 = this;
                            j28 = j30;
                            j27 = j32;
                            j23 = j36;
                        }
                        j10 = j23;
                        long j38 = j10 + j26 + 1;
                        c19265d5.m20341c(-c19265d5.m20340b(j38), j38);
                    } else {
                        j10 = j23;
                        if (j25 == 4) {
                            j11 = j10;
                            long j39 = j11 + 2;
                            float fM20340b5 = c19265d5.m20340b(j11) - c19265d5.m20340b(j39);
                            long j40 = j11 + 1;
                            long j41 = 3 + j11;
                            float fM20340b6 = c19265d5.m20340b(j41) + (-c19265d5.m20340b(j40));
                            c19265d5.m20341c(c19265d5.m20340b(j39) + c19265d5.m20340b(j11), j11);
                            c19265d5.m20341c(c19265d5.m20340b(j41) + c19265d5.m20340b(j40), j40);
                            c19265d5.m20341c(fM20340b5, j39);
                            c19265d5.m20341c(fM20340b6, j41);
                        }
                        long j42 = j11 + 1;
                        float fM20340b7 = c19265d5.m20340b(j11) - c19265d5.m20340b(j42);
                        c19265d5.m20341c(c19265d5.m20340b(j42) + c19265d5.m20340b(j11), j11);
                        c19265d5.m20341c(fM20340b7, j42);
                    }
                    j11 = j10;
                    long j43 = j11 + 1;
                    float fM20340b8 = c19265d5.m20340b(j11) - c19265d5.m20340b(j43);
                    c19265d5.m20341c(c19265d5.m20340b(j43) + c19265d5.m20340b(j11), j11);
                    c19265d5.m20341c(fM20340b8, j43);
                } else if (iM24h2 == 1) {
                    C19265d c19265d7 = c19265d5;
                    if (j22 == 1) {
                        j12 = j21;
                        j13 = j22;
                        c19265d = c19265d7;
                        j14 = 1;
                    } else {
                        C19265d c19265d8 = new C19265d(j22, true);
                        Long.signum(j22);
                        long j44 = j22 * 2;
                        C19265d c19265d9 = this.f50438p;
                        long jM20340b = (long) c19265d9.m20340b(j44 + 1);
                        long j45 = j22;
                        long j46 = j44 - 1;
                        long j47 = 1;
                        long j48 = 1;
                        while (j48 <= jM20340b) {
                            int iM20340b = (int) c19265d9.m20340b((jM20340b - j48) + 2 + j44);
                            C19265d c19265d10 = c19265d7;
                            long j49 = iM20340b;
                            long j50 = j45 / j49;
                            long j51 = j22 / j45;
                            long j52 = j51 * j50;
                            long j53 = jM20340b;
                            j46 -= ((long) (iM20340b - 1)) * j51;
                            long j54 = 1 - j47;
                            if (iM20340b == 2) {
                                c19265d2 = c19265d9;
                                j15 = j21;
                                j16 = 1;
                                j17 = j22;
                                j18 = 0;
                                if (j54 == 0) {
                                    m17813b(j51, j50, j15, 0L, j46, c19265d10, c19265d8);
                                } else {
                                    m17813b(j51, j50, 0L, j15, j46, c19265d8, c19265d10);
                                }
                            } else if (iM20340b == 3) {
                                c19265d2 = c19265d9;
                                j15 = j21;
                                j16 = 1;
                                j17 = j22;
                                j18 = 0;
                                if (j54 == 0) {
                                    m17815d(j51, j50, j15, 0L, j46, c19265d10, c19265d8);
                                } else {
                                    m17815d(j51, j50, 0L, j15, j46, c19265d8, c19265d10);
                                }
                            } else if (iM20340b != 4) {
                                if (iM20340b != 5) {
                                    if (j51 == 1) {
                                        j54 = 1 - j54;
                                    }
                                    if (j54 == 0) {
                                        c19265d2 = c19265d9;
                                        j15 = j21;
                                        j18 = 0;
                                        j16 = 1;
                                        j17 = j22;
                                        m17821j(j51, j49, j50, j52, c19265d10, j15, c19265d8, 0L, j46);
                                        j47 = 1;
                                    } else {
                                        c19265d2 = c19265d9;
                                        j15 = j21;
                                        j16 = 1;
                                        j17 = j22;
                                        j18 = 0;
                                        m17821j(j51, j49, j50, j52, c19265d8, 0L, c19265d10, j15, j46);
                                        j47 = 0;
                                    }
                                } else {
                                    c19265d2 = c19265d9;
                                    j15 = j21;
                                    j16 = 1;
                                    j17 = j22;
                                    j18 = 0;
                                    if (j54 == 0) {
                                        m17819h(j51, j50, j15, 0L, j46, c19265d10, c19265d8);
                                    } else {
                                        m17819h(j51, j50, 0L, j15, j46, c19265d8, c19265d10);
                                    }
                                }
                                j48 += j16;
                                j21 = j15;
                                c19265d9 = c19265d2;
                                j45 = j50;
                                jM20340b = j53;
                                c19265d7 = c19265d10;
                                j22 = j17;
                            } else {
                                c19265d2 = c19265d9;
                                j15 = j21;
                                j16 = 1;
                                j17 = j22;
                                j18 = 0;
                                if (j54 == 0) {
                                    m17817f(j51, j50, j15, 0L, j46, c19265d10, c19265d8);
                                } else {
                                    m17817f(j51, j50, 0L, j15, j46, c19265d8, c19265d10);
                                }
                            }
                            j47 = j54;
                            j48 += j16;
                            j21 = j15;
                            c19265d9 = c19265d2;
                            j45 = j50;
                            jM20340b = j53;
                            c19265d7 = c19265d10;
                            j22 = j17;
                        }
                        j12 = j21;
                        j13 = j22;
                        c19265d = c19265d7;
                        j14 = 1;
                        if (j47 != 1) {
                            AbstractC19279r.m20343a(0L, j12, this.f50424b, c19265d8, c19265d);
                        }
                    }
                    for (long j55 = j13 - j14; j55 >= 2; j55 -= j14) {
                        long j56 = j12 + j55;
                        C19265d c19265d11 = c19265d;
                        float fM20340b9 = c19265d11.m20340b(j56);
                        long j57 = j56 - j14;
                        c19265d11.m20341c(c19265d11.m20340b(j57), j56);
                        c19265d11.m20341c(fM20340b9, j57);
                    }
                } else if (iM24h2 == 2) {
                    long j58 = this.f50426d;
                    long j59 = j58 * 2;
                    C19265d c19265d12 = new C19265d(j59, true);
                    int i78 = AbstractC19264c.f61066c;
                    C19265d c19265d13 = this.f50440r;
                    if (i78 <= 1 || j22 <= 8192) {
                        j19 = j21;
                        c16279d = this;
                        for (long j60 = 0; j60 < j22; j60++) {
                            long j61 = j60 * 2;
                            long j62 = j61 + 1;
                            long j63 = j19 + j60;
                            c19265d12.m20341c(c19265d13.m20340b(j61) * c19265d5.m20340b(j63), j61);
                            c19265d12.m20341c(c19265d13.m20340b(j62) * (-c19265d5.m20340b(j63)), j62);
                        }
                        c19265d3 = c19265d13;
                        c19265d4 = c19265d12;
                        AbstractC16648c.m18467d(j59, c19265d4, c16279d.f50428f, c16279d.f50432j, c16279d.f50430h);
                        for (long j64 = 0; j64 < j58; j64++) {
                            long j65 = j64 * 2;
                            long j66 = j65 + 1;
                            float fM20340b10 = c19265d4.m20340b(j65);
                            C19265d c19265d14 = c16279d.f50442t;
                            float fM20340b11 = (c19265d14.m20340b(j65) * c19265d4.m20340b(j66)) + (c19265d14.m20340b(j66) * fM20340b10);
                            c19265d4.m20341c((c19265d14.m20340b(j65) * c19265d4.m20340b(j65)) - (c19265d14.m20340b(j66) * c19265d4.m20340b(j66)), j65);
                            c19265d4.m20341c(fM20340b11, j66);
                        }
                    } else {
                        int i79 = (i78 < 4 || j22 <= 65536) ? 2 : 4;
                        Future[] futureArr4 = new Future[i79];
                        long j67 = i79;
                        long j68 = j22 / j67;
                        int i80 = 0;
                        while (i80 < i79) {
                            long j69 = ((long) i80) * j68;
                            Future[] futureArr5 = futureArr4;
                            long j70 = j21;
                            C19265d c19265d15 = c19265d12;
                            futureArr5[i80] = AbstractC19264c.m20338c(new RunnableC16277b(this, j69, i80 == i79 + (-1) ? j22 : j69 + j68, j70, c19265d15, c19265d5));
                            i80++;
                            futureArr4 = futureArr5;
                            c19265d12 = c19265d15;
                            j58 = j58;
                            j67 = j67;
                            j21 = j70;
                        }
                        Future[] futureArr6 = futureArr4;
                        j19 = j21;
                        C19265d c19265d16 = c19265d12;
                        long j71 = j58;
                        long j72 = j67;
                        int i81 = 0;
                        try {
                            AbstractC19264c.m20339d(futureArr6);
                        } catch (InterruptedException e14) {
                            Logger.getLogger(C16279d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e14);
                        } catch (ExecutionException e15) {
                            Logger.getLogger(C16279d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e15);
                        }
                        c16279d = this;
                        AbstractC16648c.m18467d(j59, c19265d16, c16279d.f50428f, c16279d.f50432j, c16279d.f50430h);
                        long j73 = j71 / j72;
                        while (i81 < i79) {
                            long j74 = ((long) i81) * j73;
                            futureArr6[i81] = AbstractC19264c.m20338c(new RunnableC16278c(this, j74, i81 == i79 + (-1) ? j71 : j74 + j73, c19265d16));
                            i81++;
                        }
                        try {
                            AbstractC19264c.m20339d(futureArr6);
                        } catch (InterruptedException e16) {
                            Logger.getLogger(C16279d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e16);
                        } catch (ExecutionException e17) {
                            Logger.getLogger(C16279d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e17);
                        }
                        c19265d3 = c19265d13;
                        c19265d4 = c19265d16;
                    }
                    AbstractC16648c.m18477n(j59, c19265d4, 0L, c16279d.f50428f, c16279d.f50432j, c16279d.f50430h);
                    if (j22 % 2 == 0) {
                        long j75 = 1;
                        long j76 = j19;
                        r39.m20341c((c19265d4.m20340b(1L) * c19265d3.m20340b(1L)) + (c19265d4.m20340b(0L) * c19265d3.m20340b(0L)), j76);
                        long j77 = j22 + 1;
                        r39.m20341c((c19265d4.m20340b(j77) * c19265d3.m20340b(j77)) + (c19265d4.m20340b(j22) * c19265d3.m20340b(j22)), j76 + 1);
                        for (long j78 = 1; j78 < j22 / 2; j78++) {
                            long j79 = j78 * 2;
                            long j80 = j79 + j75;
                            r39.m20341c((c19265d4.m20340b(j80) * c19265d3.m20340b(j80)) + (c19265d4.m20340b(j79) * c19265d3.m20340b(j79)), j76 + j79);
                            c19265d5.m20341c((c19265d4.m20340b(j80) * c19265d3.m20340b(j79)) + (c19265d4.m20340b(j79) * (-c19265d3.m20340b(j80))), j76 + j80);
                            j75 = 1;
                        }
                    } else {
                        long j81 = j19;
                        r39.m20341c((c19265d4.m20340b(1L) * c19265d3.m20340b(1L)) + (c19265d4.m20340b(0L) * c19265d3.m20340b(0L)), j81);
                        long j82 = j22 - 1;
                        r39.m20341c((c19265d4.m20340b(j22) * c19265d3.m20340b(j82)) + (c19265d4.m20340b(j82) * (-c19265d3.m20340b(j22))), j81 + 1);
                        long j83 = 1;
                        while (j83 < j82 / 2) {
                            long j84 = j83 * 2;
                            long j85 = j82;
                            long j86 = j84 + 1;
                            r39.m20341c((c19265d4.m20340b(j86) * c19265d3.m20340b(j86)) + (c19265d4.m20340b(j84) * c19265d3.m20340b(j84)), j81 + j84);
                            r39.m20341c((c19265d4.m20340b(j86) * c19265d3.m20340b(j84)) + (c19265d4.m20340b(j84) * (-c19265d3.m20340b(j86))), j81 + j86);
                            j83++;
                            j82 = j85;
                        }
                        long j87 = j82;
                        r39.m20341c((c19265d4.m20340b(j22) * c19265d3.m20340b(j22)) + (c19265d4.m20340b(j87) * c19265d3.m20340b(j87)), (j81 + j22) - 1);
                    }
                }
            }
        } else {
            if (j21 >= 2147483647L) {
                throw new IllegalArgumentException(HhJS.rJzWKCO);
            }
            m17822k(fArr, (int) j21);
        }
    }
}
