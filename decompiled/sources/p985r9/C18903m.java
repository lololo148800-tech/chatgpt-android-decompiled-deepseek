package p985r9;

import android.app.Application;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p009A7.ThreadFactoryC0394d;
import p077Cn.EnumC1733a;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9138H;
import p746fa.C13606o;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14352h;
import p774h1.C14344W;
import p774h1.C14356l;
import p784hb.C14438g;
import p829j9.C16177a;
import p829j9.InterfaceC16179c;
import p865l6.ServiceConnectionC16827a;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: r9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C18903m {

    /* JADX INFO: renamed from: e */
    public static C18903m f60266e;

    /* JADX INFO: renamed from: a */
    public int f60267a;

    /* JADX INFO: renamed from: b */
    public final Object f60268b;

    /* JADX INFO: renamed from: c */
    public Object f60269c;

    /* JADX INFO: renamed from: d */
    public Object f60270d;

    public C18903m(Application application) {
        this.f60267a = 0;
        this.f60268b = application.getApplicationContext();
    }

    /* JADX INFO: renamed from: n */
    public static synchronized C18903m m20216n(Context context) {
        try {
            if (f60266e == null) {
                f60266e = new C18903m(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC0394d("MessengerIpcClient", 1))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f60266e;
    }

    /* JADX INFO: renamed from: a */
    public C14438g m20217a() throws RemoteException {
        if (this.f60267a != 2 || ((InterfaceC16179c) this.f60269c) == null || ((ServiceConnectionC16827a) this.f60270d) == null) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", ((Context) this.f60268b).getPackageName());
        try {
            return new C14438g(((C16177a) ((InterfaceC16179c) this.f60269c)).m17788d(bundle));
        } catch (RemoteException e10) {
            AbstractC9138H.m9683b("RemoteException getting install referrer information");
            this.f60267a = 0;
            throw e10;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m20218b() {
        Paint.Cap strokeCap = ((Paint) this.f60268b).getStrokeCap();
        int i10 = strokeCap == null ? -1 : AbstractC14352h.f45037a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public int m20219c() {
        Paint.Join strokeJoin = ((Paint) this.f60268b).getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : AbstractC14352h.f45038b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: d */
    public void m20220d(float f10) {
        ((Paint) this.f60268b).setAlpha((int) Math.rint(f10 * 255.0f));
    }

    /* JADX INFO: renamed from: e */
    public void m20221e(int i10) {
        if (AbstractC14334L.m15639q(this.f60267a, i10)) {
            return;
        }
        this.f60267a = i10;
        int i11 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f60268b;
        if (i11 >= 29) {
            C14344W.f45026a.m15671a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC14334L.m15621J(i10)));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m20222f(long j10) {
        ((Paint) this.f60268b).setColor(AbstractC14334L.m15617F(j10));
    }

    /* JADX INFO: renamed from: g */
    public void m20223g(C14356l c14356l) {
        this.f60270d = c14356l;
        ((Paint) this.f60268b).setColorFilter(c14356l != null ? c14356l.f45044a : null);
    }

    /* JADX INFO: renamed from: h */
    public void m20224h(int i10) {
        ((Paint) this.f60268b).setFilterBitmap(!AbstractC14334L.m15641s(i10, 0));
    }

    /* JADX INFO: renamed from: i */
    public void m20225i(Shader shader) {
        this.f60269c = shader;
        ((Paint) this.f60268b).setShader(shader);
    }

    /* JADX INFO: renamed from: j */
    public void m20226j(int i10) {
        Paint.Cap cap;
        if (AbstractC14334L.m15642t(i10, 2)) {
            cap = Paint.Cap.SQUARE;
        } else if (AbstractC14334L.m15642t(i10, 1)) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = AbstractC14334L.m15642t(i10, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        ((Paint) this.f60268b).setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: k */
    public void m20227k(int i10) {
        Paint.Join join;
        if (AbstractC14334L.m15643u(i10, 0)) {
            join = Paint.Join.MITER;
        } else if (AbstractC14334L.m15643u(i10, 2)) {
            join = Paint.Join.BEVEL;
        } else {
            join = AbstractC14334L.m15643u(i10, 1) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        ((Paint) this.f60268b).setStrokeJoin(join);
    }

    /* JADX INFO: renamed from: l */
    public void m20228l(float f10) {
        ((Paint) this.f60268b).setStrokeWidth(f10);
    }

    /* JADX INFO: renamed from: m */
    public void m20229m(int i10) {
        ((Paint) this.f60268b).setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: o */
    public synchronized C13606o m20230o(C18902l c18902l) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(c18902l.toString()));
            }
            if (!((ServiceConnectionC18901k) this.f60270d).m20212d(c18902l)) {
                ServiceConnectionC18901k serviceConnectionC18901k = new ServiceConnectionC18901k(this);
                this.f60270d = serviceConnectionC18901k;
                serviceConnectionC18901k.m20212d(c18902l);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c18902l.f60262b.f42961a;
    }

    public C18903m(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f60270d = new ServiceConnectionC18901k(this);
        this.f60267a = 1;
        this.f60269c = scheduledExecutorService;
        this.f60268b = context.getApplicationContext();
    }

    public C18903m(Paint paint) {
        this.f60268b = paint;
        this.f60267a = 3;
    }

    public C18903m(int i10, EnumC1733a enumC1733a, InterfaceC2184i interfaceC2184i, InterfaceC18776i interfaceC18776i) {
        this.f60268b = interfaceC2184i;
        this.f60267a = i10;
        this.f60269c = enumC1733a;
        this.f60270d = interfaceC18776i;
    }
}
