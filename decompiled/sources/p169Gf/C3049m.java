package p169Gf;

import android.os.SystemClock;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.C5996c0;
import p349O0.C5998d0;
import p403Qd.C6651p0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Gf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C3049m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f9199Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6651p0 f9200Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5996c0 f9201o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5998d0 f9202p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3049m(C6651p0 c6651p0, C5996c0 c5996c0, C5998d0 c5998d0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f9200Z = c6651p0;
        this.f9201o0 = c5996c0;
        this.f9202p0 = c5998d0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3049m(this.f9200Z, this.f9201o0, this.f9202p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3049m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f9199Y;
        C17296C c17296c = C17296C.f55119a;
        C5998d0 c5998d0 = this.f9202p0;
        C5996c0 c5996c0 = this.f9201o0;
        C6651p0 c6651p0 = this.f9200Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            float f10 = AbstractC3051o.f9208a;
            c5996c0.m6413h(3);
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        if (c6651p0.f21416c.isEmpty()) {
            return c17296c;
        }
        float f11 = AbstractC3051o.f9208a;
        c5996c0.m6413h(1);
        if (c6651p0.f21416c.size() == 1) {
            return c17296c;
        }
        long jM6471g = (c5998d0.m6471g() + ((long) 260)) - SystemClock.uptimeMillis();
        this.f9199Y = 1;
        if (AbstractC0575H.m1184m(jM6471g, this) == enumC19250a) {
            return enumC19250a;
        }
        float f12 = AbstractC3051o.f9208a;
        c5996c0.m6413h(2);
        if (c6651p0.f21416c.size() == 2) {
            return c17296c;
        }
        long jM6471g2 = (c5998d0.m6471g() + ((long) RCHTTPStatusCodes.BAD_REQUEST)) - SystemClock.uptimeMillis();
        this.f9199Y = 2;
        if (AbstractC0575H.m1184m(jM6471g2, this) == enumC19250a) {
            return enumC19250a;
        }
        float f13 = AbstractC3051o.f9208a;
        c5996c0.m6413h(3);
        return c17296c;
    }
}
