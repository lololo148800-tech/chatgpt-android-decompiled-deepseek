package p931ok;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ok.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18228i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        AbstractC16544l.m18094g(source, "source");
        return new C18229j(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C18229j[i10];
    }
}
