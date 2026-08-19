package p1071w0;

import p049Bm.InterfaceC1439n;
import p349O0.C5944C;
import p349O0.C5997d;
import p773h0.EnumC14284g0;
import p860l0.InterfaceC16736e1;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: w0.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20702C0 implements InterfaceC16736e1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC16736e1 f65577a;

    /* JADX INFO: renamed from: b */
    public final C5944C f65578b;

    /* JADX INFO: renamed from: c */
    public final C5944C f65579c;

    public C20702C0(InterfaceC16736e1 interfaceC16736e1, C20706E0 c20706e0) {
        this.f65577a = interfaceC16736e1;
        this.f65578b = C5997d.m6421H(new C20700B0(c20706e0, 1));
        this.f65579c = C5997d.m6421H(new C20700B0(c20706e0, 0));
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: a */
    public final boolean mo5255a() {
        return this.f65577a.mo5255a();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: b */
    public final Object mo5256b(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        return this.f65577a.mo5256b(enumC14284g0, interfaceC1439n, abstractC19687c);
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: c */
    public final boolean mo5257c() {
        return ((Boolean) this.f65579c.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: d */
    public final boolean mo5258d() {
        return ((Boolean) this.f65578b.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: e */
    public final float mo5259e(float f10) {
        return this.f65577a.mo5259e(f10);
    }
}
