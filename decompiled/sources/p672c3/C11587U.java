package p672c3;

import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p041Be.C1217J;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import ph.C18417e;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.U */
/* JADX INFO: loaded from: classes.dex */
public final class C11587U extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35053Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35054Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ WidgetReceiver f35055o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f35056p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f35057q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f35058r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11587U(WidgetReceiver widgetReceiver, Context context, int i10, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35055o0 = widgetReceiver;
        this.f35056p0 = context;
        this.f35057q0 = i10;
        this.f35058r0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11587U c11587u = new C11587U(this.f35055o0, this.f35056p0, this.f35057q0, this.f35058r0, interfaceC18770c);
        c11587u.f35054Z = obj;
        return c11587u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11587U) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35053Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f35054Z;
            WidgetReceiver widgetReceiver = this.f35055o0;
            WidgetReceiver.m14390a(widgetReceiver, interfaceC0571F, this.f35056p0);
            this.f35053Y = 1;
            C18417e c18417e = widgetReceiver.f40340b;
            c18417e.getClass();
            Object objM17652a = c18417e.f35021b.m17652a(new C11577J(this.f35056p0, new C11597c(this.f35057q0), c18417e, null, new C1217J(this.f35058r0, (InterfaceC18770c) null, 12), null), this);
            if (objM17652a != enumC19250a) {
                objM17652a = c17296c;
            }
            if (objM17652a != enumC19250a) {
                objM17652a = c17296c;
            }
            if (objM17652a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
