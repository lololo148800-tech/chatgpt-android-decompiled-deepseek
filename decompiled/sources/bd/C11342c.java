package bd;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;

/* JADX INFO: renamed from: bd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11342c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C11343d f34287Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f34288Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f34289o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC21059M f34290p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC21069X f34291q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11342c(C11343d c11343d, long j10, int i10, InterfaceC21059M interfaceC21059M, AbstractC21069X abstractC21069X) {
        super(1);
        this.f34287Y = c11343d;
        this.f34288Z = j10;
        this.f34289o0 = i10;
        this.f34290p0 = interfaceC21059M;
        this.f34291q0 = abstractC21069X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21068W layout = (AbstractC21068W) obj;
        AbstractC16544l.m18094g(layout, "$this$layout");
        this.f34287Y.getClass();
        long j10 = this.f34288Z;
        long jM9643a = AbstractC9113C4.m9643a((int) (j10 >> 32), this.f34289o0);
        float f10 = 1;
        AbstractC21068W.m21539i(layout, this.f34291q0, AbstractC9101A4.m9631a(Math.round(((this.f34290p0.getLayoutDirection() == EnumC7546k.f23904Y ? -1.0f : (-1) * (-1.0f)) + f10) * ((((int) (jM9643a >> 32)) - ((int) (j10 >> 32))) / 2.0f)), Math.round((f10 - 1.0f) * ((((int) (jM9643a & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f))));
        return C17296C.f55119a;
    }
}
