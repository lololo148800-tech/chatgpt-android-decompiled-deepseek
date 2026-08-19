package p672c3;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p523V9.AbstractC8038Z3;
import p571X9.AbstractC9233X;
import p823j3.C16095q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.J */
/* JADX INFO: loaded from: classes.dex */
public final class C11577J extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35007Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35008Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f35009o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11597c f35010p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC11579L f35011q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Bundle f35012r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ AbstractC19694j f35013s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11577J(Context context, C11597c c11597c, AbstractC11579L abstractC11579L, Bundle bundle, InterfaceC1440o interfaceC1440o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35009o0 = context;
        this.f35010p0 = c11597c;
        this.f35011q0 = abstractC11579L;
        this.f35012r0 = bundle;
        this.f35013s0 = (AbstractC19694j) interfaceC1440o;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        ?? r6 = this.f35013s0;
        C11577J c11577j = new C11577J(this.f35009o0, this.f35010p0, this.f35011q0, this.f35012r0, r6, interfaceC18770c);
        c11577j.f35008Z = obj;
        return c11577j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11577J) create((C16095q) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0086 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v4, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16095q c16095q;
        C11617m c11617m;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35007Y;
        C11597c c11597c = this.f35010p0;
        int i11 = c11597c.f35088a;
        Context context = this.f35009o0;
        if (i10 != 0) {
            if (i10 == 1) {
                c16095q = (C16095q) this.f35008Z;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                c16095q = (C16095q) this.f35008Z;
                AbstractC9233X.m9807c(obj);
                c11617m = (C11617m) c16095q.f49858a.get(AbstractC8038Z3.m8392a(i11));
                AbstractC16544l.m18092e(c11617m, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
                this.f35008Z = null;
                this.f35007Y = 3;
                if (this.f35013s0.invoke(c16095q, c11617m, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C16095q c16095q2 = (C16095q) this.f35008Z;
        String strM8392a = AbstractC8038Z3.m8392a(i11);
        this.f35008Z = c16095q2;
        this.f35007Y = 1;
        Object objM17650a = c16095q2.m17650a(context, strM8392a, this);
        if (objM17650a == enumC19250a) {
            return enumC19250a;
        }
        c16095q = c16095q2;
        obj = objM17650a;
        if (!((Boolean) obj).booleanValue()) {
            C11617m c11617m2 = new C11617m(this.f35011q0, c11597c, this.f35012r0, 248);
            this.f35008Z = c16095q;
            this.f35007Y = 2;
            if (c16095q.m17651b(context, c11617m2, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        c11617m = (C11617m) c16095q.f49858a.get(AbstractC8038Z3.m8392a(i11));
        AbstractC16544l.m18092e(c11617m, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
        this.f35008Z = null;
        this.f35007Y = 3;
        if (this.f35013s0.invoke(c16095q, c11617m, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
