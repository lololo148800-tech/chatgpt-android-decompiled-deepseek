package p046Bk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1378e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        AbstractC16544l.m18094g(parcel, "parcel");
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        int iM19530m = 0;
        while (iM19530m != i10) {
            iM19530m = AbstractC17792x.m19530m(C1383g0.class, parcel, arrayList, iM19530m, 1);
        }
        String string = parcel.readString();
        int i11 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(i11);
        int iM19530m2 = 0;
        while (iM19530m2 != i11) {
            iM19530m2 = AbstractC17792x.m19530m(C1383g0.class, parcel, arrayList2, iM19530m2, 1);
        }
        StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(C1383g0.class.getClassLoader());
        String string2 = parcel.readString();
        C1381f0 c1381f0CreateFromParcel = parcel.readInt() == 0 ? null : C1381f0.CREATOR.createFromParcel(parcel);
        boolean z6 = parcel.readInt() != 0;
        InterfaceC1389j0 interfaceC1389j0 = (InterfaceC1389j0) parcel.readParcelable(C1383g0.class.getClassLoader());
        boolean z10 = parcel.readInt() != 0;
        boolean z11 = parcel.readInt() != 0;
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int i12 = parcel.readInt();
            linkedHashMap = new LinkedHashMap(i12);
            int i13 = 0;
            while (i13 != i12) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(C1383g0.class.getClassLoader()));
                i13++;
                i12 = i12;
            }
        }
        return new C1383g0(arrayList, string, arrayList2, uiStepStyle, string2, c1381f0CreateFromParcel, z6, interfaceC1389j0, z10, z11, linkedHashMap, (InterfaceC19201o2) parcel.readParcelable(C1383g0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C1383g0[i10];
    }
}
