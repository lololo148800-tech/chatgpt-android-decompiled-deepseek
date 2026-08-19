package p046Bk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.WebrtcBuildVersion;
import p003A1.AbstractC0168G;
import p775h2.AbstractC14376f;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1383g0 extends AbstractC1391k0 {
    public static final Parcelable.Creator<C1383g0> CREATOR = new C1378e0();

    /* JADX INFO: renamed from: Y */
    public final List f3676Y;

    /* JADX INFO: renamed from: Z */
    public final String f3677Z;

    /* JADX INFO: renamed from: o0 */
    public final List f3678o0;

    /* JADX INFO: renamed from: p0 */
    public final StepStyles.UiStepStyle f3679p0;

    /* JADX INFO: renamed from: q0 */
    public final String f3680q0;

    /* JADX INFO: renamed from: r0 */
    public final C1381f0 f3681r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f3682s0;

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC1389j0 f3683t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f3684u0;

    /* JADX INFO: renamed from: v0 */
    public final boolean f3685v0;

    /* JADX INFO: renamed from: w0 */
    public final Map f3686w0;

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC19201o2 f3687x0;

    /* JADX INFO: renamed from: y0 */
    public final String f3688y0;

    /* JADX INFO: renamed from: z0 */
    public final boolean f3689z0;

    public C1383g0(List components, String stepName, List componentErrors, StepStyles.UiStepStyle uiStepStyle, String str, C1381f0 c1381f0, boolean z6, InterfaceC1389j0 interfaceC1389j0, boolean z10, boolean z11, Map map, InterfaceC19201o2 interfaceC19201o2, String requestPermissionKey, boolean z12) {
        AbstractC16544l.m18094g(components, "components");
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(componentErrors, "componentErrors");
        AbstractC16544l.m18094g(requestPermissionKey, "requestPermissionKey");
        this.f3676Y = components;
        this.f3677Z = stepName;
        this.f3678o0 = componentErrors;
        this.f3679p0 = uiStepStyle;
        this.f3680q0 = str;
        this.f3681r0 = c1381f0;
        this.f3682s0 = z6;
        this.f3683t0 = interfaceC1389j0;
        this.f3684u0 = z10;
        this.f3685v0 = z11;
        this.f3686w0 = map;
        this.f3687x0 = interfaceC19201o2;
        this.f3688y0 = requestPermissionKey;
        this.f3689z0 = z12;
    }

    /* JADX INFO: renamed from: a */
    public static C1383g0 m2047a(C1383g0 c1383g0, ArrayList arrayList, List list, String str, C1381f0 c1381f0, boolean z6, InterfaceC1389j0 interfaceC1389j0, boolean z10, Map map, InterfaceC19201o2 interfaceC19201o2, String str2, boolean z11, int i10) {
        List components = (i10 & 1) != 0 ? c1383g0.f3676Y : arrayList;
        String stepName = c1383g0.f3677Z;
        List componentErrors = (i10 & 4) != 0 ? c1383g0.f3678o0 : list;
        StepStyles.UiStepStyle uiStepStyle = c1383g0.f3679p0;
        String str3 = (i10 & 16) != 0 ? c1383g0.f3680q0 : str;
        C1381f0 c1381f1 = (i10 & 32) != 0 ? c1383g0.f3681r0 : c1381f0;
        boolean z12 = (i10 & 64) != 0 ? c1383g0.f3682s0 : z6;
        InterfaceC1389j0 interfaceC1389j1 = (i10 & 128) != 0 ? c1383g0.f3683t0 : interfaceC1389j0;
        boolean z13 = c1383g0.f3684u0;
        boolean z14 = (i10 & 512) != 0 ? c1383g0.f3685v0 : z10;
        Map map2 = (i10 & 1024) != 0 ? c1383g0.f3686w0 : map;
        InterfaceC19201o2 interfaceC19201o3 = (i10 & 2048) != 0 ? c1383g0.f3687x0 : interfaceC19201o2;
        String requestPermissionKey = (i10 & 4096) != 0 ? c1383g0.f3688y0 : str2;
        boolean z15 = (i10 & 8192) != 0 ? c1383g0.f3689z0 : z11;
        c1383g0.getClass();
        AbstractC16544l.m18094g(components, "components");
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(componentErrors, "componentErrors");
        AbstractC16544l.m18094g(requestPermissionKey, "requestPermissionKey");
        return new C1383g0(components, stepName, componentErrors, uiStepStyle, str3, c1381f1, z12, interfaceC1389j1, z13, z14, map2, interfaceC19201o3, requestPermissionKey, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1383g0)) {
            return false;
        }
        C1383g0 c1383g0 = (C1383g0) obj;
        return AbstractC16544l.m18089b(this.f3676Y, c1383g0.f3676Y) && AbstractC16544l.m18089b(this.f3677Z, c1383g0.f3677Z) && AbstractC16544l.m18089b(this.f3678o0, c1383g0.f3678o0) && AbstractC16544l.m18089b(this.f3679p0, c1383g0.f3679p0) && AbstractC16544l.m18089b(this.f3680q0, c1383g0.f3680q0) && AbstractC16544l.m18089b(this.f3681r0, c1383g0.f3681r0) && this.f3682s0 == c1383g0.f3682s0 && AbstractC16544l.m18089b(this.f3683t0, c1383g0.f3683t0) && this.f3684u0 == c1383g0.f3684u0 && this.f3685v0 == c1383g0.f3685v0 && AbstractC16544l.m18089b(this.f3686w0, c1383g0.f3686w0) && AbstractC16544l.m18089b(this.f3687x0, c1383g0.f3687x0) && AbstractC16544l.m18089b(this.f3688y0, c1383g0.f3688y0) && this.f3689z0 == c1383g0.f3689z0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f3678o0, AbstractC0168G.m527p(this.f3676Y.hashCode() * 31, 31, this.f3677Z), 31);
        StepStyles.UiStepStyle uiStepStyle = this.f3679p0;
        int iHashCode = (iM15858x + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
        String str = this.f3680q0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1381f0 c1381f0 = this.f3681r0;
        int iHashCode3 = (iHashCode2 + (c1381f0 == null ? 0 : c1381f0.f3671Y.hashCode())) * 31;
        boolean z6 = this.f3682s0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode3 + r6) * 31;
        InterfaceC1389j0 interfaceC1389j0 = this.f3683t0;
        int iHashCode4 = (i10 + (interfaceC1389j0 == null ? 0 : interfaceC1389j0.hashCode())) * 31;
        boolean z10 = this.f3684u0;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (iHashCode4 + r10) * 31;
        boolean z11 = this.f3685v0;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i12 = (i11 + r11) * 31;
        Map map = this.f3686w0;
        int iHashCode5 = (i12 + (map == null ? 0 : map.hashCode())) * 31;
        InterfaceC19201o2 interfaceC19201o2 = this.f3687x0;
        int iM527p = AbstractC0168G.m527p((iHashCode5 + (interfaceC19201o2 != null ? interfaceC19201o2.hashCode() : 0)) * 31, 31, this.f3688y0);
        boolean z12 = this.f3689z0;
        return iM527p + (z12 ? 1 : z12);
    }

    public final String toString() {
        return "Displaying(components=" + this.f3676Y + ", stepName=" + this.f3677Z + ", componentErrors=" + this.f3678o0 + ", styles=" + this.f3679p0 + ", error=" + this.f3680q0 + ", nfcScan=" + this.f3681r0 + ", autoSubmit=" + this.f3682s0 + ", pendingAction=" + this.f3683t0 + ", hasRequestedGpsPermissions=" + this.f3684u0 + ", isRequestingGpsPermissions=" + this.f3685v0 + ", componentParams=" + this.f3686w0 + ", triggeringComponent=" + this.f3687x0 + ", requestPermissionKey=" + this.f3688y0 + ", isSubmitting=" + this.f3689z0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f3676Y, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeString(this.f3677Z);
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f3678o0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeParcelable(this.f3679p0, i10);
        out.writeString(this.f3680q0);
        C1381f0 c1381f0 = this.f3681r0;
        if (c1381f0 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1381f0.writeToParcel(out, i10);
        }
        out.writeInt(this.f3682s0 ? 1 : 0);
        out.writeParcelable(this.f3683t0, i10);
        out.writeInt(this.f3684u0 ? 1 : 0);
        out.writeInt(this.f3685v0 ? 1 : 0);
        Map map = this.f3686w0;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeParcelable((Parcelable) entry.getValue(), i10);
            }
        }
        out.writeParcelable(this.f3687x0, i10);
        out.writeString(this.f3688y0);
        out.writeInt(this.f3689z0 ? 1 : 0);
    }

    public /* synthetic */ C1383g0(List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, int i10) {
        this(list, str, (i10 & 4) != 0 ? C17689w.f56480Y : list2, uiStepStyle, (i10 & 16) != 0 ? null : str2, null, false, null, false, false, null, null, WebrtcBuildVersion.maint_version, false);
    }
}
