package p1009s9;

import android.content.Context;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: s9.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19513p {

    /* JADX INFO: renamed from: a */
    public static final BinderC19509l f61972a;

    /* JADX INFO: renamed from: b */
    public static final BinderC19509l f61973b;

    /* JADX INFO: renamed from: c */
    public static Context f61974c;

    static {
        new BinderC19509l(0, AbstractBinderC19510m.m20616p("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC19509l(1, AbstractBinderC19510m.m20616p("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f61972a = new BinderC19509l(2, AbstractBinderC19510m.m20616p("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f61973b = new BinderC19509l(3, AbstractBinderC19510m.m20616p("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m20617a(Context context) {
        if (f61974c != null) {
            AbstractC15256t.m16482t("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f61974c = context.getApplicationContext();
        }
    }
}
