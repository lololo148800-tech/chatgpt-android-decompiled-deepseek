package p508Uj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Uj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C7698f extends AbstractC7701i {
    public static final Parcelable.Creator<C7698f> CREATOR = new C4576X(17);

    /* JADX INFO: renamed from: Y */
    public final String f24245Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC7699g f24246Z;

    public C7698f(String str, EnumC7699g cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f24245Y = str;
        this.f24246Z = cause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f24245Y);
        out.writeString(this.f24246Z.name());
    }
}
