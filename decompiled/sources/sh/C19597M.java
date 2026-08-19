package sh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20961i;
import p1107xh.AbstractC21239b0;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17846N;
import th.C19948C;

/* JADX INFO: renamed from: sh.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C19597M implements InterfaceC17846N {

    /* JADX INFO: renamed from: a */
    public final String f62208a;

    public C19597M(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f62208a = id2;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21239b0.f67583v;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20961i.f66759b;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19948C.f63223Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "f10eaf710455e6930e95f0456a160ae8a7f49200ff0be6e65ae02afe197674b0";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "query GizmoGetReview($id: String!) { gizmoGetReviewLegacy(id: $id) { rating } }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        interfaceC19456f.mo20545M0(ParameterNames.f31999ID);
        AbstractC17850c.f56903a.mo369f(interfaceC19456f, customScalarAdapters, this.f62208a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19597M) && AbstractC16544l.m18089b(this.f62208a, ((C19597M) obj).f62208a);
    }

    public final int hashCode() {
        return this.f62208a.hashCode();
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoGetReview";
    }

    public final String toString() {
        return "█";
    }
}
