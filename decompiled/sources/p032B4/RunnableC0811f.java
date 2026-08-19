package p032B4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p1072w2.C20793e;
import p1072w2.C20796h;
import p127El.ExecutorC2575a;
import p893n.AbstractC17377i;
import p893n.AbstractC17378j;
import p893n.AbstractC17379k;
import p896n2.AbstractC17452e;

/* JADX INFO: renamed from: B4.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0811f implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2264Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f2265Z;

    public /* synthetic */ RunnableC0811f(Context context, int i10) {
        this.f2264Y = i10;
        this.f2265Z = context;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C20793e c20793e;
        switch (this.f2264Y) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0811f(this.f2265Z, 1));
                break;
            case 1:
                AbstractC0809d.m1867t(this.f2265Z, new ExecutorC2575a(1), AbstractC0809d.f2252a, false);
                break;
            case 2:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    Context context = this.f2265Z;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i10 >= 33) {
                            Object objM19060b = AbstractC17379k.m19060b();
                            if (objM19060b != null) {
                                c20793e = new C20793e(new C20796h(AbstractC17378j.m19057a(objM19060b)));
                            } else {
                                c20793e = C20793e.f66055b;
                            }
                        } else {
                            c20793e = AbstractC17379k.f55486o0;
                            if (c20793e == null) {
                                c20793e = C20793e.f66055b;
                            }
                        }
                        if (c20793e.f66056a.isEmpty()) {
                            String strM19131e = AbstractC17452e.m19131e(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                AbstractC17378j.m19058b(systemService, AbstractC17377i.m19056a(strM19131e));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC17379k.f55489r0 = true;
                break;
            default:
                AbstractC17379k.m19064n(this.f2265Z);
                break;
        }
    }
}
