package sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20959g;
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
import th.C19992x;

/* JADX INFO: renamed from: sh.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C19590F implements InterfaceC17846N {

    /* JADX INFO: renamed from: a */
    public final AbstractC9172M3 f62198a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9172M3 f62199b;

    public C19590F() {
        C17843K c17843k = C17843K.f56900a;
        this.f62198a = c17843k;
        this.f62199b = c17843k;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21239b0.f67583v;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20959g.f66754c;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19992x.f63303Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "dcc72907105bd7e054d25379cd9c6a1a79faec849fbef5b49f7007b5c04a6998";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "query GizmoDiscoveryForViewer($locale: GizmoCategoryLocale, $first: Int) { gizmoDiscoveryForViewer(locale: $locale, first: $first) { cuts { __typename ...GizmoDiscoveryCutFragment } } }  fragment GizmoFragment on Gizmo { id legacyId display { name description theme profilePictureUrl promptStarters } author { displayName linkTo willReceiveSupportEmails displaySocials { type displayName verified verifiedData { username linkTo } } } model tags lastInteractedAt gizmoType vanityMetrics { numConversationsStr } tools { edges { node { id type metadata { actionId domain auth { type } privacyPolicyUrl } } } } instructions files { __typename ... on GizmoLiveFile { id type } ... on GizmoFullFile { id fileId name type } } productFeatures { attachments { type acceptedMimeTypes imageMimeTypes } } shareRecipient }  fragment GizmoDiscoveryCutFragment on GizmoDiscoveryCut { info { id title description displayType displayGroup } items { pageInfo { endCursor hasNextPage } edges { node { __typename ...GizmoFragment } } } }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC9172M3 abstractC9172M3 = this.f62198a;
        if (abstractC9172M3 instanceof C17844L) {
            interfaceC19456f.mo20545M0("locale");
            AbstractC17850c.m19595c(AbstractC17850c.m19593a(C21541a.f68228o0)).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M3);
        }
        AbstractC9172M3 abstractC9172M4 = this.f62199b;
        if (abstractC9172M4 instanceof C17844L) {
            interfaceC19456f.mo20545M0("first");
            AbstractC17850c.m19595c(AbstractC17850c.f56908f).mo369f(interfaceC19456f, customScalarAdapters, (C17844L) abstractC9172M4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19590F)) {
            return false;
        }
        C19590F c19590f = (C19590F) obj;
        return AbstractC16544l.m18089b(this.f62198a, c19590f.f62198a) && AbstractC16544l.m18089b(this.f62199b, c19590f.f62199b);
    }

    public final int hashCode() {
        return this.f62199b.hashCode() + (this.f62198a.hashCode() * 31);
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoDiscoveryForViewer";
    }

    public final String toString() {
        return "█";
    }
}
