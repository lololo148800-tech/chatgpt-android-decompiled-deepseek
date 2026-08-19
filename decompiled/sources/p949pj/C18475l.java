package p949pj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: pj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18475l implements Parcelable {
    public static final Parcelable.Creator<C18475l> CREATOR = new C18461e(5);

    /* JADX INFO: renamed from: Y */
    public final List f58917Y;

    public C18475l(List rules) {
        AbstractC16544l.m18094g(rules, "rules");
        this.f58917Y = rules;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18475l) && AbstractC16544l.m18089b(this.f58917Y, ((C18475l) obj).f58917Y);
    }

    public final int hashCode() {
        return this.f58917Y.hashCode();
    }

    public final String toString() {
        return "AutoCaptureRuleSet(rules=" + this.f58917Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f58917Y, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
    }
}
