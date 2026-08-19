package p149Fj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Fj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C2879m implements Parcelable {
    public static final Parcelable.Creator<C2879m> CREATOR = new C2566j(6);

    /* JADX INFO: renamed from: Y */
    public final List f8660Y;

    public C2879m(List previousFramesMetadata) {
        AbstractC16544l.m18094g(previousFramesMetadata, "previousFramesMetadata");
        this.f8660Y = previousFramesMetadata;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2879m) && AbstractC16544l.m18089b(this.f8660Y, ((C2879m) obj).f8660Y);
    }

    public final int hashCode() {
        return this.f8660Y.hashCode();
    }

    public final String toString() {
        return "AutocaptureState(previousFramesMetadata=" + this.f8660Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f8660Y, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
    }
}
