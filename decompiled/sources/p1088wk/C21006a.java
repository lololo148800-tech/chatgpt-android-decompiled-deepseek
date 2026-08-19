package p1088wk;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.steps.p688ui.network.Suggestion;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0517b;
import p1071w0.AbstractC20734X;
import p1097x3.C21115a;
import p1097x3.C21116b;
import p1097x3.C21117c;
import p1143z4.C21779i;
import p1147z9.C21815a;
import p1147z9.C21816b;
import p1147z9.C21817c;
import p1156zj.AbstractC22180o0;
import p1156zj.AbstractC22196t1;
import p1156zj.C22090C;
import p1156zj.C22092D;
import p1156zj.C22106K;
import p1156zj.C22122S0;
import p1156zj.C22124T0;
import p1156zj.C22126U0;
import p1156zj.C22130W0;
import p1156zj.C22134Y0;
import p1156zj.C22139a1;
import p1156zj.C22144c0;
import p1156zj.C22147d0;
import p1156zj.C22150e0;
import p1156zj.C22153f0;
import p1156zj.C22156g0;
import p1156zj.C22159h0;
import p1156zj.C22162i0;
import p1156zj.C22168k0;
import p1156zj.C22171l0;
import p1156zj.C22173m;
import p1156zj.C22174m0;
import p1156zj.C22176n;
import p1156zj.C22177n0;
import p1156zj.C22203w;
import p1156zj.C22205x;
import p1156zj.EnumC22088B;
import p1156zj.EnumC22094E;
import p1156zj.EnumC22128V0;
import p1156zj.EnumC22136Z0;
import p1156zj.EnumC22140b;
import p1156zj.EnumC22169k1;
import p1156zj.InterfaceC22096F;
import p1156zj.InterfaceC22179o;
import p125Ej.InterfaceC2564h;
import p149Fj.C2880n;
import p149Fj.EnumC2883q;
import p173Gj.EnumC3098e;
import p523V9.AbstractC8191s5;
import p911o0.AbstractC17792x;
import p949pj.C18428A;
import p949pj.C18475l;

