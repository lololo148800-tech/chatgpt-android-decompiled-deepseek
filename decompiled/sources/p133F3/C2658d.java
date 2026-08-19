package p133F3;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A.RunnableC0066i;
import p057C3.RunnableC1543V;
import p1073w3.AbstractC20817s;
import p232J3.C4202B;
import p232J3.C4244p;
import p232J3.C4249u;
import p232J3.C4253y;
import p232J3.RunnableC4201A;

/* JADX INFO: renamed from: F3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2658d {

    /* JADX INFO: renamed from: a */
    public final int f8168a;

    /* JADX INFO: renamed from: b */
    public final C4253y f8169b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f8170c;

    public /* synthetic */ C2658d(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C4253y c4253y) {
        this.f8170c = copyOnWriteArrayList;
        this.f8168a = i10;
        this.f8169b = c4253y;
    }

    /* JADX INFO: renamed from: a */
    public void m3628a(C4249u c4249u) {
        for (C4202B c4202b : this.f8170c) {
            AbstractC20817s.m21393G(c4202b.f13657a, new RunnableC0066i(this, c4202b.f13658b, c4249u, 10));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [J3.C, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public void m3629b(C4244p c4244p, C4249u c4249u) {
        for (C4202B c4202b : this.f8170c) {
            AbstractC20817s.m21393G(c4202b.f13657a, new RunnableC4201A(this, c4202b.f13658b, c4244p, c4249u, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [J3.C, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public void m3630c(C4244p c4244p, C4249u c4249u) {
        for (C4202B c4202b : this.f8170c) {
            AbstractC20817s.m21393G(c4202b.f13657a, new RunnableC4201A(this, c4202b.f13658b, c4244p, c4249u, 1));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3631d(C4244p c4244p, C4249u c4249u, IOException iOException, boolean z6) {
        for (C4202B c4202b : this.f8170c) {
            AbstractC20817s.m21393G(c4202b.f13657a, new RunnableC1543V(this, c4202b.f13658b, c4244p, c4249u, iOException, z6, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [J3.C, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public void m3632e(C4244p c4244p, C4249u c4249u) {
        for (C4202B c4202b : this.f8170c) {
            AbstractC20817s.m21393G(c4202b.f13657a, new RunnableC4201A(this, c4202b.f13658b, c4244p, c4249u, 0));
        }
    }
}
