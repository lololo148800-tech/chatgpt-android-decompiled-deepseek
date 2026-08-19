package p1082wd;

import bf.C11349D;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;
import p1071w0.AbstractC20734X;
import p909nm.C17690x;

/* JADX INFO: renamed from: wd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20908a {

    /* JADX INFO: renamed from: a */
    public final C20263a0 f66645a;

    /* JADX INFO: renamed from: b */
    public final C11349D f66646b;

    /* JADX INFO: renamed from: c */
    public final Map f66647c;

    /* JADX INFO: renamed from: d */
    public final boolean f66648d;

    /* JADX INFO: renamed from: e */
    public final String f66649e;

    public C20908a(C20263a0 c20263a0, C11349D c11349d, Map allGizmosInConversation, boolean z6, String str) {
        AbstractC16544l.m18094g(allGizmosInConversation, "allGizmosInConversation");
        this.f66645a = c20263a0;
        this.f66646b = c11349d;
        this.f66647c = allGizmosInConversation;
        this.f66648d = z6;
        this.f66649e = str;
    }

    /* JADX INFO: renamed from: a */
    public static C20908a m21452a(C20908a c20908a, C20263a0 c20263a0, C11349D c11349d, Map map, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            c20263a0 = c20908a.f66645a;
        }
        C20263a0 c20263a1 = c20263a0;
        if ((i10 & 2) != 0) {
            c11349d = c20908a.f66646b;
        }
        C11349D c11349d2 = c11349d;
        if ((i10 & 4) != 0) {
            map = c20908a.f66647c;
        }
        Map allGizmosInConversation = map;
        if ((i10 & 8) != 0) {
            z6 = c20908a.f66648d;
        }
        String str = c20908a.f66649e;
        c20908a.getClass();
        AbstractC16544l.m18094g(allGizmosInConversation, "allGizmosInConversation");
        return new C20908a(c20263a1, c11349d2, allGizmosInConversation, z6, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20908a)) {
            return false;
        }
        C20908a c20908a = (C20908a) obj;
        return AbstractC16544l.m18089b(this.f66645a, c20908a.f66645a) && AbstractC16544l.m18089b(this.f66646b, c20908a.f66646b) && AbstractC16544l.m18089b(this.f66647c, c20908a.f66647c) && this.f66648d == c20908a.f66648d && AbstractC16544l.m18089b(this.f66649e, c20908a.f66649e);
    }

    public final int hashCode() {
        C20263a0 c20263a0 = this.f66645a;
        int iHashCode = (c20263a0 == null ? 0 : c20263a0.hashCode()) * 31;
        C11349D c11349d = this.f66646b;
        int iM21250u = (AbstractC20734X.m21250u((iHashCode + (c11349d == null ? 0 : c11349d.hashCode())) * 31, 31, this.f66647c) + (this.f66648d ? 1231 : 1237)) * 31;
        String str = this.f66649e;
        return iM21250u + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C20908a(String str, int i10) {
        this(null, null, C17690x.f56481Y, false, (i10 & 16) != 0 ? null : str);
    }
}