/* JADX INFO: renamed from: wk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21006a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66854a;

    public /* synthetic */ C21006a(int i10) {
        this.f66854a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f66854a) {
            case 0:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new Suggestion(parcel.readString(), parcel.readString());
            case 1:
                return new C21115a(parcel);
            case 2:
                return new C21116b(parcel);
            case 3:
                return new C21117c(parcel);
            case 4:
                AbstractC16544l.m18094g(parcel, "inParcel");
                return new C21779i(parcel);
            case 5:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j = false;
                int iM8785m = 0;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        zM8782j = AbstractC8191s5.m8782j(parcel, i10);
                    } else if (c9 != 2) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i10);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C21815a(zM8782j, iM8785m);
            case 6:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        AbstractC8191s5.m8788p(parcel, i11);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC8191s5.m8775c(parcel, i11, PendingIntent.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new C21816b(pendingIntent);
            case 7:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                int iM8785m2 = 0;
                boolean zM8782j2 = false;
                while (parcel.dataPosition() < iM8789q3) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iM8785m2 = AbstractC8191s5.m8785m(parcel, i12);
                    } else if (c10 != 2) {
                        AbstractC8191s5.m8788p(parcel, i12);
                    } else {
                        zM8782j2 = AbstractC8191s5.m8782j(parcel, i12);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new C21817c(iM8785m2, zM8782j2);
            case 8:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22173m(C0517b.CREATOR.createFromParcel(parcel));
            case 9:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22176n(C22130W0.CREATOR.createFromParcel(parcel));
            case 10:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22203w(EnumC22136Z0.valueOf(parcel.readString()), C22130W0.CREATOR.createFromParcel(parcel), parcel.readString());
            case 11:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22205x(parcel.readString(), parcel.readString());
            case 12:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iM21251v = 0;
                while (iM21251v != i13) {
                    iM21251v = AbstractC20734X.m21251v(C22205x.CREATOR, parcel, arrayList, iM21251v, 1);
                }
                return new C22090C(arrayList, EnumC22094E.valueOf(parcel.readString()), parcel.readString(), EnumC22088B.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RawExtraction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C22106K.CREATOR.createFromParcel(parcel) : null);
            case 13:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iM21251v2 = 0;
                while (iM21251v2 != i14) {
                    iM21251v2 = AbstractC20734X.m21251v(C22205x.CREATOR, parcel, arrayList2, iM21251v2, 1);
                }
                return new C22092D(arrayList2, EnumC22094E.valueOf(parcel.readString()), parcel.readString(), EnumC22088B.valueOf(parcel.readString()));
            case 14:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22106K((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            case 15:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a1CreateFromParcel = C22139a1.CREATOR.createFromParcel(parcel);
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                int iM21251v3 = 0;
                int iM19530m = 0;
                while (iM19530m != i15) {
                    iM19530m = AbstractC17792x.m19530m(C22144c0.class, parcel, arrayList3, iM19530m, 1);
                }
                int i16 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i16);
                int iM19530m2 = 0;
                while (iM19530m2 != i16) {
                    iM19530m2 = AbstractC17792x.m19530m(C22144c0.class, parcel, arrayList4, iM19530m2, 1);
                }
                int i17 = parcel.readInt();
                AbstractC22180o0 abstractC22180o0 = (AbstractC22180o0) parcel.readParcelable(C22144c0.class.getClassLoader());
                int i18 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i18);
                int iM21251v4 = 0;
                while (iM21251v4 != i18) {
                    iM21251v4 = AbstractC20734X.m21251v(C22205x.CREATOR, parcel, arrayList5, iM21251v4, 1);
                }
                C18428A c18428a = (C18428A) parcel.readParcelable(C22144c0.class.getClassLoader());
                int i19 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i19);
                while (iM21251v3 != i19) {
                    iM21251v3 = AbstractC20734X.m21251v(C22134Y0.CREATOR, parcel, arrayList6, iM21251v3, 1);
                }
                return new C22144c0(c22139a1CreateFromParcel, arrayList3, arrayList4, i17, abstractC22180o0, arrayList5, c18428a, arrayList6, parcel.readString(), parcel.readString(), EnumC22140b.valueOf(parcel.readString()));
            case 16:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a1CreateFromParcel2 = C22139a1.CREATOR.createFromParcel(parcel);
                int i20 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i20);
                int iM21251v5 = 0;
                int iM19530m3 = 0;
                while (iM19530m3 != i20) {
                    iM19530m3 = AbstractC17792x.m19530m(C22147d0.class, parcel, arrayList7, iM19530m3, 1);
                }
                int i21 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i21);
                int iM19530m4 = 0;
                while (iM19530m4 != i21) {
                    iM19530m4 = AbstractC17792x.m19530m(C22147d0.class, parcel, arrayList8, iM19530m4, 1);
                }
                int i22 = parcel.readInt();
                AbstractC22180o0 abstractC22180o1 = (AbstractC22180o0) parcel.readParcelable(C22147d0.class.getClassLoader());
                int i23 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i23);
                int iM21251v6 = 0;
                while (iM21251v6 != i23) {
                    iM21251v6 = AbstractC20734X.m21251v(C22205x.CREATOR, parcel, arrayList9, iM21251v6, 1);
                }
                C18428A c18428a2 = (C18428A) parcel.readParcelable(C22147d0.class.getClassLoader());
                int i24 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i24);
                while (iM21251v5 != i24) {
                    iM21251v5 = AbstractC20734X.m21251v(C22134Y0.CREATOR, parcel, arrayList10, iM21251v5, 1);
                }
                return new C22147d0(c22139a1CreateFromParcel2, arrayList7, arrayList8, i22, abstractC22180o1, arrayList9, c18428a2, arrayList10, parcel.readString(), parcel.readString());
            case 17:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a1CreateFromParcel3 = C22139a1.CREATOR.createFromParcel(parcel);
                int i25 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i25);
                int iM19530m5 = 0;
                while (iM19530m5 != i25) {
                    iM19530m5 = AbstractC17792x.m19530m(C22150e0.class, parcel, arrayList11, iM19530m5, 1);
                }
                int i26 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i26);
                int iM19530m6 = 0;
                while (iM19530m6 != i26) {
                    iM19530m6 = AbstractC17792x.m19530m(C22150e0.class, parcel, arrayList12, iM19530m6, 1);
                }
                return new C22150e0(c22139a1CreateFromParcel3, arrayList11, arrayList12, parcel.readInt(), (InterfaceC22179o) parcel.readParcelable(C22150e0.class.getClassLoader()), parcel.readInt() != 0, (AbstractC22180o0) parcel.readParcelable(C22150e0.class.getClassLoader()), parcel.readString());
            case 18:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a1CreateFromParcel4 = C22139a1.CREATOR.createFromParcel(parcel);
                int i27 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(i27);
                int iM19530m7 = 0;
                int iM19530m8 = 0;
                while (iM19530m8 != i27) {
                    iM19530m8 = AbstractC17792x.m19530m(C22153f0.class, parcel, arrayList13, iM19530m8, 1);
                }
                InterfaceC22179o interfaceC22179o = (InterfaceC22179o) parcel.readParcelable(C22153f0.class.getClassLoader());
                C22090C c22090cCreateFromParcel = C22090C.CREATOR.createFromParcel(parcel);
                int i28 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(i28);
                while (iM19530m7 != i28) {
                    iM19530m7 = AbstractC17792x.m19530m(C22153f0.class, parcel, arrayList14, iM19530m7, 1);
                }
                return new C22153f0(c22139a1CreateFromParcel4, arrayList13, interfaceC22179o, c22090cCreateFromParcel, arrayList14, parcel.readInt(), (AbstractC22180o0) parcel.readParcelable(C22153f0.class.getClassLoader()), (InterfaceC2564h) parcel.readParcelable(C22153f0.class.getClassLoader()));
            case 19:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22130W0 c22130w0CreateFromParcel = C22130W0.CREATOR.createFromParcel(parcel);
                int i29 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(i29);
                int iM19530m9 = 0;
                while (iM19530m9 != i29) {
                    iM19530m9 = AbstractC17792x.m19530m(C22156g0.class, parcel, arrayList15, iM19530m9, 1);
                }
                C22139a1 c22139a1 = (C22139a1) parcel.readParcelable(C22156g0.class.getClassLoader());
                int i30 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(i30);
                int iM19530m10 = 0;
                while (iM19530m10 != i30) {
                    iM19530m10 = AbstractC17792x.m19530m(C22156g0.class, parcel, arrayList16, iM19530m10, 1);
                }
                return new C22156g0(c22130w0CreateFromParcel, arrayList15, c22139a1, arrayList16, parcel.readInt(), (AbstractC22180o0) parcel.readParcelable(C22156g0.class.getClassLoader()), parcel.readInt() == 0 ? null : C2880n.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
            case 20:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a2 = (C22139a1) parcel.readParcelable(C22159h0.class.getClassLoader());
                int i31 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(i31);
                int iM19530m11 = 0;
                int iM19530m12 = 0;
                while (iM19530m12 != i31) {
                    iM19530m12 = AbstractC17792x.m19530m(C22159h0.class, parcel, arrayList17, iM19530m12, 1);
                }
                int i32 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(i32);
                while (iM19530m11 != i32) {
                    iM19530m11 = AbstractC17792x.m19530m(C22159h0.class, parcel, arrayList18, iM19530m11, 1);
                }
                return new C22159h0(c22139a2, arrayList17, arrayList18, parcel.readInt(), (AbstractC22180o0) parcel.readParcelable(C22159h0.class.getClassLoader()), C22130W0.CREATOR.createFromParcel(parcel), (C18428A) parcel.readParcelable(C22159h0.class.getClassLoader()));
            case 21:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a1CreateFromParcel5 = C22139a1.CREATOR.createFromParcel(parcel);
                int i33 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(i33);
                int iM19530m13 = 0;
                while (iM19530m13 != i33) {
                    iM19530m13 = AbstractC17792x.m19530m(C22162i0.class, parcel, arrayList19, iM19530m13, 1);
                }
                InterfaceC22179o interfaceC22179o2 = (InterfaceC22179o) parcel.readParcelable(C22162i0.class.getClassLoader());
                InterfaceC22096F interfaceC22096F = (InterfaceC22096F) parcel.readParcelable(C22162i0.class.getClassLoader());
                int i34 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(i34);
                int iM19530m14 = 0;
                while (iM19530m14 != i34) {
                    iM19530m14 = AbstractC17792x.m19530m(C22162i0.class, parcel, arrayList20, iM19530m14, 1);
                }
                return new C22162i0(c22139a1CreateFromParcel5, arrayList19, interfaceC22179o2, interfaceC22096F, arrayList20, parcel.readInt(), (AbstractC22180o0) parcel.readParcelable(C22162i0.class.getClassLoader()), (C18428A) parcel.readParcelable(C22162i0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 22:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a1CreateFromParcel6 = C22139a1.CREATOR.createFromParcel(parcel);
                int i35 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(i35);
                int iM19530m15 = 0;
                while (iM19530m15 != i35) {
                    iM19530m15 = AbstractC17792x.m19530m(C22168k0.class, parcel, arrayList21, iM19530m15, 1);
                }
                InterfaceC22179o interfaceC22179o3 = (InterfaceC22179o) parcel.readParcelable(C22168k0.class.getClassLoader());
                InterfaceC22096F interfaceC22096F2 = (InterfaceC22096F) parcel.readParcelable(C22168k0.class.getClassLoader());
                String string = parcel.readString();
                int i36 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(i36);
                int iM19530m16 = 0;
                while (iM19530m16 != i36) {
                    iM19530m16 = AbstractC17792x.m19530m(C22168k0.class, parcel, arrayList22, iM19530m16, 1);
                }
                return new C22168k0(c22139a1CreateFromParcel6, arrayList21, interfaceC22179o3, interfaceC22096F2, string, arrayList22, parcel.readInt(), (AbstractC22180o0) parcel.readParcelable(C22168k0.class.getClassLoader()), (C18428A) parcel.readParcelable(C22168k0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 23:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a3 = (C22139a1) parcel.readParcelable(C22171l0.class.getClassLoader());
                int i37 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(i37);
                int iM19530m17 = 0;
                int iM19530m18 = 0;
                while (iM19530m18 != i37) {
                    iM19530m18 = AbstractC17792x.m19530m(C22171l0.class, parcel, arrayList23, iM19530m18, 1);
                }
                int i38 = parcel.readInt();
                ArrayList arrayList24 = new ArrayList(i38);
                while (iM19530m17 != i38) {
                    iM19530m17 = AbstractC17792x.m19530m(C22171l0.class, parcel, arrayList24, iM19530m17, 1);
                }
                return new C22171l0(c22139a3, arrayList23, arrayList24, (AbstractC22180o0) parcel.readParcelable(C22171l0.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : C22130W0.CREATOR.createFromParcel(parcel), parcel.readString());
            case 24:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22130W0 c22130w0CreateFromParcel2 = C22130W0.CREATOR.createFromParcel(parcel);
                int i39 = parcel.readInt();
                ArrayList arrayList25 = new ArrayList(i39);
                int iM19530m19 = 0;
                int iM19530m20 = 0;
                while (iM19530m20 != i39) {
                    iM19530m20 = AbstractC17792x.m19530m(C22174m0.class, parcel, arrayList25, iM19530m20, 1);
                }
                C22139a1 c22139a4 = (C22139a1) parcel.readParcelable(C22174m0.class.getClassLoader());
                int i40 = parcel.readInt();
                ArrayList arrayList26 = new ArrayList(i40);
                while (iM19530m19 != i40) {
                    iM19530m19 = AbstractC17792x.m19530m(C22174m0.class, parcel, arrayList26, iM19530m19, 1);
                }
                return new C22174m0(c22130w0CreateFromParcel2, arrayList25, c22139a4, arrayList26, parcel.readInt(), (AbstractC22180o0) parcel.readParcelable(C22174m0.class.getClassLoader()), parcel.readInt() == 0 ? null : C2880n.CREATOR.createFromParcel(parcel), parcel.readString(), (C18428A) parcel.readParcelable(C22174m0.class.getClassLoader()));
            case 25:
                AbstractC16544l.m18094g(parcel, "parcel");
                C22139a1 c22139a1CreateFromParcel7 = C22139a1.CREATOR.createFromParcel(parcel);
                int i41 = parcel.readInt();
                ArrayList arrayList27 = new ArrayList(i41);
                int iM19530m21 = 0;
                while (iM19530m21 != i41) {
                    iM19530m21 = AbstractC17792x.m19530m(C22177n0.class, parcel, arrayList27, iM19530m21, 1);
                }
                InterfaceC22179o interfaceC22179o4 = (InterfaceC22179o) parcel.readParcelable(C22177n0.class.getClassLoader());
                EnumC22169k1 enumC22169k1ValueOf = EnumC22169k1.valueOf(parcel.readString());
                int i42 = parcel.readInt();
                ArrayList arrayList28 = new ArrayList(i42);
                int iM19530m22 = 0;
                while (iM19530m22 != i42) {
                    iM19530m22 = AbstractC17792x.m19530m(C22177n0.class, parcel, arrayList28, iM19530m22, 1);
                }
                return new C22177n0(c22139a1CreateFromParcel7, arrayList27, interfaceC22179o4, enumC22169k1ValueOf, arrayList28, parcel.readInt(), (AbstractC22180o0) parcel.readParcelable(C22177n0.class.getClassLoader()), parcel.readInt() == 0 ? null : EnumC3098e.valueOf(parcel.readString()), parcel.readString(), (Throwable) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, (InterfaceC2564h) parcel.readParcelable(C22177n0.class.getClassLoader()), null, 8192);
            case 26:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22122S0((C18475l) parcel.readParcelable(C22122S0.class.getClassLoader()));
            case 27:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string2 = parcel.readString();
                EnumC22136Z0 enumC22136Z0ValueOf = EnumC22136Z0.valueOf(parcel.readString());
                int i43 = parcel.readInt();
                ArrayList arrayList29 = new ArrayList(i43);
                int iM19530m23 = 0;
                int iM21251v7 = 0;
                while (iM21251v7 != i43) {
                    iM21251v7 = AbstractC20734X.m21251v(C22124T0.CREATOR, parcel, arrayList29, iM21251v7, 1);
                }
                int i44 = parcel.readInt();
                ArrayList arrayList30 = new ArrayList(i44);
                while (iM19530m23 != i44) {
                    iM19530m23 = AbstractC17792x.m19530m(C22130W0.class, parcel, arrayList30, iM19530m23, 1);
                }
                return new C22130W0(string2, enumC22136Z0ValueOf, arrayList29, arrayList30, EnumC2883q.valueOf(parcel.readString()));
            case 28:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22124T0(parcel.readString(), EnumC22128V0.valueOf(parcel.readString()), (AbstractC22196t1) parcel.readParcelable(C22124T0.class.getClassLoader()), C22122S0.CREATOR.createFromParcel(parcel), C22126U0.CREATOR.createFromParcel(parcel));
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22126U0(parcel.readInt() != 0, parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f66854a) {
            case 0:
                return new Suggestion[i10];
            case 1:
                return new C21115a[i10];
            case 2:
                return new C21116b[i10];
            case 3:
                return new C21117c[i10];
            case 4:
                return new C21779i[i10];
            case 5:
                return new C21815a[i10];
            case 6:
                return new C21816b[i10];
            case 7:
                return new C21817c[i10];
            case 8:
                return new C22173m[i10];
            case 9:
                return new C22176n[i10];
            case 10:
                return new C22203w[i10];
            case 11:
                return new C22205x[i10];
            case 12:
                return new C22090C[i10];
            case 13:
                return new C22092D[i10];
            case 14:
                return new C22106K[i10];
            case 15:
                return new C22144c0[i10];
            case 16:
                return new C22147d0[i10];
            case 17:
                return new C22150e0[i10];
            case 18:
                return new C22153f0[i10];
            case 19:
                return new C22156g0[i10];
            case 20:
                return new C22159h0[i10];
            case 21:
                return new C22162i0[i10];
            case 22:
                return new C22168k0[i10];
            case 23:
                return new C22171l0[i10];
            case 24:
                return new C22174m0[i10];
            case 25:
                return new C22177n0[i10];
            case 26:
                return new C22122S0[i10];
            case 27:
                return new C22130W0[i10];
            case 28:
                return new C22124T0[i10];
            default:
                return new C22126U0[i10];
        }
    }
}
