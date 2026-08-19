package p299Ln;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0624m;
import p1027tp.C20048M;
import p1027tp.InterfaceC20059c;
import p1027tp.InterfaceC20062f;
import p571X9.AbstractC9233X;
import p746fa.C13606o;
import p746fa.InterfaceC13594c;

/* JADX INFO: renamed from: Ln.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5217b implements InterfaceC13594c, InterfaceC20062f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0624m f16952Y;

    public /* synthetic */ C5217b(C0624m c0624m) {
        this.f16952Y = c0624m;
    }

    @Override // p1027tp.InterfaceC20062f
    /* JADX INFO: renamed from: s */
    public void mo3626s(InterfaceC20059c call, Throwable th2) {
        AbstractC16544l.m18095h(call, "call");
        this.f16952Y.resumeWith(AbstractC9233X.m9806b(th2));
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public void mo258t(C13606o c13606o) {
        Exception excM15129h = c13606o.m15129h();
        if (excM15129h != null) {
            this.f16952Y.resumeWith(AbstractC9233X.m9806b(excM15129h));
        } else if (c13606o.f42985d) {
            this.f16952Y.mo1244b(null);
        } else {
            this.f16952Y.resumeWith(c13606o.m15130i());
        }
    }

    @Override // p1027tp.InterfaceC20062f
    /* JADX INFO: renamed from: v */
    public void mo3627v(InterfaceC20059c call, C20048M c20048m) {
        AbstractC16544l.m18095h(call, "call");
        this.f16952Y.resumeWith(c20048m);
    }
}
