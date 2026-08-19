package p100Dk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;
import p770gk.InterfaceC14188d;

/* JADX INFO: renamed from: Dk.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C2095v implements InterfaceC14188d {
    public static final Parcelable.Creator<C2095v> CREATOR = new C0516a(26);

    /* JADX INFO: renamed from: Y */
    public final String f6442Y;

    /* JADX INFO: renamed from: Z */
    public final Map f6443Z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2095v)) {
            return false;
        }
        C2095v c2095v = (C2095v) obj;
        return AbstractC16544l.m18089b(this.f6442Y, c2095v.f6442Y) && AbstractC16544l.m18089b(this.f6443Z, c2095v.f6443Z);
    }

    public final int hashCode() {
        return this.f6443Z.hashCode() + (this.f6442Y.hashCode() * 31);
    }

    public final String toString() {
        return "UiStepData(stepName=" + this.f6442Y + ", componentParams=" + this.f6443Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f6442Y);
        Map map = this.f6443Z;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeParcelable((Parcelable) entry.getValue(), i10);
        }
    }

    public C2095v(String stepName, Map map) {
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(map, lZYtIbClQJm.QwRkDUaTQRM);
        this.f6442Y = stepName;
        this.f6443Z = map;
    }
}
