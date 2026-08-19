package p672c3;

import android.content.Context;
import android.os.Bundle;
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

/* JADX INFO: renamed from: c3.K */
/* JADX INFO: loaded from: classes.dex */
public final class C11578K extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35014Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35015Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f35016o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11597c f35017p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18417e f35018q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Bundle f35019r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11578K(Context context, C11597c c11597c, C18417e c18417e, Bundle bundle, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35016o0 = context;
        this.f35017p0 = c11597c;
        this.f35018q0 = c18417e;
        this.f35019r0 = bundle;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11578K c11578k = new C11578K(this.f35016o0, this.f35017p0, this.f35018q0, this.f35019r0, interfaceC18770c);
        c11578k.f35015Z = obj;
        return c11578k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11578K) create((C16095q) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16095q c16095q;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35014Y;
        C11597c c11597c = this.f35017p0;
        C17296C c17296c = C17296C.f55119a;
        int i11 = c11597c.f35088a;
        Context context = this.f35016o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            c16095q = (C16095q) this.f35015Z;
            String strM8392a = AbstractC8038Z3.m8392a(i11);
            this.f35015Z = c16095q;
            this.f35014Y = 1;
            obj = c16095q.m17650a(context, strM8392a, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    AbstractC9233X.m9807c(obj);
                }
                if (i10 == 3) {
                    AbstractC9233X.m9807c(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16095q = (C16095q) this.f35015Z;
            AbstractC9233X.m9807c(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C11617m c11617m = new C11617m(this.f35018q0, c11597c, this.f35019r0, 248);
            this.f35015Z = null;
            this.f35014Y = 2;
            return c16095q.m17651b(context, c11617m, this) == enumC19250a ? enumC19250a : c17296c;
        }
        C11617m c11617m2 = (C11617m) c16095q.f49858a.get(AbstractC8038Z3.m8392a(i11));
        AbstractC16544l.m18092e(c11617m2, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
        this.f35015Z = null;
        this.f35014Y = 3;
        Object objM12994e = c11617m2.m12994e(C11603f.f35100a, this);
        if (objM12994e != enumC19250a) {
            objM12994e = c17296c;
        }
        return objM12994e == enumC19250a ? enumC19250a : c17296c;
    }
}
