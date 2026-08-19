package p193Hf;

import com.auth0.android.result.Credentials;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2062k;
import p1071w0.AbstractC20734X;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import ye.C21515d;

/* JADX INFO: renamed from: Hf.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3420z0 implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f10416a;

    /* JADX INFO: renamed from: b */
    public final String f10417b;

    /* JADX INFO: renamed from: c */
    public final String f10418c;

    /* JADX INFO: renamed from: d */
    public final boolean f10419d;

    /* JADX INFO: renamed from: e */
    public final C21515d f10420e;

    /* JADX INFO: renamed from: f */
    public final Credentials f10421f;

    /* JADX INFO: renamed from: g */
    public final Map f10422g;

    /* JADX INFO: renamed from: h */
    public final boolean f10423h;

    /* JADX INFO: renamed from: i */
    public final boolean f10424i;

    /* JADX INFO: renamed from: j */
    public final AbstractC21955Q1 f10425j;

    /* JADX INFO: renamed from: k */
    public final boolean f10426k;

    /* JADX INFO: renamed from: l */
    public final boolean f10427l;

    public C3420z0(String str, String conversationId, String accountId, boolean z6, C21515d repositoryState, Credentials credentials, Map names, boolean z10, boolean z11, AbstractC21955Q1 abstractC21955Q1) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(accountId, "accountId");
        AbstractC16544l.m18094g(repositoryState, "repositoryState");
        AbstractC16544l.m18094g(names, "names");
        this.f10416a = str;
        this.f10417b = conversationId;
        this.f10418c = accountId;
        this.f10419d = z6;
        this.f10420e = repositoryState;
        this.f10421f = credentials;
        this.f10422g = names;
        this.f10423h = z10;
        this.f10424i = z11;
        this.f10425j = abstractC21955Q1;
        boolean z12 = true;
        boolean z13 = z10 || repositoryState.f68136e || z11;
        this.f10426k = z13;
        if (!z6 && z13) {
            z12 = false;
        }
        this.f10427l = z12;
    }

    /* JADX INFO: renamed from: e */
    public static C3420z0 m4185e(C3420z0 c3420z0, String str, C21515d c21515d, Credentials credentials, Map map, boolean z6, boolean z10, C21952P1 c21952p1, int i10) {
        String str2 = c3420z0.f10416a;
        String conversationId = (i10 & 2) != 0 ? c3420z0.f10417b : str;
        String accountId = c3420z0.f10418c;
        boolean z11 = c3420z0.f10419d;
        C21515d repositoryState = (i10 & 16) != 0 ? c3420z0.f10420e : c21515d;
        Credentials credentials2 = (i10 & 32) != 0 ? c3420z0.f10421f : credentials;
        Map names = (i10 & 64) != 0 ? c3420z0.f10422g : map;
        boolean z12 = (i10 & 128) != 0 ? c3420z0.f10423h : z6;
        boolean z13 = (i10 & 256) != 0 ? c3420z0.f10424i : z10;
        AbstractC21955Q1 abstractC21955Q1 = (i10 & 512) != 0 ? c3420z0.f10425j : c21952p1;
        c3420z0.getClass();
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(accountId, "accountId");
        AbstractC16544l.m18094g(repositoryState, "repositoryState");
        AbstractC16544l.m18094g(names, "names");
        return new C3420z0(str2, conversationId, accountId, z11, repositoryState, credentials2, names, z12, z13, abstractC21955Q1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3420z0)) {
            return false;
        }
        C3420z0 c3420z0 = (C3420z0) obj;
        return AbstractC16544l.m18089b(this.f10416a, c3420z0.f10416a) && AbstractC16544l.m18089b(this.f10417b, c3420z0.f10417b) && AbstractC16544l.m18089b(this.f10418c, c3420z0.f10418c) && this.f10419d == c3420z0.f10419d && AbstractC16544l.m18089b(this.f10420e, c3420z0.f10420e) && AbstractC16544l.m18089b(this.f10421f, c3420z0.f10421f) && AbstractC16544l.m18089b(this.f10422g, c3420z0.f10422g) && this.f10423h == c3420z0.f10423h && this.f10424i == c3420z0.f10424i && AbstractC16544l.m18089b(this.f10425j, c3420z0.f10425j);
    }

    public final int hashCode() {
        int iHashCode = (this.f10420e.hashCode() + ((AbstractC0168G.m527p(AbstractC0168G.m527p(this.f10416a.hashCode() * 31, 31, this.f10417b), 31, this.f10418c) + (this.f10419d ? 1231 : 1237)) * 31)) * 31;
        Credentials credentials = this.f10421f;
        int iM21250u = (((AbstractC20734X.m21250u((iHashCode + (credentials == null ? 0 : credentials.hashCode())) * 31, 31, this.f10422g) + (this.f10423h ? 1231 : 1237)) * 31) + (this.f10424i ? 1231 : 1237)) * 31;
        AbstractC21955Q1 abstractC21955Q1 = this.f10425j;
        return iM21250u + (abstractC21955Q1 != null ? abstractC21955Q1.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
