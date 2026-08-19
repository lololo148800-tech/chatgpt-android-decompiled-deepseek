package p706df;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8047a5;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import ph.C18417e;

/* JADX INFO: renamed from: df.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C13098r extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41592Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f41593Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f41594o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f41595p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f41596q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f41597r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13098r(List list, InterfaceC10459q interfaceC10459q, float f10, int i10, int i11) {
        super(2);
        C8410b c8410b = AbstractC13084d.f41572a;
        this.f41596q0 = list;
        this.f41597r0 = interfaceC10459q;
        this.f41594o0 = f10;
        this.f41593Z = i10;
        this.f41595p0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f41596q0;
        Object obj4 = this.f41597r0;
        int i10 = this.f41595p0;
        switch (this.f41592Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(i10 | 1);
                C8410b c8410b = AbstractC13084d.f41572a;
                List list = (List) obj3;
                AbstractC8047a5.m8429b(list, (InterfaceC10459q) obj4, this.f41594o0, this.f41593Z, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(i10 | 1);
                C18417e c18417e = (C18417e) obj3;
                int i11 = this.f41593Z;
                C18417e.m19871d(c18417e, i11, this.f41594o0, (Class) obj4, (C6021p) obj, iM6447d1);
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13098r(C18417e c18417e, int i10, float f10, Class cls, int i11) {
        super(2);
        this.f41596q0 = c18417e;
        this.f41593Z = i10;
        this.f41594o0 = f10;
        this.f41597r0 = cls;
        this.f41595p0 = i11;
    }
}
