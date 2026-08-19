package p417R2;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: R2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6797i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f21805Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f21806Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC19694j f21807o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6797i(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21807o0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6797i c6797i = new C6797i(this.f21807o0, interfaceC18770c);
        c6797i.f21806Z = obj;
        return c6797i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6797i) create((C6790b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f21805Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6790b c6790b = (C6790b) this.f21806Z;
            AbstractC9233X.m9807c(obj);
            return c6790b;
        }
        AbstractC9233X.m9807c(obj);
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((C6790b) this.f21806Z).f21795a);
        AbstractC16544l.m18093f(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        C6790b c6790b2 = new C6790b(AbstractC17659D.m19256r(mapUnmodifiableMap), false);
        this.f21806Z = c6790b2;
        this.f21805Y = 1;
        return this.f21807o0.invoke(c6790b2, this) == enumC19250a ? enumC19250a : c6790b2;
    }
}
