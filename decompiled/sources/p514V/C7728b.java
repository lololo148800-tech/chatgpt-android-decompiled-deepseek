package p514V;

import java.util.Iterator;
import p178H.AbstractC3174u0;
import p228J.C3836g;
import p228J.C3865u0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3861s0;
import p544W9.AbstractC8488H2;

/* JADX INFO: renamed from: V.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7728b implements InterfaceC3861s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7729c f24360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f24361b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24362c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3800E0 f24363d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3836g f24364e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3836g f24365f;

    public /* synthetic */ C7728b(C7729c c7729c, String str, String str2, InterfaceC3800E0 interfaceC3800E0, C3836g c3836g, C3836g c3836g2) {
        this.f24360a = c7729c;
        this.f24361b = str;
        this.f24362c = str2;
        this.f24363d = interfaceC3800E0;
        this.f24364e = c3836g;
        this.f24365f = c3836g2;
    }

    @Override // p228J.InterfaceC3861s0
    /* JADX INFO: renamed from: a */
    public final void mo28a(C3865u0 c3865u0) {
        C7729c c7729c = this.f24360a;
        if (c7729c.m4009b() == null) {
            return;
        }
        c7729c.m7992B();
        c7729c.m4007A(c7729c.m7993C(this.f24361b, this.f24362c, this.f24363d, this.f24364e, this.f24365f));
        c7729c.m4018n();
        C7733g c7733g = c7729c.f24368p;
        c7733g.getClass();
        AbstractC8488H2.m9140a();
        Iterator it = c7733g.f24387Y.iterator();
        while (it.hasNext()) {
            c7733g.mo114j((AbstractC3174u0) it.next());
        }
    }
}
