package p838jj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: jj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C16234o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        AbstractC16544l.m18094g(source, "source");
        return new C16235p(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C16235p[i10];
    }
}
