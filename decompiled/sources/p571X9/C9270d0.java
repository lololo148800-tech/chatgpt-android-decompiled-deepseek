package p571X9;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p523V9.AbstractC8191s5;

/* JADX INFO: renamed from: X9.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9270d0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28057a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f28057a) {
            case 0:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                PointF[] pointFArr = null;
                int iM8785m = 0;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        pointFArr = (PointF[]) AbstractC8191s5.m8778f(parcel, i10, PointF.CREATOR);
                    } else if (c9 != 3) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i10);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C9132G(pointFArr, iM8785m);
            case 1:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                int iM8785m2 = 0;
                int iM8785m3 = 0;
                float fM8783k = 0.0f;
                float fM8783k2 = 0.0f;
                float fM8783k3 = 0.0f;
                float fM8783k4 = 0.0f;
                float fM8783k5 = 0.0f;
                float fM8783k6 = 0.0f;
                float fM8783k7 = 0.0f;
                float fM8783k8 = Float.MAX_VALUE;
                float fM8783k9 = Float.MAX_VALUE;
                float fM8783k10 = Float.MAX_VALUE;
                C9370t4[] c9370t4Arr = null;
                C9132G[] c9132gArr = null;
                float fM8783k11 = -1.0f;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iM8785m2 = AbstractC8191s5.m8785m(parcel, i11);
                            break;
                        case 2:
                            iM8785m3 = AbstractC8191s5.m8785m(parcel, i11);
                            break;
                        case 3:
                            fM8783k = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case 4:
                            fM8783k2 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case 5:
                            fM8783k3 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case 6:
                            fM8783k4 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case 7:
                            fM8783k8 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case '\b':
                            fM8783k9 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case '\t':
                            c9370t4Arr = (C9370t4[]) AbstractC8191s5.m8778f(parcel, i11, C9370t4.CREATOR);
                            break;
                        case '\n':
                            fM8783k5 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case 11:
                            fM8783k6 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case '\f':
                            fM8783k7 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case '\r':
                            c9132gArr = (C9132G[]) AbstractC8191s5.m8778f(parcel, i11, C9132G.CREATOR);
                            break;
                        case 14:
                            fM8783k10 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case 15:
                            fM8783k11 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i11);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new C9127F0(iM8785m2, iM8785m3, fM8783k, fM8783k2, fM8783k3, fM8783k4, fM8783k8, fM8783k9, fM8783k10, c9370t4Arr, fM8783k5, fM8783k6, fM8783k7, c9132gArr, fM8783k11);
            case 2:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                int iM8785m4 = 0;
                int iM8785m5 = 0;
                int iM8785m6 = 0;
                boolean zM8782j = false;
                boolean zM8782j2 = false;
                float fM8783k12 = -1.0f;
                while (parcel.dataPosition() < iM8789q3) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            iM8785m4 = AbstractC8191s5.m8785m(parcel, i12);
                            break;
                        case 3:
                            iM8785m5 = AbstractC8191s5.m8785m(parcel, i12);
                            break;
                        case 4:
                            iM8785m6 = AbstractC8191s5.m8785m(parcel, i12);
                            break;
                        case 5:
                            zM8782j = AbstractC8191s5.m8782j(parcel, i12);
                            break;
                        case 6:
                            zM8782j2 = AbstractC8191s5.m8782j(parcel, i12);
                            break;
                        case 7:
                            fM8783k12 = AbstractC8191s5.m8783k(parcel, i12);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i12);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new C9134G1(iM8785m4, iM8785m5, iM8785m6, zM8782j, zM8782j2, fM8783k12);
            case 3:
                int iM8789q4 = AbstractC8191s5.m8789q(parcel);
                int iM8785m7 = 0;
                float fM8783k13 = 0.0f;
                float fM8783k14 = 0.0f;
                int iM8785m8 = 0;
                while (parcel.dataPosition() < iM8789q4) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iM8785m7 = AbstractC8191s5.m8785m(parcel, i13);
                    } else if (c10 == 2) {
                        fM8783k13 = AbstractC8191s5.m8783k(parcel, i13);
                    } else if (c10 == 3) {
                        fM8783k14 = AbstractC8191s5.m8783k(parcel, i13);
                    } else if (c10 != 4) {
                        AbstractC8191s5.m8788p(parcel, i13);
                    } else {
                        iM8785m8 = AbstractC8191s5.m8785m(parcel, i13);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q4);
                return new C9370t4(fM8783k13, fM8783k14, iM8785m7, iM8785m8);
            case 4:
                int iM8789q5 = AbstractC8191s5.m8789q(parcel);
                int iM8785m9 = 0;
                ArrayList arrayListM8779g = null;
                while (parcel.dataPosition() < iM8789q5) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iM8785m9 = AbstractC8191s5.m8785m(parcel, i14);
                    } else if (c11 != 2) {
                        AbstractC8191s5.m8788p(parcel, i14);
                    } else {
                        arrayListM8779g = AbstractC8191s5.m8779g(parcel, i14, PointF.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q5);
                return new C9197Q4(iM8785m9, arrayListM8779g);
            case 5:
                int iM8789q6 = AbstractC8191s5.m8789q(parcel);
                int iM8785m10 = 0;
                int iM8785m11 = 0;
                int iM8785m12 = 0;
                int iM8785m13 = 0;
                boolean zM8782j3 = false;
                float fM8783k15 = 0.0f;
                while (parcel.dataPosition() < iM8789q6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iM8785m10 = AbstractC8191s5.m8785m(parcel, i15);
                            break;
                        case 2:
                            iM8785m11 = AbstractC8191s5.m8785m(parcel, i15);
                            break;
                        case 3:
                            iM8785m12 = AbstractC8191s5.m8785m(parcel, i15);
                            break;
                        case 4:
                            iM8785m13 = AbstractC8191s5.m8785m(parcel, i15);
                            break;
                        case 5:
                            zM8782j3 = AbstractC8191s5.m8782j(parcel, i15);
                            break;
                        case 6:
                            fM8783k15 = AbstractC8191s5.m8783k(parcel, i15);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i15);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q6);
                return new C9202R4(iM8785m10, iM8785m11, iM8785m12, iM8785m13, zM8782j3, fM8783k15);
            case 6:
                int iM8789q7 = AbstractC8191s5.m8789q(parcel);
                int iM8785m14 = 0;
                Rect rect = null;
                ArrayList arrayListM8779g2 = null;
                ArrayList arrayListM8779g3 = null;
                float fM8783k16 = 0.0f;
                float fM8783k17 = 0.0f;
                float fM8783k18 = 0.0f;
                float fM8783k19 = 0.0f;
                float fM8783k20 = 0.0f;
                float fM8783k21 = 0.0f;
                float fM8783k22 = 0.0f;
                while (parcel.dataPosition() < iM8789q7) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iM8785m14 = AbstractC8191s5.m8785m(parcel, i16);
                            break;
                        case 2:
                            rect = (Rect) AbstractC8191s5.m8775c(parcel, i16, Rect.CREATOR);
                            break;
                        case 3:
                            fM8783k16 = AbstractC8191s5.m8783k(parcel, i16);
                            break;
                        case 4:
                            fM8783k17 = AbstractC8191s5.m8783k(parcel, i16);
                            break;
                        case 5:
                            fM8783k18 = AbstractC8191s5.m8783k(parcel, i16);
                            break;
                        case 6:
                            fM8783k19 = AbstractC8191s5.m8783k(parcel, i16);
                            break;
                        case 7:
                            fM8783k20 = AbstractC8191s5.m8783k(parcel, i16);
                            break;
                        case '\b':
                            fM8783k21 = AbstractC8191s5.m8783k(parcel, i16);
                            break;
                        case '\t':
                            fM8783k22 = AbstractC8191s5.m8783k(parcel, i16);
                            break;
                        case '\n':
                            arrayListM8779g2 = AbstractC8191s5.m8779g(parcel, i16, C9244Y4.CREATOR);
                            break;
                        case 11:
                            arrayListM8779g3 = AbstractC8191s5.m8779g(parcel, i16, C9197Q4.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i16);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q7);
                return new C9208S4(iM8785m14, rect, fM8783k16, fM8783k17, fM8783k18, fM8783k19, fM8783k20, fM8783k21, fM8783k22, arrayListM8779g2, arrayListM8779g3);
            case 7:
                int iM8789q8 = AbstractC8191s5.m8789q(parcel);
                int iM8785m15 = 0;
                PointF pointF = null;
                while (parcel.dataPosition() < iM8789q8) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        iM8785m15 = AbstractC8191s5.m8785m(parcel, i17);
                    } else if (c12 != 2) {
                        AbstractC8191s5.m8788p(parcel, i17);
                    } else {
                        pointF = (PointF) AbstractC8191s5.m8775c(parcel, i17, PointF.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q8);
                return new C9244Y4(iM8785m15, pointF);
            default:
                int iM8789q9 = AbstractC8191s5.m8789q(parcel);
                int iM8785m16 = 0;
                int iM8785m17 = 0;
                int iM8785m18 = 0;
                int iM8785m19 = 0;
                long jM8786n = 0;
                while (parcel.dataPosition() < iM8789q9) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 2) {
                        iM8785m16 = AbstractC8191s5.m8785m(parcel, i18);
                    } else if (c13 == 3) {
                        iM8785m17 = AbstractC8191s5.m8785m(parcel, i18);
                    } else if (c13 == 4) {
                        iM8785m18 = AbstractC8191s5.m8785m(parcel, i18);
                    } else if (c13 == 5) {
                        jM8786n = AbstractC8191s5.m8786n(parcel, i18);
                    } else if (c13 != 6) {
                        AbstractC8191s5.m8788p(parcel, i18);
                    } else {
                        iM8785m19 = AbstractC8191s5.m8785m(parcel, i18);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q9);
                return new C9226V4(iM8785m16, iM8785m17, iM8785m18, jM8786n, iM8785m19);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f28057a) {
            case 0:
                return new C9132G[i10];
            case 1:
                return new C9127F0[i10];
            case 2:
                return new C9134G1[i10];
            case 3:
                return new C9370t4[i10];
            case 4:
                return new C9197Q4[i10];
            case 5:
                return new C9202R4[i10];
            case 6:
                return new C9208S4[i10];
            case 7:
                return new C9244Y4[i10];
            default:
                return new C9226V4[i10];
        }
    }
}
