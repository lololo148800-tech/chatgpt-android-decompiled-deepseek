package p193Hf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p168Gd.C3034b;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Hf.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3359e0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10255Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f10256Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f10257o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3034b f10258p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f10259q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f10260r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC10459q f10261s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f10262t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3359e0(String str, String str2, C3034b c3034b, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f10255Y = i11;
        this.f10256Z = str;
        this.f10257o0 = str2;
        this.f10258p0 = c3034b;
        this.f10259q0 = z6;
        this.f10260r0 = interfaceC1436k;
        this.f10261s0 = interfaceC10459q;
        this.f10262t0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10255Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f10262t0 | 1);
                C3034b c3034b = this.f10258p0;
                boolean z6 = this.f10259q0;
                AbstractC3365g0.m4181a(this.f10256Z, this.f10257o0, c3034b, z6, this.f10260r0, this.f10261s0, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f10262t0 | 1);
                C3034b c3034b2 = this.f10258p0;
                boolean z10 = this.f10259q0;
                AbstractC3365g0.m4181a(this.f10256Z, this.f10257o0, c3034b2, z10, this.f10260r0, this.f10261s0, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
