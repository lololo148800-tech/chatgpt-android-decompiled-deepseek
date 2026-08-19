package p1139z0;

import mm.C17296C;
import p003A1.AbstractC0267l1;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C21586I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68346Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21587J f68347Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21609d f68348o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21586I(C21587J c21587j, C21609d c21609d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68347Z = c21587j;
        this.f68348o0 = c21609d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21586I(this.f68347Z, this.f68348o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C21586I) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68346Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        this.f68346Y = 1;
        AbstractC0267l1.m858a(this.f68347Z, this.f68348o0, this);
        return enumC19250a;
    }
}
