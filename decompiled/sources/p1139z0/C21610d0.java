package p1139z0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1013t0.C19715c;
import p544W9.AbstractC8723u4;
import p571X9.AbstractC9233X;
import p759g1.C13801c;
import p773h0.C14322z0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21610d0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68448Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21612e0 f68449Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f68450o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13801c f68451p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21610d0(C21612e0 c21612e0, float f10, C13801c c13801c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68449Z = c21612e0;
        this.f68450o0 = f10;
        this.f68451p0 = c13801c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21610d0(this.f68449Z, this.f68450o0, this.f68451p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21610d0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68448Y;
        C21612e0 c21612e0 = this.f68449Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C14322z0 c14322z0 = c21612e0.f68463I0;
        float f10 = AbstractC21602Z.f68417a;
        float fCeil = this.f68450o0;
        if (!Float.isNaN(fCeil) && !Float.isInfinite(fCeil)) {
            fCeil = (float) (fCeil > 0.0f ? Math.ceil(fCeil) : Math.floor(fCeil));
        }
        this.f68448Y = 1;
        if (AbstractC8723u4.m9442c(c14322z0, fCeil, this) == enumC19250a) {
            return enumC19250a;
        }
        C19715c c19715c = c21612e0.f68458D0.f68320h;
        this.f68448Y = 2;
        if (c19715c.m20665a(this.f68451p0, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
