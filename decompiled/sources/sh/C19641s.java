package sh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19456f;
import p1085wh.AbstractC20955c;
import p1107xh.AbstractC21239b0;
import p909nm.C17689w;
import p917o6.AbstractC17850c;
import p917o6.C17840H;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17846N;
import th.C19974f;

/* JADX INFO: renamed from: sh.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C19641s implements InterfaceC17846N {

    /* JADX INFO: renamed from: a */
    public final String f62289a;

    public C19641s(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f62289a = id2;
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: a */
    public final C17859l mo19588a() {
        C17840H type = AbstractC21239b0.f67583v;
        AbstractC16544l.m18094g(type, "type");
        C17689w c17689w = C17689w.f56480Y;
        List selections = AbstractC20955c.f66745h;
        AbstractC16544l.m18094g(selections, "selections");
        return new C17859l("data", type, c17689w, c17689w, selections);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: b */
    public final C0095w0 mo19589b() {
        return AbstractC17850c.m19594b(C19974f.f63274Y, false);
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: c */
    public final String mo19590c() {
        return "ca0126fab2856521b541b3915775b5a55456f11574f3fc288162e14a60989085";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: d */
    public final String mo19591d() {
        return "query GizmoAbout($id: String!) { gizmoAboutLegacy(id: $id) { gizmo { __typename ...GizmoFragment } aboutBlocks { __typename ... on GizmoAboutGenericTitleSubtitleBlock { title subtitle } ... on GizmoAboutRatingBlock { avg countStr } ... on GizmoAboutCategoryBlock { categoryStr categoryRanking } } reviewStats { byRating } } }  fragment GizmoFragment on Gizmo { id legacyId display { name description theme profilePictureUrl promptStarters } author { displayName linkTo willReceiveSupportEmails displaySocials { type displayName verified verifiedData { username linkTo } } } model tags lastInteractedAt gizmoType vanityMetrics { numConversationsStr } tools { edges { node { id type metadata { actionId domain auth { type } privacyPolicyUrl } } } } instructions files { __typename ... on GizmoLiveFile { id type } ... on GizmoFullFile { id fileId name type } } productFeatures { attachments { type acceptedMimeTypes imageMimeTypes } } shareRecipient }";
    }

    @Override // p917o6.InterfaceC17842J
    /* JADX INFO: renamed from: e */
    public final void mo19592e(InterfaceC19456f interfaceC19456f, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        interfaceC19456f.mo20545M0(ParameterNames.f31999ID);
        AbstractC17850c.f56903a.mo369f(interfaceC19456f, customScalarAdapters, this.f62289a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19641s) && AbstractC16544l.m18089b(this.f62289a, ((C19641s) obj).f62289a);
    }

    public final int hashCode() {
        return this.f62289a.hashCode();
    }

    @Override // p917o6.InterfaceC17842J
    public final String name() {
        return "GizmoAbout";
    }

    public final String toString() {
        return "█";
    }
}
