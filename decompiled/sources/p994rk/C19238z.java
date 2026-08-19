package p994rk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C19238z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new ESignatureComponent((UiComponentConfig.ESignature) parcel.readParcelable(ESignatureComponent.class.getClassLoader()), (Bitmap) parcel.readParcelable(ESignatureComponent.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ESignatureComponent[i10];
    }
}
