package p853kd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p500Ua.AbstractC7592a;
import p500Ua.C7593b;
import p500Ua.C7597f;
import p500Ua.ResultReceiverC7594c;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9213T3;
import p571X9.AbstractC9233X;
import p658b5.C11234e;
import p746fa.C13599h;
import p746fa.C13606o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: kd.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16367b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C11234e f50836Y;

    /* JADX INFO: renamed from: Z */
    public int f50837Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Activity f50838o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16368c f50839p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16367b(Activity activity, C16368c c16368c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50838o0 = activity;
        this.f50839p0 = c16368c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16367b(this.f50838o0, this.f50839p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16367b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C11234e c11234e;
        C13606o c13606oM8117e;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f50837Z;
        C17296C c17296c = C17296C.f55119a;
        Activity activity = this.f50838o0;
        if (i10 != 0) {
            if (i10 == 1) {
                c11234e = this.f50836Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            AbstractC8160o6.m8726a(this.f50839p0.f50842c, "Prompted for app review", null, 6);
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = activity;
        }
        c11234e = new C11234e(new C7597f(applicationContext));
        this.f50836Y = c11234e;
        this.f50837Z = 1;
        obj = AbstractC9213T3.m9781b(c11234e, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        this.f50836Y = null;
        this.f50837Z = 2;
        c11234e.getClass();
        C7593b c7593b = (C7593b) ((AbstractC7592a) obj);
        if (c7593b.f24016Z) {
            c13606oM8117e = AbstractC7854B5.m8117e(null);
        } else {
            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", c7593b.f24015Y);
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            C13599h c13599h = new C13599h();
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, new ResultReceiverC7594c((Handler) c11234e.f34002o0, c13599h, 0));
            activity.startActivity(intent);
            c13606oM8117e = c13599h.f42961a;
        }
        AbstractC16544l.m18093f(c13606oM8117e, "launchReviewFlow(...)");
        Object objM9782c = AbstractC9213T3.m9782c(c13606oM8117e, this);
        if (objM9782c != enumC19250a) {
            objM9782c = c17296c;
        }
        if (objM9782c == enumC19250a) {
            return enumC19250a;
        }
        AbstractC8160o6.m8726a(this.f50839p0.f50842c, "Prompted for app review", null, 6);
        return c17296c;
    }
}
