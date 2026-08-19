package p934op;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import np.InterfaceC17710b;
import p775h2.AbstractC14376f;
import p951pp.C18536f;

/* JADX INFO: renamed from: op.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C18252a implements InterfaceC17710b, Serializable {

    /* JADX INFO: renamed from: Y */
    public String f58138Y;

    /* JADX INFO: renamed from: Z */
    public C18536f f58139Z;

    /* JADX INFO: renamed from: o0 */
    public LinkedBlockingQueue f58140o0;

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: a */
    public final boolean mo19436a() {
        return true;
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: b */
    public final boolean mo19437b() {
        return true;
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: c */
    public final boolean mo19438c() {
        return true;
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: d */
    public final boolean mo19439d() {
        return true;
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: e */
    public final boolean mo19440e() {
        return true;
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: f */
    public final void mo19441f(String str) {
        m19773i(3);
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: g */
    public final void mo19442g(String str) {
        m19773i(5);
    }

    @Override // np.InterfaceC17710b
    public final String getName() {
        return this.f58138Y;
    }

    @Override // np.InterfaceC17710b
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean mo19443h(int i10) {
        return AbstractC14376f.m15837c(this, i10);
    }

    /* JADX INFO: renamed from: i */
    public final void m19773i(int i10) {
        C18253b c18253b = new C18253b();
        System.currentTimeMillis();
        c18253b.f58141a = i10;
        c18253b.f58142b = this.f58139Z;
        Thread.currentThread().getName();
        this.f58140o0.add(c18253b);
    }
}
