package p1063vf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C20611s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65404Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20613u f65405Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f65406o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f65407p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f65408q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20611s(C20613u c20613u, String str, long j10, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65405Z = c20613u;
        this.f65406o0 = str;
        this.f65407p0 = j10;
        this.f65408q0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20611s(this.f65405Z, this.f65406o0, this.f65407p0, this.f65408q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20611s) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65404Y;
        String str = this.f65406o0;
        C20613u c20613u = this.f65405Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f65404Y = 1;
            obj = C20613u.m21196j(c20613u, str, this.f65407p0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            c20613u.f65419c.invoke(this.f65408q0, str);
        } else {
            AbstractC8160o6.m8731f(c20613u.f65420d, "Cache file never reached target size.", null, null, 6);
        }
        return C17296C.f55119a;
    }
}
