package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p960q9.C18658l;

/* JADX INFO: renamed from: rk.A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19067A1 implements Parcelable {
    public static final Parcelable.Creator<C19067A1> CREATOR = new C18658l(2);

    /* JADX INFO: renamed from: Y */
    public final String f60744Y;

    /* JADX INFO: renamed from: Z */
    public final String f60745Z;

    public C19067A1(String text, String value) {
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(value, "value");
        this.f60744Y = text;
        this.f60745Z = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19067A1)) {
            return false;
        }
        C19067A1 c19067a1 = (C19067A1) obj;
        return AbstractC16544l.m18089b(this.f60744Y, c19067a1.f60744Y) && AbstractC16544l.m18089b(this.f60745Z, c19067a1.f60745Z);
    }

    public final int hashCode() {
        return this.f60745Z.hashCode() + (this.f60744Y.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Option(text=");
        sb2.append(this.f60744Y);
        sb2.append(", value=");
        return AbstractC9306j0.m9891j(this.f60745Z, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f60744Y);
        out.writeString(this.f60745Z);
    }
}
