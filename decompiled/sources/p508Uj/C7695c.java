package p508Uj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Uj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7695c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        String string = parcel.readString();
        C7693a c7693aCreateFromParcel = C7693a.CREATOR.createFromParcel(parcel);
        C7703k c7703kCreateFromParcel = C7703k.CREATOR.createFromParcel(parcel);
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            arrayList.add(EnumC7694b.valueOf(parcel.readString()));
        }
        return new C7696d(string, c7693aCreateFromParcel, c7703kCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (StepStyles.UiStepStyle) parcel.readParcelable(C7696d.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C7696d[i10];
    }
}
