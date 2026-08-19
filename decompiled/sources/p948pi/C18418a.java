package p948pi;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21891A;
import p1155zi.C22050r;
import p324Mn.C5551u;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: pi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18418a {

    /* JADX INFO: renamed from: a */
    public final C18422e f58773a;

    /* JADX INFO: renamed from: b */
    public final C21891A f58774b;

    /* JADX INFO: renamed from: c */
    public final String f58775c;

    /* JADX INFO: renamed from: d */
    public final String f58776d;

    /* JADX INFO: renamed from: e */
    public final String f58777e;

    /* JADX INFO: renamed from: f */
    public final boolean f58778f;

    /* JADX INFO: renamed from: g */
    public final boolean f58779g;

    /* JADX INFO: renamed from: h */
    public final boolean f58780h;

    static {
        C18422e c18422e = new C18422e(ParameterNames.f31999ID, false, (C5551u) null, 14);
        C21891A.Companion.getClass();
        C21891A c21891a = C21891A.f69409c;
        C22050r.Companion.getClass();
        new C18418a(c18422e, c21891a, "default");
        new C18418a(new C18422e(ParameterNames.f31999ID, true, (C5551u) null, 12), c21891a, "default");
        new C18418a(new C18422e(ParameterNames.f31999ID, false, (C5551u) null, 14), C21891A.f69410d, "default");
        new C18418a(new C18422e(ParameterNames.f31999ID, false, (C5551u) null, 14), C21891A.f69411e, "default");
    }

    public C18418a(C18422e c18422e, C21891A accountUser, String accountId) {
        AbstractC16544l.m18094g(accountUser, "accountUser");
        AbstractC16544l.m18094g(accountId, "accountId");
        this.f58773a = c18422e;
        this.f58774b = accountUser;
        this.f58775c = accountId;
        String str = accountUser.f69416b.f69655a;
        this.f58776d = str;
        this.f58777e = AbstractC9306j0.m9890i(str, "__", accountId);
        this.f58778f = accountUser.m22330i();
        this.f58779g = accountUser.m22331j();
        this.f58780h = accountUser.m22329h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18418a)) {
            return false;
        }
        C18418a c18418a = (C18418a) obj;
        return AbstractC16544l.m18089b(this.f58773a, c18418a.f58773a) && AbstractC16544l.m18089b(this.f58774b, c18418a.f58774b) && AbstractC16544l.m18089b(this.f58775c, c18418a.f58775c);
    }

    public final int hashCode() {
        return this.f58775c.hashCode() + ((this.f58774b.hashCode() + (this.f58773a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
