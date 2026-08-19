package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxGroupComponent;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C19133X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        UiComponentConfig.InputCheckboxGroup inputCheckboxGroup = (UiComponentConfig.InputCheckboxGroup) parcel.readParcelable(InputCheckboxGroupComponent.class.getClassLoader());
        int i10 = parcel.readInt();
        LinkedHashSet linkedHashSet = new LinkedHashSet(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            linkedHashSet.add(parcel.readString());
        }
        return new InputCheckboxGroupComponent(inputCheckboxGroup, linkedHashSet);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new InputCheckboxGroupComponent[i10];
    }
}
