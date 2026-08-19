package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1088wk.C21006a;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: zj.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C22090C implements InterfaceC22096F {
    public static final Parcelable.Creator<C22090C> CREATOR = new C21006a(12);

    /* JADX INFO: renamed from: Y */
    public final List f69822Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC22094E f69823Z;

    /* JADX INFO: renamed from: o0 */
    public final String f69824o0;

    /* JADX INFO: renamed from: p0 */
    public final EnumC22088B f69825p0;

    /* JADX INFO: renamed from: q0 */
    public final RawExtraction f69826q0;

    /* JADX INFO: renamed from: r0 */
    public final C22106K f69827r0;

    public C22090C(List list, EnumC22094E side, String idClassKey, EnumC22088B captureMethod, RawExtraction rawExtraction, C22106K c22106k) {
        AbstractC16544l.m18094g(side, "side");
        AbstractC16544l.m18094g(idClassKey, "idClassKey");
        AbstractC16544l.m18094g(captureMethod, "captureMethod");
        this.f69822Y = list;
        this.f69823Z = side;
        this.f69824o0 = idClassKey;
        this.f69825p0 = captureMethod;
        this.f69826q0 = rawExtraction;
        this.f69827r0 = c22106k;
    }

    @Override // p1156zj.InterfaceC22096F
    /* JADX INFO: renamed from: P */
    public final EnumC22088B mo22348P() {
        return this.f69825p0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22090C)) {
            return false;
        }
        C22090C c22090c = (C22090C) obj;
        return AbstractC16544l.m18089b(this.f69822Y, c22090c.f69822Y) && this.f69823Z == c22090c.f69823Z && AbstractC16544l.m18089b(this.f69824o0, c22090c.f69824o0) && this.f69825p0 == c22090c.f69825p0 && AbstractC16544l.m18089b(this.f69826q0, c22090c.f69826q0) && AbstractC16544l.m18089b(this.f69827r0, c22090c.f69827r0);
    }

    public final int hashCode() {
        int iHashCode = (this.f69825p0.hashCode() + AbstractC0168G.m527p((this.f69823Z.hashCode() + (this.f69822Y.hashCode() * 31)) * 31, 31, this.f69824o0)) * 31;
        RawExtraction rawExtraction = this.f69826q0;
        int iHashCode2 = (iHashCode + (rawExtraction == null ? 0 : rawExtraction.hashCode())) * 31;
        C22106K c22106k = this.f69827r0;
        return iHashCode2 + (c22106k != null ? c22106k.hashCode() : 0);
    }

    @Override // p1156zj.InterfaceC22096F
    /* JADX INFO: renamed from: j0 */
    public final List mo22349j0() {
        return this.f69822Y;
    }

    @Override // p1156zj.InterfaceC22096F
    /* JADX INFO: renamed from: m */
    public final String mo22350m() {
        return this.f69824o0;
    }

    public final String toString() {
        return "GovernmentIdImage(frames=" + this.f69822Y + ", side=" + this.f69823Z + ", idClassKey=" + this.f69824o0 + ", captureMethod=" + this.f69825p0 + ", rawExtraction=" + this.f69826q0 + ", idDetails=" + this.f69827r0 + Separators.RPAREN;
    }

    @Override // p1156zj.InterfaceC22096F
    /* JADX INFO: renamed from: v0 */
    public final EnumC22094E mo22351v0() {
        return this.f69823Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f69822Y, out);
        while (itM19536s.hasNext()) {
            ((C22205x) itM19536s.next()).writeToParcel(out, i10);
        }
        out.writeString(this.f69823Z.name());
        out.writeString(this.f69824o0);
        out.writeString(this.f69825p0.name());
        RawExtraction rawExtraction = this.f69826q0;
        if (rawExtraction == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rawExtraction.writeToParcel(out, i10);
        }
        C22106K c22106k = this.f69827r0;
        if (c22106k == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c22106k.writeToParcel(out, i10);
        }
    }
}
