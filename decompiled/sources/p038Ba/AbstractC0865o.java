package p038Ba;

import ac.C10539a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p002A0.C0130g;
import p1060v9.AbstractC20502t;
import p110E4.C2307e;
import p233J4.C4262h;
import p349O0.C5997d;
import p501Ub.ExecutorC7613o;
import p501Ub.RunnableC7614p;
import p571X9.AbstractC9227W;
import p594Y9.C9895g4;
import p746fa.C13599h;
import p746fa.C13606o;
import p960q9.C18655i;

/* JADX INFO: renamed from: Ba.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0865o {

    /* JADX INFO: renamed from: a */
    public Object f2431a;

    /* JADX INFO: renamed from: b */
    public final Object f2432b;

    /* JADX INFO: renamed from: c */
    public Object f2433c;

    public /* synthetic */ AbstractC0865o(Object obj, Object obj2, String str) {
        this.f2431a = str;
        this.f2432b = obj;
        this.f2433c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public C4262h m1928a() {
        ((WorkDatabase) this.f2431a).m12338a();
        return ((AtomicBoolean) this.f2432b).compareAndSet(false, true) ? (C4262h) ((C17314q) this.f2433c).getValue() : m1931d();
    }

    /* JADX INFO: renamed from: b */
    public C13606o m1929b(Executor executor, Callable callable, C9895g4 c9895g4) {
        AbstractC20502t.m21160k(((AtomicInteger) this.f2432b).get() > 0);
        if (((C13606o) c9895g4.f29409Y).m15131j()) {
            C13606o c13606o = new C13606o();
            c13606o.m15136o();
            return c13606o;
        }
        C18655i c18655i = new C18655i(28);
        C13599h c13599h = new C13599h((C9895g4) c18655i.f59414Z);
        ((C2307e) this.f2431a).m3408t(new RunnableC7614p(this, c9895g4, c18655i, callable, c13599h), new ExecutorC7613o(executor, c9895g4, c18655i, c13599h));
        return c13599h.f42961a;
    }

    /* JADX INFO: renamed from: c */
    public void m1930c() {
        ((ArrayList) this.f2432b).clear();
        this.f2433c = this.f2431a;
        mo1939l();
    }

    /* JADX INFO: renamed from: d */
    public C4262h m1931d() {
        String strMo1932e = mo1932e();
        WorkDatabase workDatabase = (WorkDatabase) this.f2431a;
        workDatabase.getClass();
        workDatabase.m12338a();
        workDatabase.m12339b();
        return workDatabase.m12345h().mo4328d0().m5026k(strMo1932e);
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo1932e();

    /* JADX INFO: renamed from: f */
    public void m1933f(Object obj) {
        ((ArrayList) this.f2432b).add(this.f2433c);
        this.f2433c = obj;
    }

    /* JADX INFO: renamed from: g */
    public Object m1934g() {
        return this.f2433c;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1935h(int i10, Object obj);

    /* JADX INFO: renamed from: i */
    public abstract void mo1936i(int i10, Object obj);

    /* JADX INFO: renamed from: j */
    public abstract void mo1937j();

    /* JADX INFO: renamed from: k */
    public abstract void mo1938k(int i10, int i11, int i12);

    /* JADX INFO: renamed from: l */
    public abstract void mo1939l();

    /* JADX INFO: renamed from: m */
    public void mo1940m() {
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo1941n();

    /* JADX INFO: renamed from: o */
    public void m1942o(C4262h statement) {
        AbstractC16544l.m18094g(statement, "statement");
        if (statement == ((C4262h) ((C17314q) this.f2433c).getValue())) {
            ((AtomicBoolean) this.f2432b).set(false);
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1943p(int i10, int i11);

    /* JADX INFO: renamed from: q */
    public abstract Object mo1944q(C10539a c10539a);

    /* JADX INFO: renamed from: r */
    public void m1945r() {
        ArrayList arrayList = (ArrayList) this.f2432b;
        if (arrayList.isEmpty()) {
            C5997d.m6445c0("empty stack");
            throw null;
        }
        this.f2433c = arrayList.remove(arrayList.size() - 1);
    }

    public AbstractC0865o(C2307e c2307e) {
        this.f2432b = new AtomicInteger(0);
        this.f2433c = new AtomicBoolean(false);
        this.f2431a = c2307e;
    }

    public AbstractC0865o(WorkDatabase database) {
        AbstractC16544l.m18094g(database, "database");
        this.f2431a = database;
        this.f2432b = new AtomicBoolean(false);
        this.f2433c = AbstractC9227W.m9800c(new C0130g(this, 18));
    }

    public AbstractC0865o(int i10) {
        switch (i10) {
            case 3:
                this.f2432b = new AtomicInteger(0);
                this.f2433c = new AtomicBoolean(false);
                this.f2431a = new C2307e(6, (byte) 0);
                break;
            default:
                this.f2432b = new float[2];
                this.f2433c = new int[1];
                break;
        }
    }

    public AbstractC0865o(Object obj) {
        this.f2431a = obj;
        this.f2432b = new ArrayList();
        this.f2433c = obj;
    }
}
