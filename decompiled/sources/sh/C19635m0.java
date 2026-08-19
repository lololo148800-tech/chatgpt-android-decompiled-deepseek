package sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20967o;
import p1107xh.AbstractC21239b0;
import p571X9.AbstractC9172M3;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17843K;
import p917o6.C17844L;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17846N;
import th.C19964T;

/* JADX INFO: renamed from: sh.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19635m0 implements InterfaceC17846N {

    /* JADX INFO: renamed from: a */
    public final AbstractC9172M3 f62276a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9172M3 f62277b;

    public C19635m0() {
        C17843K c17843k = C17843K.f56900a;
        this.f62276a = c17843k;
        this.f62277b = c17843k;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21239b0.f67583v;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20967o.f66778e;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19964T.f63255Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "018aa0d558ce7f6e746855dda4987dba0228d4e87ed51f1db16886a4131dae49";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "query GizmoWithMemory($cursor: Cursor, $limit: Int) { gizmoWithMemory(cursor: $cursor, limit: $limit) { pageInfo { endCursor hasNextPage } edges { node { __typename ...GizmoPreviewFragment } } } }  fragment GizmoPreviewFragment on Gizmo { id legacyId display { name profilePictureUrl } tags gizmoType }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC9172M3 abstractC9172M3 = this.f62276a;
        if (abstractC9172M3 instanceof C17844L) {
            interfaceC19456f.mo20545M0("cursor");
            AbstractC17850c.m19595c(AbstractC17850c.f56910h).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M3);
        }
        AbstractC9172M3 abstractC9172M4 = this.f62277b;
        if (abstractC9172M4 instanceof C17844L) {
            interfaceC19456f.mo20545M0("limit");
            AbstractC17850c.m19595c(AbstractC17850c.f56908f).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19635m0)) {
            return false;
        }
        C19635m0 c19635m0 = (C19635m0) obj;
        return AbstractC16544l.m18089b(this.f62276a, c19635m0.f62276a) && AbstractC16544l.m18089b(this.f62277b, c19635m0.f62277b);
    }

    public final int hashCode() {
        return this.f62277b.hashCode() + (this.f62276a.hashCode() * 31);
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoWithMemory";
    }

    public final String toString() {
        return "█";
    }
}
