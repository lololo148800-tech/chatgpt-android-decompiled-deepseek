package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4423c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        AbstractC16544l.m18094g(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
        AbstractC4413V0 abstractC4413V0 = (AbstractC4413V0) parcel.readParcelable(C4425d0.class.getClassLoader());
        StepStyles.SelfieStepStyle selfieStepStyle = (StepStyles.SelfieStepStyle) parcel.readParcelable(C4425d0.class.getClassLoader());
        NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(C4425d0.class.getClassLoader());
        NextStep.Selfie.CaptureMethod captureMethodValueOf = NextStep.Selfie.CaptureMethod.valueOf(parcel.readString());
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        boolean z6 = parcel.readInt() != 0;
        boolean z10 = parcel.readInt() != 0;
        String string5 = parcel.readString();
        boolean z11 = parcel.readInt() != 0;
        boolean z12 = parcel.readInt() != 0;
        NextStep.Selfie.Localizations localizations = (NextStep.Selfie.Localizations) parcel.readParcelable(C4425d0.class.getClassLoader());
        int i10 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            arrayList2.add(NextStep.Selfie.CaptureFileType.valueOf(parcel.readString()));
        }
        int i12 = parcel.readInt();
        ArrayList arrayList3 = new ArrayList(i12);
        int i13 = 0;
        while (i13 != i12) {
            arrayList3.add(NextStep.Selfie.VideoCaptureMethod.valueOf(parcel.readString()));
            i13++;
            i12 = i12;
        }
        NextStep.Selfie.AssetConfig assetConfig = (NextStep.Selfie.AssetConfig) parcel.readParcelable(C4425d0.class.getClassLoader());
        String string6 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i14 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i14);
            int i15 = 0;
            while (i15 != i14) {
                arrayList4.add(NextStep.Selfie.SelfiePose.valueOf(parcel.readString()));
                i15++;
                i14 = i14;
            }
            arrayList = arrayList4;
        }
        return new C4425d0(string, string2, abstractC4413V0, selfieStepStyle, cancelDialog, captureMethodValueOf, string3, string4, z6, z10, string5, z11, z12, localizations, arrayList2, arrayList3, assetConfig, string6, arrayList, PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C4425d0[i10];
    }
}
