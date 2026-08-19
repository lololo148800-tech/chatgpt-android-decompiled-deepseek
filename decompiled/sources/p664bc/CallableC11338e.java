package p664bc;

import ac.C10539a;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11935b;
import com.google.android.gms.internal.play_billing.InterfaceC11943d;
import com.revenuecat.purchases.google.usecase.C12747b;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p544W9.AbstractC8538P4;
import p544W9.C8490H4;
import p544W9.C8496I4;
import p544W9.C8544Q4;
import p826j6.AbstractC16144M;
import p826j6.BinderC16133B;
import p826j6.C16149c;

/* JADX INFO: renamed from: bc.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC11338e implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34279c;

    public /* synthetic */ CallableC11338e(Object obj, int i10, Object obj2) {
        this.f34277a = i10;
        this.f34278b = obj;
        this.f34279c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C8496I4 c8496i4;
        InterfaceC11943d interfaceC11943d;
        switch (this.f34277a) {
            case 0:
                C10539a c10539a = (C10539a) this.f34279c;
                AbstractC11335b abstractC11335b = (AbstractC11335b) this.f34278b;
                abstractC11335b.getClass();
                HashMap map = C8496I4.f26315r0;
                C8544Q4.m9205b();
                int i10 = AbstractC8538P4.f26363a;
                C8544Q4.m9205b();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = C8496I4.f26315r0;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new C8496I4("detectorTaskWithResource#run"));
                    }
                    c8496i4 = (C8496I4) map2.get("detectorTaskWithResource#run");
                } else {
                    c8496i4 = C8490H4.f26311s0;
                }
                c8496i4.mo9147a();
                try {
                    Object objMo1944q = abstractC11335b.f34271Z.mo1944q(c10539a);
                    c8496i4.close();
                    return objMo1944q;
                } catch (Throwable th2) {
                    try {
                        c8496i4.close();
                        break;
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            default:
                C16149c c16149c = (C16149c) this.f34278b;
                C12747b c12747b = (C12747b) this.f34279c;
                c16149c.getClass();
                try {
                    synchronized (c16149c.f50112a) {
                        interfaceC11943d = c16149c.f50119h;
                        break;
                    }
                    if (interfaceC11943d == null) {
                        c16149c.m17754B(c12747b, AbstractC16144M.f50088k, 119, null);
                    } else {
                        String packageName = c16149c.f50117f.getPackageName();
                        String str = c16149c.f50114c;
                        long jLongValue = c16149c.f50111E.longValue();
                        Bundle bundle = new Bundle();
                        AbstractC11988o0.m13507b(bundle, str, jLongValue);
                        ((C11935b) interfaceC11943d).m13402B(packageName, bundle, new BinderC16133B(c12747b, c16149c.f50118g, c16149c.f50123l));
                    }
                } catch (DeadObjectException e10) {
                    c16149c.m17754B(c12747b, AbstractC16144M.f50088k, 62, e10);
                } catch (Exception e11) {
                    c16149c.m17754B(c12747b, AbstractC16144M.f50086i, 62, e11);
                }
                return null;
        }
    }
}
