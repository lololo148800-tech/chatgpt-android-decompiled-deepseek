package p131F1;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p156G1.AbstractC2962i;
import p156G1.C2961h;
import p156G1.C2971r;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: F1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2627e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public boolean f8131Y;

    /* JADX INFO: renamed from: Z */
    public int f8132Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ float f8133o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ScrollCaptureCallbackC2628f f8134p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2627e(ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8134p0 = scrollCaptureCallbackC2628f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2627e c2627e = new C2627e(this.f8134p0, interfaceC18770c);
        c2627e.f8133o0 = ((Number) obj).floatValue();
        return c2627e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2627e) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        boolean z6;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8132Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            float f10 = this.f8133o0;
            ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f = this.f8134p0;
            Object obj2 = scrollCaptureCallbackC2628f.f8135a.f8889d.f8880Y.get(AbstractC2962i.f8858e);
            if (obj2 == null) {
                obj2 = null;
            }
            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) obj2;
            if (interfaceC1439n == null) {
                AbstractC8111i5.m8593d("Required value was null.");
                throw null;
            }
            boolean z10 = ((C2961h) scrollCaptureCallbackC2628f.f8135a.f8889d.m3786j(C2971r.f8930p)).f8852c;
            if (z10) {
                f10 = -f10;
            }
            C13800b c13800b = new C13800b(AbstractC8088f6.m8536b(0.0f, f10));
            this.f8131Y = z10;
            this.f8132Z = 1;
            obj = interfaceC1439n.invoke(c13800b, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            z6 = z10;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z6 = this.f8131Y;
            AbstractC9233X.m9807c(obj);
        }
        float fM15307h = C13800b.m15307h(((C13800b) obj).f43584a);
        if (z6) {
            fM15307h = -fM15307h;
        }
        return new Float(fM15307h);
    }
}
