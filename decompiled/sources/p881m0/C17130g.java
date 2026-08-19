package p881m0;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13774m;
import p758g0.C13796x;
import p860l0.InterfaceC16694M0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: m0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17130g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16557y f54772Y;

    /* JADX INFO: renamed from: Z */
    public int f54773Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17133j f54774o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f54775p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC16546n f54776q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC16694M0 f54777r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17130g(C17133j c17133j, float f10, InterfaceC1436k interfaceC1436k, InterfaceC16694M0 interfaceC16694M0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54774o0 = c17133j;
        this.f54775p0 = f10;
        this.f54776q0 = (AbstractC16546n) interfaceC1436k;
        this.f54777r0 = interfaceC16694M0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17130g(this.f54774o0, this.f54775p0, this.f54776q0, this.f54777r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17130g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16557y c16557y;
        Object objM18897b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54773Z;
        ?? r6 = this.f54776q0;
        C17133j c17133j = this.f54774o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13796x c13796x = c17133j.f54785b;
            float f10 = this.f54775p0;
            float fMo18895a = c17133j.f54784a.mo18895a(f10, AbstractC13758e.m15246k(c13796x, 0.0f, f10));
            if (Float.isNaN(fMo18895a)) {
                throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            c16557y = new C16557y();
            float fSignum = Math.signum(f10) * Math.abs(fMo18895a);
            c16557y.f51286Y = fSignum;
            r6.invoke(new Float(fSignum));
            float f11 = c16557y.f51286Y;
            C17129f c17129f = new C17129f(c16557y, r6, 1);
            this.f54772Y = c16557y;
            this.f54773Z = 1;
            objM18897b = C17133j.m18897b(this.f54774o0, this.f54777r0, f11, this.f54775p0, c17129f, this);
            if (objM18897b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
                return obj;
            }
            C16557y c16557y2 = this.f54772Y;
            AbstractC9233X.m9807c(obj);
            c16557y = c16557y2;
            objM18897b = obj;
        }
        C13774m c13774m = (C13774m) objM18897b;
        float fMo18896b = c17133j.f54784a.mo18896b(((Number) c13774m.m15282c()).floatValue());
        if (Float.isNaN(fMo18896b)) {
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        c16557y.f51286Y = fMo18896b;
        C13774m c13774mM15248m = AbstractC13758e.m15248m(c13774m, 0.0f, 0.0f, 30);
        C17129f c17129f2 = new C17129f(c16557y, r6, 0);
        this.f54772Y = null;
        this.f54773Z = 2;
        Object objM18901b = AbstractC17136m.m18901b(this.f54777r0, fMo18896b, fMo18896b, c13774mM15248m, c17133j.f54786c, c17129f2, this);
        return objM18901b == enumC19250a ? enumC19250a : objM18901b;
    }
}
