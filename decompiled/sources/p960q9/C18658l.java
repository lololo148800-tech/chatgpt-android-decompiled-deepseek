package p960q9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import p049Bm.InterfaceC1426a;
import p1009s9.C19499b;
import p1009s9.C19501d;
import p1016t3.C19753C;
import p1016t3.C19784k;
import p1016t3.C19785l;
import p1033u5.C20116a;
import p1044uj.AbstractC20340i;
import p1044uj.C20329c0;
import p1044uj.C20331d0;
import p1044uj.C20333e0;
import p1044uj.C20336g;
import p1044uj.C20338h;
import p1044uj.C20350n;
import p1044uj.C20362t;
import p1044uj.C20365u0;
import p1044uj.C20370z;
import p1044uj.EnumC20324a;
import p1044uj.EnumC20327b0;
import p1044uj.EnumC20335f0;
import p1060v9.C20486d;
import p1060v9.C20487e;
import p1060v9.C20490h;
import p1060v9.C20492j;
import p1060v9.C20493k;
import p1060v9.C20497o;
import p1060v9.C20498p;
import p1060v9.C20508z;
import p1087wj.C20972C;
import p523V9.AbstractC8191s5;
import p523V9.AbstractC8199t5;
import p911o0.AbstractC17792x;
import p994rk.C19067A1;
import p999s.C19302K;
import pk.C18500e;
import qa.C18659a;
import sk.C19664c;

