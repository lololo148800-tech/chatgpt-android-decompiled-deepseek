package p069Cf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1011U4;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: Cf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1649h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4667Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f4668Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1011U4 f4669o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f4670p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f4671q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1649h(List list, C1011U4 c1011u4, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(2);
        this.f4667Y = i11;
        this.f4668Z = list;
        this.f4669o0 = c1011u4;
        this.f4670p0 = interfaceC1436k;
        this.f4671q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f4667Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f4671q0 | 1);
                AbstractC1652k.m2490b(this.f4668Z, this.f4669o0, this.f4670p0, c6021p, iM6447d0);
                break;
            default:
                int iM6447d1 = C5997d.m6447d0(this.f4671q0 | 1);
                AbstractC1652k.m2490b(this.f4668Z, this.f4669o0, this.f4670p0, c6021p, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
