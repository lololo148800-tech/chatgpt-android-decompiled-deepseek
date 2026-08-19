package sh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20965m;
import p1107xh.AbstractC21234Y;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17844L;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17838F;
import th.C19958M;

/* JADX INFO: renamed from: sh.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19613b0 implements InterfaceC17838F {

    /* JADX INFO: renamed from: a */
    public final String f62234a;

    /* JADX INFO: renamed from: b */
    public final C17844L f62235b;

    /* JADX INFO: renamed from: c */
    public final C17844L f62236c;

    /* JADX INFO: renamed from: d */
    public final C17844L f62237d;

    public C19613b0(String id2, C17844L c17844l, C17844L c17844l2, C17844L c17844l3) {
        AbstractC16544l.m18094g(id2, "id");
        this.f62234a = id2;
        this.f62235b = c17844l;
        this.f62236c = c17844l2;
        this.f62237d = c17844l3;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21234Y.f67552k;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20965m.f66769b;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19958M.f63243Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "d9f0d9c5f72d380293c3f452c70f2b0c85f403f7003651a92c973cd61cdc1212";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "mutation GizmoSubmitReview($id: String!, $rating: Int, $message: String, $includeFrom: Boolean) { gizmoAddReviewLegacy(id: $id, rating: $rating, message: $message, includeFrom: $includeFrom) { rating } }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        interfaceC19456f.mo20545M0(ParameterNames.f31999ID);
        AbstractC17850c.f56903a.mo369f(interfaceC19456f, customScalarAdapters, this.f62234a);
        C17844L c17844l = this.f62235b;
        interfaceC19456f.mo20545M0("rating");
        AbstractC17850c.m19595c(AbstractC17850c.f56908f).mo369f(interfaceC19456f, customScalarAdapters, c17844l);
        C17844L c17844l2 = this.f62236c;
        interfaceC19456f.mo20545M0("message");
        AbstractC17850c.m19595c(AbstractC17850c.f56907e).mo369f(interfaceC19456f, customScalarAdapters, c17844l2);
        C17844L c17844l3 = this.f62237d;
        interfaceC19456f.mo20545M0("includeFrom");
        AbstractC17850c.m19595c(AbstractC17850c.f56909g).mo369f(interfaceC19456f, customScalarAdapters, c17844l3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19613b0)) {
            return false;
        }
        C19613b0 c19613b0 = (C19613b0) obj;
        return AbstractC16544l.m18089b(this.f62234a, c19613b0.f62234a) && this.f62235b.equals(c19613b0.f62235b) && this.f62236c.equals(c19613b0.f62236c) && this.f62237d.equals(c19613b0.f62237d);
    }

    public final int hashCode() {
        return this.f62237d.hashCode() + ((this.f62236c.hashCode() + ((this.f62235b.hashCode() + (this.f62234a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoSubmitReview";
    }

    public final String toString() {
        return "█";
    }
}
