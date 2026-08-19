package p100Dk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Dk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2078e extends AbstractC2082i {
    public static final Parcelable.Creator<C2078e> CREATOR = new C0516a(22);

    /* JADX INFO: renamed from: Y */
    public final List f6415Y;

    public C2078e(List value) {
        AbstractC16544l.m18094g(value, "value");
        this.f6415Y = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeStringList(this.f6415Y);
    }
}
