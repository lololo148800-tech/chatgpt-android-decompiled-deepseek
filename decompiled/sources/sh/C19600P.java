package sh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p003A1.AbstractC0168G;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20962j;
import p1107xh.AbstractC21239b0;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17844L;
import p917o6.C17849b;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17846N;
import th.C19950E;

/* JADX INFO: renamed from: sh.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C19600P implements InterfaceC17846N {

    /* JADX INFO: renamed from: a */
    public final String f62211a;

    /* JADX INFO: renamed from: b */
    public final String f62212b;

    /* JADX INFO: renamed from: c */
    public final C17844L f62213c;

    /* JADX INFO: renamed from: d */
    public final String f62214d;

    public C19600P(String str, String str2, C17844L c17844l, String redirectTo) {
        AbstractC16544l.m18094g(redirectTo, "redirectTo");
        this.f62211a = str;
        this.f62212b = str2;
        this.f62213c = c17844l;
        this.f62214d = redirectTo;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21239b0.f67583v;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20962j.f66761b;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19950E.f63227Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "c6e26ed9a20729b595a55d3cabffcd9bd3390f7f3fdc20a09cd26cfb89baa5e6";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "query GizmoOauthRedirect($id: String!, $actionId: String!, $domain: String, $redirectTo: String!) { gizmoOauthRedirectLegacy(id: $id, actionId: $actionId, domain: $domain, redirectTo: $redirectTo) { redirectUrl } }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        interfaceC19456f.mo20545M0(ParameterNames.f31999ID);
        C17849b c17849b = AbstractC17850c.f56903a;
        c17849b.mo369f(interfaceC19456f, customScalarAdapters, this.f62211a);
        interfaceC19456f.mo20545M0("actionId");
        c17849b.mo369f(interfaceC19456f, customScalarAdapters, this.f62212b);
        C17844L c17844l = this.f62213c;
        interfaceC19456f.mo20545M0("domain");
        AbstractC17850c.m19595c(AbstractC17850c.f56907e).mo369f(interfaceC19456f, customScalarAdapters, c17844l);
        interfaceC19456f.mo20545M0("redirectTo");
        c17849b.mo369f(interfaceC19456f, customScalarAdapters, this.f62214d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19600P)) {
            return false;
        }
        C19600P c19600p = (C19600P) obj;
        return this.f62211a.equals(c19600p.f62211a) && this.f62212b.equals(c19600p.f62212b) && this.f62213c.equals(c19600p.f62213c) && AbstractC16544l.m18089b(this.f62214d, c19600p.f62214d);
    }

    public final int hashCode() {
        return this.f62214d.hashCode() + ((this.f62213c.hashCode() + AbstractC0168G.m527p(this.f62211a.hashCode() * 31, 31, this.f62212b)) * 31);
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoOauthRedirect";
    }

    public final String toString() {
        return "█";
    }
}
