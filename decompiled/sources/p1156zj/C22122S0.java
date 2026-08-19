package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p909nm.C17689w;
import p949pj.C18475l;

/* JADX INFO: renamed from: zj.S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22122S0 implements Parcelable {
    public static final Parcelable.Creator<C22122S0> CREATOR = new C21006a(26);

    /* JADX INFO: renamed from: Y */
    public final C18475l f69932Y;

    public C22122S0(C18475l ruleSet) {
        AbstractC16544l.m18094g(ruleSet, "ruleSet");
        this.f69932Y = ruleSet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22122S0) && AbstractC16544l.m18089b(this.f69932Y, ((C22122S0) obj).f69932Y);
    }

    public final int hashCode() {
        return this.f69932Y.f58917Y.hashCode();
    }

    public final String toString() {
        return "AutoCaptureConfig(ruleSet=" + this.f69932Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f69932Y, i10);
    }

    public /* synthetic */ C22122S0() {
        this(new C18475l(C17689w.f56480Y));
    }
}
