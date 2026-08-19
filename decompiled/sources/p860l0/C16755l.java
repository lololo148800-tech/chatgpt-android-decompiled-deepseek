package p860l0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p492U1.C7550o;
import p571X9.AbstractC9125E4;
import p571X9.AbstractC9233X;
import p773h0.InterfaceC14300o0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C16755l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16758m f53751Y;

    /* JADX INFO: renamed from: Z */
    public int f53752Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16758m f53753o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f53754p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16755l(C16758m c16758m, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53753o0 = c16758m;
        this.f53754p0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16755l(this.f53753o0, this.f53754p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16755l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16758m c16758m;
        float fFloatValue;
        EnumC16673F0 enumC16673F0;
        float f10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53752Z;
        EnumC16673F0 enumC16673F1 = EnumC16673F0.f53401Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16758m c16758m2 = this.f53753o0;
            InterfaceC14300o0 interfaceC14300o0 = c16758m2.f53769L0;
            long j10 = this.f53754p0;
            if (interfaceC14300o0 == null) {
                C16782u c16782u = c16758m2.f53767J0;
                long jM7906g = c16758m2.m18538W0() ? C7550o.m7906g(-1.0f, j10) : C7550o.m7906g(1.0f, j10);
                float fM7903d = c16758m2.f53768K0 == enumC16673F1 ? C7550o.m7903d(jM7906g) : C7550o.m7902c(jM7906g);
                this.f53751Y = c16758m2;
                this.f53752Z = 1;
                Object objM18552f = c16782u.m18552f(fM7903d, this);
                if (objM18552f == enumC19250a) {
                    return enumC19250a;
                }
                c16758m = c16758m2;
                obj = objM18552f;
                fFloatValue = ((Number) obj).floatValue();
                enumC16673F0 = c16758m.f53768K0;
                if (enumC16673F0 == EnumC16673F0.f53402Z) {
                    f10 = fFloatValue;
                } else {
                    f10 = 0.0f;
                }
                if (enumC16673F0 != enumC16673F1) {
                    fFloatValue = 0.0f;
                }
                AbstractC9125E4.m9659a(f10, fFloatValue);
            } else {
                long jM7906g2 = c16758m2.m18538W0() ? C7550o.m7906g(-1.0f, j10) : C7550o.m7906g(1.0f, j10);
                C16752k c16752k = new C16752k(c16758m2, null);
                this.f53752Z = 2;
                if (interfaceC14300o0.mo15582e(jM7906g2, c16752k, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (i10 == 1) {
            c16758m = this.f53751Y;
            AbstractC9233X.m9807c(obj);
            fFloatValue = ((Number) obj).floatValue();
            enumC16673F0 = c16758m.f53768K0;
            if (enumC16673F0 == EnumC16673F0.f53402Z) {
                f10 = fFloatValue;
            } else {
                f10 = 0.0f;
            }
            if (enumC16673F0 != enumC16673F1) {
                fFloatValue = 0.0f;
            }
            AbstractC9125E4.m9659a(f10, fFloatValue);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
