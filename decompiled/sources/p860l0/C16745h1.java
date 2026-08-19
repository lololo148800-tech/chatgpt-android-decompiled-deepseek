package p860l0;

import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p492U1.C7550o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16745h1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16757l1 f53706Y;

    /* JADX INFO: renamed from: Z */
    public C16524A f53707Z;

    /* JADX INFO: renamed from: o0 */
    public long f53708o0;

    /* JADX INFO: renamed from: p0 */
    public int f53709p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f53710q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16757l1 f53711r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16524A f53712s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ long f53713t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16745h1(C16757l1 c16757l1, C16524A c16524a, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53711r0 = c16757l1;
        this.f53712s0 = c16524a;
        this.f53713t0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16745h1 c16745h1 = new C16745h1(this.f53711r0, this.f53712s0, this.f53713t0, interfaceC18770c);
        c16745h1.f53710q0 = obj;
        return c16745h1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16745h1) create((C16748i1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16757l1 c16757l1;
        C16524A c16524a;
        long j10;
        C16757l1 c16757l2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53709p0;
        EnumC16673F0 enumC16673F0 = EnumC16673F0.f53402Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16748i1 c16748i1 = (C16748i1) this.f53710q0;
            c16757l1 = this.f53711r0;
            C16742g1 c16742g1 = new C16742g1(c16757l1, c16748i1);
            InterfaceC16661B0 interfaceC16661B0 = c16757l1.f53759c;
            c16524a = this.f53712s0;
            long j11 = c16524a.f51261Y;
            EnumC16673F0 enumC16673F1 = c16757l1.f53760d;
            long j12 = this.f53713t0;
            float fM18533c = c16757l1.m18533c(enumC16673F1 == enumC16673F0 ? C7550o.m7902c(j12) : C7550o.m7903d(j12));
            this.f53710q0 = c16757l1;
            this.f53706Y = c16757l1;
            this.f53707Z = c16524a;
            this.f53708o0 = j11;
            this.f53709p0 = 1;
            obj = interfaceC16661B0.mo18490a(c16742g1, fM18533c, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            j10 = j11;
            c16757l2 = c16757l1;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f53708o0;
            c16524a = this.f53707Z;
            c16757l1 = this.f53706Y;
            c16757l2 = (C16757l1) this.f53710q0;
            AbstractC9233X.m9807c(obj);
        }
        float fM18533c2 = c16757l2.m18533c(((Number) obj).floatValue());
        c16524a.f51261Y = c16757l1.f53760d == enumC16673F0 ? C7550o.m7901b(j10, fM18533c2, 0.0f, 2) : C7550o.m7901b(j10, 0.0f, fM18533c2, 1);
        return C17296C.f55119a;
    }
}
