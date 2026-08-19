package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p003A1.C0284r0;
import p1022t9.InterfaceC19827l;
import p1036u9.C20167m;
import p1036u9.C20173s;
import p1036u9.HandlerC20158d;
import p1060v9.AbstractC20502t;
import p523V9.AbstractC8230x4;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC19827l> extends AbstractC8230x4 {

    /* JADX INFO: renamed from: j */
    public static final C0284r0 f36056j = new C0284r0(14);

    /* JADX INFO: renamed from: e */
    public InterfaceC19827l f36061e;

    /* JADX INFO: renamed from: f */
    public Status f36062f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f36063g;

    /* JADX INFO: renamed from: h */
    public boolean f36064h;

    /* JADX INFO: renamed from: a */
    public final Object f36057a = new Object();

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f36058b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public final ArrayList f36059c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f36060d = new AtomicReference();

    /* JADX INFO: renamed from: i */
    public boolean f36065i = false;

    public BasePendingResult(C20173s c20173s) {
        new HandlerC20158d(c20173s != null ? c20173s.f63899b.f62879f : Looper.getMainLooper(), 0);
        new WeakReference(c20173s);
    }

    /* JADX INFO: renamed from: c */
    public final void m13183c(C20167m c20167m) {
        synchronized (this.f36057a) {
            try {
                if (m13186f()) {
                    c20167m.m20985a(this.f36062f);
                } else {
                    this.f36059c.add(c20167m);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC19827l mo13184d(Status status);

    /* JADX INFO: renamed from: e */
    public final void m13185e(Status status) {
        synchronized (this.f36057a) {
            try {
                if (!m13186f()) {
                    m13187g(mo13184d(status));
                    this.f36064h = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13186f() {
        return this.f36058b.getCount() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m13187g(InterfaceC19827l interfaceC19827l) {
        synchronized (this.f36057a) {
            try {
                if (this.f36064h) {
                    return;
                }
                m13186f();
                AbstractC20502t.m21159j("Results have already been set", !m13186f());
                AbstractC20502t.m21159j("Result has already been consumed", !this.f36063g);
                this.f36061e = interfaceC19827l;
                this.f36062f = interfaceC19827l.mo12680a();
                this.f36058b.countDown();
                ArrayList arrayList = this.f36059c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C20167m) arrayList.get(i10)).m20985a(this.f36062f);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
