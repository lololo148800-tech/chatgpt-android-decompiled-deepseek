package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ak.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C0553n extends AbstractC0554o {
    public static final Parcelable.Creator<C0553n> CREATOR = new C0516a(11);

    /* JADX INFO: renamed from: Y */
    public final String f1762Y;

    /* JADX INFO: renamed from: Z */
    public final LinkedHashMap f1763Z;

    public C0553n(String stepName, LinkedHashMap linkedHashMap) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f1762Y = stepName;
        this.f1763Z = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0553n)) {
            return false;
        }
        C0553n c0553n = (C0553n) obj;
        return AbstractC16544l.m18089b(this.f1762Y, c0553n.f1762Y) && this.f1763Z.equals(c0553n.f1763Z);
    }

    public final int hashCode() {
        return this.f1763Z.hashCode() + (this.f1762Y.hashCode() * 31);
    }

    public final String toString() {
        return "UiStepData(stepName=" + this.f1762Y + ", componentParams=" + this.f1763Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f1762Y);
        LinkedHashMap linkedHashMap = this.f1763Z;
        out.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeValue(entry.getValue());
        }
    }
}
