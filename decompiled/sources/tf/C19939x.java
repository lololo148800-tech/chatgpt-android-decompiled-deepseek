package tf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: tf.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C19939x extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63196Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f63197Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f63198o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f63199p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f63200q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f63201r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19939x(boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f63196Y = i11;
        this.f63197Z = z6;
        this.f63198o0 = z10;
        this.f63199p0 = interfaceC1436k;
        this.f63200q0 = interfaceC10459q;
        this.f63201r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63196Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC19905J.m20789b(this.f63197Z, this.f63198o0, this.f63199p0, this.f63200q0, (C6021p) obj, C5997d.m6447d0(this.f63201r0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC19905J.m20789b(this.f63197Z, this.f63198o0, this.f63199p0, this.f63200q0, (C6021p) obj, C5997d.m6447d0(this.f63201r0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
