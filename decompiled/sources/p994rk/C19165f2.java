package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.f2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19165f2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new C19169g2((UiComponentConfig.SubmitButton) parcel.readParcelable(C19169g2.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C19169g2[i10];
    }
}
