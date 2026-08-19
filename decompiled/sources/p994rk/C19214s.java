package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import pk.C18500e;

/* JADX INFO: renamed from: rk.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C19214s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new C19218t((UiComponentConfig.CreatePersonaSheet) parcel.readParcelable(C19218t.class.getClassLoader()), (UiComponentConfig.CreatePersonaSheet.CardCtaPage) parcel.readParcelable(C19218t.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, C18500e.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C19218t[i10];
    }
}
