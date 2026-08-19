package sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p003A1.AbstractC0168G;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20956d;
import p1107xh.AbstractC21234Y;
import p1107xh.EnumC21249l;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17844L;
import p917o6.C17849b;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17838F;
import th.C19985q;

/* JADX INFO: renamed from: sh.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C19643u implements InterfaceC17838F {

    /* JADX INFO: renamed from: a */
    public final String f62291a;

    /* JADX INFO: renamed from: b */
    public final C17844L f62292b;

    /* JADX INFO: renamed from: c */
    public final String f62293c;

    /* JADX INFO: renamed from: d */
    public final EnumC21249l f62294d;

    public C19643u(String actionId, C17844L c17844l, String operationKey, EnumC21249l enumC21249l) {
        AbstractC16544l.m18094g(actionId, "actionId");
        AbstractC16544l.m18094g(operationKey, "operationKey");
        this.f62291a = actionId;
        this.f62292b = c17844l;
        this.f62293c = operationKey;
        this.f62294d = enumC21249l;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21234Y.f67552k;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20956d.f66746a;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19985q.f63289Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "b9f451547104ea00841893acfd3fcf6083486e2cb91b4b0279149d8fdc38a83a";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "mutation GizmoActionOperationUpdate($actionId: String!, $domain: String, $operationKey: String!, $operationStatus: GizmoActionStatus!) { gizmoActionOperationUpdate(actionId: $actionId, domain: $domain, operationKey: $operationKey, operationStatus: $operationStatus) }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        interfaceC19456f.mo20545M0("actionId");
        C17849b c17849b = AbstractC17850c.f56903a;
        c17849b.mo369f(interfaceC19456f, customScalarAdapters, this.f62291a);
        C17844L c17844l = this.f62292b;
        interfaceC19456f.mo20545M0("domain");
        AbstractC17850c.m19595c(AbstractC17850c.f56907e).mo369f(interfaceC19456f, customScalarAdapters, c17844l);
        interfaceC19456f.mo20545M0("operationKey");
        c17849b.mo369f(interfaceC19456f, customScalarAdapters, this.f62293c);
        interfaceC19456f.mo20545M0("operationStatus");
        interfaceC19456f.mo20544L(this.f62294d.f67609Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19643u)) {
            return false;
        }
        C19643u c19643u = (C19643u) obj;
        return AbstractC16544l.m18089b(this.f62291a, c19643u.f62291a) && this.f62292b.equals(c19643u.f62292b) && AbstractC16544l.m18089b(this.f62293c, c19643u.f62293c) && this.f62294d == c19643u.f62294d;
    }

    public final int hashCode() {
        return this.f62294d.hashCode() + AbstractC0168G.m527p((this.f62292b.hashCode() + (this.f62291a.hashCode() * 31)) * 31, 31, this.f62293c);
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoActionOperationUpdate";
    }

    public final String toString() {
        return "█";
    }
}
