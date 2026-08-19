package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputRadioGroupComponent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.F0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19081F0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new InputRadioGroupComponent((UiComponentConfig.InputRadioGroup) parcel.readParcelable(InputRadioGroupComponent.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new InputRadioGroupComponent[i10];
    }
}
