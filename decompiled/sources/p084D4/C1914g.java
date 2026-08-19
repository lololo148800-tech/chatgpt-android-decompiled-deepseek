package p084D4;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import p1066vk.C20642j;
import p228J.AbstractC3794B0;
import p658b5.C11241l;
import p720e6.C13288c;
import p849k7.C16361n;

/* JADX INFO: renamed from: D4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1914g {

    /* JADX INFO: renamed from: h */
    public static final ExecutorC1912f f5596h = new ExecutorC1912f(0);

    /* JADX INFO: renamed from: a */
    public final C13288c f5597a;

    /* JADX INFO: renamed from: b */
    public final C11241l f5598b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC1912f f5599c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f5600d;

    /* JADX INFO: renamed from: e */
    public List f5601e;

    /* JADX INFO: renamed from: f */
    public List f5602f;

    /* JADX INFO: renamed from: g */
    public int f5603g;

    public C1914g(C20642j c20642j, C16361n c16361n) {
        C13288c c13288c = new C13288c(c20642j);
        synchronized (AbstractC1906c.f5571a) {
            try {
                if (AbstractC1906c.f5572b == null) {
                    AbstractC1906c.f5572b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C11241l c11241l = new C11241l(AbstractC1906c.f5572b, c16361n);
        this.f5600d = new CopyOnWriteArrayList();
        this.f5602f = Collections.emptyList();
        this.f5597a = c13288c;
        this.f5598b = c11241l;
        this.f5599c = f5596h;
    }

    /* JADX INFO: renamed from: a */
    public final void m3039a() {
        Iterator it = this.f5600d.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
    }
}
