package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputNumberComponent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.B0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19069B0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new InputNumberComponent((UiComponentConfig.InputNumber) parcel.readParcelable(InputNumberComponent.class.getClassLoader()), (Number) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new InputNumberComponent[i10];
    }
}
