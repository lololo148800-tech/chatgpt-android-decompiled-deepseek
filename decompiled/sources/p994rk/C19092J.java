package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: rk.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C19092J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        UiComponentConfig.HorizontalStack horizontalStack = (UiComponentConfig.HorizontalStack) parcel.readParcelable(C19095K.class.getClassLoader());
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        int iM19530m = 0;
        while (iM19530m != i10) {
            iM19530m = AbstractC17792x.m19530m(C19095K.class, parcel, arrayList, iM19530m, 1);
        }
        return new C19095K(horizontalStack, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C19095K[i10];
    }
}
