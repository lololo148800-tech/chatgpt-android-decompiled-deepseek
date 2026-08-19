package p838jj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: jj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C16232m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        String string = parcel.readString();
        AbstractC16544l.m18091d(string);
        Bundle bundle = parcel.readBundle(C16233n.class.getClassLoader());
        AbstractC16544l.m18091d(bundle);
        return new C16233n(string, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C16233n[i10];
    }
}
