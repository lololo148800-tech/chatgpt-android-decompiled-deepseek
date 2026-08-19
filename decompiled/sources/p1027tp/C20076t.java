package p1027tp;

import mo.AbstractC17329F;
import mo.C17352s;
import p026Ao.InterfaceC0677k;

/* JADX INFO: renamed from: tp.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C20076t extends AbstractC17329F {

    /* JADX INFO: renamed from: Y */
    public final C17352s f63577Y;

    /* JADX INFO: renamed from: Z */
    public final long f63578Z;

    public C20076t(C17352s c17352s, long j10) {
        this.f63577Y = c17352s;
        this.f63578Z = j10;
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: O0 */
    public final InterfaceC0677k mo18988O0() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: a */
    public final long mo18989a() {
        return this.f63578Z;
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: e */
    public final C17352s mo18990e() {
        return this.f63577Y;
    }
}
