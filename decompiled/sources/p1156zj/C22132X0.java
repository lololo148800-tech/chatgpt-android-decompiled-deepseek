package p1156zj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p994rk.C19094J1;

/* JADX INFO: renamed from: zj.X0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22132X0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69964a;

    public /* synthetic */ C22132X0(int i10) {
        this.f69964a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f69964a) {
            case 0:
                AbstractC16544l.m18094g(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                int iM21251v = 0;
                while (iM21251v != i10) {
                    iM21251v = AbstractC20734X.m21251v(C22130W0.CREATOR, parcel, arrayList, iM21251v, 1);
                }
                return new C22134Y0(string, string2, arrayList);
            case 1:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22139a1(EnumC22128V0.valueOf(parcel.readString()));
            case 2:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new RawExtraction(parcel.readString(), parcel.readString());
            case 3:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C22178n1.f70245Y;
            case 4:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C22181o1.f70247Y;
            case 5:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C22184p1((C19094J1) parcel.readParcelable(C22184p1.class.getClassLoader()));
            case 6:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C22187q1.f70254Y;
            case 7:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C22190r1.f70260Y;
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C22193s1.f70317Y;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f69964a) {
            case 0:
                return new C22134Y0[i10];
            case 1:
                return new C22139a1[i10];
            case 2:
                return new RawExtraction[i10];
            case 3:
                return new C22178n1[i10];
            case 4:
                return new C22181o1[i10];
            case 5:
                return new C22184p1[i10];
            case 6:
                return new C22187q1[i10];
            case 7:
                return new C22190r1[i10];
            default:
                return new C22193s1[i10];
        }
    }
}
