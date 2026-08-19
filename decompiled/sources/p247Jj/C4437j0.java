package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p125Ej.C2566j;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Jj.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4437j0 implements InterfaceC4441l0 {
    public static final Parcelable.Creator<C4437j0> CREATOR = new C2566j(27);

    /* JADX INFO: renamed from: Y */
    public final String f14447Y;

    /* JADX INFO: renamed from: Z */
    public final String f14448Z;

    /* JADX INFO: renamed from: o0 */
    public final Map f14449o0;

    /* JADX INFO: renamed from: p0 */
    public final String f14450p0;

    public C4437j0(String inquiryId, String inquiryStatus, String str, Map fields) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(inquiryStatus, "inquiryStatus");
        AbstractC16544l.m18094g(fields, "fields");
        this.f14447Y = inquiryId;
        this.f14448Z = inquiryStatus;
        this.f14449o0 = fields;
        this.f14450p0 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.InterfaceC4441l0
    /* JADX INFO: renamed from: e */
    public final String mo5201e() {
        return this.f14450p0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4437j0)) {
            return false;
        }
        C4437j0 c4437j0 = (C4437j0) obj;
        return AbstractC16544l.m18089b(this.f14447Y, c4437j0.f14447Y) && AbstractC16544l.m18089b(this.f14448Z, c4437j0.f14448Z) && AbstractC16544l.m18089b(this.f14449o0, c4437j0.f14449o0) && AbstractC16544l.m18089b(this.f14450p0, c4437j0.f14450p0);
    }

    public final int hashCode() {
        int iM21250u = AbstractC20734X.m21250u(AbstractC0168G.m527p(this.f14447Y.hashCode() * 31, 31, this.f14448Z), 31, this.f14449o0);
        String str = this.f14450p0;
        return iM21250u + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Complete(inquiryId=");
        sb2.append(this.f14447Y);
        sb2.append(", inquiryStatus=");
        sb2.append(this.f14448Z);
        sb2.append(", fields=");
        sb2.append(this.f14449o0);
        sb2.append(", sessionToken=");
        return AbstractC9306j0.m9891j(this.f14450p0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14447Y);
        out.writeString(this.f14448Z);
        Map map = this.f14449o0;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeParcelable((Parcelable) entry.getValue(), i10);
        }
        out.writeString(this.f14450p0);
    }
}
