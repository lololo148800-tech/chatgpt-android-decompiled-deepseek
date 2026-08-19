package p520V5;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p329N3.RunnableC5611a;
import p779h6.AbstractC14413b;
import p779h6.ThreadFactoryC14414c;

/* JADX INFO: renamed from: V5.D */
/* JADX INFO: loaded from: classes.dex */
public final class C7766D {

    /* JADX INFO: renamed from: e */
    public static final ExecutorService f24543e = Executors.newCachedThreadPool(new ThreadFactoryC14414c());

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f24544a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f24545b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c */
    public final Handler f24546c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public volatile C7764B f24547d = null;

    public C7766D(C7781j c7781j) {
        m8037f(new C7764B(c7781j));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8032a(InterfaceC7797z interfaceC7797z) {
        Throwable th2;
        try {
            C7764B c7764b = this.f24547d;
            if (c7764b != null && (th2 = c7764b.f24540b) != null) {
                interfaceC7797z.onResult(th2);
            }
            this.f24545b.add(interfaceC7797z);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8033b(InterfaceC7797z interfaceC7797z) {
        C7781j c7781j;
        try {
            C7764B c7764b = this.f24547d;
            if (c7764b != null && (c7781j = c7764b.f24539a) != null) {
                interfaceC7797z.onResult(c7781j);
            }
            this.f24544a.add(interfaceC7797z);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8034c(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f24545b);
        if (arrayList.isEmpty()) {
            AbstractC14413b.m15914c("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC7797z) it.next()).onResult(th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8035d() {
        C7764B c7764b = this.f24547d;
        if (c7764b == null) {
            return;
        }
        C7781j c7781j = c7764b.f24539a;
        if (c7781j == null) {
            m8034c(c7764b.f24540b);
            return;
        }
        synchronized (this) {
            Iterator it = new ArrayList(this.f24544a).iterator();
            while (it.hasNext()) {
                ((InterfaceC7797z) it.next()).onResult(c7781j);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m8036e(C7780i c7780i) {
        this.f24545b.remove(c7780i);
    }

    /* JADX INFO: renamed from: f */
    public final void m8037f(C7764B c7764b) {
        if (this.f24547d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f24547d = c7764b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m8035d();
        } else {
            this.f24546c.post(new RunnableC5611a(this, 14));
        }
    }

    public C7766D(Callable callable, boolean z6) {
        if (z6) {
            try {
                m8037f((C7764B) callable.call());
                return;
            } catch (Throwable th2) {
                m8037f(new C7764B(th2));
                return;
            }
        }
        ExecutorService executorService = f24543e;
        C7765C c7765c = new C7765C(callable);
        c7765c.f24542Z = this;
        executorService.execute(c7765c);
    }
}
