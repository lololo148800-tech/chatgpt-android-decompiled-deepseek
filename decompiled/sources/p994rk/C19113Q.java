package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.network.Suggestion;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: rk.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19113Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        AbstractC16544l.m18094g(parcel, "parcel");
        UiComponentConfig.InputAddress inputAddress = (UiComponentConfig.InputAddress) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i10 = parcel.readInt();
            arrayList = new ArrayList(i10);
            int iM21251v = 0;
            while (iM21251v != i10) {
                iM21251v = AbstractC20734X.m21251v(Suggestion.CREATOR, parcel, arrayList, iM21251v, 1);
            }
        }
        String string7 = parcel.readString();
        if (parcel.readInt() == 0) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
        }
        if (parcel.readInt() == 0) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
        }
        return new InputAddressComponent(inputAddress, string, string2, string3, string4, string5, string6, arrayList, string7, boolValueOf, boolValueOf2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new InputAddressComponent[i10];
    }
}
