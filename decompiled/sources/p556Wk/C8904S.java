package p556Wk;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p754fl.C13693c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Wk.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C8904S implements InterfaceC8921e0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1440o f27252a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8921e0 f27253b;

    public C8904S(InterfaceC1440o interceptor, InterfaceC8921e0 interfaceC8921e0) {
        AbstractC16544l.m18094g(interceptor, "interceptor");
        this.f27252a = interceptor;
        this.f27253b = interfaceC8921e0;
    }

    @Override // p556Wk.InterfaceC8921e0
    /* JADX INFO: renamed from: a */
    public final Object mo9562a(C13693c c13693c, AbstractC19687c abstractC19687c) {
        return this.f27252a.invoke(this.f27253b, c13693c, abstractC19687c);
    }
}
