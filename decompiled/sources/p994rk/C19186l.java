package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ClickableStackComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: rk.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C19186l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        UiComponentConfig.ClickableStack clickableStack = (UiComponentConfig.ClickableStack) parcel.readParcelable(ClickableStackComponent.class.getClassLoader());
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        int iM19530m = 0;
        while (iM19530m != i10) {
            iM19530m = AbstractC17792x.m19530m(ClickableStackComponent.class, parcel, arrayList, iM19530m, 1);
        }
        return new ClickableStackComponent(clickableStack, arrayList, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ClickableStackComponent[i10];
    }
}
