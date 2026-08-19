package p951pp;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import np.InterfaceC17710b;
import p934op.C18252a;
import p934op.C18253b;

/* JADX INFO: renamed from: pp.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C18536f implements InterfaceC17710b {

    /* JADX INFO: renamed from: Y */
    public final String f59054Y;

    /* JADX INFO: renamed from: Z */
    public volatile InterfaceC17710b f59055Z;

    /* JADX INFO: renamed from: o0 */
    public Boolean f59056o0;

    /* JADX INFO: renamed from: p0 */
    public Method f59057p0;

    /* JADX INFO: renamed from: q0 */
    public C18252a f59058q0;

    /* JADX INFO: renamed from: r0 */
    public final LinkedBlockingQueue f59059r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f59060s0;

    public C18536f(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z6) {
        this.f59054Y = str;
        this.f59059r0 = linkedBlockingQueue;
        this.f59060s0 = z6;
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: a */
    public final boolean mo19436a() {
        return m19903i().mo19436a();
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: b */
    public final boolean mo19437b() {
        return m19903i().mo19437b();
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: c */
    public final boolean mo19438c() {
        return m19903i().mo19438c();
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: d */
    public final boolean mo19439d() {
        return m19903i().mo19439d();
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: e */
    public final boolean mo19440e() {
        return m19903i().mo19440e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C18536f.class == obj.getClass() && this.f59054Y.equals(((C18536f) obj).f59054Y);
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: f */
    public final void mo19441f(String str) {
        m19903i().mo19441f(str);
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: g */
    public final void mo19442g(String str) {
        m19903i().mo19442g(str);
    }

    @Override // np.InterfaceC17710b
    public final String getName() {
        return this.f59054Y;
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: h */
    public final boolean mo19443h(int i10) {
        return m19903i().mo19443h(i10);
    }

    public final int hashCode() {
        return this.f59054Y.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC17710b m19903i() {
        if (this.f59055Z != null) {
            return this.f59055Z;
        }
        if (this.f59060s0) {
            return C18532b.f59048Y;
        }
        if (this.f59058q0 == null) {
            C18252a c18252a = new C18252a();
            c18252a.f58139Z = this;
            c18252a.f58138Y = this.f59054Y;
            c18252a.f58140o0 = this.f59059r0;
            this.f59058q0 = c18252a;
        }
        return this.f59058q0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19904j() {
        Boolean bool = this.f59056o0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f59057p0 = this.f59055Z.getClass().getMethod("log", C18253b.class);
            this.f59056o0 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f59056o0 = Boolean.FALSE;
        }
        return this.f59056o0.booleanValue();
    }
}
