package p193Hf;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p094De.C2027j;
import p571X9.AbstractC9233X;
import p787he.C14459O;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3396q1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10351Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10352Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3414w1 f10353o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f10354p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3396q1(C3414w1 c3414w1, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10353o0 = c3414w1;
        this.f10354p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3396q1 c3396q1 = new C3396q1(this.f10353o0, this.f10354p0, interfaceC18770c);
        c3396q1.f10352Z = obj;
        return c3396q1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3396q1) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10351Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC1758z interfaceC1758z = (InterfaceC1758z) this.f10352Z;
            C16525B c16525b = new C16525B();
            C16525B c16525b2 = new C16525B();
            String str = this.f10354p0;
            AbstractC0575H.m1156D(interfaceC1758z, null, null, new C3393p1(this.f10353o0, str, c16525b, interfaceC1758z, c16525b2, null), 3);
            C14459O c14459o = this.f10353o0.f10397a;
            C3390o1 c3390o1 = new C3390o1(c16525b2, interfaceC1758z, c16525b, 1);
            this.f10351Y = 1;
            Object objMo3141d = c14459o.f45526y.mo3141d(new C2027j(c3390o1, str, 2), this);
            if (objMo3141d != enumC19250a) {
                objMo3141d = c17296c;
            }
            if (objMo3141d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
