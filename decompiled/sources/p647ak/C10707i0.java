package p647ak;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import ba.C11269a;
import ba.C11271c;
import ba.C11273e;
import ba.C11274f;
import bb.AbstractC11278C;
import ck.C11765b;
import com.auth0.android.jwt.C11840d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.material.datepicker.C12037b;
import com.google.android.material.datepicker.C12040e;
import com.google.android.material.datepicker.C12052q;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1009s9.C19499b;
import p1060v9.C20497o;
import p1060v9.C20498p;
import p475T9.C7282e;
import p523V9.AbstractC8191s5;
import p657b4.C11228a;
import p657b4.C11229b;
import p673c4.C11646b;
import p673c4.C11647c;
import p696d4.C13003a;
import p696d4.C13004b;
import p696d4.C13005c;
import p696d4.C13006d;
import p696d4.C13007e;
import p696d4.C13008f;
import p696d4.C13013k;
import p696d4.C13014l;
import p696d4.C13015m;
import p696d4.C13016n;
import p696d4.C13017o;
import p702da.C13050b;
import p702da.C13053e;
import p702da.C13054f;
import p702da.C13055g;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10707i0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31820a;

    public /* synthetic */ C10707i0(int i10) {
        this.f31820a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f31820a) {
            case 0:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                int iM19530m = 0;
                while (iM19530m != i10) {
                    iM19530m = AbstractC17792x.m19530m(C10710j0.class, parcel, arrayList, iM19530m, 1);
                }
                return new C10710j0(arrayList, parcel.readString(), (C18428A) parcel.readParcelable(C10710j0.class.getClassLoader()), parcel.readLong(), (AbstractC10712k0) parcel.readParcelable(C10710j0.class.getClassLoader()));
            case 1:
                return new C11228a(parcel);
            case 2:
                return new C11229b(parcel);
            case 3:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                C7282e c7282e = null;
                int iM8785m = 0;
                boolean zM8782j = false;
                long jM8786n = Long.MAX_VALUE;
                while (parcel.dataPosition() < iM8789q) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        jM8786n = AbstractC8191s5.m8786n(parcel, i11);
                    } else if (c9 == 2) {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i11);
                    } else if (c9 == 3) {
                        zM8782j = AbstractC8191s5.m8782j(parcel, i11);
                    } else if (c9 != 5) {
                        AbstractC8191s5.m8788p(parcel, i11);
                    } else {
                        c7282e = (C7282e) AbstractC8191s5.m8775c(parcel, i11, C7282e.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C11269a(jM8786n, iM8785m, zM8782j, c7282e);
            case 4:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                WorkSource workSource = new WorkSource();
                C7282e c7282e2 = null;
                boolean zM8782j2 = false;
                int iM8785m2 = 0;
                int iM8785m3 = 0;
                boolean zM8782j3 = false;
                long jM8786n2 = -1;
                float fM8783k = 0.0f;
                int iM8785m4 = Integer.MAX_VALUE;
                long jM8786n3 = Long.MAX_VALUE;
                long jM8786n4 = Long.MAX_VALUE;
                long jM8786n5 = 0;
                long jM8786n6 = 600000;
                long jM8786n7 = 3600000;
                int iM8785m5 = 102;
                while (parcel.dataPosition() < iM8789q2) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iM8785m5 = AbstractC8191s5.m8785m(parcel, i12);
                            break;
                        case 2:
                            jM8786n7 = AbstractC8191s5.m8786n(parcel, i12);
                            break;
                        case 3:
                            jM8786n6 = AbstractC8191s5.m8786n(parcel, i12);
                            break;
                        case 4:
                        case 14:
                        default:
                            AbstractC8191s5.m8788p(parcel, i12);
                            break;
                        case 5:
                            jM8786n3 = AbstractC8191s5.m8786n(parcel, i12);
                            break;
                        case 6:
                            iM8785m4 = AbstractC8191s5.m8785m(parcel, i12);
                            break;
                        case 7:
                            fM8783k = AbstractC8191s5.m8783k(parcel, i12);
                            break;
                        case '\b':
                            jM8786n5 = AbstractC8191s5.m8786n(parcel, i12);
                            break;
                        case '\t':
                            zM8782j2 = AbstractC8191s5.m8782j(parcel, i12);
                            break;
                        case '\n':
                            jM8786n4 = AbstractC8191s5.m8786n(parcel, i12);
                            break;
                        case 11:
                            jM8786n2 = AbstractC8191s5.m8786n(parcel, i12);
                            break;
                        case '\f':
                            iM8785m2 = AbstractC8191s5.m8785m(parcel, i12);
                            break;
                        case '\r':
                            iM8785m3 = AbstractC8191s5.m8785m(parcel, i12);
                            break;
                        case 15:
                            zM8782j3 = AbstractC8191s5.m8782j(parcel, i12);
                            break;
                        case 16:
                            workSource = (WorkSource) AbstractC8191s5.m8775c(parcel, i12, WorkSource.CREATOR);
                            break;
                        case 17:
                            c7282e2 = (C7282e) AbstractC8191s5.m8775c(parcel, i12, C7282e.CREATOR);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new LocationRequest(iM8785m5, jM8786n7, jM8786n6, jM8786n5, jM8786n3, jM8786n4, iM8785m4, fM8783k, zM8782j2, jM8786n2, iM8785m2, iM8785m3, zM8782j3, workSource, c7282e2);
            case 5:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j4 = false;
                ArrayList arrayListM8779g = null;
                boolean zM8782j5 = false;
                while (parcel.dataPosition() < iM8789q3) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        arrayListM8779g = AbstractC8191s5.m8779g(parcel, i13, LocationRequest.CREATOR);
                    } else if (c10 == 2) {
                        zM8782j4 = AbstractC8191s5.m8782j(parcel, i13);
                    } else if (c10 != 3) {
                        AbstractC8191s5.m8788p(parcel, i13);
                    } else {
                        zM8782j5 = AbstractC8191s5.m8782j(parcel, i13);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new C11271c(arrayListM8779g, zM8782j4, zM8782j5);
            case 6:
                int iM8789q4 = AbstractC8191s5.m8789q(parcel);
                Status status = null;
                C11274f c11274f = null;
                while (parcel.dataPosition() < iM8789q4) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        status = (Status) AbstractC8191s5.m8775c(parcel, i14, Status.CREATOR);
                    } else if (c11 != 2) {
                        AbstractC8191s5.m8788p(parcel, i14);
                    } else {
                        c11274f = (C11274f) AbstractC8191s5.m8775c(parcel, i14, C11274f.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q4);
                return new C11273e(status, c11274f);
            case 7:
                int iM8789q5 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j6 = false;
                boolean zM8782j7 = false;
                boolean zM8782j8 = false;
                boolean zM8782j9 = false;
                boolean zM8782j10 = false;
                boolean zM8782j11 = false;
                while (parcel.dataPosition() < iM8789q5) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            zM8782j6 = AbstractC8191s5.m8782j(parcel, i15);
                            break;
                        case 2:
                            zM8782j7 = AbstractC8191s5.m8782j(parcel, i15);
                            break;
                        case 3:
                            zM8782j8 = AbstractC8191s5.m8782j(parcel, i15);
                            break;
                        case 4:
                            zM8782j9 = AbstractC8191s5.m8782j(parcel, i15);
                            break;
                        case 5:
                            zM8782j10 = AbstractC8191s5.m8782j(parcel, i15);
                            break;
                        case 6:
                            zM8782j11 = AbstractC8191s5.m8782j(parcel, i15);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i15);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q5);
                return new C11274f(zM8782j6, zM8782j7, zM8782j8, zM8782j9, zM8782j10, zM8782j11);
            case 8:
                return new C11646b(parcel);
            case 9:
                return new C11647c(parcel);
            case 10:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C11765b(parcel.readString(), (AbstractC10729t) parcel.readParcelable(C11765b.class.getClassLoader()), (AbstractC10729t) parcel.readParcelable(C11765b.class.getClassLoader()), (AbstractC10729t) parcel.readParcelable(C11765b.class.getClassLoader()));
            case 11:
                return new C11840d(parcel.readString());
            case 12:
                return new C12037b((C12052q) parcel.readParcelable(C12052q.class.getClassLoader()), (C12052q) parcel.readParcelable(C12052q.class.getClassLoader()), (C12040e) parcel.readParcelable(C12040e.class.getClassLoader()), (C12052q) parcel.readParcelable(C12052q.class.getClassLoader()), parcel.readInt());
            case 13:
                return new C12040e(parcel.readLong());
            case 14:
                return C12052q.m13631a(parcel.readInt(), parcel.readInt());
            case 15:
                return new C13003a(parcel);
            case 16:
                return new C13004b(parcel);
            case 17:
                return new C13005c(parcel);
            case 18:
                return new C13006d(parcel);
            case 19:
                return new C13007e(parcel);
            case 20:
                return new C13008f(parcel);
            case 21:
                return new C13013k(parcel);
            case 22:
                return new C13014l(parcel);
            case 23:
                return new C13015m(parcel);
            case 24:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new C13016n(string, string2, AbstractC11278C.m12692u(strArrCreateStringArray));
            case 25:
                return new C13017o(parcel);
            case 26:
                int iM8789q6 = AbstractC8191s5.m8789q(parcel);
                Intent intent = null;
                int iM8785m6 = 0;
                int iM8785m7 = 0;
                while (parcel.dataPosition() < iM8789q6) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iM8785m6 = AbstractC8191s5.m8785m(parcel, i16);
                    } else if (c12 == 2) {
                        iM8785m7 = AbstractC8191s5.m8785m(parcel, i16);
                    } else if (c12 != 3) {
                        AbstractC8191s5.m8788p(parcel, i16);
                    } else {
                        intent = (Intent) AbstractC8191s5.m8775c(parcel, i16, Intent.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q6);
                return new C13050b(iM8785m6, iM8785m7, intent);
            case 27:
                int iM8789q7 = AbstractC8191s5.m8789q(parcel);
                ArrayList<String> arrayList2 = null;
                String strM8776d = null;
                while (parcel.dataPosition() < iM8789q7) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        int iM8787o = AbstractC8191s5.m8787o(parcel, i17);
                        int iDataPosition = parcel.dataPosition();
                        if (iM8787o == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iM8787o);
                            arrayList2 = arrayListCreateStringArrayList;
                        }
                    } else if (c13 != 2) {
                        AbstractC8191s5.m8788p(parcel, i17);
                    } else {
                        strM8776d = AbstractC8191s5.m8776d(parcel, i17);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q7);
                return new C13053e(strM8776d, arrayList2);
            case 28:
                int iM8789q8 = AbstractC8191s5.m8789q(parcel);
                C20497o c20497o = null;
                int iM8785m8 = 0;
                while (parcel.dataPosition() < iM8789q8) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        iM8785m8 = AbstractC8191s5.m8785m(parcel, i18);
                    } else if (c14 != 2) {
                        AbstractC8191s5.m8788p(parcel, i18);
                    } else {
                        c20497o = (C20497o) AbstractC8191s5.m8775c(parcel, i18, C20497o.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q8);
                return new C13054f(iM8785m8, c20497o);
            default:
                int iM8789q9 = AbstractC8191s5.m8789q(parcel);
                C19499b c19499b = null;
                int iM8785m9 = 0;
                C20498p c20498p = null;
                while (parcel.dataPosition() < iM8789q9) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        iM8785m9 = AbstractC8191s5.m8785m(parcel, i19);
                    } else if (c15 == 2) {
                        c19499b = (C19499b) AbstractC8191s5.m8775c(parcel, i19, C19499b.CREATOR);
                    } else if (c15 != 3) {
                        AbstractC8191s5.m8788p(parcel, i19);
                    } else {
                        c20498p = (C20498p) AbstractC8191s5.m8775c(parcel, i19, C20498p.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q9);
                return new C13055g(iM8785m9, c19499b, c20498p);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f31820a) {
            case 0:
                return new C10710j0[i10];
            case 1:
                return new C11228a[i10];
            case 2:
                return new C11229b[i10];
            case 3:
                return new C11269a[i10];
            case 4:
                return new LocationRequest[i10];
            case 5:
                return new C11271c[i10];
            case 6:
                return new C11273e[i10];
            case 7:
                return new C11274f[i10];
            case 8:
                return new C11646b[i10];
            case 9:
                return new C11647c[i10];
            case 10:
                return new C11765b[i10];
            case 11:
                return new C11840d[i10];
            case 12:
                return new C12037b[i10];
            case 13:
                return new C12040e[i10];
            case 14:
                return new C12052q[i10];
            case 15:
                return new C13003a[i10];
            case 16:
                return new C13004b[i10];
            case 17:
                return new C13005c[i10];
            case 18:
                return new C13006d[i10];
            case 19:
                return new C13007e[i10];
            case 20:
                return new C13008f[i10];
            case 21:
                return new C13013k[i10];
            case 22:
                return new C13014l[i10];
            case 23:
                return new C13015m[i10];
            case 24:
                return new C13016n[i10];
            case 25:
                return new C13017o[i10];
            case 26:
                return new C13050b[i10];
            case 27:
                return new C13053e[i10];
            case 28:
                return new C13054f[i10];
            default:
                return new C13055g[i10];
        }
    }
}
