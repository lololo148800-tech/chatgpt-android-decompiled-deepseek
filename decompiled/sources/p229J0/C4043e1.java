package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: J0.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4043e1 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12748Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f12749Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f12750o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f12751p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f12752q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f12753r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4043e1(InterfaceC10459q interfaceC10459q, float f10, long j10, int i10, int i11, int i12) {
        super(2);
        this.f12748Y = i12;
        this.f12749Z = interfaceC10459q;
        this.f12750o0 = f10;
        this.f12751p0 = j10;
        this.f12752q0 = i10;
        this.f12753r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12748Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f12752q0 | 1);
                InterfaceC10459q interfaceC10459q = this.f12749Z;
                AbstractC3984T1.m4692k(interfaceC10459q, this.f12750o0, this.f12751p0, (C6021p) obj, iM6447d0, this.f12753r0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f12752q0 | 1);
                InterfaceC10459q interfaceC10459q2 = this.f12749Z;
                AbstractC3984T1.m4701t(interfaceC10459q2, this.f12750o0, this.f12751p0, (C6021p) obj, iM6447d1, this.f12753r0);
                break;
        }
        return C17296C.f55119a;
    }
}
