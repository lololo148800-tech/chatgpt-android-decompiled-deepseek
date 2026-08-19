package sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20957e;
import p1107xh.AbstractC21239b0;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17846N;
import th.C19986r;

/* JADX INFO: renamed from: sh.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C19647y implements InterfaceC17846N {
    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21239b0.f67583v;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20957e.f66749c;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19986r.f63291Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "b7f48368a6ff12194b15e589d9ebb041227c05040fce8b7d28d7513b7c99a201";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "query GizmoBootstrap { gizmoBootstrap { gizmo { __typename ...GizmoPreviewFragment } } }  fragment GizmoPreviewFragment on Gizmo { id legacyId display { name profilePictureUrl } tags gizmoType }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == C19647y.class;
    }

    public final int hashCode() {
        return AbstractC16526C.f51263a.mo5693b(C19647y.class).hashCode();
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoBootstrap";
    }
}
