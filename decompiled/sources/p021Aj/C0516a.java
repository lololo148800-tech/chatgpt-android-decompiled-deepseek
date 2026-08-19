package p021Aj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p022Ak.C0540a;
import p022Ak.C0541b;
import p022Ak.C0542c;
import p022Ak.C0545f;
import p022Ak.C0547h;
import p022Ak.C0549j;
import p022Ak.C0550k;
import p022Ak.C0551l;
import p022Ak.C0552m;
import p022Ak.C0553n;
import p022Ak.EnumC0543d;
import p022Ak.EnumC0544e;
import p022Ak.EnumC0546g;
import p022Ak.EnumC0548i;
import p046Bk.C1381f0;
import p046Bk.C1385h0;
import p046Bk.C1387i0;
import p084D4.C1885I;
import p084D4.C1945v0;
import p084D4.C1947w0;
import p100Dk.C2074a;
import p100Dk.C2075b;
import p100Dk.C2076c;
import p100Dk.C2077d;
import p100Dk.C2078e;
import p100Dk.C2079f;
import p100Dk.C2080g;
import p100Dk.C2081h;
import p100Dk.C2095v;
import p1071w0.AbstractC20734X;
import p108E2.C2250i;
import p1156zj.C22124T0;
import p117Eb.C2390t;
import p125Ej.C2565i;
import p523V9.AbstractC8191s5;
import p911o0.AbstractC17792x;
import p994rk.C19218t;
import p994rk.C19221t2;

