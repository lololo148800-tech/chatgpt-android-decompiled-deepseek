package p523V9;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: V9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8041a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25351a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25351a) {
            case 0:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                String strM8776d = null;
                String strM8776d2 = null;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        strM8776d = AbstractC8191s5.m8776d(parcel, i10);
                    } else if (c9 != 3) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        strM8776d2 = AbstractC8191s5.m8776d(parcel, i10);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                C7869D4 c7869d4 = new C7869D4();
                c7869d4.f24774Y = strM8776d;
                c7869d4.f24775Z = strM8776d2;
                return c7869d4;
            case 1:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                String strM8776d3 = null;
                String strM8776d4 = null;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 2) {
                        strM8776d3 = AbstractC8191s5.m8776d(parcel, i11);
                    } else if (c10 != 3) {
                        AbstractC8191s5.m8788p(parcel, i11);
                    } else {
                        strM8776d4 = AbstractC8191s5.m8776d(parcel, i11);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                C8032Y4 c8032y4 = new C8032Y4();
                c8032y4.f25346Y = strM8776d3;
                c8032y4.f25347Z = strM8776d4;
                return c8032y4;
            case 2:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                int iM8785m = 0;
                String strM8776d5 = null;
                String strM8776d6 = null;
                while (parcel.dataPosition() < iM8789q3) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 2) {
                        strM8776d5 = AbstractC8191s5.m8776d(parcel, i12);
                    } else if (c11 == 3) {
                        strM8776d6 = AbstractC8191s5.m8776d(parcel, i12);
                    } else if (c11 != 4) {
                        AbstractC8191s5.m8788p(parcel, i12);
                    } else {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i12);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                C8247z5 c8247z5 = new C8247z5();
                c8247z5.f25728Y = strM8776d5;
                c8247z5.f25729Z = strM8776d6;
                c8247z5.f25730o0 = iM8785m;
                return c8247z5;
            case 3:
                int iM8789q4 = AbstractC8191s5.m8789q(parcel);
                int iM8785m2 = 0;
                boolean zM8782j = false;
                while (parcel.dataPosition() < iM8789q4) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 2) {
                        iM8785m2 = AbstractC8191s5.m8785m(parcel, i13);
                    } else if (c12 != 3) {
                        AbstractC8191s5.m8788p(parcel, i13);
                    } else {
                        zM8782j = AbstractC8191s5.m8782j(parcel, i13);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q4);
                C8049b c8049b = new C8049b();
                c8049b.f25356Y = iM8785m2;
                c8049b.f25357Z = zM8782j;
                return c8049b;
            case 4:
                int iM8789q5 = AbstractC8191s5.m8789q(parcel);
                int iM8785m3 = 0;
                int iM8785m4 = 0;
                int iM8785m5 = 0;
                int iM8785m6 = 0;
                long jM8786n = 0;
                while (parcel.dataPosition() < iM8789q5) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 2) {
                        iM8785m3 = AbstractC8191s5.m8785m(parcel, i14);
                    } else if (c13 == 3) {
                        iM8785m4 = AbstractC8191s5.m8785m(parcel, i14);
                    } else if (c13 == 4) {
                        iM8785m5 = AbstractC8191s5.m8785m(parcel, i14);
                    } else if (c13 == 5) {
                        jM8786n = AbstractC8191s5.m8786n(parcel, i14);
                    } else if (c13 != 6) {
                        AbstractC8191s5.m8788p(parcel, i14);
                    } else {
                        iM8785m6 = AbstractC8191s5.m8785m(parcel, i14);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q5);
                return new C8089g(iM8785m3, iM8785m4, iM8785m5, jM8786n, iM8785m6);
            case 5:
                int iM8789q6 = AbstractC8191s5.m8789q(parcel);
                String[] strArrM8777e = null;
                int iM8785m7 = 0;
                while (parcel.dataPosition() < iM8789q6) {
                    int i15 = parcel.readInt();
                    char c14 = (char) i15;
                    if (c14 == 2) {
                        iM8785m7 = AbstractC8191s5.m8785m(parcel, i15);
                    } else if (c14 != 3) {
                        AbstractC8191s5.m8788p(parcel, i15);
                    } else {
                        strArrM8777e = AbstractC8191s5.m8777e(parcel, i15);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q6);
                C8066d0 c8066d0 = new C8066d0();
                c8066d0.f25375Y = iM8785m7;
                c8066d0.f25376Z = strArrM8777e;
                return c8066d0;
            case 6:
                int iM8789q7 = AbstractC8191s5.m8789q(parcel);
                double d10 = 0.0d;
                int iM8785m8 = 0;
                boolean zM8782j2 = false;
                String strM8776d7 = null;
                String strM8776d8 = null;
                Point[] pointArr = null;
                C7891G2 c7891g2 = null;
                C8110i4 c8110i4 = null;
                C7869D4 c7869d5 = null;
                C8247z5 c8247z6 = null;
                byte[] bArrM8774b = null;
                C8101h3 c8101h3 = null;
                C8032Y4 c8032y5 = null;
                C8067d1 c8067d1 = null;
                C7874E1 c7874e1 = null;
                C8084f2 c8084f2 = null;
                int iM8785m9 = 0;
                while (parcel.dataPosition() < iM8789q7) {
                    int i16 = parcel.readInt();
                    C8247z5 c8247z7 = c8247z6;
                    switch ((char) i16) {
                        case 2:
                            iM8785m8 = AbstractC8191s5.m8785m(parcel, i16);
                            break;
                        case 3:
                            strM8776d7 = AbstractC8191s5.m8776d(parcel, i16);
                            break;
                        case 4:
                            strM8776d8 = AbstractC8191s5.m8776d(parcel, i16);
                            break;
                        case 5:
                            iM8785m9 = AbstractC8191s5.m8785m(parcel, i16);
                            break;
                        case 6:
                            pointArr = (Point[]) AbstractC8191s5.m8778f(parcel, i16, Point.CREATOR);
                            break;
                        case 7:
                            c7891g2 = (C7891G2) AbstractC8191s5.m8775c(parcel, i16, C7891G2.CREATOR);
                            break;
                        case '\b':
                            c8110i4 = (C8110i4) AbstractC8191s5.m8775c(parcel, i16, C8110i4.CREATOR);
                            break;
                        case '\t':
                            c7869d5 = (C7869D4) AbstractC8191s5.m8775c(parcel, i16, C7869D4.CREATOR);
                            break;
                        case '\n':
                            c8247z6 = (C8247z5) AbstractC8191s5.m8775c(parcel, i16, C8247z5.CREATOR);
                            continue;
                        case 11:
                            c8032y5 = (C8032Y4) AbstractC8191s5.m8775c(parcel, i16, C8032Y4.CREATOR);
                            break;
                        case '\f':
                            c8101h3 = (C8101h3) AbstractC8191s5.m8775c(parcel, i16, C8101h3.CREATOR);
                            break;
                        case '\r':
                            c8067d1 = (C8067d1) AbstractC8191s5.m8775c(parcel, i16, C8067d1.CREATOR);
                            break;
                        case 14:
                            c7874e1 = (C7874E1) AbstractC8191s5.m8775c(parcel, i16, C7874E1.CREATOR);
                            break;
                        case 15:
                            c8084f2 = (C8084f2) AbstractC8191s5.m8775c(parcel, i16, C8084f2.CREATOR);
                            break;
                        case 16:
                            bArrM8774b = AbstractC8191s5.m8774b(parcel, i16);
                            break;
                        case 17:
                            zM8782j2 = AbstractC8191s5.m8782j(parcel, i16);
                            break;
                        case 18:
                            AbstractC8191s5.m8791s(parcel, i16, 8);
                            d10 = parcel.readDouble();
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i16);
                            break;
                    }
                    c8247z6 = c8247z7;
                }
                AbstractC8191s5.m8781i(parcel, iM8789q7);
                C8026X5 c8026x5 = new C8026X5();
                c8026x5.f25329Y = iM8785m8;
                c8026x5.f25330Z = strM8776d7;
                c8026x5.f25326A0 = bArrM8774b;
                c8026x5.f25331o0 = strM8776d8;
                c8026x5.f25332p0 = iM8785m9;
                c8026x5.f25333q0 = pointArr;
                c8026x5.f25327B0 = zM8782j2;
                c8026x5.f25328C0 = d10;
                c8026x5.f25334r0 = c7891g2;
                c8026x5.f25335s0 = c8110i4;
                c8026x5.f25336t0 = c7869d5;
                c8026x5.f25337u0 = c8247z6;
                c8026x5.f25338v0 = c8032y5;
                c8026x5.f25339w0 = c8101h3;
                c8026x5.f25340x0 = c8067d1;
                c8026x5.f25341y0 = c7874e1;
                c8026x5.f25342z0 = c8084f2;
                return c8026x5;
            case 7:
                int iM8789q8 = AbstractC8191s5.m8789q(parcel);
                String[] strArrM8777e2 = null;
                int iM8785m10 = 0;
                while (parcel.dataPosition() < iM8789q8) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        iM8785m10 = AbstractC8191s5.m8785m(parcel, i17);
                    } else if (c15 != 2) {
                        AbstractC8191s5.m8788p(parcel, i17);
                    } else {
                        strArrM8777e2 = AbstractC8191s5.m8777e(parcel, i17);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q8);
                return new C7871D6(iM8785m10, strArrM8777e2);
            case 8:
                int iM8789q9 = AbstractC8191s5.m8789q(parcel);
                String strM8776d9 = null;
                int iM8785m11 = 0;
                int iM8785m12 = 0;
                int iM8785m13 = 0;
                int iM8785m14 = 0;
                int iM8785m15 = 0;
                int iM8785m16 = 0;
                boolean zM8782j3 = false;
                while (parcel.dataPosition() < iM8789q9) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            iM8785m11 = AbstractC8191s5.m8785m(parcel, i18);
                            break;
                        case 3:
                            iM8785m12 = AbstractC8191s5.m8785m(parcel, i18);
                            break;
                        case 4:
                            iM8785m13 = AbstractC8191s5.m8785m(parcel, i18);
                            break;
                        case 5:
                            iM8785m14 = AbstractC8191s5.m8785m(parcel, i18);
                            break;
                        case 6:
                            iM8785m15 = AbstractC8191s5.m8785m(parcel, i18);
                            break;
                        case 7:
                            iM8785m16 = AbstractC8191s5.m8785m(parcel, i18);
                            break;
                        case '\b':
                            zM8782j3 = AbstractC8191s5.m8782j(parcel, i18);
                            break;
                        case '\t':
                            strM8776d9 = AbstractC8191s5.m8776d(parcel, i18);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i18);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q9);
                C7857C0 c7857c0 = new C7857C0();
                c7857c0.f24753Y = iM8785m11;
                c7857c0.f24754Z = iM8785m12;
                c7857c0.f24755o0 = iM8785m13;
                c7857c0.f24756p0 = iM8785m14;
                c7857c0.f24757q0 = iM8785m15;
                c7857c0.f24758r0 = iM8785m16;
                c7857c0.f24759s0 = zM8782j3;
                c7857c0.f24760t0 = strM8776d9;
                return c7857c0;
            case 9:
                int iM8789q10 = AbstractC8191s5.m8789q(parcel);
                String strM8776d10 = null;
                String strM8776d11 = null;
                byte[] bArrM8774b2 = null;
                Point[] pointArr2 = null;
                C7911I6 c7911i6 = null;
                C7935L6 c7935l6 = null;
                C7943M6 c7943m6 = null;
                C7959O6 c7959o6 = null;
                C7951N6 c7951n6 = null;
                C7919J6 c7919j6 = null;
                C7887F6 c7887f6 = null;
                C7895G6 c7895g6 = null;
                C7903H6 c7903h6 = null;
                int iM8785m17 = 0;
                int iM8785m18 = 0;
                while (parcel.dataPosition() < iM8789q10) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iM8785m17 = AbstractC8191s5.m8785m(parcel, i19);
                            break;
                        case 2:
                            strM8776d10 = AbstractC8191s5.m8776d(parcel, i19);
                            break;
                        case 3:
                            strM8776d11 = AbstractC8191s5.m8776d(parcel, i19);
                            break;
                        case 4:
                            bArrM8774b2 = AbstractC8191s5.m8774b(parcel, i19);
                            break;
                        case 5:
                            pointArr2 = (Point[]) AbstractC8191s5.m8778f(parcel, i19, Point.CREATOR);
                            break;
                        case 6:
                            iM8785m18 = AbstractC8191s5.m8785m(parcel, i19);
                            break;
                        case 7:
                            c7911i6 = (C7911I6) AbstractC8191s5.m8775c(parcel, i19, C7911I6.CREATOR);
                            break;
                        case '\b':
                            c7935l6 = (C7935L6) AbstractC8191s5.m8775c(parcel, i19, C7935L6.CREATOR);
                            break;
                        case '\t':
                            c7943m6 = (C7943M6) AbstractC8191s5.m8775c(parcel, i19, C7943M6.CREATOR);
                            break;
                        case '\n':
                            c7959o6 = (C7959O6) AbstractC8191s5.m8775c(parcel, i19, C7959O6.CREATOR);
                            break;
                        case 11:
                            c7951n6 = (C7951N6) AbstractC8191s5.m8775c(parcel, i19, C7951N6.CREATOR);
                            break;
                        case '\f':
                            c7919j6 = (C7919J6) AbstractC8191s5.m8775c(parcel, i19, C7919J6.CREATOR);
                            break;
                        case '\r':
                            c7887f6 = (C7887F6) AbstractC8191s5.m8775c(parcel, i19, C7887F6.CREATOR);
                            break;
                        case 14:
                            c7895g6 = (C7895G6) AbstractC8191s5.m8775c(parcel, i19, C7895G6.CREATOR);
                            break;
                        case 15:
                            c7903h6 = (C7903H6) AbstractC8191s5.m8775c(parcel, i19, C7903H6.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i19);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q10);
                return new C7967P6(iM8785m17, strM8776d10, strM8776d11, bArrM8774b2, pointArr2, iM8785m18, c7911i6, c7935l6, c7943m6, c7959o6, c7951n6, c7919j6, c7887f6, c7895g6, c7903h6);
            case 10:
                int iM8789q11 = AbstractC8191s5.m8789q(parcel);
                String strM8776d12 = null;
                int iM8785m19 = 0;
                int iM8785m20 = 0;
                int iM8785m21 = 0;
                int iM8785m22 = 0;
                int iM8785m23 = 0;
                int iM8785m24 = 0;
                boolean zM8782j4 = false;
                while (parcel.dataPosition() < iM8789q11) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iM8785m19 = AbstractC8191s5.m8785m(parcel, i20);
                            break;
                        case 2:
                            iM8785m20 = AbstractC8191s5.m8785m(parcel, i20);
                            break;
                        case 3:
                            iM8785m21 = AbstractC8191s5.m8785m(parcel, i20);
                            break;
                        case 4:
                            iM8785m22 = AbstractC8191s5.m8785m(parcel, i20);
                            break;
                        case 5:
                            iM8785m23 = AbstractC8191s5.m8785m(parcel, i20);
                            break;
                        case 6:
                            iM8785m24 = AbstractC8191s5.m8785m(parcel, i20);
                            break;
                        case 7:
                            zM8782j4 = AbstractC8191s5.m8782j(parcel, i20);
                            break;
                        case '\b':
                            strM8776d12 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i20);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q11);
                return new C7879E6(iM8785m19, iM8785m20, iM8785m21, iM8785m22, iM8785m23, iM8785m24, zM8782j4, strM8776d12);
            case 11:
                int iM8789q12 = AbstractC8191s5.m8789q(parcel);
                String strM8776d13 = null;
                String strM8776d14 = null;
                String strM8776d15 = null;
                String strM8776d16 = null;
                String strM8776d17 = null;
                C7879E6 c7879e6 = null;
                C7879E6 c7879e7 = null;
                while (parcel.dataPosition() < iM8789q12) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strM8776d13 = AbstractC8191s5.m8776d(parcel, i21);
                            break;
                        case 2:
                            strM8776d14 = AbstractC8191s5.m8776d(parcel, i21);
                            break;
                        case 3:
                            strM8776d15 = AbstractC8191s5.m8776d(parcel, i21);
                            break;
                        case 4:
                            strM8776d16 = AbstractC8191s5.m8776d(parcel, i21);
                            break;
                        case 5:
                            strM8776d17 = AbstractC8191s5.m8776d(parcel, i21);
                            break;
                        case 6:
                            c7879e6 = (C7879E6) AbstractC8191s5.m8775c(parcel, i21, C7879E6.CREATOR);
                            break;
                        case 7:
                            c7879e7 = (C7879E6) AbstractC8191s5.m8775c(parcel, i21, C7879E6.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i21);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q12);
                return new C7887F6(strM8776d13, strM8776d14, strM8776d15, strM8776d16, strM8776d17, c7879e6, c7879e7);
            case 12:
                int iM8789q13 = AbstractC8191s5.m8789q(parcel);
                C7927K6 c7927k6 = null;
                String strM8776d18 = null;
                String strM8776d19 = null;
                C7935L6[] c7935l6Arr = null;
                C7911I6[] c7911i6Arr = null;
                String[] strArrM8777e3 = null;
                C7871D6[] c7871d6Arr = null;
                while (parcel.dataPosition() < iM8789q13) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            c7927k6 = (C7927K6) AbstractC8191s5.m8775c(parcel, i22, C7927K6.CREATOR);
                            break;
                        case 2:
                            strM8776d18 = AbstractC8191s5.m8776d(parcel, i22);
                            break;
                        case 3:
                            strM8776d19 = AbstractC8191s5.m8776d(parcel, i22);
                            break;
                        case 4:
                            c7935l6Arr = (C7935L6[]) AbstractC8191s5.m8778f(parcel, i22, C7935L6.CREATOR);
                            break;
                        case 5:
                            c7911i6Arr = (C7911I6[]) AbstractC8191s5.m8778f(parcel, i22, C7911I6.CREATOR);
                            break;
                        case 6:
                            strArrM8777e3 = AbstractC8191s5.m8777e(parcel, i22);
                            break;
                        case 7:
                            c7871d6Arr = (C7871D6[]) AbstractC8191s5.m8778f(parcel, i22, C7871D6.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i22);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q13);
                return new C7895G6(c7927k6, strM8776d18, strM8776d19, c7935l6Arr, c7911i6Arr, strArrM8777e3, c7871d6Arr);
            case 13:
                int iM8789q14 = AbstractC8191s5.m8789q(parcel);
                String strM8776d20 = null;
                String strM8776d21 = null;
                String strM8776d22 = null;
                String strM8776d23 = null;
                String strM8776d24 = null;
                String strM8776d25 = null;
                String strM8776d26 = null;
                String strM8776d27 = null;
                String strM8776d28 = null;
                String strM8776d29 = null;
                String strM8776d30 = null;
                String strM8776d31 = null;
                String strM8776d32 = null;
                String strM8776d33 = null;
                while (parcel.dataPosition() < iM8789q14) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strM8776d20 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case 2:
                            strM8776d21 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case 3:
                            strM8776d22 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case 4:
                            strM8776d23 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case 5:
                            strM8776d24 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case 6:
                            strM8776d25 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case 7:
                            strM8776d26 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case '\b':
                            strM8776d27 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case '\t':
                            strM8776d28 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case '\n':
                            strM8776d29 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case 11:
                            strM8776d30 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case '\f':
                            strM8776d31 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case '\r':
                            strM8776d32 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        case 14:
                            strM8776d33 = AbstractC8191s5.m8776d(parcel, i23);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i23);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q14);
                return new C7903H6(strM8776d20, strM8776d21, strM8776d22, strM8776d23, strM8776d24, strM8776d25, strM8776d26, strM8776d27, strM8776d28, strM8776d29, strM8776d30, strM8776d31, strM8776d32, strM8776d33);
            case 14:
                int iM8789q15 = AbstractC8191s5.m8789q(parcel);
                String strM8776d34 = null;
                String strM8776d35 = null;
                int iM8785m25 = 0;
                String strM8776d36 = null;
                while (parcel.dataPosition() < iM8789q15) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 1) {
                        iM8785m25 = AbstractC8191s5.m8785m(parcel, i24);
                    } else if (c16 == 2) {
                        strM8776d34 = AbstractC8191s5.m8776d(parcel, i24);
                    } else if (c16 == 3) {
                        strM8776d36 = AbstractC8191s5.m8776d(parcel, i24);
                    } else if (c16 != 4) {
                        AbstractC8191s5.m8788p(parcel, i24);
                    } else {
                        strM8776d35 = AbstractC8191s5.m8776d(parcel, i24);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q15);
                return new C7911I6(iM8785m25, strM8776d34, strM8776d36, strM8776d35);
            case 15:
                int iM8789q16 = AbstractC8191s5.m8789q(parcel);
                double d11 = 0.0d;
                double d12 = 0.0d;
                while (parcel.dataPosition() < iM8789q16) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 1) {
                        AbstractC8191s5.m8791s(parcel, i25, 8);
                        d11 = parcel.readDouble();
                    } else if (c17 != 2) {
                        AbstractC8191s5.m8788p(parcel, i25);
                    } else {
                        AbstractC8191s5.m8791s(parcel, i25, 8);
                        d12 = parcel.readDouble();
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q16);
                return new C7919J6(d11, d12);
            case 16:
                int iM8789q17 = AbstractC8191s5.m8789q(parcel);
                String strM8776d37 = null;
                String strM8776d38 = null;
                String strM8776d39 = null;
                String strM8776d40 = null;
                String strM8776d41 = null;
                C7857C0 c7857c1 = null;
                C7857C0 c7857c2 = null;
                while (parcel.dataPosition() < iM8789q17) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            strM8776d37 = AbstractC8191s5.m8776d(parcel, i26);
                            break;
                        case 3:
                            strM8776d38 = AbstractC8191s5.m8776d(parcel, i26);
                            break;
                        case 4:
                            strM8776d39 = AbstractC8191s5.m8776d(parcel, i26);
                            break;
                        case 5:
                            strM8776d40 = AbstractC8191s5.m8776d(parcel, i26);
                            break;
                        case 6:
                            strM8776d41 = AbstractC8191s5.m8776d(parcel, i26);
                            break;
                        case 7:
                            c7857c1 = (C7857C0) AbstractC8191s5.m8775c(parcel, i26, C7857C0.CREATOR);
                            break;
                        case '\b':
                            c7857c2 = (C7857C0) AbstractC8191s5.m8775c(parcel, i26, C7857C0.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i26);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q17);
                C8067d1 c8067d2 = new C8067d1();
                c8067d2.f25377Y = strM8776d37;
                c8067d2.f25378Z = strM8776d38;
                c8067d2.f25379o0 = strM8776d39;
                c8067d2.f25380p0 = strM8776d40;
                c8067d2.f25381q0 = strM8776d41;
                c8067d2.f25382r0 = c7857c1;
                c8067d2.f25383s0 = c7857c2;
                return c8067d2;
            case 17:
                int iM8789q18 = AbstractC8191s5.m8789q(parcel);
                String strM8776d42 = null;
                String strM8776d43 = null;
                String strM8776d44 = null;
                String strM8776d45 = null;
                String strM8776d46 = null;
                String strM8776d47 = null;
                String strM8776d48 = null;
                while (parcel.dataPosition() < iM8789q18) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            strM8776d42 = AbstractC8191s5.m8776d(parcel, i27);
                            break;
                        case 2:
                            strM8776d43 = AbstractC8191s5.m8776d(parcel, i27);
                            break;
                        case 3:
                            strM8776d44 = AbstractC8191s5.m8776d(parcel, i27);
                            break;
                        case 4:
                            strM8776d45 = AbstractC8191s5.m8776d(parcel, i27);
                            break;
                        case 5:
                            strM8776d46 = AbstractC8191s5.m8776d(parcel, i27);
                            break;
                        case 6:
                            strM8776d47 = AbstractC8191s5.m8776d(parcel, i27);
                            break;
                        case 7:
                            strM8776d48 = AbstractC8191s5.m8776d(parcel, i27);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i27);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q18);
                return new C7927K6(strM8776d42, strM8776d43, strM8776d44, strM8776d45, strM8776d46, strM8776d47, strM8776d48);
            case 18:
                int iM8789q19 = AbstractC8191s5.m8789q(parcel);
                String strM8776d49 = null;
                int iM8785m26 = 0;
                while (parcel.dataPosition() < iM8789q19) {
                    int i28 = parcel.readInt();
                    char c18 = (char) i28;
                    if (c18 == 1) {
                        iM8785m26 = AbstractC8191s5.m8785m(parcel, i28);
                    } else if (c18 != 2) {
                        AbstractC8191s5.m8788p(parcel, i28);
                    } else {
                        strM8776d49 = AbstractC8191s5.m8776d(parcel, i28);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q19);
                return new C7935L6(iM8785m26, strM8776d49);
            case 19:
                int iM8789q20 = AbstractC8191s5.m8789q(parcel);
                String strM8776d50 = null;
                String strM8776d51 = null;
                while (parcel.dataPosition() < iM8789q20) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 1) {
                        strM8776d50 = AbstractC8191s5.m8776d(parcel, i29);
                    } else if (c19 != 2) {
                        AbstractC8191s5.m8788p(parcel, i29);
                    } else {
                        strM8776d51 = AbstractC8191s5.m8776d(parcel, i29);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q20);
                return new C7943M6(strM8776d50, strM8776d51);
            case 20:
                int iM8789q21 = AbstractC8191s5.m8789q(parcel);
                String strM8776d52 = null;
                String strM8776d53 = null;
                while (parcel.dataPosition() < iM8789q21) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 1) {
                        strM8776d52 = AbstractC8191s5.m8776d(parcel, i30);
                    } else if (c20 != 2) {
                        AbstractC8191s5.m8788p(parcel, i30);
                    } else {
                        strM8776d53 = AbstractC8191s5.m8776d(parcel, i30);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q21);
                return new C7951N6(strM8776d52, strM8776d53);
            case 21:
                int iM8789q22 = AbstractC8191s5.m8789q(parcel);
                int iM8785m27 = 0;
                String strM8776d54 = null;
                String strM8776d55 = null;
                while (parcel.dataPosition() < iM8789q22) {
                    int i31 = parcel.readInt();
                    char c21 = (char) i31;
                    if (c21 == 1) {
                        strM8776d54 = AbstractC8191s5.m8776d(parcel, i31);
                    } else if (c21 == 2) {
                        strM8776d55 = AbstractC8191s5.m8776d(parcel, i31);
                    } else if (c21 != 3) {
                        AbstractC8191s5.m8788p(parcel, i31);
                    } else {
                        iM8785m27 = AbstractC8191s5.m8785m(parcel, i31);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q22);
                return new C7959O6(iM8785m27, strM8776d54, strM8776d55);
            case 22:
                int iM8789q23 = AbstractC8191s5.m8789q(parcel);
                C7908I3 c7908i3 = null;
                String strM8776d56 = null;
                String strM8776d57 = null;
                C8110i4[] c8110i4Arr = null;
                C7891G2[] c7891g2Arr = null;
                String[] strArrM8777e4 = null;
                C8066d0[] c8066d0Arr = null;
                while (parcel.dataPosition() < iM8789q23) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            c7908i3 = (C7908I3) AbstractC8191s5.m8775c(parcel, i32, C7908I3.CREATOR);
                            break;
                        case 3:
                            strM8776d56 = AbstractC8191s5.m8776d(parcel, i32);
                            break;
                        case 4:
                            strM8776d57 = AbstractC8191s5.m8776d(parcel, i32);
                            break;
                        case 5:
                            c8110i4Arr = (C8110i4[]) AbstractC8191s5.m8778f(parcel, i32, C8110i4.CREATOR);
                            break;
                        case 6:
                            c7891g2Arr = (C7891G2[]) AbstractC8191s5.m8778f(parcel, i32, C7891G2.CREATOR);
                            break;
                        case 7:
                            strArrM8777e4 = AbstractC8191s5.m8777e(parcel, i32);
                            break;
                        case '\b':
                            c8066d0Arr = (C8066d0[]) AbstractC8191s5.m8778f(parcel, i32, C8066d0.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i32);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q23);
                C7874E1 c7874e2 = new C7874E1();
                c7874e2.f24780Y = c7908i3;
                c7874e2.f24781Z = strM8776d56;
                c7874e2.f24782o0 = strM8776d57;
                c7874e2.f24783p0 = c8110i4Arr;
                c7874e2.f24784q0 = c7891g2Arr;
                c7874e2.f24785r0 = strArrM8777e4;
                c7874e2.f24786s0 = c8066d0Arr;
                return c7874e2;
            case 23:
                int iM8789q24 = AbstractC8191s5.m8789q(parcel);
                String strM8776d58 = null;
                String strM8776d59 = null;
                String strM8776d60 = null;
                String strM8776d61 = null;
                String strM8776d62 = null;
                String strM8776d63 = null;
                String strM8776d64 = null;
                String strM8776d65 = null;
                String strM8776d66 = null;
                String strM8776d67 = null;
                String strM8776d68 = null;
                String strM8776d69 = null;
                String strM8776d70 = null;
                String strM8776d71 = null;
                while (parcel.dataPosition() < iM8789q24) {
                    int i33 = parcel.readInt();
                    String str = strM8776d70;
                    switch ((char) i33) {
                        case 2:
                            strM8776d58 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case 3:
                            strM8776d59 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case 4:
                            strM8776d60 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case 5:
                            strM8776d61 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case 6:
                            strM8776d62 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case 7:
                            strM8776d63 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case '\b':
                            strM8776d64 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case '\t':
                            strM8776d65 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case '\n':
                            strM8776d66 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case 11:
                            strM8776d67 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case '\f':
                            strM8776d68 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case '\r':
                            strM8776d69 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        case 14:
                            strM8776d70 = AbstractC8191s5.m8776d(parcel, i33);
                            continue;
                        case 15:
                            strM8776d71 = AbstractC8191s5.m8776d(parcel, i33);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i33);
                            break;
                    }
                    strM8776d70 = str;
                }
                AbstractC8191s5.m8781i(parcel, iM8789q24);
                C8084f2 c8084f3 = new C8084f2();
                c8084f3.f25397Y = strM8776d58;
                c8084f3.f25398Z = strM8776d59;
                c8084f3.f25399o0 = strM8776d60;
                c8084f3.f25400p0 = strM8776d61;
                c8084f3.f25401q0 = strM8776d62;
                c8084f3.f25402r0 = strM8776d63;
                c8084f3.f25403s0 = strM8776d64;
                c8084f3.f25404t0 = strM8776d65;
                c8084f3.f25405u0 = strM8776d66;
                c8084f3.f25406v0 = strM8776d67;
                c8084f3.f25407w0 = strM8776d68;
                c8084f3.f25408x0 = strM8776d69;
                c8084f3.f25409y0 = strM8776d70;
                c8084f3.f25410z0 = strM8776d71;
                return c8084f3;
            case 24:
                int iM8789q25 = AbstractC8191s5.m8789q(parcel);
                String strM8776d72 = null;
                String strM8776d73 = null;
                int iM8785m28 = 0;
                String strM8776d74 = null;
                while (parcel.dataPosition() < iM8789q25) {
                    int i34 = parcel.readInt();
                    char c22 = (char) i34;
                    if (c22 == 2) {
                        iM8785m28 = AbstractC8191s5.m8785m(parcel, i34);
                    } else if (c22 == 3) {
                        strM8776d72 = AbstractC8191s5.m8776d(parcel, i34);
                    } else if (c22 == 4) {
                        strM8776d74 = AbstractC8191s5.m8776d(parcel, i34);
                    } else if (c22 != 5) {
                        AbstractC8191s5.m8788p(parcel, i34);
                    } else {
                        strM8776d73 = AbstractC8191s5.m8776d(parcel, i34);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q25);
                C7891G2 c7891g3 = new C7891G2();
                c7891g3.f24825Y = iM8785m28;
                c7891g3.f24826Z = strM8776d72;
                c7891g3.f24827o0 = strM8776d74;
                c7891g3.f24828p0 = strM8776d73;
                return c7891g3;
            case 25:
                int iM8789q26 = AbstractC8191s5.m8789q(parcel);
                double d13 = 0.0d;
                double d14 = 0.0d;
                while (parcel.dataPosition() < iM8789q26) {
                    int i35 = parcel.readInt();
                    char c23 = (char) i35;
                    if (c23 == 2) {
                        AbstractC8191s5.m8791s(parcel, i35, 8);
                        d13 = parcel.readDouble();
                    } else if (c23 != 3) {
                        AbstractC8191s5.m8788p(parcel, i35);
                    } else {
                        AbstractC8191s5.m8791s(parcel, i35, 8);
                        d14 = parcel.readDouble();
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q26);
                C8101h3 c8101h4 = new C8101h3();
                c8101h4.f25437Y = d13;
                c8101h4.f25438Z = d14;
                return c8101h4;
            case 26:
                int iM8789q27 = AbstractC8191s5.m8789q(parcel);
                String strM8776d75 = null;
                String strM8776d76 = null;
                String strM8776d77 = null;
                String strM8776d78 = null;
                String strM8776d79 = null;
                String strM8776d80 = null;
                String strM8776d81 = null;
                while (parcel.dataPosition() < iM8789q27) {
                    int i36 = parcel.readInt();
                    switch ((char) i36) {
                        case 2:
                            strM8776d75 = AbstractC8191s5.m8776d(parcel, i36);
                            break;
                        case 3:
                            strM8776d76 = AbstractC8191s5.m8776d(parcel, i36);
                            break;
                        case 4:
                            strM8776d77 = AbstractC8191s5.m8776d(parcel, i36);
                            break;
                        case 5:
                            strM8776d78 = AbstractC8191s5.m8776d(parcel, i36);
                            break;
                        case 6:
                            strM8776d79 = AbstractC8191s5.m8776d(parcel, i36);
                            break;
                        case 7:
                            strM8776d80 = AbstractC8191s5.m8776d(parcel, i36);
                            break;
                        case '\b':
                            strM8776d81 = AbstractC8191s5.m8776d(parcel, i36);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i36);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q27);
                C7908I3 c7908i4 = new C7908I3();
                c7908i4.f24872Y = strM8776d75;
                c7908i4.f24873Z = strM8776d76;
                c7908i4.f24874o0 = strM8776d77;
                c7908i4.f24875p0 = strM8776d78;
                c7908i4.f24876q0 = strM8776d79;
                c7908i4.f24877r0 = strM8776d80;
                c7908i4.f24878s0 = strM8776d81;
                return c7908i4;
            default:
                int iM8789q28 = AbstractC8191s5.m8789q(parcel);
                String strM8776d82 = null;
                int iM8785m29 = 0;
                while (parcel.dataPosition() < iM8789q28) {
                    int i37 = parcel.readInt();
                    char c24 = (char) i37;
                    if (c24 == 2) {
                        iM8785m29 = AbstractC8191s5.m8785m(parcel, i37);
                    } else if (c24 != 3) {
                        AbstractC8191s5.m8788p(parcel, i37);
                    } else {
                        strM8776d82 = AbstractC8191s5.m8776d(parcel, i37);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q28);
                C8110i4 c8110i5 = new C8110i4();
                c8110i5.f25444Y = iM8785m29;
                c8110i5.f25445Z = strM8776d82;
                return c8110i5;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f25351a) {
            case 0:
                return new C7869D4[i10];
            case 1:
                return new C8032Y4[i10];
            case 2:
                return new C8247z5[i10];
            case 3:
                return new C8049b[i10];
            case 4:
                return new C8089g[i10];
            case 5:
                return new C8066d0[i10];
            case 6:
                return new C8026X5[i10];
            case 7:
                return new C7871D6[i10];
            case 8:
                return new C7857C0[i10];
            case 9:
                return new C7967P6[i10];
            case 10:
                return new C7879E6[i10];
            case 11:
                return new C7887F6[i10];
            case 12:
                return new C7895G6[i10];
            case 13:
                return new C7903H6[i10];
            case 14:
                return new C7911I6[i10];
            case 15:
                return new C7919J6[i10];
            case 16:
                return new C8067d1[i10];
            case 17:
                return new C7927K6[i10];
            case 18:
                return new C7935L6[i10];
            case 19:
                return new C7943M6[i10];
            case 20:
                return new C7951N6[i10];
            case 21:
                return new C7959O6[i10];
            case 22:
                return new C7874E1[i10];
            case 23:
                return new C8084f2[i10];
            case 24:
                return new C7891G2[i10];
            case 25:
                return new C8101h3[i10];
            case 26:
                return new C7908I3[i10];
            default:
                return new C8110i4[i10];
        }
    }
}
