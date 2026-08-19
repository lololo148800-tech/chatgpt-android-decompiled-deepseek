package sh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20964l;
import p1107xh.AbstractC21234Y;
import p1107xh.EnumC21217G;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17838F;
import th.C19957L;

/* JADX INFO: renamed from: sh.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C19608Y implements InterfaceC17838F {

    /* JADX INFO: renamed from: a */
    public final String f62227a;

    /* JADX INFO: renamed from: b */
    public final EnumC21217G f62228b;

    public C19608Y(String id2, EnumC21217G enumC21217G) {
        AbstractC16544l.m18094g(id2, "id");
        this.f62227a = id2;
        this.f62228b = enumC21217G;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21234Y.f67552k;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20964l.f66767a;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19957L.f63241Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "5f689d6823032644c9a25c1c2be0498ca2e9adfa98e693b65432edfcafdab8d3";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "mutation GizmoSidebar($id: String!, $action: GizmoSidebarAction!) { gizmoSidebarLegacy(id: $id, action: $action) }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        interfaceC19456f.mo20545M0(ParameterNames.f31999ID);
        AbstractC17850c.f56903a.mo369f(interfaceC19456f, customScalarAdapters, this.f62227a);
        interfaceC19456f.mo20545M0("action");
        interfaceC19456f.mo20544L(this.f62228b.f67498Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19608Y)) {
            return false;
        }
        C19608Y c19608y = (C19608Y) obj;
        return AbstractC16544l.m18089b(this.f62227a, c19608y.f62227a) && this.f62228b == c19608y.f62228b;
    }

    public final int hashCode() {
        return this.f62228b.hashCode() + (this.f62227a.hashCode() * 31);
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoSidebar";
    }

    public final String toString() {
        return "█";
    }
}
