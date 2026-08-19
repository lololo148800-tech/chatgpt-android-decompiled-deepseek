package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p125Ej.InterfaceC2564h;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: zj.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22153f0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22153f0> CREATOR = new C21006a(18);

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f70037Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70038o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC22179o f70039p0;

    /* JADX INFO: renamed from: q0 */
    public final C22090C f70040q0;

    /* JADX INFO: renamed from: r0 */
    public final List f70041r0;

    /* JADX INFO: renamed from: s0 */
    public final int f70042s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractC22180o0 f70043t0;

    /* JADX INFO: renamed from: u0 */
    public final InterfaceC2564h f70044u0;

    public C22153f0(C22139a1 currentPart, List uploadingIds, InterfaceC22179o captureConfig, C22090C idForReview, List parts, int i10, AbstractC22180o0 abstractC22180o0, InterfaceC2564h interfaceC2564h) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        AbstractC16544l.m18094g(idForReview, "idForReview");
        AbstractC16544l.m18094g(parts, "parts");
        this.f70037Z = currentPart;
        this.f70038o0 = uploadingIds;
        this.f70039p0 = captureConfig;
        this.f70040q0 = idForReview;
        this.f70041r0 = parts;
        this.f70042s0 = i10;
        this.f70043t0 = abstractC22180o0;
        this.f70044u0 = interfaceC2564h;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: b */
    public final void mo22384b() {
        super.mo22384b();
        Iterator it = this.f70040q0.f69822Y.iterator();
        while (it.hasNext()) {
            new File(((C22205x) it.next()).f70393Y).delete();
        }
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70043t0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70037Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22153f0)) {
            return false;
        }
        C22153f0 c22153f0 = (C22153f0) obj;
        return AbstractC16544l.m18089b(this.f70037Z, c22153f0.f70037Z) && AbstractC16544l.m18089b(this.f70038o0, c22153f0.f70038o0) && AbstractC16544l.m18089b(this.f70039p0, c22153f0.f70039p0) && AbstractC16544l.m18089b(this.f70040q0, c22153f0.f70040q0) && AbstractC16544l.m18089b(this.f70041r0, c22153f0.f70041r0) && this.f70042s0 == c22153f0.f70042s0 && AbstractC16544l.m18089b(this.f70043t0, c22153f0.f70043t0) && AbstractC16544l.m18089b(this.f70044u0, c22153f0.f70044u0);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70042s0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70041r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70038o0;
    }

    public final int hashCode() {
        int iM15858x = (AbstractC14376f.m15858x(this.f70041r0, (this.f70040q0.hashCode() + ((this.f70039p0.hashCode() + AbstractC14376f.m15858x(this.f70038o0, this.f70037Z.f69986Y.hashCode() * 31, 31)) * 31)) * 31, 31) + this.f70042s0) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f70043t0;
        int iHashCode = (iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31;
        InterfaceC2564h interfaceC2564h = this.f70044u0;
        return iHashCode + (interfaceC2564h != null ? interfaceC2564h.hashCode() : 0);
    }

    public final String toString() {
        return "CountdownToCapture(currentPart=" + this.f70037Z + ", uploadingIds=" + this.f70038o0 + ", captureConfig=" + this.f70039p0 + ", idForReview=" + this.f70040q0 + ", parts=" + this.f70041r0 + ", partIndex=" + this.f70042s0 + ", backState=" + this.f70043t0 + ", hint=" + this.f70044u0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70037Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70038o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeParcelable(this.f70039p0, i10);
        this.f70040q0.writeToParcel(out, i10);
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70041r0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70042s0);
        out.writeParcelable(this.f70043t0, i10);
        out.writeParcelable(this.f70044u0, i10);
    }
}
