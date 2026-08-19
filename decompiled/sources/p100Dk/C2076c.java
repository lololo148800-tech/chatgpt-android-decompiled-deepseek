package p100Dk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Dk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2076c extends AbstractC2082i {
    public static final Parcelable.Creator<C2076c> CREATOR = new C0516a(20);

    /* JADX INFO: renamed from: Y */
    public final Number f6413Y;

    public C2076c(Number value) {
        AbstractC16544l.m18094g(value, "value");
        this.f6413Y = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeSerializable(this.f6413Y);
    }
}
