package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16784u1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53874Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53875Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19723A f53876o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f53877p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC16546n f53878q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16685J0 f53879r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16784u1(C19723A c19723a, InterfaceC1440o interfaceC1440o, InterfaceC1436k interfaceC1436k, C16685J0 c16685j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53876o0 = c19723a;
        this.f53877p0 = (AbstractC19694j) interfaceC1440o;
        this.f53878q0 = (AbstractC16546n) interfaceC1436k;
        this.f53879r0 = c16685j0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.o, sm.j] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        ?? r6 = this.f53878q0;
        C16685J0 c16685j0 = this.f53879r0;
        C16784u1 c16784u1 = new C16784u1(this.f53876o0, this.f53877p0, r6, c16685j0, interfaceC18770c);
        c16784u1.f53875Z = obj;
        return c16784u1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16784u1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Bm.o, sm.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53874Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16781t1 c16781t1 = new C16781t1((InterfaceC0571F) this.f53875Z, this.f53877p0, this.f53878q0, this.f53879r0, null);
            this.f53874Y = 1;
            if (AbstractC8717t4.m9428b(this.f53876o0, c16781t1, this) == enumC19250a) {
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
