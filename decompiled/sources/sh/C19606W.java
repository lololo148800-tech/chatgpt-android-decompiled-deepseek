package sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20963k;
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
import th.C19952G;

/* JADX INFO: renamed from: sh.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C19606W implements InterfaceC17846N {

    /* JADX INFO: renamed from: a */
    public final String f62223a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9172M3 f62224b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9172M3 f62225c;

    public C19606W(String query, AbstractC9172M3 abstractC9172M3) {
        C17843K c17843k = C17843K.f56900a;
        AbstractC16544l.m18094g(query, "query");
        this.f62223a = query;
        this.f62224b = c17843k;
        this.f62225c = abstractC9172M3;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21239b0.f67583v;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20963k.f66766e;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19952G.f63231Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "21102abac203f695231583f3d21f4e496ab3d704963576e07c57ebb3e091803c";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "query GizmoSearch($query: String!, $first: Int, $after: Cursor) { gizmoSearch(q: $query, first: $first, after: $after) { pageInfo { endCursor hasNextPage } edges { node { __typename ...GizmoFragment } } } }  fragment GizmoFragment on Gizmo { id legacyId display { name description theme profilePictureUrl promptStarters } author { displayName linkTo willReceiveSupportEmails displaySocials { type displayName verified verifiedData { username linkTo } } } model tags lastInteractedAt gizmoType vanityMetrics { numConversationsStr } tools { edges { node { id type metadata { actionId domain auth { type } privacyPolicyUrl } } } } instructions files { __typename ... on GizmoLiveFile { id type } ... on GizmoFullFile { id fileId name type } } productFeatures { attachments { type acceptedMimeTypes imageMimeTypes } } shareRecipient }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        interfaceC19456f.mo20545M0("query");
        AbstractC17850c.f56903a.mo369f(interfaceC19456f, customScalarAdapters, this.f62223a);
        AbstractC9172M3 abstractC9172M3 = this.f62224b;
        if (abstractC9172M3 instanceof C17844L) {
            interfaceC19456f.mo20545M0("first");
            AbstractC17850c.m19595c(AbstractC17850c.f56908f).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M3);
        }
        AbstractC9172M3 abstractC9172M4 = this.f62225c;
        if (abstractC9172M4 instanceof C17844L) {
            interfaceC19456f.mo20545M0("after");
            AbstractC17850c.m19595c(AbstractC17850c.f56910h).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19606W)) {
            return false;
        }
        C19606W c19606w = (C19606W) obj;
        return AbstractC16544l.m18089b(this.f62223a, c19606w.f62223a) && AbstractC16544l.m18089b(this.f62224b, c19606w.f62224b) && AbstractC16544l.m18089b(this.f62225c, c19606w.f62225c);
    }

    public final int hashCode() {
        return this.f62225c.hashCode() + ((this.f62224b.hashCode() + (this.f62223a.hashCode() * 31)) * 31);
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoSearch";
    }

    public final String toString() {
        return "█";
    }
}
