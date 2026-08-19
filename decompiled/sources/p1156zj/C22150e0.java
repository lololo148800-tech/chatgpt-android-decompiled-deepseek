package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: zj.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22150e0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22150e0> CREATOR = new C21006a(17);

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f70024Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70025o0;

    /* JADX INFO: renamed from: p0 */
    public final List f70026p0;

    /* JADX INFO: renamed from: q0 */
    public final int f70027q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC22179o f70028r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f70029s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractC22180o0 f70030t0;

    /* JADX INFO: renamed from: u0 */
    public final String f70031u0;

    public C22150e0(C22139a1 currentPart, List uploadingIds, List list, int i10, InterfaceC22179o captureConfig, boolean z6, AbstractC22180o0 abstractC22180o0, String str) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        this.f70024Z = currentPart;
        this.f70025o0 = uploadingIds;
        this.f70026p0 = list;
        this.f70027q0 = i10;
        this.f70028r0 = captureConfig;
        this.f70029s0 = z6;
        this.f70030t0 = abstractC22180o0;
        this.f70031u0 = str;
    }

    /* JADX INFO: renamed from: i */
    public static C22150e0 m22383i(C22150e0 c22150e0, boolean z6, String str, int i10) {
        C22139a1 currentPart = c22150e0.f70024Z;
        List uploadingIds = c22150e0.f70025o0;
        List parts = c22150e0.f70026p0;
        int i11 = c22150e0.f70027q0;
        InterfaceC22179o captureConfig = c22150e0.f70028r0;
        if ((i10 & 32) != 0) {
            z6 = c22150e0.f70029s0;
        }
        boolean z10 = z6;
        AbstractC22180o0 abstractC22180o0 = c22150e0.f70030t0;
        if ((i10 & 128) != 0) {
            str = c22150e0.f70031u0;
        }
        c22150e0.getClass();
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(parts, "parts");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        return new C22150e0(currentPart, uploadingIds, parts, i11, captureConfig, z10, abstractC22180o0, str);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70030t0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70024Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22150e0)) {
            return false;
        }
        C22150e0 c22150e0 = (C22150e0) obj;
        return AbstractC16544l.m18089b(this.f70024Z, c22150e0.f70024Z) && AbstractC16544l.m18089b(this.f70025o0, c22150e0.f70025o0) && AbstractC16544l.m18089b(this.f70026p0, c22150e0.f70026p0) && this.f70027q0 == c22150e0.f70027q0 && AbstractC16544l.m18089b(this.f70028r0, c22150e0.f70028r0) && this.f70029s0 == c22150e0.f70029s0 && AbstractC16544l.m18089b(this.f70030t0, c22150e0.f70030t0) && AbstractC16544l.m18089b(this.f70031u0, c22150e0.f70031u0);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70027q0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70026p0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70025o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f70028r0.hashCode() + ((AbstractC14376f.m15858x(this.f70026p0, AbstractC14376f.m15858x(this.f70025o0, this.f70024Z.f69986Y.hashCode() * 31, 31), 31) + this.f70027q0) * 31)) * 31;
        boolean z6 = this.f70029s0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode + r6) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f70030t0;
        int iHashCode2 = (i10 + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31;
        String str = this.f70031u0;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ChooseCaptureMethod(currentPart=" + this.f70024Z + ", uploadingIds=" + this.f70025o0 + ", parts=" + this.f70026p0 + ", partIndex=" + this.f70027q0 + ", captureConfig=" + this.f70028r0 + ", choosingDocumentToUpload=" + this.f70029s0 + ", backState=" + this.f70030t0 + ", error=" + this.f70031u0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70024Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70025o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70026p0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70027q0);
        out.writeParcelable(this.f70028r0, i10);
        out.writeInt(this.f70029s0 ? 1 : 0);
        out.writeParcelable(this.f70030t0, i10);
        out.writeString(this.f70031u0);
    }
}
