package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.I1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19091I1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new C19094J1((UiComponentConfig.RemoteImage) parcel.readParcelable(C19094J1.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C19094J1[i10];
    }
}
