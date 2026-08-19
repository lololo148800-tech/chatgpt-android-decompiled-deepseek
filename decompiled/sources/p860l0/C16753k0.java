package p860l0;

import gf.C14127l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p547Wc.C8805o;
import p571X9.AbstractC9233X;
import p758g0.C13775m0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16753k0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53738Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53739Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC16777s0 f53740o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19723A f53741p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C14127l f53742q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C13775m0 f53743r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16756l0 f53744s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16756l0 f53745t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C8805o f53746u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16753k0(AbstractC16777s0 abstractC16777s0, C19723A c19723a, C14127l c14127l, C13775m0 c13775m0, C16756l0 c16756l0, C16756l0 c16756l1, C8805o c8805o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53740o0 = abstractC16777s0;
        this.f53741p0 = c19723a;
        this.f53742q0 = c14127l;
        this.f53743r0 = c13775m0;
        this.f53744s0 = c16756l0;
        this.f53745t0 = c16756l1;
        this.f53746u0 = c8805o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16756l0 c16756l0 = this.f53745t0;
        C8805o c8805o = this.f53746u0;
        C16753k0 c16753k0 = new C16753k0(this.f53740o0, this.f53741p0, this.f53742q0, this.f53743r0, this.f53744s0, c16756l0, c8805o, interfaceC18770c);
        c16753k0.f53739Z = obj;
        return c16753k0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16753k0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [An.F] */
    /* JADX WARN: Type inference failed for: r2v11, types: [An.F] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = this.f53738Y;
        C17296C c17296c = C17296C.f55119a;
        AbstractC16777s0 abstractC16777s0 = this.f53740o0;
        try {
            if (r6 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f53739Z;
                EnumC16673F0 enumC16673F0 = abstractC16777s0.f53839B0;
                C19723A c19723a = this.f53741p0;
                C14127l c14127l = this.f53742q0;
                C13775m0 c13775m0 = this.f53743r0;
                C16756l0 c16756l0 = this.f53744s0;
                C16756l0 c16756l1 = this.f53745t0;
                C8805o c8805o = this.f53746u0;
                this.f53739Z = interfaceC0571F;
                this.f53738Y = 1;
                float f10 = AbstractC16750j0.f53729a;
                Object objM9428b = AbstractC8717t4.m9428b(c19723a, new C16729c0(c16756l1, new C16524A(), enumC16673F0, c14127l, c8805o, c16756l0, c13775m0, null), this);
                r6 = objM9428b;
                if (objM9428b != enumC19250a) {
                    r6 = c17296c;
                }
                if (r6 == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (r6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r6 = (InterfaceC0571F) this.f53739Z;
                AbstractC9233X.m9807c(obj);
            }
        } catch (CancellationException e10) {
            C1743k c1743k = abstractC16777s0.f53843F0;
            if (c1743k != null) {
                c1743k.mo2524p(C16699O.f53513a);
            }
            if (!AbstractC0575H.m1196y(r6)) {
                throw e10;
            }
        }
        return c17296c;
    }
}
