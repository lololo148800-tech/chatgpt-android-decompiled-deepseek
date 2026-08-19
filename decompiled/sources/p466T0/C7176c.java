package p466T0;

import p415R0.InterfaceC6786d;
import p491U0.C7533a;
import p826j6.C16137F;
import p909nm.AbstractC17672f;

/* JADX INFO: renamed from: T0.c */
/* JADX INFO: loaded from: classes.dex */
public class C7176c extends AbstractC17672f implements InterfaceC6786d {

    /* JADX INFO: renamed from: o0 */
    public static final C7176c f22810o0 = new C7176c(C7187n.f22836e, 0);

    /* JADX INFO: renamed from: Y */
    public final C7187n f22811Y;

    /* JADX INFO: renamed from: Z */
    public final int f22812Z;

    public C7176c(C7187n c7187n, int i10) {
        this.f22811Y = c7187n;
        this.f22812Z = i10;
    }

    @Override // p415R0.InterfaceC6786d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C7178e builder() {
        return new C7178e(this);
    }

    /* JADX INFO: renamed from: b */
    public final C7176c m7555b(Object obj, C7533a c7533a) {
        C16137F c16137fM7582u = this.f22811Y.m7582u(obj != null ? obj.hashCode() : 0, obj, c7533a, 0);
        return c16137fM7582u == null ? this : new C7176c((C7187n) c16137fM7582u.f50064o0, this.f22812Z + c16137fM7582u.f50063Z);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f22811Y.m7566d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f22811Y.m7569g(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
