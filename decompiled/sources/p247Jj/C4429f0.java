package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Jj.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4429f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        AbstractC16544l.m18094g(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
        AbstractC4413V0 abstractC4413V0 = (AbstractC4413V0) parcel.readParcelable(C4431g0.class.getClassLoader());
        StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(C4431g0.class.getClassLoader());
        NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(C4431g0.class.getClassLoader());
        NextStep.C12890Ui.Localizations localizations = (NextStep.C12890Ui.Localizations) parcel.readParcelable(C4431g0.class.getClassLoader());
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(i10);
        int iM19530m = 0;
        while (iM19530m != i10) {
            iM19530m = AbstractC17792x.m19530m(C4431g0.class, parcel, arrayList2, iM19530m, 1);
        }
        boolean z6 = parcel.readInt() != 0;
        boolean z10 = parcel.readInt() != 0;
        boolean z11 = parcel.readInt() != 0;
        int i11 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
        int i12 = 0;
        while (i12 != i11) {
            linkedHashMap.put(parcel.readString(), parcel.readParcelable(C4431g0.class.getClassLoader()));
            i12++;
            i11 = i11;
            z10 = z10;
        }
        boolean z12 = z10;
        String string5 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            int iM19530m2 = 0;
            while (iM19530m2 != i13) {
                iM19530m2 = AbstractC17792x.m19530m(C4431g0.class, parcel, arrayList3, iM19530m2, 1);
                i13 = i13;
            }
            arrayList = arrayList3;
        }
        return new C4431g0(string, string2, abstractC4413V0, uiStepStyle, cancelDialog, localizations, string3, string4, arrayList2, z6, z12, z11, linkedHashMap, string5, arrayList, (C17062e) parcel.readParcelable(C4431g0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C4431g0[i10];
    }
}
