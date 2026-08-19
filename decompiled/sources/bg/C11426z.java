package bg;

import cg.C11745q;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p707dg.C13107c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bg.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C11426z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f34511Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11399A f34512Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f34513o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f34514p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f34515q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f34516r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11426z(C11399A c11399a, String str, String str2, String str3, String str4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34512Z = c11399a;
        this.f34513o0 = str;
        this.f34514p0 = str2;
        this.f34515q0 = str3;
        this.f34516r0 = str4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11426z(this.f34512Z, this.f34513o0, this.f34514p0, this.f34515q0, this.f34516r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11426z) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34511Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11745q c11745q = this.f34512Z.f34429a;
            C13107c c13107c = new C13107c(this.f34513o0, this.f34514p0, this.f34515q0, this.f34516r0);
            this.f34511Y = 1;
            obj = c11745q.m13036b(c13107c, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
