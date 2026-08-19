package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputPhoneNumberComponent;
import kotlin.jvm.internal.AbstractC16544l;
import p138F8.vJO.vRJidSveZHcTw;

/* JADX INFO: renamed from: rk.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19075D0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new InputPhoneNumberComponent[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, vRJidSveZHcTw.nWbXJrhhty);
        return new InputPhoneNumberComponent((UiComponentConfig.InputPhoneNumber) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), parcel.readString());
    }
}
