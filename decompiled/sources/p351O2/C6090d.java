package p351O2;

import java.util.List;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p544W9.AbstractC8454B4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6090d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19823Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19824Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ List f19825o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6090d(List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19825o0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6090d c6090d = new C6090d(this.f19825o0, interfaceC18770c);
        c6090d.f19824Z = obj;
        return c6090d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6090d) create((C6111y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19823Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6111y c6111y = (C6111y) this.f19824Z;
            this.f19823Y = 1;
            if (AbstractC8454B4.m9067b(this.f19825o0, c6111y, this) == enumC19250a) {
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
