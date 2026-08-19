package p033B5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.C17314q;
import p049Bm.InterfaceC1426a;
import p160G5.InterfaceC3000f;
import p160G5.InterfaceC3001g;
import p225Im.InterfaceC3756d;
import p374P5.C6361n;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: renamed from: B5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0823g {

    /* JADX INFO: renamed from: a */
    public final List f2297a;

    /* JADX INFO: renamed from: b */
    public final List f2298b;

    /* JADX INFO: renamed from: c */
    public final List f2299c;

    /* JADX INFO: renamed from: d */
    public List f2300d;

    /* JADX INFO: renamed from: e */
    public List f2301e;

    /* JADX INFO: renamed from: f */
    public final C17314q f2302f;

    /* JADX INFO: renamed from: g */
    public final C17314q f2303g;

    public C0823g(List list, List list2, List list3, List list4, List list5) {
        this.f2297a = list;
        this.f2298b = list2;
        this.f2299c = list3;
        this.f2300d = list4;
        this.f2301e = list5;
        final int i10 = 0;
        this.f2302f = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: B5.b

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C0823g f2284Z;

            {
                this.f2284Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        C0823g c0823g = this.f2284Z;
                        List list6 = c0823g.f2300d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            AbstractC17686t.m19398v((List) ((InterfaceC1426a) list6.get(i11)).invoke(), arrayList);
                        }
                        c0823g.f2300d = C17689w.f56480Y;
                        return arrayList;
                    default:
                        C0823g c0823g2 = this.f2284Z;
                        List list7 = c0823g2.f2301e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            AbstractC17686t.m19398v((List) ((InterfaceC1426a) list7.get(i12)).invoke(), arrayList2);
                        }
                        c0823g2.f2301e = C17689w.f56480Y;
                        return arrayList2;
                }
            }
        });
        final int i11 = 1;
        this.f2303g = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: B5.b

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C0823g f2284Z;

            {
                this.f2284Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        C0823g c0823g = this.f2284Z;
                        List list6 = c0823g.f2300d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            AbstractC17686t.m19398v((List) ((InterfaceC1426a) list6.get(i12)).invoke(), arrayList);
                        }
                        c0823g.f2300d = C17689w.f56480Y;
                        return arrayList;
                    default:
                        C0823g c0823g2 = this.f2284Z;
                        List list7 = c0823g2.f2301e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            AbstractC17686t.m19398v((List) ((InterfaceC1426a) list7.get(i13)).invoke(), arrayList2);
                        }
                        c0823g2.f2301e = C17689w.f56480Y;
                        return arrayList2;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final C17309l m1883a(Object obj, C6361n c6361n, C0840x c0840x, int i10) {
        C17314q c17314q = this.f2302f;
        int size = ((List) c17314q.getValue()).size();
        while (i10 < size) {
            C17309l c17309l = (C17309l) ((List) c17314q.getValue()).get(i10);
            InterfaceC3000f interfaceC3000f = (InterfaceC3000f) c17309l.f55136Y;
            if (((InterfaceC3756d) c17309l.f55137Z).mo4449e(obj)) {
                AbstractC16544l.m18092e(interfaceC3000f, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                InterfaceC3001g interfaceC3001gMo3828a = interfaceC3000f.mo3828a(obj, c6361n, c0840x);
                if (interfaceC3001gMo3828a != null) {
                    return new C17309l(interfaceC3001gMo3828a, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }
}
