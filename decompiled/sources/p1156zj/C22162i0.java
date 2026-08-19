package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22162i0 extends AbstractC22165j0 {
    public static final Parcelable.Creator<C22162i0> CREATOR = new C21006a(21);

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f70080Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70081o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC22179o f70082p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC22096F f70083q0;

    /* JADX INFO: renamed from: r0 */
    public final List f70084r0;

    /* JADX INFO: renamed from: s0 */
    public final int f70085s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractC22180o0 f70086t0;

    /* JADX INFO: renamed from: u0 */
    public final C18428A f70087u0;

    /* JADX INFO: renamed from: v0 */
    public final String f70088v0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f70089w0;

    public C22162i0(C22139a1 currentPart, List uploadingIds, InterfaceC22179o captureConfig, InterfaceC22096F idForReview, List parts, int i10, AbstractC22180o0 abstractC22180o0, C18428A cameraProperties, String str, boolean z6) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        AbstractC16544l.m18094g(idForReview, "idForReview");
        AbstractC16544l.m18094g(parts, "parts");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f70080Z = currentPart;
        this.f70081o0 = uploadingIds;
        this.f70082p0 = captureConfig;
        this.f70083q0 = idForReview;
        this.f70084r0 = parts;
        this.f70085s0 = i10;
        this.f70086t0 = abstractC22180o0;
        this.f70087u0 = cameraProperties;
        this.f70088v0 = str;
        this.f70089w0 = z6;
    }

    /* JADX INFO: renamed from: p */
    public static C22162i0 m22385p(C22162i0 c22162i0, String str, boolean z6, int i10) {
        C22139a1 currentPart = c22162i0.f70080Z;
        List uploadingIds = c22162i0.f70081o0;
        InterfaceC22179o captureConfig = c22162i0.f70082p0;
        InterfaceC22096F idForReview = c22162i0.f70083q0;
        List parts = c22162i0.f70084r0;
        int i11 = c22162i0.f70085s0;
        AbstractC22180o0 abstractC22180o0 = c22162i0.f70086t0;
        C18428A cameraProperties = c22162i0.f70087u0;
        if ((i10 & 256) != 0) {
            str = c22162i0.f70088v0;
        }
        String str2 = str;
        if ((i10 & 512) != 0) {
            z6 = c22162i0.f70089w0;
        }
        c22162i0.getClass();
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        AbstractC16544l.m18094g(idForReview, "idForReview");
        AbstractC16544l.m18094g(parts, "parts");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        return new C22162i0(currentPart, uploadingIds, captureConfig, idForReview, parts, i11, abstractC22180o0, cameraProperties, str2, z6);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: b */
    public final void mo22384b() {
        super.mo22384b();
        Iterator it = this.f70083q0.mo22349j0().iterator();
        while (it.hasNext()) {
            new File(((C22205x) it.next()).f70393Y).delete();
        }
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70086t0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70080Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22162i0)) {
            return false;
        }
        C22162i0 c22162i0 = (C22162i0) obj;
        return AbstractC16544l.m18089b(this.f70080Z, c22162i0.f70080Z) && AbstractC16544l.m18089b(this.f70081o0, c22162i0.f70081o0) && AbstractC16544l.m18089b(this.f70082p0, c22162i0.f70082p0) && AbstractC16544l.m18089b(this.f70083q0, c22162i0.f70083q0) && AbstractC16544l.m18089b(this.f70084r0, c22162i0.f70084r0) && this.f70085s0 == c22162i0.f70085s0 && AbstractC16544l.m18089b(this.f70086t0, c22162i0.f70086t0) && AbstractC16544l.m18089b(this.f70087u0, c22162i0.f70087u0) && AbstractC16544l.m18089b(this.f70088v0, c22162i0.f70088v0) && this.f70089w0 == c22162i0.f70089w0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70085s0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70084r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70081o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public final int hashCode() {
        int iM15858x = (AbstractC14376f.m15858x(this.f70084r0, (this.f70083q0.hashCode() + ((this.f70082p0.hashCode() + AbstractC14376f.m15858x(this.f70081o0, this.f70080Z.f69986Y.hashCode() * 31, 31)) * 31)) * 31, 31) + this.f70085s0) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f70086t0;
        int iHashCode = (this.f70087u0.hashCode() + ((iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31)) * 31;
        String str = this.f70088v0;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z6 = this.f70089w0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode2 + r6;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: i */
    public final C18428A mo22386i() {
        return this.f70087u0;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: j */
    public final InterfaceC22179o mo22387j() {
        return this.f70082p0;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: l */
    public final C22139a1 mo22388l() {
        return this.f70080Z;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: n */
    public final InterfaceC22096F mo22389n() {
        return this.f70083q0;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: o */
    public final AbstractC22165j0 mo22390o(boolean z6) {
        return m22385p(this, null, z6, 511);
    }

    public final String toString() {
        return "ReviewCapturedImage(currentPart=" + this.f70080Z + ", uploadingIds=" + this.f70081o0 + ", captureConfig=" + this.f70082p0 + ", idForReview=" + this.f70083q0 + ", parts=" + this.f70084r0 + ", partIndex=" + this.f70085s0 + ", backState=" + this.f70086t0 + ", cameraProperties=" + this.f70087u0 + ", error=" + this.f70088v0 + ", submittingForAutoClassification=" + this.f70089w0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70080Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70081o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeParcelable(this.f70082p0, i10);
        out.writeParcelable(this.f70083q0, i10);
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70084r0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70085s0);
        out.writeParcelable(this.f70086t0, i10);
        out.writeParcelable(this.f70087u0, i10);
        out.writeString(this.f70088v0);
        out.writeInt(this.f70089w0 ? 1 : 0);
    }
}
