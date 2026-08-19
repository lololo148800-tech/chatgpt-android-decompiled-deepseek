package p366Oj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Oj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6260b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        AbstractC16544l.m18094g(source, "source");
        return new C6261c(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C6261c[i10];
    }
}
