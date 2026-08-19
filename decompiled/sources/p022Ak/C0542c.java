package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ak.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0542c implements Parcelable {
    public static final Parcelable.Creator<C0542c> CREATOR = new C0516a(3);

    /* JADX INFO: renamed from: Y */
    public final File f1721Y;

    public C0542c(File data) {
        AbstractC16544l.m18094g(data, "data");
        this.f1721Y = data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0542c) && AbstractC16544l.m18089b(this.f1721Y, ((C0542c) obj).f1721Y);
    }

    public final int hashCode() {
        return this.f1721Y.hashCode();
    }

    public final String toString() {
        return "DocumentFile(data=" + this.f1721Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeSerializable(this.f1721Y);
    }
}
