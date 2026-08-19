package p672c3;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import mm.C17296C;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p351O2.InterfaceC6094h;
import p394Q2.C6561a;
import p394Q2.C6562b;
import p417R2.C6795g;
import p437Rn.C6949g;
import p571X9.AbstractC9227W;
import p996rm.EnumC19250a;
import ph.C18417e;

/* JADX INFO: renamed from: c3.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C11584Q {

    /* JADX INFO: renamed from: d */
    public static final C11581N f35031d = new C11581N();

    /* JADX INFO: renamed from: e */
    public static final C6562b f35032e;

    /* JADX INFO: renamed from: f */
    public static InterfaceC6094h f35033f;

    /* JADX INFO: renamed from: g */
    public static final C6795g f35034g;

    /* JADX INFO: renamed from: a */
    public final Context f35035a;

    /* JADX INFO: renamed from: b */
    public final AppWidgetManager f35036b;

    /* JADX INFO: renamed from: c */
    public final C17314q f35037c = AbstractC9227W.m9800c(new C6949g(this, 27));

    static {
        C6561a c6561a = C6561a.f21229Y;
        C3516e c3516e = AbstractC0593T.f1824a;
        f35032e = new C6562b(null, c6561a, AbstractC0575H.m1174c(ExecutorC3515d.f10633Z.plus(AbstractC0575H.m1176e())));
        f35034g = new C6795g("list::Providers");
    }

    public C11584Q(Context context) {
        this.f35035a = context;
        this.f35036b = AppWidgetManager.getInstance(context);
    }

    /* JADX INFO: renamed from: a */
    public final Object m12976a(WidgetReceiver widgetReceiver, C18417e c18417e, C11590X c11590x) {
        f35031d.getClass();
        String canonicalName = widgetReceiver.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = c18417e.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object objMo6651b = ((InterfaceC6094h) this.f35037c.getValue()).mo6651b(new C11583P(canonicalName, canonicalName2, null), c11590x);
        return objMo6651b == EnumC19250a.f61036Y ? objMo6651b : C17296C.f55119a;
    }
}
