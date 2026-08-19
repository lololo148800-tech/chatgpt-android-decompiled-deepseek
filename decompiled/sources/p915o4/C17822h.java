package p915o4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.util.ArrayList;
import java.util.List;
import p1053v3.C20421b;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.InterfaceC20802d;
import p372P3.C6318J;
import p666bl.C11500p;
import p775h2.AbstractC14376f;
import p885m4.C17153c;
import p885m4.C17162l;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17163m;

/* JADX INFO: renamed from: o4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17822h implements InterfaceC17163m {

    /* JADX INFO: renamed from: t0 */
    public static final byte[] f56845t0 = {0, 7, 8, 15};

    /* JADX INFO: renamed from: u0 */
    public static final byte[] f56846u0 = {0, 119, -120, -1};

    /* JADX INFO: renamed from: v0 */
    public static final byte[] f56847v0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: Y */
    public final Paint f56848Y;

    /* JADX INFO: renamed from: Z */
    public final Paint f56849Z;

    /* JADX INFO: renamed from: o0 */
    public final Canvas f56850o0;

    /* JADX INFO: renamed from: p0 */
    public final C17816b f56851p0;

    /* JADX INFO: renamed from: q0 */
    public final C17815a f56852q0;

    /* JADX INFO: renamed from: r0 */
    public final C17821g f56853r0;

    /* JADX INFO: renamed from: s0 */
    public Bitmap f56854s0;

    public C17822h(List list) {
        C20811m c20811m = new C20811m((byte[]) list.get(0));
        int iM21371z = c20811m.m21371z();
        int iM21371z2 = c20811m.m21371z();
        Paint paint = new Paint();
        this.f56848Y = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f56849Z = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f56850o0 = new Canvas();
        this.f56851p0 = new C17816b(719, 575, 0, 719, 0, 575);
        this.f56852q0 = new C17815a(0, new int[]{0, -1, -16777216, -8421505}, m19568b(), m19569d());
        this.f56853r0 = new C17821g(iM21371z, iM21371z2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m19567a(int i10, int i11, C6318J c6318j) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c6318j.m6872i(i11);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m19568b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = m19570e(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = m19570e(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static int[] m19569d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = m19570e(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = m19570e(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = m19570e(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = m19570e(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = m19570e(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public static int m19570e(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0216  */
    /* JADX WARN: Code duplicated, block: B:118:0x0224 A[LOOP:3: B:89:0x0172->B:118:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:0x0196  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    /* JADX INFO: renamed from: f */
    public static void m19571f(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i13;
        int i14;
        int iM6872i;
        int iM6872i2;
        char c9;
        char c10;
        int iM6872i3;
        int i15;
        int iM6872i4;
        int iM6872i5;
        int i16;
        int iM6872i6;
        C6318J c6318j = new C6318J(bArr.length, bArr);
        int i17 = i11;
        int i18 = i12;
        byte[] bArrM19567a = null;
        byte[] bArrM19567a2 = null;
        byte[] bArrM19567a3 = null;
        while (c6318j.m6865b() != 0) {
            int i19 = 8;
            int iM6872i7 = c6318j.m6872i(8);
            if (iM6872i7 != 240) {
                int i20 = 1;
                int i21 = 3;
                int i22 = 4;
                switch (iM6872i7) {
                    case 16:
                        int i23 = 1;
                        if (i10 == 3) {
                            bArr3 = bArrM19567a == null ? f56846u0 : bArrM19567a;
                        } else {
                            if (i10 == 2) {
                                bArr3 = bArrM19567a3 == null ? f56845t0 : bArrM19567a3;
                            } else {
                                bArr2 = null;
                            }
                            i13 = i17;
                            i14 = 0;
                            while (true) {
                                iM6872i = c6318j.m6872i(2);
                                if (iM6872i != 0) {
                                    iM6872i3 = i23;
                                } else if (c6318j.m6871h()) {
                                    iM6872i3 = c6318j.m6872i(3) + 3;
                                    iM6872i = c6318j.m6872i(2);
                                } else if (c6318j.m6871h()) {
                                    iM6872i3 = i23;
                                    iM6872i = 0;
                                } else {
                                    iM6872i2 = c6318j.m6872i(2);
                                    if (iM6872i2 != 0) {
                                        c9 = 4;
                                        c10 = '\b';
                                        i14 = i23;
                                        iM6872i = 0;
                                        iM6872i3 = 0;
                                    } else if (iM6872i2 != i23) {
                                        c9 = 4;
                                        c10 = '\b';
                                        i14 = i14;
                                        iM6872i3 = 2;
                                        iM6872i = 0;
                                    } else if (iM6872i2 != 2) {
                                        c9 = 4;
                                        c10 = '\b';
                                        i14 = i14;
                                        iM6872i3 = c6318j.m6872i(4) + 12;
                                        iM6872i = c6318j.m6872i(2);
                                    } else if (iM6872i2 != 3) {
                                        iM6872i = 0;
                                        iM6872i3 = 0;
                                    } else {
                                        c10 = '\b';
                                        i14 = i14;
                                        iM6872i3 = c6318j.m6872i(8) + 29;
                                        iM6872i = c6318j.m6872i(2);
                                        c9 = 4;
                                    }
                                    if (iM6872i3 == 0 && paint != null) {
                                        if (bArr2 != 0) {
                                            iM6872i = bArr2[iM6872i];
                                        }
                                        paint.setColor(iArr[iM6872i]);
                                        canvas.drawRect(i13, i18, i13 + iM6872i3, i18 + 1, paint);
                                    }
                                    i13 += iM6872i3;
                                    if (i14 != 0) {
                                        c6318j.m6866c();
                                    } else {
                                        i14 = i14;
                                        i23 = 1;
                                    }
                                }
                                c9 = 4;
                                c10 = '\b';
                                if (iM6872i3 == 0) {
                                }
                                i13 += iM6872i3;
                                if (i14 != 0) {
                                    c6318j.m6866c();
                                } else {
                                    i14 = i14;
                                    i23 = 1;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i13 = i17;
                        i14 = 0;
                        while (true) {
                            iM6872i = c6318j.m6872i(2);
                            if (iM6872i != 0) {
                                iM6872i3 = i23;
                            } else if (c6318j.m6871h()) {
                                iM6872i3 = c6318j.m6872i(3) + 3;
                                iM6872i = c6318j.m6872i(2);
                            } else if (c6318j.m6871h()) {
                                iM6872i3 = i23;
                                iM6872i = 0;
                            } else {
                                iM6872i2 = c6318j.m6872i(2);
                                if (iM6872i2 != 0) {
                                    c9 = 4;
                                    c10 = '\b';
                                    i14 = i23;
                                    iM6872i = 0;
                                    iM6872i3 = 0;
                                } else if (iM6872i2 != i23) {
                                    c9 = 4;
                                    c10 = '\b';
                                    i14 = i14;
                                    iM6872i3 = 2;
                                    iM6872i = 0;
                                } else if (iM6872i2 != 2) {
                                    c9 = 4;
                                    c10 = '\b';
                                    i14 = i14;
                                    iM6872i3 = c6318j.m6872i(4) + 12;
                                    iM6872i = c6318j.m6872i(2);
                                } else if (iM6872i2 != 3) {
                                    iM6872i = 0;
                                    iM6872i3 = 0;
                                } else {
                                    c10 = '\b';
                                    i14 = i14;
                                    iM6872i3 = c6318j.m6872i(8) + 29;
                                    iM6872i = c6318j.m6872i(2);
                                    c9 = 4;
                                }
                                if (iM6872i3 == 0) {
                                }
                                i13 += iM6872i3;
                                if (i14 != 0) {
                                    c6318j.m6866c();
                                } else {
                                    i14 = i14;
                                    i23 = 1;
                                }
                            }
                            c9 = 4;
                            c10 = '\b';
                            if (iM6872i3 == 0) {
                            }
                            i13 += iM6872i3;
                            if (i14 != 0) {
                                c6318j.m6866c();
                            } else {
                                i14 = i14;
                                i23 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i10 == 3 ? bArrM19567a2 == null ? f56847v0 : bArrM19567a2 : null;
                        i13 = i17;
                        boolean z6 = false;
                        while (true) {
                            int iM6872i8 = c6318j.m6872i(i22);
                            if (iM6872i8 != 0) {
                                i15 = 1;
                                z6 = z6;
                            } else if (c6318j.m6871h()) {
                                if (c6318j.m6871h()) {
                                    int iM6872i9 = c6318j.m6872i(2);
                                    if (iM6872i9 == 0) {
                                        i15 = 1;
                                    } else if (iM6872i9 == 1) {
                                        i15 = 2;
                                    } else if (iM6872i9 == 2) {
                                        iM6872i4 = c6318j.m6872i(i22) + 9;
                                        iM6872i5 = c6318j.m6872i(i22);
                                    } else if (iM6872i9 != i21) {
                                        z6 = z6;
                                        iM6872i8 = 0;
                                        i15 = 0;
                                    } else {
                                        iM6872i4 = c6318j.m6872i(i19) + 25;
                                        iM6872i5 = c6318j.m6872i(i22);
                                    }
                                    iM6872i8 = 0;
                                } else {
                                    iM6872i4 = c6318j.m6872i(2) + i22;
                                    iM6872i5 = c6318j.m6872i(i22);
                                }
                                z6 = z6;
                                i15 = iM6872i4;
                                iM6872i8 = iM6872i5;
                            } else {
                                int iM6872i10 = c6318j.m6872i(i21);
                                if (iM6872i10 != 0) {
                                    i15 = iM6872i10 + 2;
                                    iM6872i8 = 0;
                                } else {
                                    z6 = true;
                                    iM6872i8 = 0;
                                    i15 = 0;
                                }
                            }
                            if (i15 != 0 && paint != null) {
                                if (bArr4 != 0) {
                                    iM6872i8 = bArr4[iM6872i8];
                                }
                                paint.setColor(iArr[iM6872i8]);
                                canvas.drawRect(i13, i18, i13 + i15, i18 + 1, paint);
                            }
                            i13 += i15;
                            if (z6) {
                                c6318j.m6866c();
                            } else {
                                i21 = i21;
                                z6 = z6;
                                i22 = 4;
                                i19 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i24 = i17;
                        int i25 = 0;
                        while (true) {
                            int iM6872i11 = c6318j.m6872i(8);
                            if (iM6872i11 != 0) {
                                i16 = i25;
                                iM6872i6 = i20;
                            } else if (c6318j.m6871h()) {
                                i16 = i25;
                                iM6872i6 = c6318j.m6872i(7);
                                iM6872i11 = c6318j.m6872i(8);
                            } else {
                                int iM6872i12 = c6318j.m6872i(7);
                                if (iM6872i12 != 0) {
                                    i16 = i25;
                                    iM6872i6 = iM6872i12;
                                    iM6872i11 = 0;
                                } else {
                                    i16 = i20;
                                    iM6872i11 = 0;
                                    iM6872i6 = 0;
                                }
                            }
                            if (iM6872i6 != 0 && paint != null) {
                                paint.setColor(iArr[iM6872i11]);
                                canvas.drawRect(i24, i18, i24 + iM6872i6, i18 + 1, paint);
                            }
                            i24 += iM6872i6;
                            if (i16 != 0) {
                                i17 = i24;
                                continue;
                            } else {
                                i20 = i20;
                                i25 = i16;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM6872i7) {
                            case 32:
                                bArrM19567a3 = m19567a(4, 4, c6318j);
                                break;
                            case 33:
                                bArrM19567a = m19567a(4, 8, c6318j);
                                break;
                            case 34:
                                bArrM19567a2 = m19567a(16, 8, c6318j);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
                i17 = i13;
            } else {
                i18 += 2;
                i17 = i11;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static C17815a m19572g(C6318J c6318j, int i10) {
        int[] iArr;
        int iM6872i;
        int i11;
        int iM6872i2;
        int iM6872i3;
        int iM6872i4;
        int i12 = 8;
        int iM6872i5 = c6318j.m6872i(8);
        c6318j.m6883t(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int i15 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM19568b = m19568b();
        int[] iArrM19569d = m19569d();
        while (i14 > 0) {
            int iM6872i6 = c6318j.m6872i(i12);
            int iM6872i7 = c6318j.m6872i(i12);
            if ((iM6872i7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM6872i7 & 64) != 0 ? iArrM19568b : iArrM19569d;
            }
            if ((iM6872i7 & 1) != 0) {
                iM6872i3 = c6318j.m6872i(i12);
                iM6872i4 = c6318j.m6872i(i12);
                iM6872i = c6318j.m6872i(i12);
                iM6872i2 = c6318j.m6872i(i12);
                i11 = i14 - 6;
            } else {
                int iM6872i8 = c6318j.m6872i(6) << i13;
                int iM6872i9 = c6318j.m6872i(4) << 4;
                iM6872i = c6318j.m6872i(4) << 4;
                i11 = i14 - 4;
                iM6872i2 = c6318j.m6872i(i13) << 6;
                iM6872i3 = iM6872i8;
                iM6872i4 = iM6872i9;
            }
            if (iM6872i3 == 0) {
                iM6872i4 = i15;
                iM6872i = iM6872i4;
                iM6872i2 = 255;
            }
            double d10 = iM6872i3;
            double d11 = iM6872i4 - 128;
            double d12 = iM6872i - 128;
            iArr[iM6872i6] = m19570e((byte) (255 - (iM6872i2 & 255)), AbstractC20817s.m21408i((int) ((1.402d * d11) + d10), 0, 255), AbstractC20817s.m21408i((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), AbstractC20817s.m21408i((int) ((d12 * 1.772d) + d10), 0, 255));
            i14 = i11;
            i15 = 0;
            iM6872i5 = iM6872i5;
            iArrM19569d = iArrM19569d;
            i12 = 8;
            i13 = 2;
        }
        return new C17815a(iM6872i5, iArr2, iArrM19568b, iArrM19569d);
    }

    /* JADX INFO: renamed from: h */
    public static C17817c m19573h(C6318J c6318j) {
        byte[] bArr;
        int iM6872i = c6318j.m6872i(16);
        c6318j.m6883t(4);
        int iM6872i2 = c6318j.m6872i(2);
        boolean zM6871h = c6318j.m6871h();
        c6318j.m6883t(1);
        byte[] bArr2 = AbstractC20817s.f66111f;
        if (iM6872i2 != 1) {
            if (iM6872i2 == 0) {
                int iM6872i3 = c6318j.m6872i(16);
                int iM6872i4 = c6318j.m6872i(16);
                if (iM6872i3 > 0) {
                    bArr2 = new byte[iM6872i3];
                    c6318j.m6875l(iM6872i3, bArr2);
                }
                if (iM6872i4 > 0) {
                    bArr = new byte[iM6872i4];
                    c6318j.m6875l(iM6872i4, bArr);
                }
            }
            return new C17817c(iM6872i, zM6871h, bArr2, bArr);
        }
        c6318j.m6883t(c6318j.m6872i(8) * 16);
        bArr = bArr2;
        return new C17817c(iM6872i, zM6871h, bArr2, bArr);
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: c */
    public final void mo3514c() {
        C17821g c17821g = this.f56853r0;
        c17821g.f56838c.clear();
        c17821g.f56839d.clear();
        c17821g.f56840e.clear();
        c17821g.f56841f.clear();
        c17821g.f56842g.clear();
        c17821g.f56843h = null;
        c17821g.f56844i = null;
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC17157g mo3516i(byte[] bArr, int i10, int i11) {
        return AbstractC14376f.m15838d(this, bArr, i11);
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: o */
    public final void mo3519o(byte[] bArr, int i10, int i11, C17162l c17162l, InterfaceC20802d interfaceC20802d) {
        C17821g c17821g;
        C17153c c17153c;
        int i12;
        char c9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C17819e c17819e;
        int i18;
        int iM6872i;
        int i19;
        int i20;
        int i21 = 8;
        C6318J c6318j = new C6318J(i10 + i11, bArr);
        c6318j.m6880q(i10);
        while (true) {
            int iM6865b = c6318j.m6865b();
            c17821g = this.f56853r0;
            if (iM6865b >= 48 && c6318j.m6872i(i21) == 15) {
                int iM6872i2 = c6318j.m6872i(i21);
                int i22 = 16;
                int iM6872i3 = c6318j.m6872i(16);
                int iM6872i4 = c6318j.m6872i(16);
                int iM6869f = c6318j.m6869f() + iM6872i4;
                if (iM6872i4 * 8 > c6318j.m6865b()) {
                    AbstractC20800b.m21332t("DvbParser", "Data field length exceeds limit");
                    c6318j.m6883t(c6318j.m6865b());
                } else {
                    switch (iM6872i2) {
                        case 16:
                            if (iM6872i3 == c17821g.f56836a) {
                                C11500p c11500p = c17821g.f56844i;
                                c6318j.m6872i(i21);
                                int iM6872i5 = c6318j.m6872i(4);
                                int iM6872i6 = c6318j.m6872i(2);
                                c6318j.m6883t(2);
                                int i23 = iM6872i4 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i23 > 0) {
                                    int iM6872i7 = c6318j.m6872i(i21);
                                    c6318j.m6883t(i21);
                                    i23 -= 6;
                                    sparseArray.put(iM6872i7, new C17818d(c6318j.m6872i(16), c6318j.m6872i(16)));
                                    i21 = 8;
                                }
                                C11500p c11500p2 = new C11500p(iM6872i5, iM6872i6, sparseArray);
                                if (iM6872i6 != 0) {
                                    c17821g.f56844i = c11500p2;
                                    c17821g.f56838c.clear();
                                    c17821g.f56839d.clear();
                                    c17821g.f56840e.clear();
                                } else if (c11500p != null && c11500p.f34808Z != iM6872i5) {
                                    c17821g.f56844i = c11500p2;
                                }
                            }
                            break;
                        case 17:
                            C11500p c11500p3 = c17821g.f56844i;
                            if (iM6872i3 == c17821g.f56836a && c11500p3 != null) {
                                int iM6872i8 = c6318j.m6872i(i21);
                                c6318j.m6883t(4);
                                boolean zM6871h = c6318j.m6871h();
                                c6318j.m6883t(3);
                                int iM6872i9 = c6318j.m6872i(16);
                                int iM6872i10 = c6318j.m6872i(16);
                                c6318j.m6872i(3);
                                int iM6872i11 = c6318j.m6872i(3);
                                c6318j.m6883t(2);
                                int iM6872i12 = c6318j.m6872i(i21);
                                int iM6872i13 = c6318j.m6872i(i21);
                                int iM6872i14 = c6318j.m6872i(4);
                                int iM6872i15 = c6318j.m6872i(2);
                                c6318j.m6883t(2);
                                int i24 = iM6872i4 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i24 > 0) {
                                    int iM6872i16 = c6318j.m6872i(i22);
                                    int iM6872i17 = c6318j.m6872i(2);
                                    c6318j.m6872i(2);
                                    int iM6872i18 = c6318j.m6872i(12);
                                    c6318j.m6883t(4);
                                    int iM6872i19 = c6318j.m6872i(12);
                                    int i25 = i24 - 6;
                                    if (iM6872i17 == 1 || iM6872i17 == 2) {
                                        c6318j.m6872i(i21);
                                        c6318j.m6872i(i21);
                                        i24 -= 8;
                                    } else {
                                        i24 = i25;
                                    }
                                    sparseArray2.put(iM6872i16, new C17820f(iM6872i18, iM6872i19));
                                    i22 = 16;
                                }
                                C17819e c17819e2 = new C17819e(iM6872i8, zM6871h, iM6872i9, iM6872i10, iM6872i11, iM6872i12, iM6872i13, iM6872i14, iM6872i15, sparseArray2);
                                SparseArray sparseArray3 = c17821g.f56838c;
                                if (c11500p3.f34809o0 == 0 && (c17819e = (C17819e) sparseArray3.get(iM6872i8)) != null) {
                                    int i26 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c17819e.f56833j;
                                        if (i26 < sparseArray4.size()) {
                                            c17819e2.f56833j.put(sparseArray4.keyAt(i26), (C17820f) sparseArray4.valueAt(i26));
                                            i26++;
                                        }
                                    }
                                }
                                sparseArray3.put(c17819e2.f56824a, c17819e2);
                            }
                            break;
                        case 18:
                            if (iM6872i3 == c17821g.f56836a) {
                                C17815a c17815aM19572g = m19572g(c6318j, iM6872i4);
                                c17821g.f56839d.put(c17815aM19572g.f56808a, c17815aM19572g);
                            } else if (iM6872i3 == c17821g.f56837b) {
                                C17815a c17815aM19572g2 = m19572g(c6318j, iM6872i4);
                                c17821g.f56841f.put(c17815aM19572g2.f56808a, c17815aM19572g2);
                            }
                            break;
                        case 19:
                            if (iM6872i3 == c17821g.f56836a) {
                                C17817c c17817cM19573h = m19573h(c6318j);
                                c17821g.f56840e.put(c17817cM19573h.f56818a, c17817cM19573h);
                            } else if (iM6872i3 == c17821g.f56837b) {
                                C17817c c17817cM19573h2 = m19573h(c6318j);
                                c17821g.f56842g.put(c17817cM19573h2.f56818a, c17817cM19573h2);
                            }
                            break;
                        case 20:
                            if (iM6872i3 == c17821g.f56836a) {
                                c6318j.m6883t(4);
                                boolean zM6871h2 = c6318j.m6871h();
                                c6318j.m6883t(3);
                                int iM6872i20 = c6318j.m6872i(16);
                                int iM6872i21 = c6318j.m6872i(16);
                                if (zM6871h2) {
                                    int iM6872i22 = c6318j.m6872i(16);
                                    int iM6872i23 = c6318j.m6872i(16);
                                    int iM6872i24 = c6318j.m6872i(16);
                                    i18 = iM6872i23;
                                    iM6872i = c6318j.m6872i(16);
                                    i20 = iM6872i24;
                                    i19 = iM6872i22;
                                } else {
                                    i18 = iM6872i20;
                                    iM6872i = iM6872i21;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                c17821g.f56843h = new C17816b(iM6872i20, iM6872i21, i19, i18, i20, iM6872i);
                            }
                            break;
                    }
                    c6318j.m6884u(iM6869f - c6318j.m6869f());
                }
                i21 = 8;
            }
        }
        C11500p c11500p4 = c17821g.f56844i;
        if (c11500p4 == null) {
            C11276A c11276a = AbstractC11278C.f34162Z;
            c17153c = new C17153c(C11294T.f34185q0, -9223372036854775807L, -9223372036854775807L);
        } else {
            C17816b c17816b = c17821g.f56843h;
            if (c17816b == null) {
                c17816b = this.f56851p0;
            }
            Bitmap bitmap = this.f56854s0;
            Canvas canvas = this.f56850o0;
            if (bitmap == null || c17816b.f56812a + 1 != bitmap.getWidth() || c17816b.f56813b + 1 != this.f56854s0.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c17816b.f56812a + 1, c17816b.f56813b + 1, Bitmap.Config.ARGB_8888);
                this.f56854s0 = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i27 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c11500p4.f34810p0;
                if (i27 < sparseArray5.size()) {
                    canvas.save();
                    C17818d c17818d = (C17818d) sparseArray5.valueAt(i27);
                    C17819e c17819e3 = (C17819e) c17821g.f56838c.get(sparseArray5.keyAt(i27));
                    int i28 = c17818d.f56822a + c17816b.f56814c;
                    int i29 = c17818d.f56823b + c17816b.f56816e;
                    int iMin = Math.min(c17819e3.f56826c + i28, c17816b.f56815d);
                    int i30 = c17819e3.f56827d;
                    int i31 = i29 + i30;
                    canvas.clipRect(i28, i29, iMin, Math.min(i31, c17816b.f56817f));
                    SparseArray sparseArray6 = c17821g.f56839d;
                    int i32 = c17819e3.f56829f;
                    C17815a c17815a = (C17815a) sparseArray6.get(i32);
                    if (c17815a == null && (c17815a = (C17815a) c17821g.f56841f.get(i32)) == null) {
                        c17815a = this.f56852q0;
                    }
                    int i33 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c17819e3.f56833j;
                        if (i33 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i33);
                            C17820f c17820f = (C17820f) sparseArray7.valueAt(i33);
                            C11500p c11500p5 = c11500p4;
                            C17817c c17817c = (C17817c) c17821g.f56840e.get(iKeyAt);
                            if (c17817c == null) {
                                c17817c = (C17817c) c17821g.f56842g.get(iKeyAt);
                            }
                            if (c17817c != null) {
                                Paint paint = c17817c.f56819b ? null : this.f56848Y;
                                int i34 = c17820f.f56834a + i28;
                                int i35 = c17820f.f56835b + i29;
                                int i36 = c17819e3.f56828e;
                                int i37 = i33;
                                int[] iArr = i36 == 3 ? c17815a.f56811d : i36 == 2 ? c17815a.f56810c : c17815a.f56809b;
                                i14 = i37;
                                i16 = i30;
                                i15 = i31;
                                i17 = i29;
                                Paint paint2 = paint;
                                m19571f(c17817c.f56820c, iArr, i36, i34, i35, paint2, canvas);
                                m19571f(c17817c.f56821d, iArr, i36, i34, i35 + 1, paint2, canvas);
                            } else {
                                i14 = i33;
                                i15 = i31;
                                i16 = i30;
                                i17 = i29;
                            }
                            i33 = i14 + 1;
                            c17819e3 = c17819e3;
                            i28 = i28;
                            c11500p4 = c11500p5;
                            c17821g = c17821g;
                            i27 = i27;
                            c17816b = c17816b;
                            i30 = i16;
                            i31 = i15;
                            i29 = i17;
                            arrayList = arrayList;
                        } else {
                            C11500p c11500p6 = c11500p4;
                            C17816b c17816b2 = c17816b;
                            ArrayList arrayList2 = arrayList;
                            int i38 = i27;
                            C17821g c17821g2 = c17821g;
                            int i39 = i31;
                            int i40 = i30;
                            int i41 = i29;
                            int i42 = i28;
                            C17819e c17819e4 = c17819e3;
                            boolean z6 = c17819e4.f56825b;
                            int i43 = c17819e4.f56826c;
                            if (z6) {
                                int i44 = c17819e4.f56828e;
                                if (i44 == 3) {
                                    i13 = c17815a.f56811d[c17819e4.f56830g];
                                    c9 = 2;
                                } else {
                                    c9 = 2;
                                    i13 = i44 == 2 ? c17815a.f56810c[c17819e4.f56831h] : c17815a.f56809b[c17819e4.f56832i];
                                }
                                Paint paint3 = this.f56849Z;
                                paint3.setColor(i13);
                                i12 = i41;
                                canvas.drawRect(i42, i12, i42 + i43, i39, paint3);
                            } else {
                                i12 = i41;
                                c9 = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f56854s0, i42, i12, i43, i40);
                            float f10 = c17816b2.f56812a;
                            float f11 = c17816b2.f56813b;
                            arrayList2.add(new C20421b(null, null, null, bitmapCreateBitmap2, i12 / f11, 0, 0, i42 / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, i43 / f10, i40 / f11, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            c17821g = c17821g2;
                            i27 = i38 + 1;
                            c11500p4 = c11500p6;
                            arrayList = arrayList2;
                            c17816b = c17816b2;
                        }
                    }
                } else {
                    c17153c = new C17153c(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC20802d.accept(c17153c);
    }
}
