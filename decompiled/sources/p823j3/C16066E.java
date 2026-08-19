package p823j3;

import android.content.Context;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p349O0.C6032u0;
import p571X9.AbstractC9233X;
import p672c3.C11617m;
import p672c3.C11628r0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C16066E extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49747Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f49748Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6032u0 f49749o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11617m f49750p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C2153Q0 f49751q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Context f49752r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C11628r0 f49753s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16075N f49754t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C16073L f49755u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16066E(C6032u0 c6032u0, C11617m c11617m, C2153Q0 c2153q0, Context context, C11628r0 c11628r0, C16075N c16075n, C16073L c16073l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49749o0 = c6032u0;
        this.f49750p0 = c11617m;
        this.f49751q0 = c2153q0;
        this.f49752r0 = context;
        this.f49753s0 = c11628r0;
        this.f49754t0 = c16075n;
        this.f49755u0 = c16073l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16066E c16066e = new C16066E(this.f49749o0, this.f49750p0, this.f49751q0, this.f49752r0, this.f49753s0, this.f49754t0, this.f49755u0, interfaceC18770c);
        c16066e.f49748Z = obj;
        return c16066e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16066E) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49747Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f49748Z;
            C16524A c16524a = new C16524A();
            C6032u0 c6032u0 = this.f49749o0;
            c16524a.f51261Y = c6032u0.f19645a;
            C16065D c16065d = new C16065D(this.f49750p0, c6032u0, c16524a, this.f49751q0, this.f49752r0, this.f49753s0, this.f49754t0, this.f49755u0, interfaceC0571F, null);
            this.f49747Y = 1;
            if (AbstractC2124C.m3212k(c6032u0.f19663s, c16065d, this) == enumC19250a) {
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
