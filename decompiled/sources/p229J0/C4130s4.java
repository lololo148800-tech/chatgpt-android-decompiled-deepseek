package p229J0;

import androidx.compose.material3.AbstractC10859d;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p758g0.InterfaceC13772l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.s4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4130s4 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f13340Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4148v4 f13341Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f13342o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4130s4(C4148v4 c4148v4, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f13341Z = c4148v4;
        this.f13342o0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4130s4(this.f13341Z, this.f13342o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4130s4) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f13340Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4148v4 c4148v4 = this.f13341Z;
            C13756d c13756d = c4148v4.f13437D0;
            if (c13756d != null) {
                Float f10 = new Float(this.f13342o0);
                InterfaceC13772l interfaceC13772l = c4148v4.f13435B0 ? AbstractC10859d.f32665f : AbstractC10859d.f32666g;
                this.f13340Y = 1;
                obj = C13756d.m15222c(c13756d, f10, interfaceC13772l, null, this, 12);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        return C17296C.f55119a;
    }
}
