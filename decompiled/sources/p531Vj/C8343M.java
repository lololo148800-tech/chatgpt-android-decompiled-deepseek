package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p174Gk.uSfJ.HpucjswO;
import p588Y2.C9602F;
import p588Y2.C9607K;
import p588Y2.C9609M;
import p588Y2.C9618b;
import p588Y2.C9619c;
import p612Z3.C10152a;
import p638a4.C10501a;
import p647ak.AbstractC10712k0;
import p647ak.C10670U;
import p647ak.C10672V;
import p647ak.C10674W;
import p647ak.C10676X;
import p647ak.C10678Y;
import p647ak.C10680Z;
import p647ak.C10683a0;
import p647ak.C10686b0;
import p647ak.C10689c0;
import p647ak.C10692d0;
import p647ak.C10695e0;
import p647ak.C10698f0;
import p647ak.C10701g0;
import p647ak.C10704h0;
import p647ak.C10725r;
import p647ak.C10727s;
import p647ak.EnumC10647I;
import p647ak.EnumC10721p;
import p647ak.EnumC10723q;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: Vj.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8343M implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25999a;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f25999a) {
            case 0:
                return new C8344N[i10];
            case 1:
                return new C8345O[i10];
            case 2:
                return new C8346P[i10];
            case 3:
                return new C8347Q[i10];
            case 4:
                return new C8348S[i10];
            case 5:
                return new C8349T[i10];
            case 6:
                return new C8365e0[i10];
            case 7:
                return new C9618b[i10];
            case 8:
                return new C9619c[i10];
            case 9:
                return new C9602F[i10];
            case 10:
                return new C9607K[i10];
            case 11:
                return new C9609M[i10];
            case 12:
                return new C10152a[i10];
            case 13:
                return new C10501a[i10];
            case 14:
                return new C10725r[i10];
            case 15:
                return new C10727s[i10];
            case 16:
                return new C10670U[i10];
            case 17:
                return new C10672V[i10];
            case 18:
                return new C10674W[i10];
            case 19:
                return new C10676X[i10];
            case 20:
                return new C10678Y[i10];
            case 21:
                return new C10680Z[i10];
            case 22:
                return new C10683a0[i10];
            case 23:
                return new C10686b0[i10];
            case 24:
                return new C10689c0[i10];
            case 25:
                return new C10692d0[i10];
            case 26:
                return new C10695e0[i10];
            case 27:
                return new C10698f0[i10];
            case 28:
                return new C10701g0[i10];
            default:
                return new C10704h0[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25999a) {
            case 0:
                AbstractC16544l.m18094g(parcel, HpucjswO.oBkmAsz);
                parcel.readInt();
                return C8344N.f26000Y;
            case 1:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8345O.f26001Y;
            case 2:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8346P.f26002Y;
            case 3:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8347Q.f26003Y;
            case 4:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8348S.f26004Y;
            case 5:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C8349T.f26005Y;
            case 6:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C8365e0(EnumC8334D.valueOf(parcel.readString()), EnumC8363d0.valueOf(parcel.readString()));
            case 7:
                return new C9618b(parcel);
            case 8:
                return new C9619c(parcel);
            case 9:
                C9602F c9602f = new C9602F();
                c9602f.f28898Y = parcel.readString();
                c9602f.f28899Z = parcel.readInt();
                return c9602f;
            case 10:
                C9607K c9607k = new C9607K();
                c9607k.f28910q0 = null;
                c9607k.f28911r0 = new ArrayList();
                c9607k.f28912s0 = new ArrayList();
                c9607k.f28906Y = parcel.createStringArrayList();
                c9607k.f28907Z = parcel.createStringArrayList();
                c9607k.f28908o0 = (C9618b[]) parcel.createTypedArray(C9618b.CREATOR);
                c9607k.f28909p0 = parcel.readInt();
                c9607k.f28910q0 = parcel.readString();
                c9607k.f28911r0 = parcel.createStringArrayList();
                c9607k.f28912s0 = parcel.createTypedArrayList(C9619c.CREATOR);
                c9607k.f28913t0 = parcel.createTypedArrayList(C9602F.CREATOR);
                return c9607k;
            case 11:
                return new C9609M(parcel);
            case 12:
                String string = parcel.readString();
                string.getClass();
                return new C10152a(parcel.readInt(), string);
            case 13:
                return new C10501a(parcel);
            case 14:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C10725r(parcel.readString(), EnumC10721p.valueOf(parcel.readString()), EnumC10723q.valueOf(parcel.readString()), parcel.readLong());
            case 15:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C10727s(parcel.readString(), EnumC10721p.valueOf(parcel.readString()));
            case 16:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                int iM19530m = 0;
                while (iM19530m != i10) {
                    iM19530m = AbstractC17792x.m19530m(C10670U.class, parcel, arrayList, iM19530m, 1);
                }
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(EnumC10723q.valueOf(parcel.readString()));
                }
                return new C10670U(arrayList, arrayList2, parcel.readInt() == 0 ? null : EnumC10647I.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (C18428A) parcel.readParcelable(C10670U.class.getClassLoader()), (AbstractC10712k0) parcel.readParcelable(C10670U.class.getClassLoader()));
            case 17:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C10672V((AbstractC10712k0) parcel.readParcelable(C10672V.class.getClassLoader()), EnumC10723q.valueOf(parcel.readString()), (AbstractC10712k0) parcel.readParcelable(C10672V.class.getClassLoader()));
            case 18:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i13 = parcel.readInt();
                EnumC10647I enumC10647IValueOf = parcel.readInt() == 0 ? null : EnumC10647I.valueOf(parcel.readString());
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList3.add(EnumC10723q.valueOf(parcel.readString()));
                }
                return new C10674W(i13, parcel.readLong(), parcel.readLong(), enumC10647IValueOf, (AbstractC10712k0) parcel.readParcelable(C10674W.class.getClassLoader()), arrayList3, (C18428A) parcel.readParcelable(C10674W.class.getClassLoader()));
            case 19:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i16 = parcel.readInt();
                EnumC10647I enumC10647IValueOf2 = parcel.readInt() == 0 ? null : EnumC10647I.valueOf(parcel.readString());
                C18428A c18428a = (C18428A) parcel.readParcelable(C10676X.class.getClassLoader());
                int i17 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList4.add(EnumC10723q.valueOf(parcel.readString()));
                }
                return new C10676X(i16, enumC10647IValueOf2, c18428a, arrayList4, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (AbstractC10712k0) parcel.readParcelable(C10676X.class.getClassLoader()));
            case 20:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i19 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i19);
                int iM19530m2 = 0;
                while (iM19530m2 != i19) {
                    iM19530m2 = AbstractC17792x.m19530m(C10678Y.class, parcel, arrayList5, iM19530m2, 1);
                }
                return new C10678Y(arrayList5, parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, (C18428A) parcel.readParcelable(C10678Y.class.getClassLoader()), parcel.readLong(), (AbstractC10712k0) parcel.readParcelable(C10678Y.class.getClassLoader()));
            case 21:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i20 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i20);
                int iM19530m3 = 0;
                while (iM19530m3 != i20) {
                    iM19530m3 = AbstractC17792x.m19530m(C10680Z.class, parcel, arrayList6, iM19530m3, 1);
                }
                return new C10680Z(arrayList6, (C18428A) parcel.readParcelable(C10680Z.class.getClassLoader()), parcel.readLong(), (AbstractC10712k0) parcel.readParcelable(C10680Z.class.getClassLoader()));
            case 22:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C10683a0(parcel.readInt() != 0, parcel.readInt() != 0, (AbstractC10712k0) parcel.readParcelable(C10683a0.class.getClassLoader()));
            case 23:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C10686b0((AbstractC10712k0) parcel.readParcelable(C10686b0.class.getClassLoader()));
            case 24:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i21 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i21);
                int iM19530m4 = 0;
                while (iM19530m4 != i21) {
                    iM19530m4 = AbstractC17792x.m19530m(C10689c0.class, parcel, arrayList7, iM19530m4, 1);
                }
                int i22 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i22);
                for (int i23 = 0; i23 != i22; i23++) {
                    arrayList8.add(EnumC10723q.valueOf(parcel.readString()));
                }
                return new C10689c0(arrayList7, arrayList8, parcel.readInt() != 0, (C18428A) parcel.readParcelable(C10689c0.class.getClassLoader()), parcel.readLong(), (AbstractC10712k0) parcel.readParcelable(C10689c0.class.getClassLoader()));
            case 25:
                AbstractC16544l.m18094g(parcel, "parcel");
                boolean z6 = parcel.readInt() != 0;
                EnumC10647I enumC10647IValueOf3 = parcel.readInt() == 0 ? null : EnumC10647I.valueOf(parcel.readString());
                int i24 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    arrayList9.add(EnumC10723q.valueOf(parcel.readString()));
                }
                return new C10692d0(z6, enumC10647IValueOf3, arrayList9, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (C18428A) parcel.readParcelable(C10692d0.class.getClassLoader()), (AbstractC10712k0) parcel.readParcelable(C10692d0.class.getClassLoader()));
            case 26:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i26 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i26);
                for (int i27 = 0; i27 != i26; i27++) {
                    arrayList10.add(EnumC10723q.valueOf(parcel.readString()));
                }
                return new C10695e0(arrayList10, parcel.readLong(), (C18428A) parcel.readParcelable(C10695e0.class.getClassLoader()), parcel.readLong(), (AbstractC10712k0) parcel.readParcelable(C10695e0.class.getClassLoader()));
            case 27:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i28 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i28);
                int iM19530m5 = 0;
                while (iM19530m5 != i28) {
                    iM19530m5 = AbstractC17792x.m19530m(C10698f0.class, parcel, arrayList11, iM19530m5, 1);
                }
                return new C10698f0(parcel.readLong(), (AbstractC10712k0) parcel.readParcelable(C10698f0.class.getClassLoader()), parcel.readString(), arrayList11, (C18428A) parcel.readParcelable(C10698f0.class.getClassLoader()));
            case 28:
                AbstractC16544l.m18094g(parcel, "parcel");
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                AbstractC10712k0 abstractC10712k0 = (AbstractC10712k0) parcel.readParcelable(C10701g0.class.getClassLoader());
                int i29 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i29);
                for (int i30 = 0; i30 != i29; i30++) {
                    arrayList12.add(EnumC10723q.valueOf(parcel.readString()));
                }
                return new C10701g0(z10, z11, abstractC10712k0, arrayList12);
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string2 = parcel.readString();
                C18428A c18428a2 = (C18428A) parcel.readParcelable(C10704h0.class.getClassLoader());
                long j10 = parcel.readLong();
                AbstractC10712k0 abstractC10712k1 = (AbstractC10712k0) parcel.readParcelable(C10704h0.class.getClassLoader());
                int i31 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(i31);
                for (int i32 = 0; i32 != i31; i32++) {
                    arrayList13.add(EnumC10723q.valueOf(parcel.readString()));
                }
                return new C10704h0(j10, abstractC10712k1, string2, arrayList13, c18428a2);
        }
    }
}
