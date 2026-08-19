package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import kotlin.jvm.internal.AbstractC16544l;
import sk.C19664c;

/* JADX INFO: renamed from: rk.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C19080F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new GovernmentIdNfcScanComponent((UiComponentConfig.GovernmentIdNfcScan) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C19664c.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new GovernmentIdNfcScanComponent[i10];
    }
}
