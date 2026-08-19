package p900n6;

import java.util.Iterator;
import mm.C17296C;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p228J.AbstractC3794B0;
import p571X9.AbstractC9233X;
import p917o6.C17852e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: n6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17506c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f55991Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f55992Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17507d f55993o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17852e f55994p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17506c(C17507d c17507d, C17852e c17852e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55993o0 = c17507d;
        this.f55994p0 = c17852e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17506c c17506c = new C17506c(this.f55993o0, this.f55994p0, interfaceC18770c);
        c17506c.f55992Z = obj;
        return c17506c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17506c) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f55991Y;
        C17507d c17507d = this.f55993o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC1758z interfaceC1758z = (InterfaceC1758z) this.f55992Z;
                Iterator it = c17507d.f56000r0.iterator();
                if (it.hasNext()) {
                    throw AbstractC3794B0.m4497v(it);
                }
                AbstractC0563B abstractC0563B = c17507d.f55995Y.f56006a;
                C17505b c17505b = new C17505b(c17507d, this.f55994p0, interfaceC1758z, null);
                this.f55991Y = 1;
                if (AbstractC0575H.m1168P(abstractC0563B, c17505b, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            Iterator it2 = c17507d.f56000r0.iterator();
            if (it2.hasNext()) {
                throw AbstractC3794B0.m4497v(it2);
            }
            return C17296C.f55119a;
        } catch (Throwable th2) {
            Iterator it3 = c17507d.f56000r0.iterator();
            if (it3.hasNext()) {
                throw AbstractC3794B0.m4497v(it3);
            }
            throw th2;
        }
    }
}
