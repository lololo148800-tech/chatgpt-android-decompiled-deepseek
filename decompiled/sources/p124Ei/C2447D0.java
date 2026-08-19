package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7902H5;
import p523V9.AbstractC8011V4;

/* JADX INFO: renamed from: Ei.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2447D0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7599Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f7600Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f7601o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f7602p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f7603q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2447D0(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, int i10, int i11) {
        super(2);
        this.f7599Y = i11;
        this.f7600Z = z6;
        this.f7601o0 = interfaceC1426a;
        this.f7602p0 = interfaceC1426a2;
        this.f7603q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7599Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f7603q0 | 1);
                AbstractC8011V4.m8326b(this.f7600Z, this.f7601o0, this.f7602p0, c6021p, iM6447d0);
                break;
            default:
                int iM6447d1 = C5997d.m6447d0(this.f7603q0 | 1);
                AbstractC7902H5.m8198c(this.f7600Z, this.f7601o0, this.f7602p0, c6021p, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
