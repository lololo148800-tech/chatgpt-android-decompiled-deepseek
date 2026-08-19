package p026Ao;

import io.sentry.hints.C15370i;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.f */
/* JADX INFO: loaded from: classes2.dex */
public class C0672f extends C0665N {

    /* JADX INFO: renamed from: h */
    public static final ReentrantLock f1954h;

    /* JADX INFO: renamed from: i */
    public static final Condition f1955i;

    /* JADX INFO: renamed from: j */
    public static final long f1956j;

    /* JADX INFO: renamed from: k */
    public static final long f1957k;

    /* JADX INFO: renamed from: l */
    public static C0672f f1958l;

    /* JADX INFO: renamed from: e */
    public int f1959e;

    /* JADX INFO: renamed from: f */
    public C0672f f1960f;

    /* JADX INFO: renamed from: g */
    public long f1961g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f1954h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC16544l.m18093f(conditionNewCondition, "newCondition(...)");
        f1955i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f1956j = millis;
        f1957k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: i */
    public final void m1413i() {
        long j10 = this.f1940c;
        boolean z6 = this.f1938a;
        if (j10 != 0 || z6) {
            ReentrantLock reentrantLock = f1954h;
            reentrantLock.lock();
            try {
                if (this.f1959e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f1959e = 1;
                C15370i.m16623h(this, j10, z6);
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1414j() {
        ReentrantLock reentrantLock = f1954h;
        reentrantLock.lock();
        try {
            int i10 = this.f1959e;
            this.f1959e = 0;
            if (i10 != 1) {
                boolean z6 = i10 == 2;
                reentrantLock.unlock();
                return z6;
            }
            C0672f c0672f = f1958l;
            while (c0672f != null) {
                C0672f c0672f2 = c0672f.f1960f;
                if (c0672f2 == this) {
                    c0672f.f1960f = this.f1960f;
                    this.f1960f = null;
                    reentrantLock.unlock();
                    return false;
                }
                c0672f = c0672f2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo1385k() {
    }
}
