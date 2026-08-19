package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0517b;
import p1088wk.C21006a;

/* JADX INFO: renamed from: zj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C22173m implements InterfaceC22179o {
    public static final Parcelable.Creator<C22173m> CREATOR = new C21006a(8);

    /* JADX INFO: renamed from: Y */
    public final C0517b f70206Y;

    public C22173m(C0517b config) {
        AbstractC16544l.m18094g(config, "config");
        this.f70206Y = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22173m) && AbstractC16544l.m18089b(this.f70206Y, ((C22173m) obj).f70206Y);
    }

    public final int hashCode() {
        return this.f70206Y.hashCode();
    }

    public final String toString() {
        return "AutoClassifyConfig(config=" + this.f70206Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70206Y.writeToParcel(out, i10);
    }
}