/* JADX INFO: renamed from: q9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C18658l implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59415a;

    public /* synthetic */ C18658l(int i10) {
        this.f59415a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static void m20035a(C20487e c20487e, Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        int i11 = c20487e.f65040Y;
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(i11);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(c20487e.f65041Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(c20487e.f65042o0);
        AbstractC8199t5.m8807f(parcel, 4, c20487e.f65043p0);
        AbstractC8199t5.m8805d(parcel, 5, c20487e.f65044q0);
        AbstractC8199t5.m8809h(parcel, 6, c20487e.f65045r0, i10);
        AbstractC8199t5.m8803b(parcel, 7, c20487e.f65046s0);
        AbstractC8199t5.m8806e(parcel, 8, c20487e.f65047t0, i10);
        AbstractC8199t5.m8809h(parcel, 10, c20487e.f65048u0, i10);
        AbstractC8199t5.m8809h(parcel, 11, c20487e.f65049v0, i10);
        AbstractC8199t5.m8813l(parcel, 12, 4);
        parcel.writeInt(c20487e.f65050w0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 13, 4);
        parcel.writeInt(c20487e.f65051x0);
        boolean z6 = c20487e.f65052y0;
        AbstractC8199t5.m8813l(parcel, 14, 4);
        parcel.writeInt(z6 ? 1 : 0);
        AbstractC8199t5.m8807f(parcel, 15, c20487e.f65053z0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f59415a) {
            case 0:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                String strM8776d = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        strM8776d = AbstractC8191s5.m8776d(parcel, i10);
                    } else if (c9 != 5) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) AbstractC8191s5.m8775c(parcel, i10, GoogleSignInOptions.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new SignInConfiguration(strM8776d, googleSignInOptions);
            case 1:
                C18659a c18659a = new C18659a(parcel);
                c18659a.f59416Y = ((Integer) parcel.readValue(C18659a.class.getClassLoader())).intValue();
                return c18659a;
            case 2:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C19067A1(parcel.readString(), parcel.readString());
            case 3:
                C19302K c19302k = new C19302K(parcel);
                c19302k.f61160Y = parcel.readByte() != 0;
                return c19302k;
            case 4:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                PendingIntent pendingIntent = null;
                int iM8785m = 0;
                int iM8785m2 = 0;
                String strM8776d2 = null;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i11);
                    } else if (c10 == 2) {
                        iM8785m2 = AbstractC8191s5.m8785m(parcel, i11);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) AbstractC8191s5.m8775c(parcel, i11, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        AbstractC8191s5.m8788p(parcel, i11);
                    } else {
                        strM8776d2 = AbstractC8191s5.m8776d(parcel, i11);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new C19499b(iM8785m, iM8785m2, pendingIntent, strM8776d2);
            case 5:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                long jM8786n = -1;
                int iM8785m3 = 0;
                String strM8776d3 = null;
                while (parcel.dataPosition() < iM8789q3) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        strM8776d3 = AbstractC8191s5.m8776d(parcel, i12);
                    } else if (c11 == 2) {
                        iM8785m3 = AbstractC8191s5.m8785m(parcel, i12);
                    } else if (c11 != 3) {
                        AbstractC8191s5.m8788p(parcel, i12);
                    } else {
                        jM8786n = AbstractC8191s5.m8786n(parcel, i12);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new C19501d(jM8786n, strM8776d3, iM8785m3);
            case 6:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C19664c((Uri) parcel.readParcelable(C19664c.class.getClassLoader()), (Uri) parcel.readParcelable(C19664c.class.getClassLoader()), (Uri) parcel.readParcelable(C19664c.class.getClassLoader()));
            case 7:
                return new C19785l(parcel);
            case 8:
                return new C19784k(parcel);
            case 9:
                return new C19753C(parcel);
            case 10:
                int iM8789q4 = AbstractC8191s5.m8789q(parcel);
                String strM8776d4 = null;
                int iM8785m4 = 0;
                while (parcel.dataPosition() < iM8789q4) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        iM8785m4 = AbstractC8191s5.m8785m(parcel, i13);
                    } else if (c12 != 2) {
                        AbstractC8191s5.m8788p(parcel, i13);
                    } else {
                        strM8776d4 = AbstractC8191s5.m8776d(parcel, i13);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q4);
                return new Scope(iM8785m4, strM8776d4);
            case 11:
                int iM8789q5 = AbstractC8191s5.m8789q(parcel);
                String strM8776d5 = null;
                C19499b c19499b = null;
                int iM8785m5 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iM8789q5) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        iM8785m5 = AbstractC8191s5.m8785m(parcel, i14);
                    } else if (c13 == 2) {
                        strM8776d5 = AbstractC8191s5.m8776d(parcel, i14);
                    } else if (c13 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC8191s5.m8775c(parcel, i14, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        AbstractC8191s5.m8788p(parcel, i14);
                    } else {
                        c19499b = (C19499b) AbstractC8191s5.m8775c(parcel, i14, C19499b.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q5);
                return new Status(iM8785m5, strM8776d5, pendingIntent2, c19499b);
            case 12:
                String string = parcel.readString();
                AbstractC16544l.m18091d(string);
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    String string2 = parcel.readString();
                    AbstractC16544l.m18091d(string2);
                    String string3 = parcel.readString();
                    AbstractC16544l.m18091d(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new C20116a(string, linkedHashMap);
            case 13:
                AbstractC16544l.m18094g(parcel, "parcel");
                return EnumC20324a.valueOf(parcel.readString());
            case 14:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C20336g(parcel.readString(), EnumC20324a.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 15:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C20338h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                AbstractC16544l.m18094g(parcel, "parcel");
                C18500e c18500e = (C18500e) parcel.readParcelable(C20350n.class.getClassLoader());
                int i17 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new C20350n(c18500e, arrayList, (C17280a) parcel.readParcelable(C20350n.class.getClassLoader()), (InterfaceC1426a) parcel.readSerializable(), (InterfaceC1426a) parcel.readSerializable());
            case 17:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C20362t(C20370z.CREATOR.createFromParcel(parcel), C20365u0.CREATOR.createFromParcel(parcel));
            case 18:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                int iM19530m = 0;
                while (iM19530m != i19) {
                    iM19530m = AbstractC17792x.m19530m(C20329c0.class, parcel, arrayList2, iM19530m, 1);
                }
                return new C20329c0(arrayList2, parcel.readString(), EnumC20327b0.valueOf(parcel.readString()), EnumC20335f0.valueOf(parcel.readString()), (AbstractC20340i) parcel.readParcelable(C20329c0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            case 19:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C20331d0(EnumC20327b0.valueOf(parcel.readString()), EnumC20335f0.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 20:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i20 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i20);
                int iM19530m2 = 0;
                while (iM19530m2 != i20) {
                    iM19530m2 = AbstractC17792x.m19530m(C20333e0.class, parcel, arrayList3, iM19530m2, 1);
                }
                return new C20333e0(arrayList3, parcel.readString(), EnumC20335f0.valueOf(parcel.readString()), parcel.readString());
            case 21:
                int iM8789q6 = AbstractC8191s5.m8789q(parcel);
                ArrayList arrayListM8779g = null;
                int iM8785m6 = 0;
                while (parcel.dataPosition() < iM8789q6) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        iM8785m6 = AbstractC8191s5.m8785m(parcel, i21);
                    } else if (c14 != 2) {
                        AbstractC8191s5.m8788p(parcel, i21);
                    } else {
                        arrayListM8779g = AbstractC8191s5.m8779g(parcel, i21, C20490h.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q6);
                return new C20493k(iM8785m6, arrayListM8779g);
            case 22:
                int iM8789q7 = AbstractC8191s5.m8789q(parcel);
                int iM8785m7 = -1;
                int iM8785m8 = 0;
                int iM8785m9 = 0;
                int iM8785m10 = 0;
                int iM8785m11 = 0;
                String strM8776d6 = null;
                String strM8776d7 = null;
                long jM8786n2 = 0;
                long jM8786n3 = 0;
                while (parcel.dataPosition() < iM8789q7) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            iM8785m8 = AbstractC8191s5.m8785m(parcel, i22);
                            break;
                        case 2:
                            iM8785m9 = AbstractC8191s5.m8785m(parcel, i22);
                            break;
                        case 3:
                            iM8785m10 = AbstractC8191s5.m8785m(parcel, i22);
                            break;
                        case 4:
                            jM8786n2 = AbstractC8191s5.m8786n(parcel, i22);
                            break;
                        case 5:
                            jM8786n3 = AbstractC8191s5.m8786n(parcel, i22);
                            break;
                        case 6:
                            strM8776d6 = AbstractC8191s5.m8776d(parcel, i22);
                            break;
                        case 7:
                            strM8776d7 = AbstractC8191s5.m8776d(parcel, i22);
                            break;
                        case '\b':
                            iM8785m11 = AbstractC8191s5.m8785m(parcel, i22);
                            break;
                        case '\t':
                            iM8785m7 = AbstractC8191s5.m8785m(parcel, i22);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i22);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q7);
                return new C20490h(iM8785m8, iM8785m9, iM8785m10, jM8786n2, jM8786n3, strM8776d6, strM8776d7, iM8785m11, iM8785m7);
            case 23:
                int iM8789q8 = AbstractC8191s5.m8789q(parcel);
                Account account = null;
                int iM8785m12 = 0;
                int iM8785m13 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM8789q8) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 1) {
                        iM8785m12 = AbstractC8191s5.m8785m(parcel, i23);
                    } else if (c15 == 2) {
                        account = (Account) AbstractC8191s5.m8775c(parcel, i23, Account.CREATOR);
                    } else if (c15 == 3) {
                        iM8785m13 = AbstractC8191s5.m8785m(parcel, i23);
                    } else if (c15 != 4) {
                        AbstractC8191s5.m8788p(parcel, i23);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC8191s5.m8775c(parcel, i23, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q8);
                return new C20497o(iM8785m12, account, iM8785m13, googleSignInAccount);
            case 24:
                int iM8789q9 = AbstractC8191s5.m8789q(parcel);
                int iM8785m14 = 0;
                boolean zM8782j = false;
                boolean zM8782j2 = false;
                IBinder iBinderM8784l = null;
                C19499b c19499b2 = null;
                while (parcel.dataPosition() < iM8789q9) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 1) {
                        iM8785m14 = AbstractC8191s5.m8785m(parcel, i24);
                    } else if (c16 == 2) {
                        iBinderM8784l = AbstractC8191s5.m8784l(parcel, i24);
                    } else if (c16 == 3) {
                        c19499b2 = (C19499b) AbstractC8191s5.m8775c(parcel, i24, C19499b.CREATOR);
                    } else if (c16 == 4) {
                        zM8782j = AbstractC8191s5.m8782j(parcel, i24);
                    } else if (c16 != 5) {
                        AbstractC8191s5.m8788p(parcel, i24);
                    } else {
                        zM8782j2 = AbstractC8191s5.m8782j(parcel, i24);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q9);
                return new C20498p(iM8785m14, iBinderM8784l, c19499b2, zM8782j, zM8782j2);
            case 25:
                int iM8789q10 = AbstractC8191s5.m8789q(parcel);
                int iM8785m15 = 0;
                int iM8785m16 = 0;
                int iM8785m17 = 0;
                boolean zM8782j3 = false;
                boolean zM8782j4 = false;
                while (parcel.dataPosition() < iM8789q10) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 1) {
                        iM8785m15 = AbstractC8191s5.m8785m(parcel, i25);
                    } else if (c17 == 2) {
                        zM8782j3 = AbstractC8191s5.m8782j(parcel, i25);
                    } else if (c17 == 3) {
                        zM8782j4 = AbstractC8191s5.m8782j(parcel, i25);
                    } else if (c17 == 4) {
                        iM8785m16 = AbstractC8191s5.m8785m(parcel, i25);
                    } else if (c17 != 5) {
                        AbstractC8191s5.m8788p(parcel, i25);
                    } else {
                        iM8785m17 = AbstractC8191s5.m8785m(parcel, i25);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q10);
                return new C20492j(iM8785m15, iM8785m16, iM8785m17, zM8782j3, zM8782j4);
            case 26:
                int iM8789q11 = AbstractC8191s5.m8789q(parcel);
                Bundle bundleM8773a = null;
                C20486d c20486d = null;
                int iM8785m18 = 0;
                C19501d[] c19501dArr = null;
                while (parcel.dataPosition() < iM8789q11) {
                    int i26 = parcel.readInt();
                    char c18 = (char) i26;
                    if (c18 == 1) {
                        bundleM8773a = AbstractC8191s5.m8773a(parcel, i26);
                    } else if (c18 == 2) {
                        c19501dArr = (C19501d[]) AbstractC8191s5.m8778f(parcel, i26, C19501d.CREATOR);
                    } else if (c18 == 3) {
                        iM8785m18 = AbstractC8191s5.m8785m(parcel, i26);
                    } else if (c18 != 4) {
                        AbstractC8191s5.m8788p(parcel, i26);
                    } else {
                        c20486d = (C20486d) AbstractC8191s5.m8775c(parcel, i26, C20486d.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q11);
                C20508z c20508z = new C20508z();
                c20508z.f65110Y = bundleM8773a;
                c20508z.f65111Z = c19501dArr;
                c20508z.f65112o0 = iM8785m18;
                c20508z.f65113p0 = c20486d;
                return c20508z;
            case 27:
                int iM8789q12 = AbstractC8191s5.m8789q(parcel);
                C20492j c20492j = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zM8782j5 = false;
                boolean zM8782j6 = false;
                int iM8785m19 = 0;
                while (parcel.dataPosition() < iM8789q12) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            c20492j = (C20492j) AbstractC8191s5.m8775c(parcel, i27, C20492j.CREATOR);
                            break;
                        case 2:
                            zM8782j5 = AbstractC8191s5.m8782j(parcel, i27);
                            break;
                        case 3:
                            zM8782j6 = AbstractC8191s5.m8782j(parcel, i27);
                            break;
                        case 4:
                            int iM8787o = AbstractC8191s5.m8787o(parcel, i27);
                            int iDataPosition = parcel.dataPosition();
                            if (iM8787o == 0) {
                                iArrCreateIntArray = null;
                            } else {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iM8787o);
                            }
                            break;
                        case 5:
                            iM8785m19 = AbstractC8191s5.m8785m(parcel, i27);
                            break;
                        case 6:
                            int iM8787o2 = AbstractC8191s5.m8787o(parcel, i27);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM8787o2 == 0) {
                                iArrCreateIntArray2 = null;
                            } else {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iM8787o2);
                            }
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i27);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q12);
                return new C20486d(c20492j, zM8782j5, zM8782j6, iArrCreateIntArray, iM8785m19, iArrCreateIntArray2);
            case 28:
                int iM8789q13 = AbstractC8191s5.m8789q(parcel);
                Scope[] scopeArr = C20487e.f65038A0;
                Bundle bundle = new Bundle();
                C19501d[] c19501dArr2 = C20487e.f65039B0;
                C19501d[] c19501dArr3 = c19501dArr2;
                String strM8776d8 = null;
                IBinder iBinderM8784l2 = null;
                Account account2 = null;
                String strM8776d9 = null;
                int iM8785m20 = 0;
                int iM8785m21 = 0;
                int iM8785m22 = 0;
                boolean zM8782j7 = false;
                int iM8785m23 = 0;
                boolean zM8782j8 = false;
                while (parcel.dataPosition() < iM8789q13) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iM8785m20 = AbstractC8191s5.m8785m(parcel, i28);
                            break;
                        case 2:
                            iM8785m21 = AbstractC8191s5.m8785m(parcel, i28);
                            break;
                        case 3:
                            iM8785m22 = AbstractC8191s5.m8785m(parcel, i28);
                            break;
                        case 4:
                            strM8776d8 = AbstractC8191s5.m8776d(parcel, i28);
                            break;
                        case 5:
                            iBinderM8784l2 = AbstractC8191s5.m8784l(parcel, i28);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC8191s5.m8778f(parcel, i28, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = AbstractC8191s5.m8773a(parcel, i28);
                            break;
                        case '\b':
                            account2 = (Account) AbstractC8191s5.m8775c(parcel, i28, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC8191s5.m8788p(parcel, i28);
                            break;
                        case '\n':
                            c19501dArr2 = (C19501d[]) AbstractC8191s5.m8778f(parcel, i28, C19501d.CREATOR);
                            break;
                        case 11:
                            c19501dArr3 = (C19501d[]) AbstractC8191s5.m8778f(parcel, i28, C19501d.CREATOR);
                            break;
                        case '\f':
                            zM8782j7 = AbstractC8191s5.m8782j(parcel, i28);
                            break;
                        case '\r':
                            iM8785m23 = AbstractC8191s5.m8785m(parcel, i28);
                            break;
                        case 14:
                            zM8782j8 = AbstractC8191s5.m8782j(parcel, i28);
                            break;
                        case 15:
                            strM8776d9 = AbstractC8191s5.m8776d(parcel, i28);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q13);
                return new C20487e(iM8785m20, iM8785m21, iM8785m22, strM8776d8, iBinderM8784l2, scopeArr, bundle, account2, c19501dArr2, c19501dArr3, zM8782j7, iM8785m23, zM8782j8, strM8776d9);
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string4 = parcel.readString();
                int i29 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i29);
                int iM19530m3 = 0;
                while (iM19530m3 != i29) {
                    iM19530m3 = AbstractC17792x.m19530m(C20972C.class, parcel, arrayList4, iM19530m3, 1);
                }
                return new C20972C(string4, arrayList4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f59415a) {
            case 0:
                return new SignInConfiguration[i10];
            case 1:
                return new C18659a[i10];
            case 2:
                return new C19067A1[i10];
            case 3:
                return new C19302K[i10];
            case 4:
                return new C19499b[i10];
            case 5:
                return new C19501d[i10];
            case 6:
                return new C19664c[i10];
            case 7:
                return new C19785l[i10];
            case 8:
                return new C19784k[i10];
            case 9:
                return new C19753C[i10];
            case 10:
                return new Scope[i10];
            case 11:
                return new Status[i10];
            case 12:
                return new C20116a[i10];
            case 13:
                return new EnumC20324a[i10];
            case 14:
                return new C20336g[i10];
            case 15:
                return new C20338h[i10];
            case 16:
                return new C20350n[i10];
            case 17:
                return new C20362t[i10];
            case 18:
                return new C20329c0[i10];
            case 19:
                return new C20331d0[i10];
            case 20:
                return new C20333e0[i10];
            case 21:
                return new C20493k[i10];
            case 22:
                return new C20490h[i10];
            case 23:
                return new C20497o[i10];
            case 24:
                return new C20498p[i10];
            case 25:
                return new C20492j[i10];
            case 26:
                return new C20508z[i10];
            case 27:
                return new C20486d[i10];
            case 28:
                return new C20487e[i10];
            default:
                return new C20972C[i10];
        }
    }
}
