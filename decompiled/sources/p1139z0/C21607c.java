package p1139z0;

import android.view.View;
import mm.C17296C;
import p003A1.C0275o0;
import p006A4.C0362w;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1094x0.AbstractC21046e;
import p389Pn.C6535t;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21607c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68435Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f68436Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0275o0 f68437o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0362w f68438p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C21611e f68439q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C21587J f68440r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21607c(C0275o0 c0275o0, C0362w c0362w, C21611e c21611e, C21587J c21587j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68437o0 = c0275o0;
        this.f68438p0 = c0362w;
        this.f68439q0 = c21611e;
        this.f68440r0 = c21587j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21607c c21607c = new C21607c(this.f68437o0, this.f68438p0, this.f68439q0, this.f68440r0, interfaceC18770c);
        c21607c.f68436Z = obj;
        return c21607c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C21607c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68435Y;
        C21611e c21611e = this.f68439q0;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
                throw new C0644w();
            }
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f68436Z;
            C21589L c21589l = AbstractC21590M.f68371a;
            C0275o0 c0275o0 = this.f68437o0;
            View view = c0275o0.f999Y;
            c21589l.getClass();
            C21585H c21585h = new C21585H(view);
            C21591N c21591n = new C21591N(c0275o0.f999Y, new C6535t(this.f68440r0), c21585h);
            if (AbstractC21046e.f66933a) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C21605b(c21611e, c21585h, null), 3);
            }
            C0362w c0362w = this.f68438p0;
            if (c0362w != null) {
                c0362w.invoke(c21591n);
            }
            c21611e.f68454c = c21591n;
            this.f68435Y = 1;
            c0275o0.m860a(c21591n, this);
            return enumC19250a;
        } catch (Throwable th2) {
            c21611e.f68454c = null;
            throw th2;
        }
    }
}
