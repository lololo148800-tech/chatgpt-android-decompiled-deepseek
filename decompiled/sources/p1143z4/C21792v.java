package p1143z4;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0742X;
import p076Cm.InterfaceC1723a;
import p1070w.C20694c;
import p1091wn.AbstractC21031l;
import p1091wn.C21020a;
import p1113xn.AbstractC21322p;
import p692d0.C12960M;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: z4.v */
/* JADX INFO: loaded from: classes.dex */
public class C21792v extends AbstractC21790t implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ int f69140y0 = 0;

    /* JADX INFO: renamed from: u0 */
    public final C12960M f69141u0;

    /* JADX INFO: renamed from: v0 */
    public int f69142v0;

    /* JADX INFO: renamed from: w0 */
    public String f69143w0;

    /* JADX INFO: renamed from: x0 */
    public String f69144x0;

    public C21792v(C21794x c21794x) {
        super(c21794x);
        this.f69141u0 = new C12960M(0);
    }

    @Override // p1143z4.AbstractC21790t
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C21792v)) {
            return false;
        }
        if (super.equals(obj)) {
            C12960M c12960m = this.f69141u0;
            int iM14655f = c12960m.m14655f();
            C21792v c21792v = (C21792v) obj;
            C12960M c12960m2 = c21792v.f69141u0;
            if (iM14655f == c12960m2.m14655f() && this.f69142v0 == c21792v.f69142v0) {
                for (AbstractC21790t abstractC21790t : (C21020a) AbstractC21031l.m21483g(new C0742X(c12960m, 2))) {
                    if (!abstractC21790t.equals(c12960m2.m14652c(abstractC21790t.f69135r0))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p1143z4.AbstractC21790t
    public final int hashCode() {
        int iM14653d = this.f69142v0;
        C12960M c12960m = this.f69141u0;
        int iM14655f = c12960m.m14655f();
        for (int i10 = 0; i10 < iM14655f; i10++) {
            iM14653d = (((iM14653d * 31) + c12960m.m14653d(i10)) * 31) + ((AbstractC21790t) c12960m.m14656g(i10)).hashCode();
        }
        return iM14653d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21791u(this);
    }

    @Override // p1143z4.AbstractC21790t
    /* JADX INFO: renamed from: q */
    public final C21789s mo22282q(C20694c c20694c) {
        C21789s c21789sMo22282q = super.mo22282q(c20694c);
        ArrayList arrayList = new ArrayList();
        C21791u c21791u = new C21791u(this);
        while (c21791u.hasNext()) {
            C21789s c21789sMo22282q2 = ((AbstractC21790t) c21791u.next()).mo22282q(c20694c);
            if (c21789sMo22282q2 != null) {
                arrayList.add(c21789sMo22282q2);
            }
        }
        return (C21789s) AbstractC17680n.m19354d0(AbstractC17678l.m19315v(new C21789s[]{c21789sMo22282q, (C21789s) AbstractC17680n.m19354d0(arrayList)}));
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC21790t m22284s(int i10, boolean z6) {
        C21792v c21792v;
        AbstractC21790t abstractC21790t = (AbstractC21790t) this.f69141u0.m14652c(i10);
        if (abstractC21790t != null) {
            return abstractC21790t;
        }
        if (!z6 || (c21792v = this.f69131Z) == null) {
            return null;
        }
        return c21792v.m22284s(i10, true);
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC21790t m22285t(String route, boolean z6) {
        C21792v c21792v;
        Object next;
        AbstractC16544l.m18094g(route, "route");
        int iHashCode = "android-app://androidx.navigation/".concat(route).hashCode();
        C12960M c12960m = this.f69141u0;
        AbstractC21790t abstractC21790t = (AbstractC21790t) c12960m.m14652c(iHashCode);
        if (abstractC21790t == null) {
            Iterator it = ((C21020a) AbstractC21031l.m21483g(new C0742X(c12960m, 2))).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((AbstractC21790t) next).m22281p(route) == null);
            abstractC21790t = (AbstractC21790t) next;
        }
        if (abstractC21790t != null) {
            return abstractC21790t;
        }
        if (!z6 || (c21792v = this.f69131Z) == null || AbstractC21322p.m21681O(route)) {
            return null;
        }
        return c21792v.m22285t(route, true);
    }

    @Override // p1143z4.AbstractC21790t
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.f69144x0;
        AbstractC21790t abstractC21790tM22285t = (str == null || AbstractC21322p.m21681O(str)) ? null : m22285t(str, true);
        if (abstractC21790tM22285t == null) {
            abstractC21790tM22285t = m22284s(this.f69142v0, true);
        }
        sb2.append(" startDestination=");
        if (abstractC21790tM22285t == null) {
            String str2 = this.f69144x0;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.f69143w0;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f69142v0));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(abstractC21790tM22285t.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "sb.toString()");
        return string;
    }

    /* JADX INFO: renamed from: u */
    public final C21789s m22286u(C20694c c20694c) {
        return super.mo22282q(c20694c);
    }
}
