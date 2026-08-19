package p622Ze;

import bf.C11391s;
import bf.C11398z;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p349O0.InterfaceC5985X;
import p550We.C8829j;
import p550We.EnumC8830k;

/* JADX INFO: renamed from: Ze.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10293k extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30572Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f30573Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8829j f30574o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11391s f30575p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f30576q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10293k(InterfaceC1436k interfaceC1436k, C8829j c8829j, C11391s c11391s, InterfaceC5985X interfaceC5985X, int i10) {
        super(0);
        this.f30572Y = i10;
        this.f30573Z = interfaceC1436k;
        this.f30574o0 = c8829j;
        this.f30575p0 = c11391s;
        this.f30576q0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C11398z c11398z;
        C11398z c11398z2;
        switch (this.f30572Y) {
            case 0:
                this.f30576q0.setValue(Boolean.FALSE);
                String str = this.f30574o0.f27015a;
                C11391s c11391s = this.f30575p0;
                this.f30573Z.invoke(new C10296n(str, (c11391s == null || (c11398z = c11391s.f34417c) == null) ? null : c11398z.f34426b, EnumC8830k.f27020Z));
                break;
            default:
                this.f30576q0.setValue(Boolean.FALSE);
                String str2 = this.f30574o0.f27015a;
                C11391s c11391s2 = this.f30575p0;
                this.f30573Z.invoke(new C10296n(str2, (c11391s2 == null || (c11398z2 = c11391s2.f34417c) == null) ? null : c11398z2.f34426b, EnumC8830k.f27019Y));
                break;
        }
        return C17296C.f55119a;
    }
}
