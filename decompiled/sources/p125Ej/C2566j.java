package p125Ej;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$ClassificationFailedResponse;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdAcceptedResponse;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdClassesForCountry;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdRejectedResponse;
import com.withpersona.sdk2.inquiry.internal.InquiryField$BooleanField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$ChoicesField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$DateField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$DatetimeField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$FloatField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$IntegerField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$MultiChoicesField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$StringField;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import p022Ak.EnumC0543d;
import p1071w0.AbstractC20734X;
import p149Fj.C2867a;
import p149Fj.C2879m;
import p149Fj.C2880n;
import p149Fj.C2882p;
import p212I9.C3653a;
import p222Ij.C3736a;
import p222Ij.C3737b;
import p247Jj.AbstractC4413V0;
import p247Jj.C4381F;
import p247Jj.C4389J;
import p247Jj.C4407S0;
import p247Jj.C4412V;
import p247Jj.C4414W;
import p247Jj.C4415X;
import p247Jj.C4427e0;
import p247Jj.C4435i0;
import p247Jj.C4437j0;
import p247Jj.C4439k0;
import p247Jj.EnumC4392K0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Ej.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C2566j implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7998a;

    public /* synthetic */ C2566j(int i10) {
        this.f7998a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        switch (this.f7998a) {
            case 0:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C2567k.f7999Y;
            case 1:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                int iM21251v = 0;
                while (iM21251v != i10) {
                    iM21251v = AbstractC20734X.m21251v(AutoClassifyResponse$IdClassesForCountry.CREATOR, parcel, arrayList, iM21251v, 1);
                }
                return new AutoClassifyResponse$ClassificationFailedResponse(arrayList);
            case 2:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new AutoClassifyResponse$IdAcceptedResponse(parcel.readString(), parcel.readString(), (C12893Id) parcel.readParcelable(AutoClassifyResponse$IdAcceptedResponse.class.getClassLoader()));
            case 3:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int iM19530m = 0;
                while (iM19530m != i11) {
                    iM19530m = AbstractC17792x.m19530m(AutoClassifyResponse$IdClassesForCountry.class, parcel, arrayList2, iM19530m, 1);
                }
                return new AutoClassifyResponse$IdClassesForCountry(string, string2, arrayList2);
            case 4:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iM21251v2 = 0;
                while (iM21251v2 != i12) {
                    iM21251v2 = AbstractC20734X.m21251v(AutoClassifyResponse$IdClassesForCountry.CREATOR, parcel, arrayList3, iM21251v2, 1);
                }
                return new AutoClassifyResponse$IdRejectedResponse(arrayList3);
            case 5:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C2867a.f8636Y;
            case 6:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iM19530m2 = 0;
                while (iM19530m2 != i13) {
                    iM19530m2 = AbstractC17792x.m19530m(C2879m.class, parcel, arrayList4, iM19530m2, 1);
                }
                return new C2879m(arrayList4);
            case 7:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                int iM19530m3 = 0;
                while (iM19530m3 != i14) {
                    iM19530m3 = AbstractC17792x.m19530m(C2880n.class, parcel, arrayList5, iM19530m3, 1);
                }
                return new C2880n(parcel.readString(), parcel.readString(), arrayList5);
            case 8:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string3 = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i15);
                int iM19530m4 = 0;
                while (iM19530m4 != i15) {
                    iM19530m4 = AbstractC17792x.m19530m(C2882p.class, parcel, arrayList6, iM19530m4, 1);
                }
                return new C2882p(string3, arrayList6);
            case 9:
                try {
                    return Transport.m13211a(parcel.readString());
                } catch (C3653a e10) {
                    throw new RuntimeException(e10);
                }
            case 10:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C3736a(parcel.readString(), parcel.readString());
            case 11:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C3737b(parcel.readString());
            case 12:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new InquiryField$BooleanField(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString());
            case 13:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new InquiryField$ChoicesField(parcel.readString(), parcel.readString());
            case 14:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new InquiryField$DateField(parcel.readString(), parcel.readString());
            case 15:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new InquiryField$DatetimeField(parcel.readString(), parcel.readString());
            case 16:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new InquiryField$FloatField(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
            case 17:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new InquiryField$IntegerField(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 18:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new InquiryField$MultiChoicesField(parcel.readString(), parcel.createStringArray());
            case 19:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new InquiryField$StringField(parcel.readString(), parcel.readString());
            case 20:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C4381F(parcel.readString());
            case 21:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readParcelable(C4389J.class.getClassLoader()));
                }
                return new C4389J(linkedHashMap2);
            case 22:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC4413V0 abstractC4413V0 = (AbstractC4413V0) parcel.readParcelable(C4412V.class.getClassLoader());
                String string6 = parcel.readString();
                int i18 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    linkedHashMap3.put(parcel.readString(), parcel.readParcelable(C4412V.class.getClassLoader()));
                }
                return new C4412V(string4, string5, abstractC4413V0, string6, linkedHashMap3);
            case 23:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i20 = parcel.readInt();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(i20);
                    for (int i21 = 0; i21 != i20; i21++) {
                        linkedHashMap4.put(parcel.readString(), parcel.readParcelable(C4414W.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap4;
                }
                return new C4414W(string7, string8, string9, string10, string11, linkedHashMap, parcel.readString(), (StaticInquiryTemplate) parcel.readParcelable(C4414W.class.getClassLoader()), parcel.readInt() != 0);
            case 24:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C4415X(parcel.readString());
            case 25:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C4427e0(parcel.readString(), (AbstractC4413V0) parcel.readParcelable(C4427e0.class.getClassLoader()), parcel.readString(), (StepStyle) parcel.readParcelable(C4427e0.class.getClassLoader()), parcel.readInt() != 0, (C17062e) parcel.readParcelable(C4427e0.class.getClassLoader()));
            case 26:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C4435i0(parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(C4435i0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 27:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                int i22 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(i22);
                for (int i23 = 0; i23 != i22; i23++) {
                    linkedHashMap5.put(parcel.readString(), parcel.readParcelable(C4437j0.class.getClassLoader()));
                }
                return new C4437j0(string12, string13, parcel.readString(), linkedHashMap5);
            case 28:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C4439k0(parcel.readString(), (EnumC0543d) parcel.readParcelable(C4439k0.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(C4439k0.class.getClassLoader()), parcel.readString());
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C4407S0(EnumC4392K0.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f7998a) {
            case 0:
                return new C2567k[i10];
            case 1:
                return new AutoClassifyResponse$ClassificationFailedResponse[i10];
            case 2:
                return new AutoClassifyResponse$IdAcceptedResponse[i10];
            case 3:
                return new AutoClassifyResponse$IdClassesForCountry[i10];
            case 4:
                return new AutoClassifyResponse$IdRejectedResponse[i10];
            case 5:
                return new C2867a[i10];
            case 6:
                return new C2879m[i10];
            case 7:
                return new C2880n[i10];
            case 8:
                return new C2882p[i10];
            case 9:
                return new Transport[i10];
            case 10:
                return new C3736a[i10];
            case 11:
                return new C3737b[i10];
            case 12:
                return new InquiryField$BooleanField[i10];
            case 13:
                return new InquiryField$ChoicesField[i10];
            case 14:
                return new InquiryField$DateField[i10];
            case 15:
                return new InquiryField$DatetimeField[i10];
            case 16:
                return new InquiryField$FloatField[i10];
            case 17:
                return new InquiryField$IntegerField[i10];
            case 18:
                return new InquiryField$MultiChoicesField[i10];
            case 19:
                return new InquiryField$StringField[i10];
            case 20:
                return new C4381F[i10];
            case 21:
                return new C4389J[i10];
            case 22:
                return new C4412V[i10];
            case 23:
                return new C4414W[i10];
            case 24:
                return new C4415X[i10];
            case 25:
                return new C4427e0[i10];
            case 26:
                return new C4435i0[i10];
            case 27:
                return new C4437j0[i10];
            case 28:
                return new C4439k0[i10];
            default:
                return new C4407S0[i10];
        }
    }
}
