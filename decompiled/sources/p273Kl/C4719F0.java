package p273Kl;

import io.livekit.android.room.C15102a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p153Fn.C2925c;
import p199Hl.C3493r;
import p199Hl.EnumC3478c;
import p225Im.InterfaceC3776x;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p344Nl.AbstractC5821C;
import p344Nl.C5842n;
import p344Nl.EnumC5835g;
import p571X9.AbstractC9233X;
import p658b5.C11248s;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.F0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4719F0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC4814a f15346Y;

    /* JADX INFO: renamed from: Z */
    public C4727J0 f15347Z;

    /* JADX INFO: renamed from: o0 */
    public EnumC3478c f15348o0;

    /* JADX INFO: renamed from: p0 */
    public int f15349p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4727J0 f15350q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ EnumC3478c f15351r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4719F0(C4727J0 c4727j0, EnumC3478c enumC3478c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15350q0 = c4727j0;
        this.f15351r0 = enumC3478c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4719F0(this.f15350q0, this.f15351r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4719F0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0015, B:27:0x00d2, B:29:0x00d6, B:32:0x00df, B:33:0x00e2, B:17:0x004a, B:21:0x0058, B:23:0x00be, B:34:0x00e3, B:35:0x00e6), top: B:38:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00df A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0015, B:27:0x00d2, B:29:0x00d6, B:32:0x00df, B:33:0x00e2, B:17:0x004a, B:21:0x0058, B:23:0x00be, B:34:0x00e3, B:35:0x00e6), top: B:38:0x000b }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C4727J0 c4727j0;
        C4816c c4816c;
        EnumC3478c reason;
        InterfaceC4814a interfaceC4814a;
        C4727J0 c4727j1;
        InterfaceC4814a interfaceC4814a2;
        C2925c c2925c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = this.f15349p0;
        C17296C c17296c = C17296C.f55119a;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    EnumC3478c enumC3478c = this.f15348o0;
                    C4727J0 c4727j2 = this.f15347Z;
                    InterfaceC4814a interfaceC4814a3 = this.f15346Y;
                    AbstractC9233X.m9807c(obj);
                    c4727j0 = c4727j2;
                    reason = enumC3478c;
                    interfaceC4814a = interfaceC4814a3;
                } else {
                    if (r6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4727j1 = this.f15347Z;
                    InterfaceC4814a interfaceC4814a4 = this.f15346Y;
                    AbstractC9233X.m9807c(obj);
                    interfaceC4814a2 = interfaceC4814a4;
                }
                c2925c = c4727j1.f15388m;
                if (c2925c != null) {
                    AbstractC16544l.m18103p("coroutineScope");
                    throw null;
                }
                AbstractC0575H.m1180i(c2925c, null);
                ((C4816c) interfaceC4814a2).m5450g(null);
                return c17296c;
            }
            AbstractC9233X.m9807c(obj);
            c4727j0 = this.f15350q0;
            c4816c = c4727j0.f15372E;
            this.f15346Y = c4816c;
            this.f15347Z = c4727j0;
            reason = this.f15351r0;
            this.f15348o0 = reason;
            this.f15349p0 = 1;
            if (c4816c.m5448e(null, this) == enumC19250a) {
                interfaceC4814a = c4816c;
                return enumC19250a;
            }
            interfaceC4814a = c4816c;
            EnumC4807x0 enumC4807x0M5412g = c4727j0.m5412g();
            EnumC4807x0 enumC4807x0 = EnumC4807x0.f15675o0;
            if (enumC4807x0M5412g == enumC4807x0) {
                ((C4816c) interfaceC4814a).m5450g(null);
                return c17296c;
            }
            c4727j0.f15375H.m5915a();
            c4727j0.m5420o(enumC4807x0);
            C4727J0.m5406a(c4727j0);
            C15102a c15102a = c4727j0.f15376a;
            C4718F c4718f = C15102a.Companion;
            c15102a.m16211c("Normal Closure");
            C5842n c5842n = c4727j0.f15400y;
            c5842n.m6248k();
            AbstractC0575H.m1180i(c5842n.f18996c, null);
            c5842n.f18994a = "";
            InterfaceC3776x[] interfaceC3776xArr = AbstractC5821C.f18993u;
            c5842n.f19003j.m8944g(null, interfaceC3776xArr[4]);
            c5842n.f19000g.m8944g(null, interfaceC3776xArr[1]);
            c5842n.f19004k.m8944g(null, interfaceC3776xArr[5]);
            c5842n.f18999f.m8944g(null, interfaceC3776xArr[0]);
            c5842n.f19006m.m8944g(null, interfaceC3776xArr[7]);
            c5842n.f19007n.m8944g(EnumC5835g.f19062p0, interfaceC3776xArr[8]);
            C11248s c11248s = c4727j0.f15389n;
            AbstractC16544l.m18094g(reason, "reason");
            C3493r c3493r = new C3493r(c4727j0);
            C2925c c2925c2 = c4727j0.f15388m;
            if (c2925c2 == null) {
                AbstractC16544l.m18103p("coroutineScope");
                throw null;
            }
            C0564B0 c0564b0M12669r = c11248s.m12669r(c3493r, c2925c2);
            this.f15346Y = interfaceC4814a;
            this.f15347Z = c4727j0;
            this.f15348o0 = null;
            this.f15349p0 = 2;
            if (c0564b0M12669r.mo1272P(this) == enumC19250a) {
                return enumC19250a;
            }
            c4727j1 = c4727j0;
            interfaceC4814a2 = interfaceC4814a;
            c2925c = c4727j1.f15388m;
            if (c2925c != null) {
                AbstractC16544l.m18103p("coroutineScope");
                throw null;
            }
            AbstractC0575H.m1180i(c2925c, null);
            ((C4816c) interfaceC4814a2).m5450g(null);
            return c17296c;
        } catch (Throwable th2) {
            ((C4816c) r6).m5450g(null);
            throw th2;
        }
    }
}
