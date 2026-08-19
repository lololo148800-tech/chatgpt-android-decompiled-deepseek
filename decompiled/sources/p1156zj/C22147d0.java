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
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22147d0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22147d0> CREATOR = new C21006a(16);

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f70009Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70010o0;

    /* JADX INFO: renamed from: p0 */
    public final List f70011p0;

    /* JADX INFO: renamed from: q0 */
    public final int f70012q0;

    /* JADX INFO: renamed from: r0 */
    public final AbstractC22180o0 f70013r0;

    /* JADX INFO: renamed from: s0 */
    public final List f70014s0;

    /* JADX INFO: renamed from: t0 */
    public final C18428A f70015t0;

    /* JADX INFO: renamed from: u0 */
    public final List f70016u0;

    /* JADX INFO: renamed from: v0 */
    public final String f70017v0;

    /* JADX INFO: renamed from: w0 */
    public final String f70018w0;

    public C22147d0(C22139a1 currentPart, List uploadingIds, List parts, int i10, AbstractC22180o0 abstractC22180o0, List captureFrames, C18428A cameraProperties, List idConfigsForCountry, String str, String str2) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(parts, "parts");
        AbstractC16544l.m18094g(captureFrames, "captureFrames");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        AbstractC16544l.m18094g(idConfigsForCountry, "idConfigsForCountry");
        this.f70009Z = currentPart;
        this.f70010o0 = uploadingIds;
        this.f70011p0 = parts;
        this.f70012q0 = i10;
        this.f70013r0 = abstractC22180o0;
        this.f70014s0 = captureFrames;
        this.f70015t0 = cameraProperties;
        this.f70016u0 = idConfigsForCountry;
        this.f70017v0 = str;
        this.f70018w0 = str2;
    }

    /* JADX INFO: renamed from: i */
    public static C22147d0 m22382i(C22147d0 c22147d0, String str, String str2, int i10) {
        if ((i10 & 256) != 0) {
            str = c22147d0.f70017v0;
        }
        String str3 = str;
        if ((i10 & 512) != 0) {
            str2 = c22147d0.f70018w0;
        }
        C22139a1 currentPart = c22147d0.f70009Z;
        AbstractC16544l.m18094g(currentPart, "currentPart");
        List uploadingIds = c22147d0.f70010o0;
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        List parts = c22147d0.f70011p0;
        AbstractC16544l.m18094g(parts, "parts");
        List captureFrames = c22147d0.f70014s0;
        AbstractC16544l.m18094g(captureFrames, "captureFrames");
        C18428A cameraProperties = c22147d0.f70015t0;
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        List idConfigsForCountry = c22147d0.f70016u0;
        AbstractC16544l.m18094g(idConfigsForCountry, "idConfigsForCountry");
        return new C22147d0(currentPart, uploadingIds, parts, c22147d0.f70012q0, c22147d0.f70013r0, captureFrames, cameraProperties, idConfigsForCountry, str3, str2);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70013r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70009Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22147d0)) {
            return false;
        }
        C22147d0 c22147d0 = (C22147d0) obj;
        return AbstractC16544l.m18089b(this.f70009Z, c22147d0.f70009Z) && AbstractC16544l.m18089b(this.f70010o0, c22147d0.f70010o0) && AbstractC16544l.m18089b(this.f70011p0, c22147d0.f70011p0) && this.f70012q0 == c22147d0.f70012q0 && AbstractC16544l.m18089b(this.f70013r0, c22147d0.f70013r0) && AbstractC16544l.m18089b(this.f70014s0, c22147d0.f70014s0) && AbstractC16544l.m18089b(this.f70015t0, c22147d0.f70015t0) && AbstractC16544l.m18089b(this.f70016u0, c22147d0.f70016u0) && AbstractC16544l.m18089b(this.f70017v0, c22147d0.f70017v0) && AbstractC16544l.m18089b(this.f70018w0, c22147d0.f70018w0);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70012q0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70011p0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70010o0;
    }

    public final int hashCode() {
        int iM15858x = (AbstractC14376f.m15858x(this.f70011p0, AbstractC14376f.m15858x(this.f70010o0, this.f70009Z.f69986Y.hashCode() * 31, 31), 31) + this.f70012q0) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f70013r0;
        int iM15858x2 = AbstractC14376f.m15858x(this.f70016u0, (this.f70015t0.hashCode() + AbstractC14376f.m15858x(this.f70014s0, (iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31, 31)) * 31, 31);
        String str = this.f70017v0;
        int iHashCode = (iM15858x2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70018w0;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoClassificationManualSelect(currentPart=");
        sb2.append(this.f70009Z);
        sb2.append(", uploadingIds=");
        sb2.append(this.f70010o0);
        sb2.append(", parts=");
        sb2.append(this.f70011p0);
        sb2.append(", partIndex=");
        sb2.append(this.f70012q0);
        sb2.append(", backState=");
        sb2.append(this.f70013r0);
        sb2.append(", captureFrames=");
        sb2.append(this.f70014s0);
        sb2.append(", cameraProperties=");
        sb2.append(this.f70015t0);
        sb2.append(", idConfigsForCountry=");
        sb2.append(this.f70016u0);
        sb2.append(", selectedCountryCode=");
        sb2.append(this.f70017v0);
        sb2.append(", selectedIdClass=");
        return AbstractC9306j0.m9891j(this.f70018w0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70009Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70010o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70011p0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70012q0);
        out.writeParcelable(this.f70013r0, i10);
        Iterator itM19536s3 = AbstractC17792x.m19536s(this.f70014s0, out);
        while (itM19536s3.hasNext()) {
            ((C22205x) itM19536s3.next()).writeToParcel(out, i10);
        }
        out.writeParcelable(this.f70015t0, i10);
        Iterator itM19536s4 = AbstractC17792x.m19536s(this.f70016u0, out);
        while (itM19536s4.hasNext()) {
            ((C22134Y0) itM19536s4.next()).writeToParcel(out, i10);
        }
        out.writeString(this.f70017v0);
        out.writeString(this.f70018w0);
    }
}
