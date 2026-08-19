package p1087wj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p770gk.InterfaceC14188d;
import p911o0.AbstractC17792x;
import p960q9.C18658l;

/* JADX INFO: renamed from: wj.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C20972C implements InterfaceC14188d {
    public static final Parcelable.Creator<C20972C> CREATOR = new C18658l(29);

    /* JADX INFO: renamed from: Y */
    public final String f66783Y;

    /* JADX INFO: renamed from: Z */
    public final List f66784Z;

    public C20972C(String stepName, List list) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f66783Y = stepName;
        this.f66784Z = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20972C)) {
            return false;
        }
        C20972C c20972c = (C20972C) obj;
        return AbstractC16544l.m18089b(this.f66783Y, c20972c.f66783Y) && AbstractC16544l.m18089b(this.f66784Z, c20972c.f66784Z);
    }

    public final int hashCode() {
        return this.f66784Z.hashCode() + (this.f66783Y.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentStepData(stepName=" + this.f66783Y + ", documents=" + this.f66784Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f66783Y);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f66784Z, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
    }
}
