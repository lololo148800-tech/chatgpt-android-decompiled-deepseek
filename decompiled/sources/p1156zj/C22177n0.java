package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p1088wk.C21006a;
import p125Ej.InterfaceC2564h;
import p173Gj.EnumC3098e;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: zj.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22177n0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22177n0> CREATOR = new C21006a(25);

    /* JADX INFO: renamed from: A0 */
    public final InterfaceC1426a f70231A0;

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f70232Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70233o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC22179o f70234p0;

    /* JADX INFO: renamed from: q0 */
    public final EnumC22169k1 f70235q0;

    /* JADX INFO: renamed from: r0 */
    public final List f70236r0;

    /* JADX INFO: renamed from: s0 */
    public final int f70237s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractC22180o0 f70238t0;

    /* JADX INFO: renamed from: u0 */
    public final EnumC3098e f70239u0;

    /* JADX INFO: renamed from: v0 */
    public final String f70240v0;

    /* JADX INFO: renamed from: w0 */
    public final Throwable f70241w0;

    /* JADX INFO: renamed from: x0 */
    public final boolean f70242x0;

    /* JADX INFO: renamed from: y0 */
    public final boolean f70243y0;

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC2564h f70244z0;

    public C22177n0(C22139a1 currentPart, List uploadingIds, InterfaceC22179o captureConfig, EnumC22169k1 manualCapture, List parts, int i10, AbstractC22180o0 abstractC22180o0, EnumC3098e enumC3098e, String str, Throwable th2, boolean z6, boolean z10, InterfaceC2564h interfaceC2564h, InterfaceC1426a webRtcConnectionEstablished) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        AbstractC16544l.m18094g(manualCapture, "manualCapture");
        AbstractC16544l.m18094g(parts, "parts");
        AbstractC16544l.m18094g(webRtcConnectionEstablished, "webRtcConnectionEstablished");
        this.f70232Z = currentPart;
        this.f70233o0 = uploadingIds;
        this.f70234p0 = captureConfig;
        this.f70235q0 = manualCapture;
        this.f70236r0 = parts;
        this.f70237s0 = i10;
        this.f70238t0 = abstractC22180o0;
        this.f70239u0 = enumC3098e;
        this.f70240v0 = str;
        this.f70241w0 = th2;
        this.f70242x0 = z6;
        this.f70243y0 = z10;
        this.f70244z0 = interfaceC2564h;
        this.f70231A0 = webRtcConnectionEstablished;
    }

    /* JADX INFO: renamed from: i */
    public static C22177n0 m22397i(C22177n0 c22177n0, EnumC22169k1 enumC22169k1, EnumC3098e enumC3098e, Throwable th2, boolean z6, boolean z10, InterfaceC2564h interfaceC2564h, int i10) {
        C22139a1 currentPart = c22177n0.f70232Z;
        List uploadingIds = c22177n0.f70233o0;
        InterfaceC22179o captureConfig = c22177n0.f70234p0;
        EnumC22169k1 manualCapture = (i10 & 8) != 0 ? c22177n0.f70235q0 : enumC22169k1;
        List parts = c22177n0.f70236r0;
        int i11 = c22177n0.f70237s0;
        AbstractC22180o0 abstractC22180o0 = c22177n0.f70238t0;
        EnumC3098e enumC3098e2 = (i10 & 128) != 0 ? c22177n0.f70239u0 : enumC3098e;
        String str = c22177n0.f70240v0;
        Throwable th3 = (i10 & 512) != 0 ? c22177n0.f70241w0 : th2;
        boolean z11 = (i10 & 1024) != 0 ? c22177n0.f70242x0 : z6;
        boolean z12 = (i10 & 2048) != 0 ? c22177n0.f70243y0 : z10;
        InterfaceC2564h interfaceC2564h2 = (i10 & 4096) != 0 ? c22177n0.f70244z0 : interfaceC2564h;
        InterfaceC1426a webRtcConnectionEstablished = c22177n0.f70231A0;
        c22177n0.getClass();
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(captureConfig, "captureConfig");
        AbstractC16544l.m18094g(manualCapture, "manualCapture");
        AbstractC16544l.m18094g(parts, "parts");
        AbstractC16544l.m18094g(webRtcConnectionEstablished, "webRtcConnectionEstablished");
        return new C22177n0(currentPart, uploadingIds, captureConfig, manualCapture, parts, i11, abstractC22180o0, enumC3098e2, str, th3, z11, z12, interfaceC2564h2, webRtcConnectionEstablished);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70238t0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70232Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22177n0)) {
            return false;
        }
        C22177n0 c22177n0 = (C22177n0) obj;
        return AbstractC16544l.m18089b(this.f70232Z, c22177n0.f70232Z) && AbstractC16544l.m18089b(this.f70233o0, c22177n0.f70233o0) && AbstractC16544l.m18089b(this.f70234p0, c22177n0.f70234p0) && this.f70235q0 == c22177n0.f70235q0 && AbstractC16544l.m18089b(this.f70236r0, c22177n0.f70236r0) && this.f70237s0 == c22177n0.f70237s0 && AbstractC16544l.m18089b(this.f70238t0, c22177n0.f70238t0) && this.f70239u0 == c22177n0.f70239u0 && AbstractC16544l.m18089b(this.f70240v0, c22177n0.f70240v0) && AbstractC16544l.m18089b(this.f70241w0, c22177n0.f70241w0) && this.f70242x0 == c22177n0.f70242x0 && this.f70243y0 == c22177n0.f70243y0 && AbstractC16544l.m18089b(this.f70244z0, c22177n0.f70244z0) && AbstractC16544l.m18089b(this.f70231A0, c22177n0.f70231A0);
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70237s0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70236r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70233o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iM15858x = (AbstractC14376f.m15858x(this.f70236r0, (this.f70235q0.hashCode() + ((this.f70234p0.hashCode() + AbstractC14376f.m15858x(this.f70233o0, this.f70232Z.f69986Y.hashCode() * 31, 31)) * 31)) * 31, 31) + this.f70237s0) * 31;
        AbstractC22180o0 abstractC22180o0 = this.f70238t0;
        int iHashCode = (iM15858x + (abstractC22180o0 == null ? 0 : abstractC22180o0.hashCode())) * 31;
        EnumC3098e enumC3098e = this.f70239u0;
        int iHashCode2 = (iHashCode + (enumC3098e == null ? 0 : enumC3098e.hashCode())) * 31;
        String str = this.f70240v0;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th2 = this.f70241w0;
        int iHashCode4 = (iHashCode3 + (th2 == null ? 0 : th2.hashCode())) * 31;
        boolean z6 = this.f70242x0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode4 + r6) * 31;
        boolean z10 = this.f70243y0;
        int i11 = (i10 + (z10 ? 1 : z10)) * 31;
        InterfaceC2564h interfaceC2564h = this.f70244z0;
        return this.f70231A0.hashCode() + ((i11 + (interfaceC2564h != null ? interfaceC2564h.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WaitForAutocapture(currentPart=" + this.f70232Z + ", uploadingIds=" + this.f70233o0 + ", captureConfig=" + this.f70234p0 + ", manualCapture=" + this.f70235q0 + ", parts=" + this.f70236r0 + ", partIndex=" + this.f70237s0 + ", backState=" + this.f70238t0 + ", webRtcState=" + this.f70239u0 + ", webRtcJwt=" + this.f70240v0 + ", error=" + this.f70241w0 + ", checkCameraPermissions=" + this.f70242x0 + ", checkAudioPermissions=" + this.f70243y0 + ", hint=" + this.f70244z0 + ", webRtcConnectionEstablished=" + this.f70231A0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70232Z.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70233o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeParcelable(this.f70234p0, i10);
        out.writeString(this.f70235q0.name());
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70236r0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70237s0);
        out.writeParcelable(this.f70238t0, i10);
        EnumC3098e enumC3098e = this.f70239u0;
        if (enumC3098e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC3098e.name());
        }
        out.writeString(this.f70240v0);
        out.writeSerializable(this.f70241w0);
        out.writeInt(this.f70242x0 ? 1 : 0);
        out.writeInt(this.f70243y0 ? 1 : 0);
        out.writeParcelable(this.f70244z0, i10);
    }

    public /* synthetic */ C22177n0(C22139a1 c22139a1, List list, InterfaceC22179o interfaceC22179o, EnumC22169k1 enumC22169k1, List list2, int i10, AbstractC22180o0 abstractC22180o0, EnumC3098e enumC3098e, String str, Throwable th2, boolean z6, boolean z10, InterfaceC2564h interfaceC2564h, InterfaceC1426a interfaceC1426a, int i11) {
        this(c22139a1, list, interfaceC22179o, enumC22169k1, list2, i10, abstractC22180o0, enumC3098e, str, (i11 & 512) != 0 ? null : th2, (i11 & 1024) != 0 ? true : z6, (i11 & 2048) != 0 ? true : z10, (i11 & 4096) != 0 ? null : interfaceC2564h, (i11 & 8192) != 0 ? C22138a0.f69983o0 : interfaceC1426a);
    }
}
