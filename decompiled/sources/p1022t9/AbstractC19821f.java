package p1022t9;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.internal.AbstractC11852a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p1009s9.C19502e;
import p1036u9.C20149A;
import p1036u9.C20155a;
import p1036u9.C20159e;
import p1036u9.C20171q;
import p1036u9.C20173s;
import p1036u9.C20175u;
import p1036u9.C20177w;
import p1036u9.DialogInterfaceOnCancelListenerC20169o;
import p1036u9.FragmentC20153E;
import p1060v9.AbstractC20502t;
import p1060v9.C20485c;
import p1060v9.C20486d;
import p1060v9.C20491i;
import p1060v9.C20492j;
import p166Ga.C3029c;
import p377P9.HandlerC6378d;
import p658b5.C11232c;
import p692d0.C12967f;
import p746fa.C13599h;
import p746fa.C13606o;
import p746fa.ExecutorC13605n;
import p849k7.C16361n;

/* JADX INFO: renamed from: t9.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19821f {

    /* JADX INFO: renamed from: a */
    public final Context f62874a;

    /* JADX INFO: renamed from: b */
    public final String f62875b;

    /* JADX INFO: renamed from: c */
    public final C11232c f62876c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC19817b f62877d;

    /* JADX INFO: renamed from: e */
    public final C20155a f62878e;

    /* JADX INFO: renamed from: f */
    public final Looper f62879f;

    /* JADX INFO: renamed from: g */
    public final int f62880g;

    /* JADX INFO: renamed from: h */
    public final C20173s f62881h;

    /* JADX INFO: renamed from: i */
    public final C16361n f62882i;

    /* JADX INFO: renamed from: j */
    public final C20159e f62883j;

    public AbstractC19821f(Context context, HiddenActivity hiddenActivity, C11232c c11232c, InterfaceC19817b interfaceC19817b, C19820e c19820e) {
        FragmentC20153E fragmentC20153E;
        AbstractC20502t.m21158i(context, "Null context is not permitted.");
        AbstractC20502t.m21158i(c11232c, "Api must not be null.");
        AbstractC20502t.m21158i(c19820e, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC20502t.m21158i(applicationContext, "The provided context did not have an application context.");
        this.f62874a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f62875b = attributionTag;
        this.f62876c = c11232c;
        this.f62877d = interfaceC19817b;
        this.f62879f = c19820e.f62873b;
        C20155a c20155a = new C20155a(c11232c, interfaceC19817b, attributionTag);
        this.f62878e = c20155a;
        this.f62881h = new C20173s(this);
        C20159e c20159eM20979g = C20159e.m20979g(applicationContext);
        this.f62883j = c20159eM20979g;
        this.f62880g = c20159eM20979g.f63864t0.getAndIncrement();
        this.f62882i = c19820e.f62872a;
        if (hiddenActivity != null && Looper.myLooper() == Looper.getMainLooper()) {
            WeakHashMap weakHashMap = FragmentC20153E.f63835p0;
            WeakReference weakReference = (WeakReference) weakHashMap.get(hiddenActivity);
            if (weakReference == null || (fragmentC20153E = (FragmentC20153E) weakReference.get()) == null) {
                try {
                    fragmentC20153E = (FragmentC20153E) hiddenActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (fragmentC20153E == null || fragmentC20153E.isRemoving()) {
                        fragmentC20153E = new FragmentC20153E();
                        hiddenActivity.getFragmentManager().beginTransaction().add(fragmentC20153E, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(hiddenActivity, new WeakReference(fragmentC20153E));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
                }
            }
            DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o = (DialogInterfaceOnCancelListenerC20169o) fragmentC20153E.mo20971d();
            if (dialogInterfaceOnCancelListenerC20169o == null) {
                Object obj = C19502e.f61949c;
                dialogInterfaceOnCancelListenerC20169o = new DialogInterfaceOnCancelListenerC20169o(fragmentC20153E, c20159eM20979g);
            }
            dialogInterfaceOnCancelListenerC20169o.f63881r0.add(c20155a);
            c20159eM20979g.m20980b(dialogInterfaceOnCancelListenerC20169o);
        }
        HandlerC6378d handlerC6378d = c20159eM20979g.f63870z0;
        handlerC6378d.sendMessage(handlerC6378d.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: a */
    public final C20485c m20769a() {
        C20485c c20485c = new C20485c();
        Set setEmptySet = Collections.emptySet();
        if (((C12967f) c20485c.f65029a) == null) {
            c20485c.f65029a = new C12967f(0);
        }
        ((C12967f) c20485c.f65029a).addAll(setEmptySet);
        Context context = this.f62874a;
        c20485c.f65031c = context.getClass().getName();
        c20485c.f65030b = context.getPackageName();
        return c20485c;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX INFO: renamed from: b */
    public final C13606o m20770b(int i10, C3029c c3029c) {
        C20175u c20175u;
        C13599h c13599h = new C13599h();
        C20159e c20159e = this.f62883j;
        c20159e.getClass();
        int i11 = c3029c.f9117b;
        if (i11 != 0) {
            C20155a c20155a = this.f62878e;
            if (c20159e.m20981c()) {
                C20492j c20492j = (C20492j) C20491i.m21138a().f65068Y;
                boolean z6 = true;
                if (c20492j != null) {
                    if (c20492j.f65070Z) {
                        C20171q c20171q = (C20171q) c20159e.f63866v0.get(c20155a);
                        if (c20171q != null) {
                            InterfaceC19818c interfaceC19818c = c20171q.f63885b;
                            if (interfaceC19818c instanceof AbstractC11852a) {
                                AbstractC11852a abstractC11852a = (AbstractC11852a) interfaceC19818c;
                                if (abstractC11852a.f36088u == null || abstractC11852a.mo13200d()) {
                                    z6 = c20492j.f65071o0;
                                } else {
                                    C20486d c20486dM21008a = C20175u.m21008a(c20171q, abstractC11852a, i11);
                                    if (c20486dM21008a != null) {
                                        c20171q.f63895l++;
                                        z6 = c20486dM21008a.f65034o0;
                                    }
                                }
                            }
                        } else {
                            z6 = c20492j.f65071o0;
                        }
                    }
                    c20175u = null;
                }
                c20175u = new C20175u(c20159e, i11, c20155a, z6 ? System.currentTimeMillis() : 0L, z6 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                c20175u = null;
            }
            if (c20175u != null) {
                C13606o c13606o = c13599h.f42961a;
                HandlerC6378d handlerC6378d = c20159e.f63870z0;
                handlerC6378d.getClass();
                c13606o.m15123b(new ExecutorC13605n(handlerC6378d, 1), c20175u);
            }
        }
        C20177w c20177w = new C20177w(new C20149A(i10, c3029c, c13599h, this.f62882i), c20159e.f63865u0.get(), this);
        HandlerC6378d handlerC6378d2 = c20159e.f63870z0;
        handlerC6378d2.sendMessage(handlerC6378d2.obtainMessage(4, c20177w));
        return c13599h.f42961a;
    }
}
