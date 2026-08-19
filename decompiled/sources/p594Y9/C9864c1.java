package p594Y9;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p523V9.AbstractC8191s5;

/* JADX INFO: renamed from: Y9.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C9864c1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29373a;

    public /* synthetic */ C9864c1(int i10) {
        this.f29373a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f29373a) {
            case 0:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                int iM8785m = 0;
                int iM8785m2 = 0;
                int iM8785m3 = 0;
                int iM8785m4 = 0;
                float fM8783k = 0.0f;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i10);
                    } else if (c9 == 3) {
                        iM8785m2 = AbstractC8191s5.m8785m(parcel, i10);
                    } else if (c9 == 4) {
                        iM8785m3 = AbstractC8191s5.m8785m(parcel, i10);
                    } else if (c9 == 5) {
                        iM8785m4 = AbstractC8191s5.m8785m(parcel, i10);
                    } else if (c9 != 6) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        fM8783k = AbstractC8191s5.m8783k(parcel, i10);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C9700B0(iM8785m, iM8785m2, iM8785m3, iM8785m4, fM8783k);
            case 1:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                C9875d5[] c9875d5Arr = null;
                C9700B0 c9700b0 = null;
                C9700B0 c9700b1 = null;
                C9700B0 c9700b2 = null;
                String strM8776d = null;
                String strM8776d2 = null;
                float fM8783k2 = 0.0f;
                int iM8785m5 = 0;
                boolean zM8782j = false;
                int iM8785m6 = 0;
                int iM8785m7 = 0;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            c9875d5Arr = (C9875d5[]) AbstractC8191s5.m8778f(parcel, i11, C9875d5.CREATOR);
                            break;
                        case 3:
                            c9700b0 = (C9700B0) AbstractC8191s5.m8775c(parcel, i11, C9700B0.CREATOR);
                            break;
                        case 4:
                            c9700b1 = (C9700B0) AbstractC8191s5.m8775c(parcel, i11, C9700B0.CREATOR);
                            break;
                        case 5:
                            c9700b2 = (C9700B0) AbstractC8191s5.m8775c(parcel, i11, C9700B0.CREATOR);
                            break;
                        case 6:
                            strM8776d = AbstractC8191s5.m8776d(parcel, i11);
                            break;
                        case 7:
                            fM8783k2 = AbstractC8191s5.m8783k(parcel, i11);
                            break;
                        case '\b':
                            strM8776d2 = AbstractC8191s5.m8776d(parcel, i11);
                            break;
                        case '\t':
                            iM8785m5 = AbstractC8191s5.m8785m(parcel, i11);
                            break;
                        case '\n':
                            zM8782j = AbstractC8191s5.m8782j(parcel, i11);
                            break;
                        case 11:
                            iM8785m6 = AbstractC8191s5.m8785m(parcel, i11);
                            break;
                        case '\f':
                            iM8785m7 = AbstractC8191s5.m8785m(parcel, i11);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i11);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new C10002y3(c9875d5Arr, c9700b0, c9700b1, c9700b2, strM8776d, fM8783k2, strM8776d2, iM8785m5, zM8782j, iM8785m6, iM8785m7);
            case 2:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                while (parcel.dataPosition() < iM8789q3) {
                    AbstractC8191s5.m8788p(parcel, parcel.readInt());
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new C9967s4();
            case 3:
                int iM8789q4 = AbstractC8191s5.m8789q(parcel);
                String strM8776d3 = null;
                Rect rect = null;
                ArrayList arrayListM8779g = null;
                String strM8776d4 = null;
                ArrayList arrayListM8779g2 = null;
                while (parcel.dataPosition() < iM8789q4) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        strM8776d3 = AbstractC8191s5.m8776d(parcel, i12);
                    } else if (c10 == 2) {
                        rect = (Rect) AbstractC8191s5.m8775c(parcel, i12, Rect.CREATOR);
                    } else if (c10 == 3) {
                        arrayListM8779g = AbstractC8191s5.m8779g(parcel, i12, Point.CREATOR);
                    } else if (c10 == 4) {
                        strM8776d4 = AbstractC8191s5.m8776d(parcel, i12);
                    } else if (c10 != 5) {
                        AbstractC8191s5.m8788p(parcel, i12);
                    } else {
                        arrayListM8779g2 = AbstractC8191s5.m8779g(parcel, i12, C9854a5.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q4);
                return new C9841Y4(strM8776d3, rect, arrayListM8779g, strM8776d4, arrayListM8779g2);
            case 4:
                int iM8789q5 = AbstractC8191s5.m8789q(parcel);
                Rect rect2 = null;
                String strM8776d5 = null;
                String strM8776d6 = null;
                ArrayList arrayListM8779g3 = null;
                ArrayList arrayListM8779g4 = null;
                float fM8783k3 = 0.0f;
                float fM8783k4 = 0.0f;
                while (parcel.dataPosition() < iM8789q5) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strM8776d5 = AbstractC8191s5.m8776d(parcel, i13);
                            break;
                        case 2:
                            rect2 = (Rect) AbstractC8191s5.m8775c(parcel, i13, Rect.CREATOR);
                            break;
                        case 3:
                            arrayListM8779g3 = AbstractC8191s5.m8779g(parcel, i13, Point.CREATOR);
                            break;
                        case 4:
                            strM8776d6 = AbstractC8191s5.m8776d(parcel, i13);
                            break;
                        case 5:
                            fM8783k3 = AbstractC8191s5.m8783k(parcel, i13);
                            break;
                        case 6:
                            fM8783k4 = AbstractC8191s5.m8783k(parcel, i13);
                            break;
                        case 7:
                            arrayListM8779g4 = AbstractC8191s5.m8779g(parcel, i13, C9868c5.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i13);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q5);
                return new C9847Z4(fM8783k3, fM8783k4, rect2, strM8776d5, strM8776d6, arrayListM8779g3, arrayListM8779g4);
            case 5:
                int iM8789q6 = AbstractC8191s5.m8789q(parcel);
                Rect rect3 = null;
                String strM8776d7 = null;
                String strM8776d8 = null;
                ArrayList arrayListM8779g5 = null;
                ArrayList arrayListM8779g6 = null;
                float fM8783k5 = 0.0f;
                float fM8783k6 = 0.0f;
                while (parcel.dataPosition() < iM8789q6) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strM8776d7 = AbstractC8191s5.m8776d(parcel, i14);
                            break;
                        case 2:
                            rect3 = (Rect) AbstractC8191s5.m8775c(parcel, i14, Rect.CREATOR);
                            break;
                        case 3:
                            arrayListM8779g5 = AbstractC8191s5.m8779g(parcel, i14, Point.CREATOR);
                            break;
                        case 4:
                            strM8776d8 = AbstractC8191s5.m8776d(parcel, i14);
                            break;
                        case 5:
                            arrayListM8779g6 = AbstractC8191s5.m8779g(parcel, i14, C9847Z4.CREATOR);
                            break;
                        case 6:
                            fM8783k5 = AbstractC8191s5.m8783k(parcel, i14);
                            break;
                        case 7:
                            fM8783k6 = AbstractC8191s5.m8783k(parcel, i14);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i14);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q6);
                return new C9854a5(fM8783k5, fM8783k6, rect3, strM8776d7, strM8776d8, arrayListM8779g5, arrayListM8779g6);
            case 6:
                int iM8789q7 = AbstractC8191s5.m8789q(parcel);
                String strM8776d9 = null;
                ArrayList arrayListM8779g7 = null;
                while (parcel.dataPosition() < iM8789q7) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        strM8776d9 = AbstractC8191s5.m8776d(parcel, i15);
                    } else if (c11 != 2) {
                        AbstractC8191s5.m8788p(parcel, i15);
                    } else {
                        arrayListM8779g7 = AbstractC8191s5.m8779g(parcel, i15, C9841Y4.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q7);
                return new C9861b5(strM8776d9, arrayListM8779g7);
            case 7:
                int iM8789q8 = AbstractC8191s5.m8789q(parcel);
                String strM8776d10 = null;
                Rect rect4 = null;
                ArrayList arrayListM8779g8 = null;
                float fM8783k7 = 0.0f;
                float fM8783k8 = 0.0f;
                while (parcel.dataPosition() < iM8789q8) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        strM8776d10 = AbstractC8191s5.m8776d(parcel, i16);
                    } else if (c12 == 2) {
                        rect4 = (Rect) AbstractC8191s5.m8775c(parcel, i16, Rect.CREATOR);
                    } else if (c12 == 3) {
                        arrayListM8779g8 = AbstractC8191s5.m8779g(parcel, i16, Point.CREATOR);
                    } else if (c12 == 4) {
                        fM8783k7 = AbstractC8191s5.m8783k(parcel, i16);
                    } else if (c12 != 5) {
                        AbstractC8191s5.m8788p(parcel, i16);
                    } else {
                        fM8783k8 = AbstractC8191s5.m8783k(parcel, i16);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q8);
                return new C9868c5(strM8776d10, rect4, arrayListM8779g8, fM8783k7, fM8783k8);
            case 8:
                int iM8789q9 = AbstractC8191s5.m8789q(parcel);
                String strM8776d11 = null;
                while (parcel.dataPosition() < iM8789q9) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        AbstractC8191s5.m8788p(parcel, i17);
                    } else {
                        strM8776d11 = AbstractC8191s5.m8776d(parcel, i17);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q9);
                return new C9835X4(strM8776d11);
            default:
                int iM8789q10 = AbstractC8191s5.m8789q(parcel);
                C9967s4[] c9967s4Arr = null;
                C9700B0 c9700b3 = null;
                C9700B0 c9700b4 = null;
                String strM8776d12 = null;
                String strM8776d13 = null;
                float fM8783k9 = 0.0f;
                boolean zM8782j2 = false;
                while (parcel.dataPosition() < iM8789q10) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            c9967s4Arr = (C9967s4[]) AbstractC8191s5.m8778f(parcel, i18, C9967s4.CREATOR);
                            break;
                        case 3:
                            c9700b3 = (C9700B0) AbstractC8191s5.m8775c(parcel, i18, C9700B0.CREATOR);
                            break;
                        case 4:
                            c9700b4 = (C9700B0) AbstractC8191s5.m8775c(parcel, i18, C9700B0.CREATOR);
                            break;
                        case 5:
                            strM8776d12 = AbstractC8191s5.m8776d(parcel, i18);
                            break;
                        case 6:
                            fM8783k9 = AbstractC8191s5.m8783k(parcel, i18);
                            break;
                        case 7:
                            strM8776d13 = AbstractC8191s5.m8776d(parcel, i18);
                            break;
                        case '\b':
                            zM8782j2 = AbstractC8191s5.m8782j(parcel, i18);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i18);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q10);
                return new C9875d5(c9967s4Arr, c9700b3, c9700b4, strM8776d12, fM8783k9, strM8776d13, zM8782j2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f29373a) {
            case 0:
                return new C9700B0[i10];
            case 1:
                return new C10002y3[i10];
            case 2:
                return new C9967s4[i10];
            case 3:
                return new C9841Y4[i10];
            case 4:
                return new C9847Z4[i10];
            case 5:
                return new C9854a5[i10];
            case 6:
                return new C9861b5[i10];
            case 7:
                return new C9868c5[i10];
            case 8:
                return new C9835X4[i10];
            default:
                return new C9875d5[i10];
        }
    }
}
