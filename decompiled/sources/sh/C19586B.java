package sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20958f;
import p1107xh.AbstractC21239b0;
import p1129yh.C21541a;
import p571X9.AbstractC9172M3;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17843K;
import p917o6.C17844L;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17846N;
import th.C19989u;

/* JADX INFO: renamed from: sh.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C19586B implements InterfaceC17846N {

    /* JADX INFO: renamed from: a */
    public final String f62190a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9172M3 f62191b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9172M3 f62192c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9172M3 f62193d;

    public C19586B(String str, AbstractC9172M3 after, int i10) {
        C17843K c17843k = C17843K.f56900a;
        after = (i10 & 4) != 0 ? c17843k : after;
        AbstractC16544l.m18094g(after, "after");
        this.f62190a = str;
        this.f62191b = c17843k;
        this.f62192c = after;
        this.f62193d = c17843k;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21239b0.f67583v;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20958f.f66751b;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19989u.f63297Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "307e60a4ece6515be1d1447ea96cc8d077448a2402f0ada34217ce606ddffc23";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "query GizmoDiscoveryCut($cutId: String!, $first: Int, $after: Cursor, $locale: GizmoCategoryLocale) { gizmoDiscoveryCut(id: $cutId, first: $first, after: $after, locale: $locale) { __typename ...GizmoDiscoveryCutFragment } }  fragment GizmoFragment on Gizmo { id legacyId display { name description theme profilePictureUrl promptStarters } author { displayName linkTo willReceiveSupportEmails displaySocials { type displayName verified verifiedData { username linkTo } } } model tags lastInteractedAt gizmoType vanityMetrics { numConversationsStr } tools { edges { node { id type metadata { actionId domain auth { type } privacyPolicyUrl } } } } instructions files { __typename ... on GizmoLiveFile { id type } ... on GizmoFullFile { id fileId name type } } productFeatures { attachments { type acceptedMimeTypes imageMimeTypes } } shareRecipient }  fragment GizmoDiscoveryCutFragment on GizmoDiscoveryCut { info { id title description displayType displayGroup } items { pageInfo { endCursor hasNextPage } edges { node { __typename ...GizmoFragment } } } }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        interfaceC19456f.mo20545M0("cutId");
        AbstractC17850c.f56903a.mo369f(interfaceC19456f, customScalarAdapters, this.f62190a);
        AbstractC9172M3 abstractC9172M3 = this.f62191b;
        if (abstractC9172M3 instanceof C17844L) {
            interfaceC19456f.mo20545M0("first");
            AbstractC17850c.m19595c(AbstractC17850c.f56908f).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M3);
        }
        AbstractC9172M3 abstractC9172M4 = this.f62192c;
        if (abstractC9172M4 instanceof C17844L) {
            interfaceC19456f.mo20545M0("after");
            AbstractC17850c.m19595c(AbstractC17850c.f56910h).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M4);
        }
        AbstractC9172M3 abstractC9172M5 = this.f62193d;
        if (abstractC9172M5 instanceof C17844L) {
            interfaceC19456f.mo20545M0("locale");
            AbstractC17850c.m19595c(AbstractC17850c.m19593a(C21541a.f68228o0)).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19586B)) {
            return false;
        }
        C19586B c19586b = (C19586B) obj;
        return AbstractC16544l.m18089b(this.f62190a, c19586b.f62190a) && AbstractC16544l.m18089b(this.f62191b, c19586b.f62191b) && AbstractC16544l.m18089b(this.f62192c, c19586b.f62192c) && AbstractC16544l.m18089b(this.f62193d, c19586b.f62193d);
    }

    public final int hashCode() {
        return this.f62193d.hashCode() + ((this.f62192c.hashCode() + ((this.f62191b.hashCode() + (this.f62190a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoDiscoveryCut";
    }

    public final String toString() {
        return "█";
    }
}
