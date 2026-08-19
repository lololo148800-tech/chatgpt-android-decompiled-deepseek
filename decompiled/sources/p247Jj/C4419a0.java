package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0517b;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Jj.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4419a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        String string;
        AbstractC16544l.m18094g(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        AbstractC4413V0 abstractC4413V0 = (AbstractC4413V0) parcel.readParcelable(C4421b0.class.getClassLoader());
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(C4421b0.class.getClassLoader());
        NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(C4421b0.class.getClassLoader());
        String string4 = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(i10);
        int iM19530m = 0;
        while (iM19530m != i10) {
            iM19530m = AbstractC17792x.m19530m(C4421b0.class, parcel, arrayList2, iM19530m, 1);
        }
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        boolean z6 = parcel.readInt() != 0;
        boolean z10 = parcel.readInt() != 0;
        NextStep.GovernmentId.Localizations localizations = (NextStep.GovernmentId.Localizations) parcel.readParcelable(C4421b0.class.getClassLoader());
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i11 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i11);
            int iM19530m2 = 0;
            while (iM19530m2 != i11) {
                iM19530m2 = AbstractC17792x.m19530m(C4421b0.class, parcel, arrayList3, iM19530m2, 1);
                i11 = i11;
            }
            arrayList = arrayList3;
        }
        int i12 = parcel.readInt();
        ArrayList arrayList4 = new ArrayList(i12);
        int i13 = 0;
        while (i13 != i12) {
            arrayList4.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
            i13++;
            i12 = i12;
        }
        int i14 = parcel.readInt();
        long j10 = parcel.readLong();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        boolean z11 = parcel.readInt() != 0;
        int i15 = parcel.readInt();
        ArrayList arrayList5 = new ArrayList(i15);
        int i16 = 0;
        while (i16 != i15) {
            arrayList5.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
            i16++;
            i15 = i15;
        }
        int i17 = parcel.readInt();
        ArrayList arrayList6 = new ArrayList(i17);
        int i18 = 0;
        while (true) {
            string = parcel.readString();
            if (i18 == i17) {
                break;
            }
            arrayList6.add(NextStep.GovernmentId.VideoCaptureMethod.valueOf(string));
            i18++;
            i17 = i17;
        }
        return new C4421b0(string2, string3, abstractC4413V0, governmentIdStepStyle, cancelDialog, string4, arrayList2, string5, string6, z6, z10, localizations, arrayList, arrayList4, i14, j10, string7, string8, z11, arrayList5, arrayList6, string, (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(C4421b0.class.getClassLoader()), (C0517b) parcel.readParcelable(C4421b0.class.getClassLoader()), StyleElements.Axis.valueOf(parcel.readString()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C4421b0[i10];
    }
}
