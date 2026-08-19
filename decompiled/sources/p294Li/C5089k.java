package p294Li;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1000s0.C19408d;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Li.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C5089k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19408d f16647Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f16648Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f16649o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f16650p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f16651q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5089k(C19408d c19408d, InterfaceC10459q interfaceC10459q, long j10, long j11, int i10) {
        super(2);
        this.f16647Y = c19408d;
        this.f16648Z = interfaceC10459q;
        this.f16649o0 = j10;
        this.f16650p0 = j11;
        this.f16651q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC5094p.m5659a(this.f16647Y, this.f16648Z, this.f16649o0, this.f16650p0, (C6021p) obj, C5997d.m6447d0(this.f16651q0 | 1));
        return C17296C.f55119a;
    }
}
