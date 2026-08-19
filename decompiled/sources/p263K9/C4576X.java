package p263K9;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import p1009s9.C19501d;
import p408Qj.C6744j;
import p408Qj.C6745k;
import p475T9.C7282e;
import p500Ua.AbstractC7592a;
import p500Ua.C7593b;
import p508Uj.C7693a;
import p508Uj.C7697e;
import p508Uj.C7698f;
import p508Uj.C7700h;
import p508Uj.C7703k;
import p508Uj.EnumC7699g;
import p520V5.C7778g;
import p521V6.C7815h;
import p521V6.C7817j;
import p523V9.AbstractC8191s5;
import p531Vj.C8331A;
import p531Vj.C8341K;
import p531Vj.C8342L;
import p531Vj.C8377p;
import p531Vj.C8378q;
import p531Vj.C8379r;
import p531Vj.C8380s;
import p531Vj.EnumC8332B;
import p531Vj.EnumC8333C;

/* JADX INFO: renamed from: K9.X */
/* JADX INFO: loaded from: classes.dex */
public final class C4576X implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14923a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14923a) {
            case 0:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                byte[] bArrM8774b = null;
                byte[] bArrM8774b2 = null;
                byte[] bArrM8774b3 = null;
                byte[] bArrM8774b4 = null;
                byte[] bArrM8774b5 = null;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        bArrM8774b = AbstractC8191s5.m8774b(parcel, i10);
                    } else if (c9 == 3) {
                        bArrM8774b2 = AbstractC8191s5.m8774b(parcel, i10);
                    } else if (c9 == 4) {
                        bArrM8774b3 = AbstractC8191s5.m8774b(parcel, i10);
                    } else if (c9 == 5) {
                        bArrM8774b4 = AbstractC8191s5.m8774b(parcel, i10);
                    } else if (c9 != 6) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        bArrM8774b5 = AbstractC8191s5.m8774b(parcel, i10);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C4589i(bArrM8774b, bArrM8774b2, bArrM8774b3, bArrM8774b4, bArrM8774b5);
            case 1:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                byte[] bArrM8774b6 = null;
                byte[] bArrM8774b7 = null;
                byte[] bArrM8774b8 = null;
                String[] strArrM8777e = null;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 2) {
                        bArrM8774b6 = AbstractC8191s5.m8774b(parcel, i11);
                    } else if (c10 == 3) {
                        bArrM8774b7 = AbstractC8191s5.m8774b(parcel, i11);
                    } else if (c10 == 4) {
                        bArrM8774b8 = AbstractC8191s5.m8774b(parcel, i11);
                    } else if (c10 != 5) {
                        AbstractC8191s5.m8788p(parcel, i11);
                    } else {
                        strArrM8777e = AbstractC8191s5.m8777e(parcel, i11);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new C4590j(bArrM8774b6, bArrM8774b7, bArrM8774b8, strArrM8777e);
            case 2:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                int iM8785m = 0;
                String strM8776d = null;
                int iM8785m2 = 0;
                while (parcel.dataPosition() < iM8789q3) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 2) {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i12);
                    } else if (c11 == 3) {
                        strM8776d = AbstractC8191s5.m8776d(parcel, i12);
                    } else if (c11 != 4) {
                        AbstractC8191s5.m8788p(parcel, i12);
                    } else {
                        iM8785m2 = AbstractC8191s5.m8785m(parcel, i12);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new C4591k(iM8785m, iM8785m2, strM8776d);
            case 3:
                int iM8789q4 = AbstractC8191s5.m8789q(parcel);
                String strM8776d2 = null;
                Boolean boolValueOf = null;
                String strM8776d3 = null;
                String strM8776d4 = null;
                while (parcel.dataPosition() < iM8789q4) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 2) {
                        strM8776d2 = AbstractC8191s5.m8776d(parcel, i13);
                    } else if (c12 == 3) {
                        int iM8787o = AbstractC8191s5.m8787o(parcel, i13);
                        if (iM8787o == 0) {
                            boolValueOf = null;
                        } else {
                            AbstractC8191s5.m8790r(parcel, iM8787o, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c12 == 4) {
                        strM8776d3 = AbstractC8191s5.m8776d(parcel, i13);
                    } else if (c12 != 5) {
                        AbstractC8191s5.m8788p(parcel, i13);
                    } else {
                        strM8776d4 = AbstractC8191s5.m8776d(parcel, i13);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q4);
                return new C4593m(strM8776d2, boolValueOf, strM8776d3, strM8776d4);
            case 4:
                try {
                    return C4595o.m5339a(parcel.readInt());
                } catch (C4594n e10) {
                    throw new RuntimeException(e10);
                }
            case 5:
                int iM8789q5 = AbstractC8191s5.m8789q(parcel);
                byte[] bArrM8774b9 = null;
                byte[] bArrM8774b10 = null;
                byte[] bArrM8774b11 = null;
                long jM8786n = 0;
                while (parcel.dataPosition() < iM8789q5) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        jM8786n = AbstractC8191s5.m8786n(parcel, i14);
                    } else if (c13 == 2) {
                        bArrM8774b9 = AbstractC8191s5.m8774b(parcel, i14);
                    } else if (c13 == 3) {
                        bArrM8774b10 = AbstractC8191s5.m8774b(parcel, i14);
                    } else if (c13 != 4) {
                        AbstractC8191s5.m8788p(parcel, i14);
                    } else {
                        bArrM8774b11 = AbstractC8191s5.m8774b(parcel, i14);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q5);
                return new C4577Y(jM8786n, bArrM8774b9, bArrM8774b10, bArrM8774b11);
            case 6:
                int iM8789q6 = AbstractC8191s5.m8789q(parcel);
                ArrayList arrayListM8779g = null;
                while (parcel.dataPosition() < iM8789q6) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        AbstractC8191s5.m8788p(parcel, i15);
                    } else {
                        arrayListM8779g = AbstractC8191s5.m8779g(parcel, i15, C4577Y.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q6);
                return new C4578Z(arrayListM8779g);
            case 7:
                int iM8789q7 = AbstractC8191s5.m8789q(parcel);
                while (parcel.dataPosition() < iM8789q7) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        AbstractC8191s5.m8788p(parcel, i16);
                    } else {
                        AbstractC8191s5.m8782j(parcel, i16);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q7);
                return new C4580a0();
            case 8:
                try {
                    return EnumC4598r.m5340a(parcel.readInt());
                } catch (C4597q e11) {
                    throw new IllegalArgumentException(e11);
                }
            case 9:
                int iM8789q8 = AbstractC8191s5.m8789q(parcel);
                String strM8776d5 = null;
                while (parcel.dataPosition() < iM8789q8) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        AbstractC8191s5.m8788p(parcel, i17);
                    } else {
                        strM8776d5 = AbstractC8191s5.m8776d(parcel, i17);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q8);
                return new C4599s(strM8776d5);
            case 10:
                return new ParcelImpl(parcel);
            case 11:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C6744j.f21649Y;
            case 12:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C6745k(parcel.readParcelable(C6745k.class.getClassLoader()), (StepStyle) parcel.readParcelable(C6745k.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                int iM8789q9 = AbstractC8191s5.m8789q(parcel);
                String strM8776d6 = null;
                String strM8776d7 = null;
                String strM8776d8 = null;
                ArrayList arrayListM8779g2 = null;
                C7282e c7282e = null;
                int iM8785m3 = 0;
                while (parcel.dataPosition() < iM8789q9) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        iM8785m3 = AbstractC8191s5.m8785m(parcel, i18);
                    } else if (c14 == 3) {
                        strM8776d6 = AbstractC8191s5.m8776d(parcel, i18);
                    } else if (c14 == 4) {
                        strM8776d7 = AbstractC8191s5.m8776d(parcel, i18);
                    } else if (c14 == 6) {
                        strM8776d8 = AbstractC8191s5.m8776d(parcel, i18);
                    } else if (c14 == 7) {
                        c7282e = (C7282e) AbstractC8191s5.m8775c(parcel, i18, C7282e.CREATOR);
                    } else if (c14 != '\b') {
                        AbstractC8191s5.m8788p(parcel, i18);
                    } else {
                        arrayListM8779g2 = AbstractC8191s5.m8779g(parcel, i18, C19501d.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q9);
                return new C7282e(iM8785m3, strM8776d6, strM8776d7, strM8776d8, arrayListM8779g2, c7282e);
            case 14:
                return new C7593b((PendingIntent) parcel.readParcelable(AbstractC7592a.class.getClassLoader()), parcel.readInt() != 0);
            case 15:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C7693a(parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            case 16:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C7697e.f24244Y;
            case 17:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C7698f(parcel.readString(), EnumC7699g.valueOf(parcel.readString()));
            case 18:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C7700h((Uri) parcel.readParcelable(C7700h.class.getClassLoader()), (Uri) parcel.readParcelable(C7700h.class.getClassLoader()), (Uri) parcel.readParcelable(C7700h.class.getClassLoader()));
            case 19:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C7703k(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                C7778g c7778g = new C7778g(parcel);
                c7778g.f24564Y = parcel.readString();
                c7778g.f24566o0 = parcel.readFloat();
                c7778g.f24567p0 = parcel.readInt() == 1;
                c7778g.f24568q0 = parcel.readString();
                c7778g.f24569r0 = parcel.readInt();
                c7778g.f24570s0 = parcel.readInt();
                return c7778g;
            case 21:
                return new C7815h(parcel);
            case 22:
                return new C7817j(parcel);
            case 23:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8377p.f26078Y;
            case 24:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8378q.f26079Y;
            case 25:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8379r.f26080Y;
            case 26:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8380s.f26081Y;
            case 27:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C8331A(EnumC8332B.valueOf(parcel.readString()), EnumC8333C.valueOf(parcel.readString()));
            case 28:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8341K.f25997Y;
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8342L.f25998Y;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f14923a) {
            case 0:
                return new C4589i[i10];
            case 1:
                return new C4590j[i10];
            case 2:
                return new C4591k[i10];
            case 3:
                return new C4593m[i10];
            case 4:
                return new C4595o[i10];
            case 5:
                return new C4577Y[i10];
            case 6:
                return new C4578Z[i10];
            case 7:
                return new C4580a0[i10];
            case 8:
                return new EnumC4598r[i10];
            case 9:
                return new C4599s[i10];
            case 10:
                return new ParcelImpl[i10];
            case 11:
                return new C6744j[i10];
            case 12:
                return new C6745k[i10];
            case 13:
                return new C7282e[i10];
            case 14:
                return new AbstractC7592a[i10];
            case 15:
                return new C7693a[i10];
            case 16:
                return new C7697e[i10];
            case 17:
                return new C7698f[i10];
            case 18:
                return new C7700h[i10];
            case 19:
                return new C7703k[i10];
            case 20:
                return new C7778g[i10];
            case 21:
                return new C7815h[i10];
            case 22:
                return new C7817j[i10];
            case 23:
                return new C8377p[i10];
            case 24:
                return new C8378q[i10];
            case 25:
                return new C8379r[i10];
            case 26:
                return new C8380s[i10];
            case 27:
                return new C8331A[i10];
            case 28:
                return new C8341K[i10];
            default:
                return new C8342L[i10];
        }
    }
}
