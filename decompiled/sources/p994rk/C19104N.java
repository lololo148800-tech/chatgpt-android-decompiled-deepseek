package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C19104N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new C19107O((UiComponentConfig.CombinedStepImagePreview) parcel.readParcelable(C19107O.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C19107O[i10];
    }
}
