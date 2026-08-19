package p982r5;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1075w5.C20831i;
import p1075w5.C20835m;
import p571X9.AbstractC9233X;
import p864l5.C16815b;
import p864l5.C16816c;
import p958q5.C18638m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: r5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18876d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60145Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18880h f60146Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f60147o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f60148p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C20831i f60149q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f60150r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16525B f60151s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16816c f60152t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18876d(C18880h c18880h, C16525B c16525b, C16525B c16525b2, C20831i c20831i, Object obj, C16525B c16525b3, C16816c c16816c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60146Z = c18880h;
        this.f60147o0 = c16525b;
        this.f60148p0 = c16525b2;
        this.f60149q0 = c20831i;
        this.f60150r0 = obj;
        this.f60151s0 = c16525b3;
        this.f60152t0 = c16816c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18876d(this.f60146Z, this.f60147o0, this.f60148p0, this.f60149q0, this.f60150r0, this.f60151s0, this.f60152t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18876d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60145Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18638m c18638m = (C18638m) this.f60147o0.f51262Y;
            C16815b c16815b = (C16815b) this.f60148p0.f51262Y;
            C20835m c20835m = (C20835m) this.f60151s0.f51262Y;
            this.f60145Y = 1;
            obj = C18880h.m20196a(this.f60146Z, c18638m, c16815b, this.f60149q0, this.f60150r0, c20835m, this.f60152t0, this);
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
