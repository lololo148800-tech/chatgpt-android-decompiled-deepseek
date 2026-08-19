package p080D0;

import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p003A1.C0227a;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19736m;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16750j0;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: D0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1779M extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f5090Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f5091o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f5092p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16524A f5093q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1779M(long j10, C16524A c16524a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5092p0 = j10;
        this.f5093q0 = c16524a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1779M c1779m = new C1779M(this.f5092p0, this.f5093q0, interfaceC18770c);
        c1779m.f5091o0 = obj;
        return c1779m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1779M) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5090Z;
        C16524A c16524a = this.f5093q0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19748y c19748y2 = (C19748y) this.f5091o0;
            C0227a c0227a = new C0227a(c16524a, 4);
            this.f5091o0 = c19748y2;
            this.f5090Z = 1;
            Object objM18520d = AbstractC16750j0.m18520d(c19748y2, this.f5092p0, c0227a, this);
            if (objM18520d == enumC19250a) {
                return enumC19250a;
            }
            c19748y = c19748y2;
            obj = objM18520d;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c19748y = (C19748y) this.f5091o0;
            AbstractC9233X.m9807c(obj);
        }
        if (((C19738o) obj) != null && AbstractC8088f6.m8538d(c16524a.f51261Y)) {
            return EnumC1808i.f5206Z;
        }
        C19738o c19738o = (C19738o) AbstractC17680n.m19341Q(c19748y.f62527q0.f62440E0.f62460a);
        if (!AbstractC19736m.m20681c(c19738o)) {
            return EnumC1808i.f5208p0;
        }
        c19738o.m20691a();
        return EnumC1808i.f5205Y;
    }
}
