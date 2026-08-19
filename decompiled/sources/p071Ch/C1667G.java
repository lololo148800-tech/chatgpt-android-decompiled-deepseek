package p071Ch;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1053v3.p1054lN.IGDwkYw;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ch.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C1667G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4723Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1669I f4724Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667G(C1669I c1669i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4724Z = c1669i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1667G(this.f4724Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1667G) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4723Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1669I c1669i = this.f4724Z;
            this.f4723Y = 1;
            obj = ((C1662B) c1669i.f4730p0).invoke(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(IGDwkYw.mdSjQYBumX);
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
