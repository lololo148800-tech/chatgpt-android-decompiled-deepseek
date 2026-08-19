package p860l0;

import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16691L0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f53478Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16557y f53479Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f53480o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16691L0(C16557y c16557y, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53479Z = c16557y;
        this.f53480o0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16691L0 c16691l0 = new C16691L0(this.f53479Z, this.f53480o0, interfaceC18770c);
        c16691l0.f53478Y = obj;
        return c16691l0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16691L0 c16691l0 = (C16691L0) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16691l0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f53479Z.f51286Y = ((InterfaceC16694M0) this.f53478Y).mo18510a(this.f53480o0);
        return C17296C.f55119a;
    }
}
