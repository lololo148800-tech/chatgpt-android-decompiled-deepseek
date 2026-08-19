package p1044uj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: uj.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20363t0 implements Parcelable.Creator {
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
                iM19530m = AbstractC17792x.m19530m(C20365u0.class, parcel, arrayList2, iM19530m, 1);
            }
            arrayList = arrayList2;
        }
        return new C20365u0(arrayList, (StepStyles.UiStepStyle) parcel.readParcelable(C20365u0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C20365u0[i10];
    }
}
