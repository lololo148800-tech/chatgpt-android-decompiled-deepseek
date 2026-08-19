package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p492U1.C7550o;
import p571X9.AbstractC9125E4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16752k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16758m f53734Y;

    /* JADX INFO: renamed from: Z */
    public int f53735Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ long f53736o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16758m f53737p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16752k(C16758m c16758m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53737p0 = c16758m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16752k c16752k = new C16752k(this.f53737p0, interfaceC18770c);
        c16752k.f53736o0 = ((C7550o) obj).f23912a;
        return c16752k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        long j10 = ((C7550o) obj).f23912a;
        C16752k c16752k = new C16752k(this.f53737p0, (InterfaceC18770c) obj2);
        c16752k.f53736o0 = j10;
        return c16752k.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16758m c16758m;
        long j10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53735Z;
        EnumC16673F0 enumC16673F0 = EnumC16673F0.f53401Y;
        C16758m c16758m2 = this.f53737p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long j11 = this.f53736o0;
            C16782u c16782u = c16758m2.f53767J0;
            float fM7903d = c16758m2.f53768K0 == enumC16673F0 ? C7550o.m7903d(j11) : C7550o.m7902c(j11);
            this.f53734Y = c16758m2;
            this.f53736o0 = j11;
            this.f53735Z = 1;
            obj = c16782u.m18552f(fM7903d, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            c16758m = c16758m2;
            j10 = j11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f53736o0;
            c16758m = this.f53734Y;
            AbstractC9233X.m9807c(obj);
        }
        float fFloatValue = ((Number) obj).floatValue();
        EnumC16673F0 enumC16673F1 = c16758m.f53768K0;
        float f10 = enumC16673F1 == EnumC16673F0.f53402Z ? fFloatValue : 0.0f;
        if (enumC16673F1 != enumC16673F0) {
            fFloatValue = 0.0f;
        }
        long jM9659a = AbstractC9125E4.m9659a(f10, fFloatValue);
        float fM18550d = c16758m2.f53767J0.m18550d();
        float fM18494d = c16758m2.f53767J0.m18548b().m18494d();
        if (fM18550d >= c16758m2.f53767J0.m18548b().m18493c() || fM18550d <= fM18494d) {
            j10 = jM9659a;
        }
        return new C7550o(j10);
    }
}
