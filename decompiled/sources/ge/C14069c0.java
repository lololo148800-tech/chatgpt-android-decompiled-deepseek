package ge;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p544W9.AbstractC8723u4;
import p571X9.AbstractC9233X;
import p936p0.C18280t;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14069c0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44260Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18280t f44261Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f44262o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14069c0(C18280t c18280t, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44261Z = c18280t;
        this.f44262o0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14069c0(this.f44261Z, this.f44262o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14069c0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44260Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            float f10 = this.f44262o0;
            this.f44260Y = 1;
            if (AbstractC8723u4.m9442c(this.f44261Z, f10, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
