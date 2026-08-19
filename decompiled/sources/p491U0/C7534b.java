package p491U0;

import java.util.Iterator;
import p415R0.InterfaceC6787e;
import p466T0.C7176c;
import p515V0.C7736b;
import p909nm.AbstractC17675i;

/* JADX INFO: renamed from: U0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7534b extends AbstractC17675i implements InterfaceC6787e {

    /* JADX INFO: renamed from: p0 */
    public static final C7534b f23880p0;

    /* JADX INFO: renamed from: Y */
    public final Object f23881Y;

    /* JADX INFO: renamed from: Z */
    public final Object f23882Z;

    /* JADX INFO: renamed from: o0 */
    public final C7176c f23883o0;

    static {
        C7736b c7736b = C7736b.f24402a;
        f23880p0 = new C7534b(c7736b, c7736b, C7176c.f22810o0);
    }

    public C7534b(Object obj, Object obj2, C7176c c7176c) {
        this.f23881Y = obj;
        this.f23882Z = obj2;
        this.f23883o0 = c7176c;
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f23883o0.containsKey(obj);
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        C7176c c7176c = this.f23883o0;
        c7176c.getClass();
        return c7176c.f22812Z;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7535c(this.f23883o0, this.f23881Y);
    }
}
