package p232J3;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p083D3.C1875m;
import p1016t3.AbstractC19764N;
import p1016t3.C19797x;
import p1073w3.AbstractC20800b;
import p1142z3.InterfaceC21730C;
import p133F3.C2657c;
import p133F3.C2658d;
import p133F3.InterfaceC2659e;
import p305M3.C5285e;

/* JADX INFO: renamed from: J3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4226a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f13807a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f13808b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final C2658d f13809c;

    /* JADX INFO: renamed from: d */
    public final C2658d f13810d;

    /* JADX INFO: renamed from: e */
    public Looper f13811e;

    /* JADX INFO: renamed from: f */
    public AbstractC19764N f13812f;

    /* JADX INFO: renamed from: g */
    public C1875m f13813g;

    public AbstractC4226a() {
        int i10 = 0;
        C4253y c4253y = null;
        this.f13809c = new C2658d(new CopyOnWriteArrayList(), i10, c4253y);
        this.f13810d = new C2658d(new CopyOnWriteArrayList(), i10, c4253y);
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC4251w mo4929a(C4253y c4253y, C5285e c5285e, long j10);

    /* JADX INFO: renamed from: b */
    public final void m4988b(InterfaceC4254z interfaceC4254z) {
        HashSet hashSet = this.f13808b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC4254z);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo4989c();
    }

    /* JADX INFO: renamed from: d */
    public final void m4990d(InterfaceC4254z interfaceC4254z) {
        this.f13811e.getClass();
        HashSet hashSet = this.f13808b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC4254z);
        if (zIsEmpty) {
            mo4991e();
        }
    }

    /* JADX INFO: renamed from: f */
    public AbstractC19764N mo4992f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract C19797x mo4930g();

    /* JADX INFO: renamed from: h */
    public boolean mo4993h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo4931i();

    /* JADX INFO: renamed from: j */
    public final void m4994j(InterfaceC4254z interfaceC4254z, InterfaceC21730C interfaceC21730C, C1875m c1875m) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f13811e;
        AbstractC20800b.m21316d(looper == null || looper == looperMyLooper);
        this.f13813g = c1875m;
        AbstractC19764N abstractC19764N = this.f13812f;
        this.f13807a.add(interfaceC4254z);
        if (this.f13811e == null) {
            this.f13811e = looperMyLooper;
            this.f13808b.add(interfaceC4254z);
            mo4932k(interfaceC21730C);
        } else if (abstractC19764N != null) {
            m4990d(interfaceC4254z);
            interfaceC4254z.mo2360a(this, abstractC19764N);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo4932k(InterfaceC21730C interfaceC21730C);

    /* JADX INFO: renamed from: l */
    public final void m4995l(AbstractC19764N abstractC19764N) {
        this.f13812f = abstractC19764N;
        Iterator it = this.f13807a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4254z) it.next()).mo2360a(this, abstractC19764N);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo4933m(InterfaceC4251w interfaceC4251w);

    /* JADX INFO: renamed from: n */
    public final void m4996n(InterfaceC4254z interfaceC4254z) {
        ArrayList arrayList = this.f13807a;
        arrayList.remove(interfaceC4254z);
        if (!arrayList.isEmpty()) {
            m4988b(interfaceC4254z);
            return;
        }
        this.f13811e = null;
        this.f13812f = null;
        this.f13813g = null;
        this.f13808b.clear();
        mo4934o();
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo4934o();

    /* JADX INFO: renamed from: p */
    public final void m4997p(InterfaceC2659e interfaceC2659e) {
        CopyOnWriteArrayList<C2657c> copyOnWriteArrayList = this.f13810d.f8170c;
        for (C2657c c2657c : copyOnWriteArrayList) {
            if (c2657c.f8167a == interfaceC2659e) {
                copyOnWriteArrayList.remove(c2657c);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m4998q(InterfaceC4203C interfaceC4203C) {
        CopyOnWriteArrayList<C4202B> copyOnWriteArrayList = this.f13809c.f8170c;
        for (C4202B c4202b : copyOnWriteArrayList) {
            if (c4202b.f13658b == interfaceC4203C) {
                copyOnWriteArrayList.remove(c4202b);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo4935r(C19797x c19797x);

    /* JADX INFO: renamed from: c */
    public void mo4989c() {
    }

    /* JADX INFO: renamed from: e */
    public void mo4991e() {
    }
}
