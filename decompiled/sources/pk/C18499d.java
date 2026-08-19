package pk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: pk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18499d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        AbstractC16544l.m18094g(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i10 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i10);
            int iM19530m = 0;
            while (iM19530m != i10) {
                iM19530m = AbstractC17792x.m19530m(C18500e.class, parcel, arrayList2, iM19530m, 1);
            }
            arrayList = arrayList2;
        }
        return new C18500e(arrayList, (StepStyles.UiStepStyle) parcel.readParcelable(C18500e.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C18500e[i10];
    }
}
