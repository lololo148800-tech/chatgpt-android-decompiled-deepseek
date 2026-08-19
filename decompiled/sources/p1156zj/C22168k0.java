package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p174Gk.uSfJ.HpucjswO;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22168k0 extends AbstractC22165j0 {
    public static final Parcelable.Creator<C22168k0> CREATOR = new C21006a(22);

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f70135Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70136o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC22179o f70137p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC22096F f70138q0;

    /* JADX INFO: renamed from: r0 */
    public final String f70139r0;

    /* JADX INFO: renamed from: s0 */
    public final List f70140s0;

    /* JADX INFO: renamed from: t0 */
    public final int f70141t0;

    /* JADX INFO: renamed from: u0 */
    public final AbstractC22180o0 f70142u0;

    /* JADX INFO: renamed from: v0 */
    public final C18428A f70143v0;

    /* JADX INFO: renamed from: w0 */
    public final String f70144w0;

    /* JADX INFO: renamed from: x0 */
    public final boolean f70145x0;

    public C22168k0(C22139a1 currentPart, List uploadingIds, InterfaceC22179o captureConfig, InterfaceC22096F idForReview, String str, List parts, int i10, AbstractC22180o0 abstractC22180o0, C18428A cameraProperties, String str2, boolean z6) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        AbstractC16544l.m18094g(idForReview, "idForReview");
        AbstractC16544l.m18094g(parts, "parts");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f70135Z = currentPart;
        this.f70136o0 = uploadingIds;
        this.f70137p0 = captureConfig;
        this.f70138q0 = idForReview;
        this.f70139r0 = str;
        this.f70140s0 = parts;
        this.f70141t0 = i10;
        this.f70142u0 = abstractC22180o0;
        this.f70143v0 = cameraProperties;
        this.f70144w0 = str2;
        this.f70145x0 = z6;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: b */
    public final void mo22384b() {
        super.mo22384b();
        Iterator it = this.f70138q0.mo22349j0().iterator();
        while (it.hasNext()) {
            new File(((C22205x) it.next()).f70393Y).delete();
        }
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70142u0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70135Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22168k0)) {
            return false;
        }
        C22168k0 c22168k0 = (C22168k0) obj;
        return AbstractC16544l.m18089b(this.f70135Z, c22168k0.f70135Z) && AbstractC16544l.m18089b(this.f70136o0, c22168k0.f70136o0) && AbstractC16544l.m18089b(this.f70137p0, c22168k0.f70137p0) && AbstractC16544l.m18089b(this.f70138q0, c22168k0.f70138q0) && AbstractC16544l.m18089b(this.f70139r0, c22168k0.f70139r0) && AbstractC16544l.m18089b(this.f70140s0, c22168k0.f70140s0) && this.f70141t0 == c22168k0.f70141t0 && AbstractC16544l.m18089b(this.f70142u0, c22168k0.f70142u0) && AbstractC16544l.m18089b(this.f70143v0, c22168k0.f70143v0) && AbstractC16544l.m18089b(this.f70144w0, c22168k0.f70144w0) && this.f70145x0 == c22168k0.f70145x0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70141t0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70140s0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70136o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f70138q0.hashCode() + ((this.f70137p0.hashCode() + AbstractC14376f.m15858x(this.f70136o0, this.f70135Z.f69986Y.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.f70139r0;
        int iM15858x = (AbstractC14376f.m15858x(this.f70140s0, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31) + this.f70141t0) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f70142u0;
        int iHashCode2 = (this.f70143v0.hashCode() + ((iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31)) * 31;
        String str2 = this.f70144w0;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z6 = this.f70145x0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode3 + r6;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: i */
    public final C18428A mo22386i() {
        return this.f70143v0;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: j */
    public final InterfaceC22179o mo22387j() {
        return this.f70137p0;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: l */
    public final C22139a1 mo22388l() {
        return this.f70135Z;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: n */
    public final InterfaceC22096F mo22389n() {
        return this.f70138q0;
    }

    @Override // p1156zj.AbstractC22165j0
    /* JADX INFO: renamed from: o */
    public final AbstractC22165j0 mo22390o(boolean z6) {
        return m22391p(this, null, z6, 1023);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReviewSelectedImage(currentPart=");
        sb2.append(this.f70135Z);
        sb2.append(", uploadingIds=");
        sb2.append(this.f70136o0);
        sb2.append(", captureConfig=");
        sb2.append(this.f70137p0);
        sb2.append(", idForReview=");
        sb2.append(this.f70138q0);
        sb2.append(", fileName=");
        sb2.append(this.f70139r0);
        sb2.append(", parts=");
        sb2.append(this.f70140s0);
        sb2.append(", partIndex=");
        sb2.append(this.f70141t0);
        sb2.append(", backState=");
        sb2.append(this.f70142u0);
        sb2.append(", cameraProperties=");
        sb2.append(this.f70143v0);
        sb2.append(", error=");
        sb2.append(this.f70144w0);
        sb2.append(", submittingForAutoClassification=");
        return AbstractC14376f.m15823B(sb2, this.f70145x0, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70135Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70136o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeParcelable(this.f70137p0, i10);
        out.writeParcelable(this.f70138q0, i10);
        out.writeString(this.f70139r0);
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70140s0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70141t0);
        out.writeParcelable(this.f70142u0, i10);
        out.writeParcelable(this.f70143v0, i10);
        out.writeString(this.f70144w0);
        out.writeInt(this.f70145x0 ? 1 : 0);
    }

    /* JADX INFO: renamed from: p */
    public static C22168k0 m22391p(C22168k0 c22168k0, String str, boolean z6, int i10) {
        C22139a1 currentPart = c22168k0.f70135Z;
        List uploadingIds = c22168k0.f70136o0;
        InterfaceC22179o captureConfig = c22168k0.f70137p0;
        InterfaceC22096F idForReview = c22168k0.f70138q0;
        String str2 = c22168k0.f70139r0;
        List list = c22168k0.f70140s0;
        int i11 = c22168k0.f70141t0;
        AbstractC22180o0 abstractC22180o0 = c22168k0.f70142u0;
        C18428A cameraProperties = c22168k0.f70143v0;
        if ((i10 & 512) != 0) {
            str = c22168k0.f70144w0;
        }
        String str3 = str;
        if ((i10 & 1024) != 0) {
            z6 = c22168k0.f70145x0;
        }
        c22168k0.getClass();
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        AbstractC16544l.m18094g(idForReview, "idForReview");
        AbstractC16544l.m18094g(list, HpucjswO.YxNgnZEeFc);
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        return new C22168k0(currentPart, uploadingIds, captureConfig, idForReview, str2, list, i11, abstractC22180o0, cameraProperties, str3, z6);
    }
}
