package p823j3;

import android.content.Context;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p349O0.C6032u0;
import p349O0.EnumC6020o0;
import p571X9.AbstractC9233X;
import p637a3.AbstractC10494k;
import p672c3.C11617m;
import p672c3.C11628r0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.D */
/* JADX INFO: loaded from: classes.dex */
public final class C16065D extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49736Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f49737Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11617m f49738o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6032u0 f49739p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16524A f49740q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C2153Q0 f49741r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Context f49742s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C11628r0 f49743t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C16075N f49744u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C16073L f49745v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC0571F f49746w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16065D(C11617m c11617m, C6032u0 c6032u0, C16524A c16524a, C2153Q0 c2153q0, Context context, C11628r0 c11628r0, C16075N c16075n, C16073L c16073l, InterfaceC0571F interfaceC0571F, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49738o0 = c11617m;
        this.f49739p0 = c6032u0;
        this.f49740q0 = c16524a;
        this.f49741r0 = c2153q0;
        this.f49742s0 = context;
        this.f49743t0 = c11628r0;
        this.f49744u0 = c16075n;
        this.f49745v0 = c16073l;
        this.f49746w0 = interfaceC0571F;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16065D c16065d = new C16065D(this.f49738o0, this.f49739p0, this.f49740q0, this.f49741r0, this.f49742s0, this.f49743t0, this.f49744u0, this.f49745v0, this.f49746w0, interfaceC18770c);
        c16065d.f49737Z = obj;
        return c16065d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16065D) create((EnumC6020o0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49736Y;
        C16524A c16524a = this.f49740q0;
        C6032u0 c6032u0 = this.f49739p0;
        C2153Q0 c2153q0 = this.f49741r0;
        C17296C c17296c = C17296C.f55119a;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            this.f49744u0.m17644b(this.f49745v0.f49768a);
            c16524a.f51261Y = c6032u0.f19645a;
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        int iOrdinal = ((EnumC6020o0) this.f49737Z).ordinal();
        if (iOrdinal == 0) {
            AbstractC0575H.m1180i(this.f49746w0, null);
        } else if (iOrdinal == 4) {
            if (c6032u0.f19645a > c16524a.f51261Y || !((Boolean) c2153q0.getValue()).booleanValue()) {
                AbstractC10494k abstractC10494k = (AbstractC10494k) this.f49743t0.mo10955a();
                this.f49736Y = 1;
                obj = this.f49738o0.m12991b(this.f49742s0, abstractC10494k, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            }
            c16524a.f51261Y = c6032u0.f19645a;
        }
        return c17296c;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!((Boolean) c2153q0.getValue()).booleanValue() && zBooleanValue) {
            Boolean bool = Boolean.TRUE;
            this.f49736Y = 2;
            c2153q0.mo395a(bool, this);
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
            this.f49744u0.m17644b(this.f49745v0.f49768a);
        }
        c16524a.f51261Y = c6032u0.f19645a;
        return c17296c;
    }
}
