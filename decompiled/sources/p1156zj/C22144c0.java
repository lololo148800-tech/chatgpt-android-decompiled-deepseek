package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p1088wk.C21006a;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22144c0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22144c0> CREATOR = new C21006a(15);

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f69995Z;

    /* JADX INFO: renamed from: o0 */
    public final List f69996o0;

    /* JADX INFO: renamed from: p0 */
    public final List f69997p0;

    /* JADX INFO: renamed from: q0 */
    public final int f69998q0;

    /* JADX INFO: renamed from: r0 */
    public final AbstractC22180o0 f69999r0;

    /* JADX INFO: renamed from: s0 */
    public final List f70000s0;

    /* JADX INFO: renamed from: t0 */
    public final C18428A f70001t0;

    /* JADX INFO: renamed from: u0 */
    public final ArrayList f70002u0;

    /* JADX INFO: renamed from: v0 */
    public final String f70003v0;

    /* JADX INFO: renamed from: w0 */
    public final String f70004w0;

    /* JADX INFO: renamed from: x0 */
    public final EnumC22140b f70005x0;

    public C22144c0(C22139a1 currentPart, List uploadingIds, List parts, int i10, AbstractC22180o0 abstractC22180o0, List captureFrames, C18428A cameraProperties, ArrayList arrayList, String str, String str2, EnumC22140b errorType) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(parts, "parts");
        AbstractC16544l.m18094g(captureFrames, "captureFrames");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        AbstractC16544l.m18094g(errorType, "errorType");
        this.f69995Z = currentPart;
        this.f69996o0 = uploadingIds;
        this.f69997p0 = parts;
        this.f69998q0 = i10;
        this.f69999r0 = abstractC22180o0;
        this.f70000s0 = captureFrames;
        this.f70001t0 = cameraProperties;
        this.f70002u0 = arrayList;
        this.f70003v0 = str;
        this.f70004w0 = str2;
        this.f70005x0 = errorType;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f69999r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f69995Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22144c0)) {
            return false;
        }
        C22144c0 c22144c0 = (C22144c0) obj;
        return AbstractC16544l.m18089b(this.f69995Z, c22144c0.f69995Z) && AbstractC16544l.m18089b(this.f69996o0, c22144c0.f69996o0) && AbstractC16544l.m18089b(this.f69997p0, c22144c0.f69997p0) && this.f69998q0 == c22144c0.f69998q0 && AbstractC16544l.m18089b(this.f69999r0, c22144c0.f69999r0) && AbstractC16544l.m18089b(this.f70000s0, c22144c0.f70000s0) && AbstractC16544l.m18089b(this.f70001t0, c22144c0.f70001t0) && AbstractC16544l.m18089b(this.f70002u0, c22144c0.f70002u0) && AbstractC16544l.m18089b(this.f70003v0, c22144c0.f70003v0) && AbstractC16544l.m18089b(this.f70004w0, c22144c0.f70004w0) && this.f70005x0 == c22144c0.f70005x0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f69998q0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f69997p0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f69996o0;
    }

    public final int hashCode() {
        int iM15858x = (AbstractC14376f.m15858x(this.f69997p0, AbstractC14376f.m15858x(this.f69996o0, this.f69995Z.f69986Y.hashCode() * 31, 31), 31) + this.f69998q0) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f69999r0;
        int iHashCode = (this.f70002u0.hashCode() + ((this.f70001t0.hashCode() + AbstractC14376f.m15858x(this.f70000s0, (iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31, 31)) * 31)) * 31;
        String str = this.f70003v0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70004w0;
        return this.f70005x0.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f69995Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f69996o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f69997p0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f69998q0);
        out.writeParcelable(this.f69999r0, i10);
        Iterator itM19536s3 = AbstractC17792x.m19536s(this.f70000s0, out);
        while (itM19536s3.hasNext()) {
            ((C22205x) itM19536s3.next()).writeToParcel(out, i10);
        }
        out.writeParcelable(this.f70001t0, i10);
        ArrayList arrayList = this.f70002u0;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C22134Y0) it.next()).writeToParcel(out, i10);
        }
        out.writeString(this.f70003v0);
        out.writeString(this.f70004w0);
        out.writeString(this.f70005x0.name());
    }

    public final String toString() {
        return "AutoClassificationError(currentPart=" + this.f69995Z + ", uploadingIds=" + this.f69996o0 + QzvfuIgrngtl.dqXfLLxSzg + this.f69997p0 + ", partIndex=" + this.f69998q0 + ", backState=" + this.f69999r0 + ", captureFrames=" + this.f70000s0 + ", cameraProperties=" + this.f70001t0 + ", idConfigsForCountry=" + this.f70002u0 + ", selectedCountryCode=" + this.f70003v0 + ", selectedIdClass=" + this.f70004w0 + ", errorType=" + this.f70005x0 + Separators.RPAREN;
    }

    public /* synthetic */ C22144c0(C22139a1 c22139a1, List list, List list2, int i10, AbstractC22180o0 abstractC22180o0, List list3, C18428A c18428a, ArrayList arrayList, EnumC22140b enumC22140b) {
        this(c22139a1, list, list2, i10, abstractC22180o0, list3, c18428a, arrayList, null, null, enumC22140b);
    }
}
