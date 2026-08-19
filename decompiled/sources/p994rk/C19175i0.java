package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputDateComponent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19175i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new InputDateComponent((UiComponentConfig.InputDate) parcel.readParcelable(InputDateComponent.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new InputDateComponent[i10];
    }
}
