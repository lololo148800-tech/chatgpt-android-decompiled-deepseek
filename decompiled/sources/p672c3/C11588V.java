package p672c3;

import android.content.Context;
import android.os.Build;
import com.openai.feature.widget.impl.WidgetReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import ph.C18417e;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.V */
/* JADX INFO: loaded from: classes.dex */
public final class C11588V extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35059Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ WidgetReceiver f35060Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f35061o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f35062p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11588V(WidgetReceiver widgetReceiver, Context context, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35060Z = widgetReceiver;
        this.f35061o0 = context;
        this.f35062p0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11588V(this.f35060Z, this.f35061o0, this.f35062p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11588V) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35059Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18417e c18417e = this.f35060Z.f40340b;
            this.f35059Y = 1;
            c18417e.getClass();
            AtomicBoolean atomicBoolean = AbstractC11567C0.f34969a;
            if (Build.VERSION.SDK_INT >= 29 && AbstractC11567C0.f34969a.get()) {
                C11569D0.f34970a.m12965a("GlanceAppWidget::update", 0);
            }
            Object objM17652a = c18417e.f35021b.m17652a(new C11578K(this.f35061o0, new C11597c(this.f35062p0), c18417e, null, null), this);
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