/* JADX INFO: renamed from: Aj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0516a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1656a;

    public /* synthetic */ C0516a(int i10) {
        this.f1656a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f1656a) {
            case 0:
                return new C0517b[i10];
            case 1:
                return new C0540a[i10];
            case 2:
                return new C0541b[i10];
            case 3:
                return new C0542c[i10];
            case 4:
                return new EnumC0543d[i10];
            case 5:
                return new C0547h[i10];
            case 6:
                return new C0545f[i10];
            case 7:
                return new C0549j[i10];
            case 8:
                return new C0550k[i10];
            case 9:
                return new C0551l[i10];
            case 10:
                return new C0552m[i10];
            case 11:
                return new C0553n[i10];
            case 12:
                return new C1381f0[i10];
            case 13:
                return new C1385h0[i10];
            case 14:
                return new C1387i0[i10];
            case 15:
                return new C1885I[i10];
            case 16:
                return new C1945v0[i10];
            case 17:
                return new C1947w0[i10];
            case 18:
                return new C2074a[i10];
            case 19:
                return new C2075b[i10];
            case 20:
                return new C2076c[i10];
            case 21:
                return new C2077d[i10];
            case 22:
                return new C2078e[i10];
            case 23:
                return new C2079f[i10];
            case 24:
                return new C2080g[i10];
            case 25:
                return new C2081h[i10];
            case 26:
                return new C2095v[i10];
            case 27:
                return new C2250i[i10];
            case 28:
                return new C2390t[i10];
            default:
                return new C2565i[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1656a) {
            case 0:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C0517b(parcel.readInt() != 0, parcel.readInt() != 0, C22124T0.CREATOR.createFromParcel(parcel));
            case 1:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                int iM19530m = 0;
                while (iM19530m != i10) {
                    iM19530m = AbstractC17792x.m19530m(C0540a.class, parcel, arrayList, iM19530m, 1);
                }
                return new C0540a(arrayList);
            case 2:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C0541b((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            case 3:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C0542c((File) parcel.readSerializable());
            case 4:
                AbstractC16544l.m18094g(parcel, nkFZpTrMPpn.cTHEBuJwlKD);
                return EnumC0543d.valueOf(parcel.readString());
            case 5:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string = parcel.readString();
                EnumC0546g enumC0546gValueOf = EnumC0546g.valueOf(parcel.readString());
                EnumC0544e enumC0544eValueOf = EnumC0544e.valueOf(parcel.readString());
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int iM21251v = 0;
                while (iM21251v != i11) {
                    iM21251v = AbstractC20734X.m21251v(C0545f.CREATOR, parcel, arrayList2, iM21251v, 1);
                }
                return new C0547h(string, enumC0546gValueOf, enumC0544eValueOf, arrayList2);
            case 6:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C0545f((File) parcel.readSerializable(), parcel.readString());
            case 7:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C0549j(EnumC0548i.valueOf(parcel.readString()), (File) parcel.readSerializable());
            case 8:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string2 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iM21251v2 = 0;
                while (iM21251v2 != i12) {
                    iM21251v2 = AbstractC20734X.m21251v(C0542c.CREATOR, parcel, arrayList3, iM21251v2, 1);
                }
                return new C0550k(string2, arrayList3);
            case 9:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string3 = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iM21251v3 = 0;
                while (iM21251v3 != i13) {
                    iM21251v3 = AbstractC20734X.m21251v(C0547h.CREATOR, parcel, arrayList4, iM21251v3, 1);
                }
                return new C0551l(string3, arrayList4, C0541b.CREATOR.createFromParcel(parcel));
            case 10:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C0552m(parcel.readString(), parcel.readInt() == 0 ? null : C0549j.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C0549j.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C0549j.CREATOR.createFromParcel(parcel) : null);
            case 11:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string4 = parcel.readString();
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(C0553n.class.getClassLoader()));
                }
                return new C0553n(string4, linkedHashMap);
            case 12:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C1381f0((GovernmentIdNfcScanComponent) parcel.readParcelable(C1381f0.class.getClassLoader()));
            case 13:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C1385h0((C19218t) parcel.readParcelable(C1385h0.class.getClassLoader()));
            case 14:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C1387i0((C19221t2) parcel.readParcelable(C1387i0.class.getClassLoader()));
            case 15:
                C1885I c1885i = new C1885I();
                c1885i.f5497Y = parcel.readInt();
                c1885i.f5498Z = parcel.readInt();
                c1885i.f5499o0 = parcel.readInt() == 1;
                return c1885i;
            case 16:
                C1945v0 c1945v0 = new C1945v0();
                c1945v0.f5748Y = parcel.readInt();
                c1945v0.f5749Z = parcel.readInt();
                c1945v0.f5751p0 = parcel.readInt() == 1;
                int i16 = parcel.readInt();
                if (i16 > 0) {
                    int[] iArr = new int[i16];
                    c1945v0.f5750o0 = iArr;
                    parcel.readIntArray(iArr);
                }
                return c1945v0;
            case 17:
                C1947w0 c1947w0 = new C1947w0();
                c1947w0.f5756Y = parcel.readInt();
                c1947w0.f5757Z = parcel.readInt();
                int i17 = parcel.readInt();
                c1947w0.f5758o0 = i17;
                if (i17 > 0) {
                    int[] iArr2 = new int[i17];
                    c1947w0.f5759p0 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i18 = parcel.readInt();
                c1947w0.f5760q0 = i18;
                if (i18 > 0) {
                    int[] iArr3 = new int[i18];
                    c1947w0.f5761r0 = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c1947w0.f5763t0 = parcel.readInt() == 1;
                c1947w0.f5764u0 = parcel.readInt() == 1;
                c1947w0.f5765v0 = parcel.readInt() == 1;
                c1947w0.f5762s0 = parcel.readArrayList(C1945v0.class.getClassLoader());
                return c1947w0;
            case 18:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C2074a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C2075b(parcel.readInt() != 0);
            case 20:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C2076c((Number) parcel.readSerializable());
            case 21:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C2077d(parcel.readString());
            case 22:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C2078e(parcel.createStringArrayList());
            case 23:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C2079f(parcel.readString());
            case 24:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C2080g(parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C2081h(parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string5 = parcel.readString();
                int i19 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i19);
                for (int i20 = 0; i20 != i19; i20++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readParcelable(C2095v.class.getClassLoader()));
                }
                return new C2095v(string5, linkedHashMap2);
            case 27:
                C2250i c2250i = new C2250i(parcel);
                c2250i.f6891Y = parcel.readInt();
                return c2250i;
            case 28:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                Bundle bundleM8773a = null;
                while (parcel.dataPosition() < iM8789q) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        AbstractC8191s5.m8788p(parcel, i21);
                    } else {
                        bundleM8773a = AbstractC8191s5.m8773a(parcel, i21);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C2390t(bundleM8773a);
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C2565i.f7997Y;
        }
    }
}
