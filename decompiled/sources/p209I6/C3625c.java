package p209I6;

import mm.C17296C;
import mo.C17327D;
import mo.InterfaceC17333J;
import p025An.C0636s;
import p026Ao.C0678l;
import p060C6.C1606c;
import p060C6.C1607d;
import p077Cn.C1743k;
import p1159zo.C22221g;
import p571X9.AbstractC9147I2;

/* JADX INFO: renamed from: I6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3625c extends AbstractC9147I2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0636s f11052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1743k f11053b;

    public C3625c(C0636s c0636s, C1743k c1743k) {
        this.f11052a = c0636s;
        this.f11053b = c1743k;
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: e */
    public final void mo4337e(C22221g c22221g, int i10, String str) {
        this.f11053b.mo2522l(null);
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: f */
    public final void mo4338f(C22221g c22221g, int i10, String str) {
        this.f11052a.m1298O(C17296C.f55119a);
        this.f11053b.m2550s(new C1607d("WebSocket Closed code='" + i10 + "' reason='" + str + '\'', null), false);
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: g */
    public final void mo4339g(C22221g c22221g, Exception exc, C17327D c17327d) {
        this.f11052a.m1298O(C17296C.f55119a);
        this.f11053b.m2550s(new C1606c("Web socket communication error", exc), false);
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: h */
    public final void mo4340h(String str, C22221g c22221g) {
        this.f11053b.mo2524p(str);
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: i */
    public final void mo4341i(C22221g c22221g, C0678l c0678l) {
        this.f11053b.mo2524p(c0678l.m1452r());
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: j */
    public final void mo4342j(InterfaceC17333J interfaceC17333J, C17327D c17327d) {
        this.f11052a.m1298O(C17296C.f55119a);
    }
}
