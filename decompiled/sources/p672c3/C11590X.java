package p672c3;

import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.CancellationException;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import ph.C18417e;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.X */
/* JADX INFO: loaded from: classes.dex */
public final class C11590X extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35068Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f35069Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ WidgetReceiver f35070o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11590X(Context context, WidgetReceiver widgetReceiver, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35069Z = context;
        this.f35070o0 = widgetReceiver;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11590X(this.f35069Z, this.f35070o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11590X) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35068Y;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                Context context = this.f35069Z;
                WidgetReceiver widgetReceiver = this.f35070o0;
                C11584Q c11584q = new C11584Q(context);
                C18417e c18417e = widgetReceiver.f40340b;
                this.f35068Y = 1;
                if (c11584q.m12976a(widgetReceiver, c18417e, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            AbstractC15256t.m16466d("GlanceAppWidget", "Error in Glance App Widget", th2);
        }
        return C17296C.f55119a;
    }
}
