package p033B5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm.C17309l;
import p1018t5.C19801a;
import p111E5.InterfaceC2326j;
import p160G5.InterfaceC3000f;
import p225Im.InterfaceC3756d;
import p234J5.C4263a;
import p864l5.C16815b;
import p909nm.AbstractC17680n;
import p958q5.InterfaceC18631f;

/* JADX INFO: renamed from: B5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0822f {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2292a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2293b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2294c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f2295d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f2296e;

    public C0822f(C16815b c16815b) {
        this.f2292a = AbstractC17680n.m19323D0(c16815b.f53952a);
        this.f2293b = AbstractC17680n.m19323D0(c16815b.f53953b);
        this.f2294c = AbstractC17680n.m19323D0(c16815b.f53954c);
        this.f2295d = AbstractC17680n.m19323D0(c16815b.f53955d);
        this.f2296e = AbstractC17680n.m19323D0(c16815b.f53956e);
    }

    /* JADX INFO: renamed from: a */
    public void m1879a(InterfaceC3000f interfaceC3000f, InterfaceC3756d interfaceC3756d) {
        this.f2295d.add(new C0821e(interfaceC3000f, 0, interfaceC3756d));
    }

    /* JADX INFO: renamed from: b */
    public void m1880b(C4263a c4263a, InterfaceC3756d interfaceC3756d) {
        this.f2293b.add(new C17309l(c4263a, interfaceC3756d));
    }

    /* JADX INFO: renamed from: c */
    public void m1881c(InterfaceC18631f interfaceC18631f, Class cls) {
        this.f2295d.add(new C17309l(interfaceC18631f, cls));
    }

    /* JADX INFO: renamed from: d */
    public void m1882d(C19801a c19801a, Class cls) {
        this.f2293b.add(new C17309l(c19801a, cls));
    }

    public C0822f(C0823g c0823g) {
        this.f2292a = AbstractC17680n.m19323D0(c0823g.f2297a);
        this.f2293b = AbstractC17680n.m19323D0(c0823g.f2298b);
        this.f2294c = AbstractC17680n.m19323D0(c0823g.f2299c);
        List list = (List) c0823g.f2302f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0819c((C17309l) it.next(), 0));
        }
        this.f2295d = arrayList;
        List list2 = (List) c0823g.f2303g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C0820d((InterfaceC2326j) it2.next(), 0));
        }
        this.f2296e = arrayList2;
    }
}
