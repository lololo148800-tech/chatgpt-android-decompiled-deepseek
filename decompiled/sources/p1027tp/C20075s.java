package p1027tp;

import java.io.IOException;
import mo.AbstractC17329F;
import mo.C17352s;
import p026Ao.AbstractC0668b;
import p026Ao.C0657F;
import p026Ao.InterfaceC0677k;
import p111E5.C2318b;

/* JADX INFO: renamed from: tp.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C20075s extends AbstractC17329F {

    /* JADX INFO: renamed from: Y */
    public final AbstractC17329F f63574Y;

    /* JADX INFO: renamed from: Z */
    public final C0657F f63575Z;

    /* JADX INFO: renamed from: o0 */
    public IOException f63576o0;

    public C20075s(AbstractC17329F abstractC17329F) {
        this.f63574Y = abstractC17329F;
        this.f63575Z = AbstractC0668b.m1403c(new C2318b(this, abstractC17329F.mo18988O0()));
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: O0 */
    public final InterfaceC0677k mo18988O0() {
        return this.f63575Z;
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: a */
    public final long mo18989a() {
        return this.f63574Y.mo18989a();
    }

    @Override // mo.AbstractC17329F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f63574Y.close();
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: e */
    public final C17352s mo18990e() {
        return this.f63574Y.mo18990e();
    }
}
