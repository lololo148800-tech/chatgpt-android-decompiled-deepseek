package p823j3;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p561X.C8990d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.M */
/* JADX INFO: loaded from: classes.dex */
public final class C16074M extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49772Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16075N f49773Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8990d f49774o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC0571F f49775p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16104z f49776q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16074M(C16075N c16075n, C8990d c8990d, InterfaceC0571F interfaceC0571F, C16104z c16104z, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49773Z = c16075n;
        this.f49774o0 = c8990d;
        this.f49775p0 = interfaceC0571F;
        this.f49776q0 = c16104z;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16074M(this.f49773Z, this.f49774o0, this.f49775p0, this.f49776q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16074M) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        long jM17643a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49772Y;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        do {
            C16075N c16075n = this.f49773Z;
            Object obj2 = c16075n.f49778Z.get();
            AbstractC16544l.m18091d(obj2);
            long jLongValue = ((Number) obj2).longValue();
            this.f49774o0.getClass();
            if (jLongValue <= System.currentTimeMillis()) {
                AbstractC0575H.m1180i(this.f49775p0, new C16072K("Timed out of executing block.", this.f49776q0.hashCode()));
                return C17296C.f55119a;
            }
            jM17643a = c16075n.m17643a();
            this.f49772Y = 1;
        } while (AbstractC0575H.m1185n(jM17643a, this) != enumC19250a);
        return enumC19250a;
    }
}
