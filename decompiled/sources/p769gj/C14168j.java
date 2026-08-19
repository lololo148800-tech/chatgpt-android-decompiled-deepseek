package p769gj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p002A0.C0148y;
import p017Af.C0485p;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p225Im.InterfaceC3756d;
import p544W9.AbstractC8712t;
import p544W9.AbstractC8718u;
import p544W9.AbstractC8724v;
import p562X0.C9006a;

/* JADX INFO: renamed from: gj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C14168j implements InterfaceC14147A {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3756d f44547a;

    /* JADX INFO: renamed from: b */
    public final C9006a f44548b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC14150D f44549c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1441p f44550d;

    public C14168j(InterfaceC3756d type, InterfaceC1436k interfaceC1436k, C14164f c14164f, int i10) {
        InterfaceC1441p doShowRendering = c14164f;
        doShowRendering = (i10 & 8) != 0 ? new C0485p(interfaceC1436k) : doShowRendering;
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(doShowRendering, "doShowRendering");
        C9006a c9006a = new C9006a(interfaceC1436k);
        this.f44547a = type;
        this.f44548b = c9006a;
        this.f44549c = null;
        this.f44550d = doShowRendering;
    }

    @Override // p769gj.InterfaceC14147A
    /* JADX INFO: renamed from: a */
    public final View mo1135a(Object initialRendering, C14183y initialViewEnvironment, Context context, ViewGroup viewGroup) {
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        C17309l c17309l = (C17309l) this.f44548b.invoke(initialRendering, initialViewEnvironment);
        C14183y c14183y = (C14183y) c17309l.f55137Z;
        View viewM9421c = AbstractC8712t.m9421c((InterfaceC14149C) c14183y.m15505a(InterfaceC14149C.f44508a), c17309l.f55136Y, c14183y, context, viewGroup, this.f44549c);
        AbstractC14158L abstractC14158LM9449g = AbstractC8724v.m9449g(viewM9421c);
        InterfaceC1439n interfaceC1439nMo15503b = abstractC14158LM9449g == null ? null : abstractC14158LM9449g.mo15503b();
        AbstractC16544l.m18091d(interfaceC1439nMo15503b);
        AbstractC8718u.m9432a(viewM9421c, initialRendering, c14183y, new C0148y(this, viewM9421c, interfaceC1439nMo15503b, 28));
        return viewM9421c;
    }

    @Override // p769gj.InterfaceC14147A
    public final InterfaceC3756d getType() {
        return this.f44547a;
    }
}
