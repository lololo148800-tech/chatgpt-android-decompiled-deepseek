package p080D0;

import mm.C17296C;
import p013Ab.C0420b;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p1071w0.InterfaceC20772r0;
import p1140z1.AbstractC21690f;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1773G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5062Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f5063Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1812k f5064o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC20772r0 f5065p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1773G(InterfaceC1812k interfaceC1812k, InterfaceC20772r0 interfaceC20772r0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5064o0 = interfaceC1812k;
        this.f5065p0 = interfaceC20772r0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1773G c1773g = new C1773G(this.f5064o0, this.f5065p0, interfaceC18770c);
        c1773g.f5063Z = obj;
        return c1773g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1773G) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5062Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f5063Z;
            c19723a.getClass();
            C1772F c1772f = new C1772F(this.f5064o0, new C0420b(AbstractC21690f.m22217v(c19723a).f68635F0), this.f5065p0, null);
            this.f5062Y = 1;
            if (AbstractC8717t4.m9428b(c19723a, c1772f, this) == enumC19250a) {
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
