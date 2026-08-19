package p178H;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.camera2.Camera2Config$DefaultProvider;
import androidx.camera.core.impl.MetadataHolderService;
import io.sentry.C15358g1;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001A.C0067i0;
import p001A.C0090u;
import p001A.C0100z;
import p228J.AbstractServiceC3845k0;
import p228J.C3792A0;
import p228J.C3827b0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.C3841i0;
import p228J.C3843j0;
import p228J.C3874z;
import p228J.RunnableC3869w0;
import p283L5.AbstractC4941g;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8143m5;
import p544W9.AbstractC8455C;
import p544W9.AbstractC8476F2;
import p610Z1.C10145l;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: H.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3169s {

    /* JADX INFO: renamed from: l */
    public static final Object f9521l = new Object();

    /* JADX INFO: renamed from: m */
    public static final SparseArray f9522m = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final C3171t f9525c;

    /* JADX INFO: renamed from: d */
    public final Executor f9526d;

    /* JADX INFO: renamed from: e */
    public final Handler f9527e;

    /* JADX INFO: renamed from: f */
    public C0090u f9528f;

    /* JADX INFO: renamed from: g */
    public C15358g1 f9529g;

    /* JADX INFO: renamed from: h */
    public C0067i0 f9530h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3148h0 f9531i;

    /* JADX INFO: renamed from: j */
    public final C10145l f9532j;

    /* JADX INFO: renamed from: a */
    public final C15358g1 f9523a = new C15358g1(5);

    /* JADX INFO: renamed from: b */
    public final Object f9524b = new Object();

    /* JADX INFO: renamed from: k */
    public int f9533k = 1;

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e4, code lost:
    
        r0 = r1;
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3169s(Context context) {
        Camera2Config$DefaultProvider camera2Config$DefaultProvider;
        Object objMo39b;
        Object objMo39b2;
        Object objMo39b3;
        InterfaceC3148h0 c3792a0;
        for (Context contextM9110c = AbstractC8476F2.m9110c(context); contextM9110c instanceof ContextWrapper; contextM9110c = ((ContextWrapper) contextM9110c).getBaseContext()) {
            if (contextM9110c instanceof Application) {
                break;
            }
        }
        try {
            Context contextM9110c2 = AbstractC8476F2.m9110c(context);
            Bundle bundle = contextM9110c2.getPackageManager().getServiceInfo(new ComponentName(contextM9110c2, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string == null) {
                AbstractC8072d6.m8487d("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                camera2Config$DefaultProvider = null;
            } else {
                camera2Config$DefaultProvider = (Camera2Config$DefaultProvider) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            AbstractC8072d6.m8488e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
        } catch (ClassNotFoundException e11) {
            e = e11;
            AbstractC8072d6.m8488e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
        } catch (IllegalAccessException e12) {
            e = e12;
            AbstractC8072d6.m8488e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
        } catch (InstantiationException e13) {
            e = e13;
            AbstractC8072d6.m8488e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
        } catch (NoSuchMethodException e14) {
            e = e14;
            AbstractC8072d6.m8488e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
        } catch (NullPointerException e15) {
            e = e15;
            AbstractC8072d6.m8488e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
        } catch (InvocationTargetException e16) {
            e = e16;
            AbstractC8072d6.m8488e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
        }
        if (camera2Config$DefaultProvider == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        C3171t cameraXConfig = camera2Config$DefaultProvider.getCameraXConfig();
        this.f9525c = cameraXConfig;
        try {
            objMo39b = cameraXConfig.f9558Y.mo39b(C3171t.f9557w0);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        C3841i0 c3841i0M9070b = (C3841i0) objMo39b;
        if (c3841i0M9070b != null) {
            AbstractC8072d6.m8486c("CameraX", "QuirkSettings from CameraXConfig: " + c3841i0M9070b);
        } else {
            try {
                Bundle bundle2 = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC3845k0.class), 640).metaData;
                if (bundle2 == null) {
                    AbstractC8072d6.m8492i("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                    c3841i0M9070b = null;
                } else {
                    c3841i0M9070b = AbstractC8455C.m9070b(bundle2, context);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                AbstractC8072d6.m8486c("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            }
            AbstractC8072d6.m8486c("CameraX", "QuirkSettings from app metadata: " + c3841i0M9070b);
        }
        if (c3841i0M9070b == null) {
            c3841i0M9070b = C3843j0.f11625b;
            AbstractC8072d6.m8486c("CameraX", "QuirkSettings by default: " + c3841i0M9070b);
        }
        C3827b0 c3827b0 = C3843j0.f11626c.f11627a;
        synchronized (c3827b0.f11589o0) {
            try {
                if (!Objects.equals(((AtomicReference) c3827b0.f11590p0).getAndSet(c3841i0M9070b), c3841i0M9070b)) {
                    int i10 = c3827b0.f11588Z + 1;
                    c3827b0.f11588Z = i10;
                    if (!c3827b0.f11587Y) {
                        c3827b0.f11587Y = true;
                        Iterator it = ((CopyOnWriteArraySet) c3827b0.f11592r0).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ((RunnableC3869w0) it.next()).m4592a(i10);
                            } else {
                                synchronized (c3827b0.f11589o0) {
                                    if (c3827b0.f11588Z == i10) {
                                        break;
                                    }
                                    Iterator it2 = ((CopyOnWriteArraySet) c3827b0.f11592r0).iterator();
                                    int i11 = c3827b0.f11588Z;
                                }
                            }
                        }
                        c3827b0.f11587Y = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            objMo39b2 = this.f9525c.f9558Y.mo39b(C3171t.f9551q0);
        } catch (IllegalArgumentException unused3) {
            objMo39b2 = null;
        }
        Executor executor = (Executor) objMo39b2;
        try {
            objMo39b3 = this.f9525c.f9558Y.mo39b(C3171t.f9552r0);
        } catch (IllegalArgumentException unused4) {
            objMo39b3 = null;
        }
        Handler handler = (Handler) objMo39b3;
        this.f9526d = executor == null ? new ExecutorC3159n() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            handlerThread.start();
            this.f9527e = AbstractC8143m5.m8678a(handlerThread.getLooper());
        } else {
            this.f9527e = handler;
        }
        C3171t c3171t = this.f9525c;
        C3828c c3828c = C3171t.f9553s0;
        c3171t.getClass();
        m3996a((Integer) ((C3835f0) c3171t.getConfig()).mo36M(c3828c, null));
        C3171t c3171t2 = this.f9525c;
        c3171t2.getClass();
        C3828c c3828c2 = C3171t.f9556v0;
        Object objMo39b4 = InterfaceC3148h0.f9472a;
        try {
            objMo39b4 = c3171t2.f9558Y.mo39b(c3828c2);
        } catch (IllegalArgumentException unused5) {
        }
        InterfaceC3148h0 interfaceC3148h0 = (InterfaceC3148h0) objMo39b4;
        Objects.requireNonNull(interfaceC3148h0);
        long jMo3985a = interfaceC3148h0.mo3985a();
        if (interfaceC3148h0 instanceof C3874z) {
            switch (((C3874z) interfaceC3148h0).f11715b) {
                case 0:
                    c3792a0 = new C3874z(jMo3985a, 0);
                    break;
                default:
                    c3792a0 = new C3874z(jMo3985a, 1);
                    break;
            }
        } else {
            c3792a0 = new C3792A0(jMo3985a, interfaceC3148h0);
        }
        this.f9531i = c3792a0;
        this.f9532j = m3997b(context);
    }

    /* JADX INFO: renamed from: a */
    public static void m3996a(Integer num) {
        synchronized (f9521l) {
            try {
                if (num == null) {
                    return;
                }
                AbstractC4941g.m5556O("minLogLevel", num.intValue(), 3, 6);
                SparseArray sparseArray = f9522m;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                if (sparseArray.size() == 0 || sparseArray.get(3) != null) {
                    AbstractC8072d6.f25387a = 3;
                } else if (sparseArray.get(4) != null) {
                    AbstractC8072d6.f25387a = 4;
                } else if (sparseArray.get(5) != null) {
                    AbstractC8072d6.f25387a = 5;
                } else if (sparseArray.get(6) != null) {
                    AbstractC8072d6.f25387a = 6;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C10145l m3997b(Context context) {
        C10145l c10145lM17947b;
        synchronized (this.f9524b) {
            boolean z6 = true;
            if (this.f9533k != 1) {
                z6 = false;
            }
            AbstractC4941g.m5559R("CameraX.initInternal() should only be called once per instance", z6);
            this.f9533k = 2;
            c10145lM17947b = AbstractC16347a.m17947b(new C0100z(this, 12, context));
        }
        return c10145lM17947b;
    }

    /* JADX INFO: renamed from: c */
    public final void m3998c() {
        synchronized (this.f9524b) {
            this.f9533k = 4;
        }
    }
}
