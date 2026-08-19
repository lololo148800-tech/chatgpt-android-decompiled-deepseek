package p1099x6;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1057v6.C20463c;
import p523V9.AbstractC8047a5;
import p571X9.AbstractC9233X;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.InterfaceC17841I;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x6.t */
/* JADX INFO: loaded from: classes.dex */
public final class C21152t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67222Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f67223Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21143k f67224o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17852e f67225p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17867t f67226q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21152t(C16525B c16525b, C21143k c21143k, C17852e c17852e, C17867t c17867t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67223Z = c16525b;
        this.f67224o0 = c21143k;
        this.f67225p0 = c17852e;
        this.f67226q0 = c17867t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21152t c21152t = new C21152t(this.f67223Z, this.f67224o0, this.f67225p0, this.f67226q0, interfaceC18770c);
        c21152t.f67222Y = obj;
        return c21152t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21152t c21152t = (C21152t) create((C17853f) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21152t.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC17841I interfaceC17841I = ((C17853f) this.f67222Y).f56933c;
        if (interfaceC17841I != null) {
            this.f67223Z.f51262Y = AbstractC8047a5.m8435h(AbstractC8047a5.m8436i(this.f67225p0.f56921a, interfaceC17841I, this.f67226q0, (C20463c) this.f67224o0.f67190b.f64Y).values());
        }
        return C17296C.f55119a;
    }
}
