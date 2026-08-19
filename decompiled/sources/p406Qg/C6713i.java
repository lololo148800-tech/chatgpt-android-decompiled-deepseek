package p406Qg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p571X9.AbstractC9153J2;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Qg.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6713i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21577Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Float f21578Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f21579o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f21580p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f21581q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6713i(Float f10, boolean z6, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f21577Y = i11;
        this.f21578Z = f10;
        this.f21579o0 = z6;
        this.f21580p0 = interfaceC10459q;
        this.f21581q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21577Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f21581q0 | 1);
                AbstractC9153J2.m9700a(this.f21578Z, this.f21579o0, this.f21580p0, c6021p, iM6447d0);
                break;
            default:
                int iM6447d1 = C5997d.m6447d0(this.f21581q0 | 1);
                AbstractC9153J2.m9700a(this.f21578Z, this.f21579o0, this.f21580p0, c6021p, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
