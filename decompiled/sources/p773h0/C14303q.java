package p773h0;

import kotlin.jvm.internal.AbstractC16544l;
import p774h1.C14351g;
import p774h1.InterfaceC14333K;
import p774h1.InterfaceC14362r;
import p821j1.C16037b;

/* JADX INFO: renamed from: h0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C14303q {

    /* JADX INFO: renamed from: a */
    public C14351g f44903a = null;

    /* JADX INFO: renamed from: b */
    public InterfaceC14362r f44904b = null;

    /* JADX INFO: renamed from: c */
    public C16037b f44905c = null;

    /* JADX INFO: renamed from: d */
    public InterfaceC14333K f44906d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14303q)) {
            return false;
        }
        C14303q c14303q = (C14303q) obj;
        return AbstractC16544l.m18089b(this.f44903a, c14303q.f44903a) && AbstractC16544l.m18089b(this.f44904b, c14303q.f44904b) && AbstractC16544l.m18089b(this.f44905c, c14303q.f44905c) && AbstractC16544l.m18089b(this.f44906d, c14303q.f44906d);
    }

    public final int hashCode() {
        C14351g c14351g = this.f44903a;
        int iHashCode = (c14351g == null ? 0 : c14351g.hashCode()) * 31;
        InterfaceC14362r interfaceC14362r = this.f44904b;
        int iHashCode2 = (iHashCode + (interfaceC14362r == null ? 0 : interfaceC14362r.hashCode())) * 31;
        C16037b c16037b = this.f44905c;
        int iHashCode3 = (iHashCode2 + (c16037b == null ? 0 : c16037b.hashCode())) * 31;
        InterfaceC14333K interfaceC14333K = this.f44906d;
        return iHashCode3 + (interfaceC14333K != null ? interfaceC14333K.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f44903a + ", canvas=" + this.f44904b + ", canvasDrawScope=" + this.f44905c + ", borderPath=" + this.f44906d + ')';
    }
}
