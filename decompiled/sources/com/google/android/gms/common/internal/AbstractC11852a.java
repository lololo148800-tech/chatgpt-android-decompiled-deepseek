package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p011A9.C0418i;
import p1009s9.C19499b;
import p1009s9.C19501d;
import p1009s9.C19502e;
import p1009s9.C19503f;
import p1022t9.InterfaceC19818c;
import p1022t9.InterfaceC19822g;
import p1022t9.InterfaceC19823h;
import p1036u9.C20171q;
import p1060v9.AbstractC20499q;
import p1060v9.AbstractC20502t;
import p1060v9.BinderC20504v;
import p1060v9.C20478A;
import p1060v9.C20481D;
import p1060v9.C20487e;
import p1060v9.C20491i;
import p1060v9.C20501s;
import p1060v9.C20506x;
import p1060v9.C20507y;
import p1060v9.C20508z;
import p1060v9.HandlerC20503u;
import p1060v9.InterfaceC20484b;
import p1060v9.InterfaceC20488f;
import p1060v9.ServiceConnectionC20505w;
import p110E4.C2313k;
import p588Y2.C9642z;
import p935p.RunnableC18260f;
import p999s.C19341c1;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11852a implements InterfaceC19818c {

    /* JADX INFO: renamed from: x */
    public static final C19501d[] f36067x = new C19501d[0];

    /* JADX INFO: renamed from: a */
    public volatile String f36068a;

    /* JADX INFO: renamed from: b */
    public C2313k f36069b;

    /* JADX INFO: renamed from: c */
    public final Context f36070c;

    /* JADX INFO: renamed from: d */
    public final C20481D f36071d;

    /* JADX INFO: renamed from: e */
    public final HandlerC20503u f36072e;

    /* JADX INFO: renamed from: f */
    public final Object f36073f;

    /* JADX INFO: renamed from: g */
    public final Object f36074g;

    /* JADX INFO: renamed from: h */
    public C20501s f36075h;

    /* JADX INFO: renamed from: i */
    public InterfaceC20484b f36076i;

    /* JADX INFO: renamed from: j */
    public IInterface f36077j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f36078k;

    /* JADX INFO: renamed from: l */
    public ServiceConnectionC20505w f36079l;

    /* JADX INFO: renamed from: m */
    public int f36080m;

    /* JADX INFO: renamed from: n */
    public final C20491i f36081n;

    /* JADX INFO: renamed from: o */
    public final C20491i f36082o;

    /* JADX INFO: renamed from: p */
    public final int f36083p;

    /* JADX INFO: renamed from: q */
    public final String f36084q;

    /* JADX INFO: renamed from: r */
    public volatile String f36085r;

    /* JADX INFO: renamed from: s */
    public C19499b f36086s;

    /* JADX INFO: renamed from: t */
    public boolean f36087t;

    /* JADX INFO: renamed from: u */
    public volatile C20508z f36088u;

    /* JADX INFO: renamed from: v */
    public final AtomicInteger f36089v;

    /* JADX INFO: renamed from: w */
    public final Set f36090w;

    public AbstractC11852a(Context context, Looper looper, int i10, C19341c1 c19341c1, InterfaceC19822g interfaceC19822g, InterfaceC19823h interfaceC19823h) {
        synchronized (C20481D.f65019g) {
            try {
                if (C20481D.f65020h == null) {
                    C20481D.f65020h = new C20481D(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C20481D c20481d = C20481D.f65020h;
        Object obj = C19502e.f61949c;
        AbstractC20502t.m21157h(interfaceC19822g);
        AbstractC20502t.m21157h(interfaceC19823h);
        C20491i c20491i = new C20491i(interfaceC19822g);
        C20491i c20491i2 = new C20491i(interfaceC19823h);
        String str = (String) c19341c1.f61258q0;
        this.f36068a = null;
        this.f36073f = new Object();
        this.f36074g = new Object();
        this.f36078k = new ArrayList();
        this.f36080m = 1;
        this.f36086s = null;
        this.f36087t = false;
        this.f36088u = null;
        this.f36089v = new AtomicInteger(0);
        AbstractC20502t.m21158i(context, "Context must not be null");
        this.f36070c = context;
        AbstractC20502t.m21158i(looper, "Looper must not be null");
        AbstractC20502t.m21158i(c20481d, "Supervisor must not be null");
        this.f36071d = c20481d;
        this.f36072e = new HandlerC20503u(this, looper);
        this.f36083p = i10;
        this.f36081n = c20491i;
        this.f36082o = c20491i2;
        this.f36084q = str;
        Set set = (Set) c19341c1.f61255Z;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f36090w = set;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m13195w(AbstractC11852a abstractC11852a) {
        int i10;
        int i11;
        synchronized (abstractC11852a.f36073f) {
            i10 = abstractC11852a.f36080m;
        }
        if (i10 == 3) {
            abstractC11852a.f36087t = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        HandlerC20503u handlerC20503u = abstractC11852a.f36072e;
        handlerC20503u.sendMessage(handlerC20503u.obtainMessage(i11, abstractC11852a.f36089v.get(), 16));
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m13196x(AbstractC11852a abstractC11852a, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC11852a.f36073f) {
            try {
                if (abstractC11852a.f36080m != i10) {
                    return false;
                }
                abstractC11852a.m13210y(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: a */
    public final boolean mo13197a() {
        boolean z6;
        synchronized (this.f36073f) {
            z6 = this.f36080m == 4;
        }
        return z6;
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: b */
    public final Set mo13198b() {
        return mo13208m() ? this.f36090w : Collections.emptySet();
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: c */
    public final void mo13199c(String str) {
        this.f36068a = str;
        mo13203g();
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: d */
    public final boolean mo13200d() {
        boolean z6;
        synchronized (this.f36073f) {
            int i10 = this.f36080m;
            z6 = true;
            if (i10 != 2 && i10 != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: e */
    public final void mo13201e() {
        if (!mo13197a() || this.f36069b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: f */
    public final void mo13202f(InterfaceC20488f interfaceC20488f, Set set) {
        Bundle bundleMo6126p = mo6126p();
        String str = this.f36085r;
        int i10 = C19503f.f61951a;
        Scope[] scopeArr = C20487e.f65038A0;
        Bundle bundle = new Bundle();
        int i11 = this.f36083p;
        C19501d[] c19501dArr = C20487e.f65039B0;
        C20487e c20487e = new C20487e(6, i11, i10, null, null, scopeArr, bundle, null, c19501dArr, c19501dArr, true, 0, false, str);
        c20487e.f65043p0 = this.f36070c.getPackageName();
        c20487e.f65046s0 = bundleMo6126p;
        if (set != null) {
            c20487e.f65045r0 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo13208m()) {
            c20487e.f65047t0 = new Account("<<default account>>", "com.google");
            if (interfaceC20488f != null) {
                c20487e.f65044q0 = interfaceC20488f.asBinder();
            }
        }
        c20487e.f65048u0 = f36067x;
        c20487e.f65049v0 = mo1032o();
        if (mo5842v()) {
            c20487e.f65052y0 = true;
        }
        try {
            synchronized (this.f36074g) {
                try {
                    C20501s c20501s = this.f36075h;
                    if (c20501s != null) {
                        c20501s.m21149d(new BinderC20504v(this, this.f36089v.get()), c20487e);
                    } else {
                        AbstractC15256t.m16482t("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (DeadObjectException e10) {
            AbstractC15256t.m16483u("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i12 = this.f36089v.get();
            HandlerC20503u handlerC20503u = this.f36072e;
            handlerC20503u.sendMessage(handlerC20503u.obtainMessage(6, i12, 3));
        } catch (RemoteException e11) {
            e = e11;
            AbstractC15256t.m16483u("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.f36089v.get();
            C20506x c20506x = new C20506x(this, 8, null, null);
            HandlerC20503u handlerC20503u2 = this.f36072e;
            handlerC20503u2.sendMessage(handlerC20503u2.obtainMessage(1, i13, -1, c20506x));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            AbstractC15256t.m16483u("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i14 = this.f36089v.get();
            C20506x c20506x2 = new C20506x(this, 8, null, null);
            HandlerC20503u handlerC20503u3 = this.f36072e;
            handlerC20503u3.sendMessage(handlerC20503u3.obtainMessage(1, i14, -1, c20506x2));
        }
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: g */
    public final void mo13203g() {
        this.f36089v.incrementAndGet();
        synchronized (this.f36078k) {
            try {
                int size = this.f36078k.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((AbstractC20499q) this.f36078k.get(i10)).m21147c();
                }
                this.f36078k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f36074g) {
            this.f36075h = null;
        }
        m13210y(1, null);
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: h */
    public final void mo13204h(C9642z c9642z) {
        ((C20171q) c9642z.f29064Z).f63896m.f63870z0.post(new RunnableC18260f(c9642z, 8));
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: i */
    public final void mo13205i(InterfaceC20484b interfaceC20484b) {
        this.f36076i = interfaceC20484b;
        m13210y(2, null);
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: k */
    public final C19501d[] mo13206k() {
        C20508z c20508z = this.f36088u;
        if (c20508z == null) {
            return null;
        }
        return c20508z.f65111Z;
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: l */
    public final String mo13207l() {
        return this.f36068a;
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: m */
    public boolean mo13208m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public abstract IInterface mo1031n(IBinder iBinder);

    /* JADX INFO: renamed from: o */
    public C19501d[] mo1032o() {
        return f36067x;
    }

    /* JADX INFO: renamed from: p */
    public Bundle mo6126p() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: q */
    public final IInterface m13209q() {
        IInterface iInterface;
        synchronized (this.f36073f) {
            try {
                if (this.f36080m == 5) {
                    throw new DeadObjectException();
                }
                if (!mo13197a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f36077j;
                AbstractC20502t.m21158i(iInterface, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    /* JADX INFO: renamed from: r */
    public abstract String mo1033r();

    /* JADX INFO: renamed from: s */
    public abstract String mo1034s();

    /* JADX INFO: renamed from: t */
    public boolean mo1035t() {
        return mo1030j() >= 211700000;
    }

    /* JADX INFO: renamed from: u */
    public void mo7733u() {
        System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: v */
    public boolean mo5842v() {
        return this instanceof C0418i;
    }

    /* JADX INFO: renamed from: y */
    public final void m13210y(int i10, IInterface iInterface) {
        C2313k c2313k;
        AbstractC20502t.m21151b((i10 == 4) == (iInterface != null));
        synchronized (this.f36073f) {
            try {
                this.f36080m = i10;
                this.f36077j = iInterface;
                if (i10 == 1) {
                    ServiceConnectionC20505w serviceConnectionC20505w = this.f36079l;
                    if (serviceConnectionC20505w != null) {
                        C20481D c20481d = this.f36071d;
                        String str = this.f36069b.f7195c;
                        AbstractC20502t.m21157h(str);
                        this.f36069b.getClass();
                        if (this.f36084q == null) {
                            this.f36070c.getClass();
                        }
                        c20481d.m21130b(str, serviceConnectionC20505w, this.f36069b.f7194b);
                        this.f36079l = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    ServiceConnectionC20505w serviceConnectionC20505w2 = this.f36079l;
                    if (serviceConnectionC20505w2 != null && (c2313k = this.f36069b) != null) {
                        AbstractC15256t.m16465c("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c2313k.f7195c + " on com.google.android.gms");
                        C20481D c20481d2 = this.f36071d;
                        String str2 = this.f36069b.f7195c;
                        AbstractC20502t.m21157h(str2);
                        this.f36069b.getClass();
                        if (this.f36084q == null) {
                            this.f36070c.getClass();
                        }
                        c20481d2.m21130b(str2, serviceConnectionC20505w2, this.f36069b.f7194b);
                        this.f36089v.incrementAndGet();
                    }
                    ServiceConnectionC20505w serviceConnectionC20505w3 = new ServiceConnectionC20505w(this, this.f36089v.get());
                    this.f36079l = serviceConnectionC20505w3;
                    String strMo1034s = mo1034s();
                    boolean zMo1035t = mo1035t();
                    this.f36069b = new C2313k(strMo1034s, zMo1035t, 3);
                    if (zMo1035t && mo1030j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f36069b.f7195c)));
                    }
                    C20481D c20481d3 = this.f36071d;
                    String str3 = this.f36069b.f7195c;
                    AbstractC20502t.m21157h(str3);
                    this.f36069b.getClass();
                    String name = this.f36084q;
                    if (name == null) {
                        name = this.f36070c.getClass().getName();
                    }
                    if (!c20481d3.m21131c(new C20478A(str3, this.f36069b.f7194b), serviceConnectionC20505w3, name)) {
                        AbstractC15256t.m16482t("GmsClient", "unable to connect to service: " + this.f36069b.f7195c + " on com.google.android.gms");
                        int i11 = this.f36089v.get();
                        C20507y c20507y = new C20507y(this, 16);
                        HandlerC20503u handlerC20503u = this.f36072e;
                        handlerC20503u.sendMessage(handlerC20503u.obtainMessage(7, i11, -1, c20507y));
                    }
                } else if (i10 == 4) {
                    AbstractC20502t.m21157h(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
