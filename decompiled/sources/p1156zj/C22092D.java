package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1088wk.C21006a;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: zj.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C22092D implements InterfaceC22096F {
    public static final Parcelable.Creator<C22092D> CREATOR = new C21006a(13);

    /* JADX INFO: renamed from: Y */
    public final List f69830Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC22094E f69831Z;

    /* JADX INFO: renamed from: o0 */
    public final String f69832o0;

    /* JADX INFO: renamed from: p0 */
    public final EnumC22088B f69833p0;

    public C22092D(List list, EnumC22094E side, String idClassKey, EnumC22088B captureMethod) {
        AbstractC16544l.m18094g(side, "side");
        AbstractC16544l.m18094g(idClassKey, "idClassKey");
        AbstractC16544l.m18094g(captureMethod, "captureMethod");
        this.f69830Y = list;
        this.f69831Z = side;
        this.f69832o0 = idClassKey;
        this.f69833p0 = captureMethod;
    }

    @Override // p1156zj.InterfaceC22096F
    /* JADX INFO: renamed from: P */
    public final EnumC22088B mo22348P() {
        return this.f69833p0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22092D)) {
            return false;
        }
        C22092D c22092d = (C22092D) obj;
        return AbstractC16544l.m18089b(this.f69830Y, c22092d.f69830Y) && this.f69831Z == c22092d.f69831Z && AbstractC16544l.m18089b(this.f69832o0, c22092d.f69832o0) && this.f69833p0 == c22092d.f69833p0;
    }

    public final int hashCode() {
        return this.f69833p0.hashCode() + AbstractC0168G.m527p((this.f69831Z.hashCode() + (this.f69830Y.hashCode() * 31)) * 31, 31, this.f69832o0);
    }

    @Override // p1156zj.InterfaceC22096F
    /* JADX INFO: renamed from: j0 */
    public final List mo22349j0() {
        return this.f69830Y;
    }

    @Override // p1156zj.InterfaceC22096F
    /* JADX INFO: renamed from: m */
    public final String mo22350m() {
        return this.f69832o0;
    }

    public final String toString() {
        return "GovernmentIdVideo(frames=" + this.f69830Y + ", side=" + this.f69831Z + ", idClassKey=" + this.f69832o0 + ", captureMethod=" + this.f69833p0 + Separators.RPAREN;
    }

    @Override // p1156zj.InterfaceC22096F
    /* JADX INFO: renamed from: v0 */
    public final EnumC22094E mo22351v0() {
        return this.f69831Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f69830Y, out);
        while (itM19536s.hasNext()) {
            ((C22205x) itM19536s.next()).writeToParcel(out, i10);
        }
        out.writeString(this.f69831Z.name());
        out.writeString(this.f69832o0);
        out.writeString(this.f69833p0.name());
    }
}
