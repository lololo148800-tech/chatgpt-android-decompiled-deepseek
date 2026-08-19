package p527Ve;

import bf.C11349D;
import ge.AbstractC14085k0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8039Z4;
import p594Y9.AbstractC9809T2;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ve.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C8272i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25783Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11349D f25784Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f25785o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f25786p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f25787q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8272i(C11349D c11349d, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f25783Y = 3;
        this.f25784Z = c11349d;
        this.f25786p0 = interfaceC1436k;
        this.f25785o0 = interfaceC10459q;
        this.f25787q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f25783Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9809T2.m10433a(C5997d.m6447d0(this.f25787q0 | 1), this.f25786p0, c6021p, this.f25785o0, this.f25784Z);
                break;
            case 1:
                AbstractC8039Z4.m8400b(C5997d.m6447d0(this.f25787q0 | 1), this.f25786p0, c6021p, this.f25785o0, this.f25784Z);
                break;
            case 2:
                AbstractC8039Z4.m8400b(C5997d.m6447d0(this.f25787q0 | 1), this.f25786p0, c6021p, this.f25785o0, this.f25784Z);
                break;
            default:
                AbstractC14085k0.m15489d(C5997d.m6447d0(this.f25787q0 | 1), this.f25786p0, c6021p, this.f25785o0, this.f25784Z);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8272i(C11349D c11349d, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(2);
        this.f25783Y = i11;
        this.f25784Z = c11349d;
        this.f25785o0 = interfaceC10459q;
        this.f25786p0 = interfaceC1436k;
        this.f25787q0 = i10;
    }
}
