package p185H6;

import bj.InterfaceC11470q;
import java.util.ArrayList;
import p658b5.C11238i;

/* JADX INFO: renamed from: H6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3246b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f9889a;

    /* JADX INFO: renamed from: b */
    public int f9890b;

    public C3246b(int i10, ArrayList arrayList) {
        this.f9889a = arrayList;
        this.f9890b = i10;
    }

    /* JADX INFO: renamed from: a */
    public void m4134a(InterfaceC11470q interfaceC11470q) {
        if (interfaceC11470q == null) {
            throw new IllegalArgumentException("factory == null");
        }
        ArrayList arrayList = this.f9889a;
        int i10 = this.f9890b;
        this.f9890b = i10 + 1;
        arrayList.add(i10, interfaceC11470q);
    }

    /* JADX INFO: renamed from: b */
    public boolean m4135b() {
        return this.f9890b < this.f9889a.size();
    }

    /* JADX INFO: renamed from: c */
    public Object m4136c(C11238i c11238i, C3252h c3252h) {
        ArrayList arrayList = this.f9889a;
        int size = arrayList.size();
        int i10 = this.f9890b;
        if (i10 < size) {
            return ((InterfaceC3250f) arrayList.get(i10)).mo4133a(c11238i, new C3246b(i10 + 1, arrayList), c3252h);
        }
        throw new IllegalStateException("Check failed.");
    }

    public C3246b(ArrayList arrayList) {
        this.f9889a = arrayList;
    }

    public C3246b() {
        this.f9889a = new ArrayList();
        this.f9890b = 0;
    }
}
