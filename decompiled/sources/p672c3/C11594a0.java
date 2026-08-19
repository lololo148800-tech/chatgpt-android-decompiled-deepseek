package p672c3;

import androidx.glance.appwidget.GlanceRemoteViewsService;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8038Z3;
import p571X9.AbstractC9233X;
import p823j3.C16095q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import ph.C18417e;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11594a0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35078Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35079Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11596b0 f35080o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11597c f35081p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18417e f35082q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11594a0(C11596b0 c11596b0, C11597c c11597c, C18417e c18417e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35080o0 = c11596b0;
        this.f35081p0 = c11597c;
        this.f35082q0 = c18417e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11594a0 c11594a0 = new C11594a0(this.f35080o0, this.f35081p0, this.f35082q0, interfaceC18770c);
        c11594a0.f35079Z = obj;
        return c11594a0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11594a0) create((C16095q) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16095q c16095q;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35078Y;
        C11597c c11597c = this.f35081p0;
        C11596b0 c11596b0 = this.f35080o0;
        if (i10 != 0) {
            if (i10 == 1) {
                c16095q = (C16095q) this.f35079Z;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                c16095q = (C16095q) this.f35079Z;
                AbstractC9233X.m9807c(obj);
                C11617m c11617m = (C11617m) c16095q.f49858a.get(AbstractC8038Z3.m8392a(c11597c.f35088a));
                AbstractC16544l.m18092e(c11617m, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
                this.f35079Z = null;
                this.f35078Y = 3;
                obj = c11617m.m12995f(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return obj;
        }
        AbstractC9233X.m9807c(obj);
        C16095q c16095q2 = (C16095q) this.f35079Z;
        GlanceRemoteViewsService glanceRemoteViewsService = c11596b0.f35084a;
        String strM8392a = AbstractC8038Z3.m8392a(c11597c.f35088a);
        this.f35079Z = c16095q2;
        this.f35078Y = 1;
        Object objM17650a = c16095q2.m17650a(glanceRemoteViewsService, strM8392a, this);
        if (objM17650a == enumC19250a) {
            return enumC19250a;
        }
        c16095q = c16095q2;
        obj = objM17650a;
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        GlanceRemoteViewsService glanceRemoteViewsService2 = c11596b0.f35084a;
        C11617m c11617m2 = new C11617m(this.f35082q0, c11597c, null, 252);
        this.f35079Z = c16095q;
        this.f35078Y = 2;
        if (c16095q.m17651b(glanceRemoteViewsService2, c11617m2, this) == enumC19250a) {
            return enumC19250a;
        }
        C11617m c11617m3 = (C11617m) c16095q.f49858a.get(AbstractC8038Z3.m8392a(c11597c.f35088a));
        AbstractC16544l.m18092e(c11617m3, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
        this.f35079Z = null;
        this.f35078Y = 3;
        obj = c11617m3.m12995f(this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        return obj;
    }
}
