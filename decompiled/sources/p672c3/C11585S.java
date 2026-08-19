package p672c3;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
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

/* JADX INFO: renamed from: c3.S */
/* JADX INFO: loaded from: classes.dex */
public final class C11585S extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35038Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35039Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ WidgetReceiver f35040o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f35041p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f35042q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Bundle f35043r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11585S(WidgetReceiver widgetReceiver, Context context, int i10, Bundle bundle, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35040o0 = widgetReceiver;
        this.f35041p0 = context;
        this.f35042q0 = i10;
        this.f35043r0 = bundle;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11585S c11585s = new C11585S(this.f35040o0, this.f35041p0, this.f35042q0, this.f35043r0, interfaceC18770c);
        c11585s.f35039Z = obj;
        return c11585s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11585S) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17652a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35038Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f35039Z;
            WidgetReceiver widgetReceiver = this.f35040o0;
            WidgetReceiver.m14390a(widgetReceiver, interfaceC0571F, this.f35041p0);
            this.f35038Y = 1;
            C18417e c18417e = widgetReceiver.f40340b;
            c18417e.getClass();
            C11642y0 c11642y0 = c18417e.f58772d;
            if (Build.VERSION.SDK_INT <= 31 || !(c11642y0 instanceof C11642y0)) {
                C11597c c11597c = new C11597c(this.f35042q0);
                Bundle bundle = this.f35043r0;
                objM17652a = c18417e.f35021b.m17652a(new C11577J(this.f35041p0, c11597c, c18417e, bundle, new C1217J(bundle, (InterfaceC18770c) null, 11), null), this);
                if (objM17652a != enumC19250a) {
                    objM17652a = c17296c;
                }
                if (objM17652a != enumC19250a) {
                    objM17652a = c17296c;
                }
            } else {
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
