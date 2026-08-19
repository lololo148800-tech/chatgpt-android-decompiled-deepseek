package p387Pl;

import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11248s;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Pl.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C6456C extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f20945Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6457D f20946Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArrayList f20947o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6456C(C6457D c6457d, ArrayList arrayList, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f20946Z = c6457d;
        this.f20947o0 = arrayList;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6456C(this.f20946Z, this.f20947o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6456C) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f20945Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11248s c11248s = this.f20946Z.f20982a;
            ArrayList arrayList = this.f20947o0;
            this.f20945Y = 1;
            if (c11248s.m12671t(arrayList, this) == enumC19250a) {
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
