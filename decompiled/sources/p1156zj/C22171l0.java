package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;
import p909nm.C17689w;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: zj.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22171l0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22171l0> CREATOR = new C21006a(23);

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f70164Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70165o0;

    /* JADX INFO: renamed from: p0 */
    public final List f70166p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractC22180o0 f70167q0;

    /* JADX INFO: renamed from: r0 */
    public final int f70168r0;

    /* JADX INFO: renamed from: s0 */
    public final C22130W0 f70169s0;

    /* JADX INFO: renamed from: t0 */
    public final String f70170t0;

    public C22171l0(C22139a1 currentPart, List uploadingIds, List parts, AbstractC22180o0 abstractC22180o0, int i10, C22130W0 c22130w0, String str) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(parts, "parts");
        this.f70164Z = currentPart;
        this.f70165o0 = uploadingIds;
        this.f70166p0 = parts;
        this.f70167q0 = abstractC22180o0;
        this.f70168r0 = i10;
        this.f70169s0 = c22130w0;
        this.f70170t0 = str;
    }

    /* JADX INFO: renamed from: i */
    public static C22171l0 m22396i(C22171l0 c22171l0, String str) {
        C22139a1 currentPart = c22171l0.f70164Z;
        List uploadingIds = c22171l0.f70165o0;
        List parts = c22171l0.f70166p0;
        AbstractC22180o0 abstractC22180o0 = c22171l0.f70167q0;
        int i10 = c22171l0.f70168r0;
        C22130W0 c22130w0 = c22171l0.f70169s0;
        c22171l0.getClass();
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(parts, "parts");
        return new C22171l0(currentPart, uploadingIds, parts, abstractC22180o0, i10, c22130w0, str);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70167q0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70164Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22171l0)) {
            return false;
        }
        C22171l0 c22171l0 = (C22171l0) obj;
        return AbstractC16544l.m18089b(this.f70164Z, c22171l0.f70164Z) && AbstractC16544l.m18089b(this.f70165o0, c22171l0.f70165o0) && AbstractC16544l.m18089b(this.f70166p0, c22171l0.f70166p0) && AbstractC16544l.m18089b(this.f70167q0, c22171l0.f70167q0) && this.f70168r0 == c22171l0.f70168r0 && AbstractC16544l.m18089b(this.f70169s0, c22171l0.f70169s0) && AbstractC16544l.m18089b(this.f70170t0, c22171l0.f70170t0);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70168r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70166p0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70165o0;
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f70166p0, AbstractC14376f.m15858x(this.f70165o0, this.f70164Z.f69986Y.hashCode() * 31, 31), 31);
        AbstractC22180o0 abstractC22180o0 = this.f70167q0;
        int iHashCode = (((iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31) + this.f70168r0) * 31;
        C22130W0 c22130w0 = this.f70169s0;
        int iHashCode2 = (iHashCode + (c22130w0 == null ? 0 : c22130w0.hashCode())) * 31;
        String str = this.f70170t0;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowInstructions(currentPart=");
        sb2.append(this.f70164Z);
        sb2.append(", uploadingIds=");
        sb2.append(this.f70165o0);
        sb2.append(", parts=");
        sb2.append(this.f70166p0);
        sb2.append(", backState=");
        sb2.append(this.f70167q0);
        sb2.append(", partIndex=");
        sb2.append(this.f70168r0);
        sb2.append(", selectedId=");
        sb2.append(this.f70169s0);
        sb2.append(", error=");
        return AbstractC9306j0.m9891j(this.f70170t0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f70164Z, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70165o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70166p0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeParcelable(this.f70167q0, i10);
        out.writeInt(this.f70168r0);
        C22130W0 c22130w0 = this.f70169s0;
        if (c22130w0 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c22130w0.writeToParcel(out, i10);
        }
        out.writeString(this.f70170t0);
    }

    public /* synthetic */ C22171l0() {
        C22139a1 c22139a1 = new C22139a1(EnumC22128V0.Front);
        C17689w c17689w = C17689w.f56480Y;
        this(c22139a1, c17689w, c17689w, null, -1, null, null);
    }
}
