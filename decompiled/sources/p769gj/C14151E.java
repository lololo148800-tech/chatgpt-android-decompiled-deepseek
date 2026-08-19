package p769gj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: gj.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C14151E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        AbstractC16544l.m18094g(source, "source");
        return new C14152F(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C14152F[i10];
    }
}
