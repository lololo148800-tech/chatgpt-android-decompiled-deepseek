package com.auth0.android.request.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import p087D7.AbstractC1976c;
import p1035u7.C20144b;
import p109E3.RunnableC2301y;
import p1100x7.InterfaceC21155a;
import p523V9.AbstractC8143m5;
import p569X7.EnumC9072a;

/* JADX INFO: renamed from: com.auth0.android.request.internal.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11846e implements InterfaceC21155a {

    /* JADX INFO: renamed from: Y */
    public final Object f35977Y;

    /* JADX INFO: renamed from: Z */
    public volatile Object f35978Z;

    public C11846e(int i10) {
        switch (i10) {
            case 1:
                this.f35977Y = new CopyOnWriteArraySet();
                break;
            case 2:
                EnumC9072a enumC9072a = EnumC9072a.f27785o0;
                this.f35977Y = new LinkedList();
                this.f35978Z = enumC9072a;
                break;
            default:
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
                AbstractC16544l.m18093f(executorServiceNewFixedThreadPool, "newFixedThreadPool(MAX_CONCURRENT_THREADS)");
                this.f35977Y = executorServiceNewFixedThreadPool;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13162a(Runnable runnable) {
        if (((Handler) this.f35978Z) == null) {
            synchronized (this) {
                if (((Handler) this.f35978Z) == null) {
                    Looper mainLooper = Looper.getMainLooper();
                    AbstractC16544l.m18093f(mainLooper, "getMainLooper()");
                    Handler handlerM8678a = AbstractC8143m5.m8678a(mainLooper);
                    AbstractC16544l.m18093f(handlerM8678a, "createAsync(looper)");
                    this.f35978Z = handlerM8678a;
                }
            }
        }
        Handler handler = (Handler) this.f35978Z;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: c */
    public synchronized void mo13163c() {
        ((LinkedList) this.f35977Y).clear();
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: h */
    public EnumC9072a mo13164h() {
        return (EnumC9072a) this.f35978Z;
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: i */
    public synchronized void mo13165i() {
        EnumC9072a enumC9072a = EnumC9072a.f27783Y;
        synchronized (this) {
            if (enumC9072a == ((EnumC9072a) this.f35978Z)) {
                return;
            }
            EnumC9072a previousConsent = (EnumC9072a) this.f35978Z;
            this.f35978Z = enumC9072a;
            for (C20144b c20144b : (LinkedList) this.f35977Y) {
                c20144b.getClass();
                EnumC9072a enumC9072a2 = EnumC9072a.f27783Y;
                AbstractC16544l.m18094g(previousConsent, "previousConsent");
                AbstractC1976c.m3152i(c20144b.f63810p0, "Data migration", c20144b.f63811q0, new RunnableC2301y(c20144b, previousConsent, c20144b.m20962a(previousConsent), enumC9072a2, c20144b.m20962a(enumC9072a2), 4));
            }
        }
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: j */
    public synchronized void mo13166j(C20144b c20144b) {
        ((LinkedList) this.f35977Y).add(c20144b);
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: k */
    public synchronized void mo13167k(C20144b c20144b) {
        ((LinkedList) this.f35977Y).remove(c20144b);
    }
}
