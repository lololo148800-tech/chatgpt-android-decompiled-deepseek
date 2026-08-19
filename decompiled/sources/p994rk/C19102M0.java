package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: rk.M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19102M0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        UiComponentConfig.InputSelect inputSelect = (UiComponentConfig.InputSelect) parcel.readParcelable(C19105N0.class.getClassLoader());
        UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyle = (UiComponentConfig.InputSelectComponentStyle) parcel.readParcelable(C19105N0.class.getClassLoader());
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        int iM21251v = 0;
        while (iM21251v != i10) {
            iM21251v = AbstractC20734X.m21251v(C19067A1.CREATOR, parcel, arrayList, iM21251v, 1);
        }
        return new C19105N0(inputSelect, inputSelectComponentStyle, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C19105N0[i10];
    }
}
