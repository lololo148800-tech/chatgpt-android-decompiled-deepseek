package p474T8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p349O0.C5944C;
import p349O0.C5997d;
import p571X9.AbstractC9196Q3;
import p841k.AbstractC16283c;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: T8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7265c implements InterfaceC7263a {

    /* JADX INFO: renamed from: Y */
    public final List f23037Y;

    /* JADX INFO: renamed from: Z */
    public final List f23038Z;

    /* JADX INFO: renamed from: o0 */
    public final C5944C f23039o0;

    /* JADX INFO: renamed from: p0 */
    public final C5944C f23040p0;

    /* JADX INFO: renamed from: q0 */
    public final C5944C f23041q0;

    /* JADX INFO: renamed from: r0 */
    public AbstractC16283c f23042r0;

    public C7265c(List list) {
        this.f23037Y = list;
        this.f23038Z = list;
        final int i10 = 0;
        this.f23039o0 = C5997d.m6421H(new InterfaceC1426a(this) { // from class: T8.b

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C7265c f23036Z;

            {
                this.f23036Z = this;
            }

            /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                boolean z6;
                boolean z10;
                switch (i10) {
                    case 0:
                        List list2 = this.f23036Z.f23038Z;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!AbstractC16544l.m18089b(((InterfaceC7269g) obj).mo7726a(), C7271i.f23054a)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        C7265c c7265c = this.f23036Z;
                        List list3 = c7265c.f23038Z;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z6 = true;
                        } else {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                InterfaceC7272j interfaceC7272jMo7726a = ((InterfaceC7269g) it.next()).mo7726a();
                                AbstractC16544l.m18094g(interfaceC7272jMo7726a, "<this>");
                                if (!interfaceC7272jMo7726a.equals(C7271i.f23054a)) {
                                    if (c7265c.mo7723d().isEmpty()) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                            }
                            z6 = true;
                        }
                        return Boolean.valueOf(z6);
                    default:
                        C7265c c7265c2 = this.f23036Z;
                        List list4 = c7265c2.f23038Z;
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            z10 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC9196Q3.m9763e(((InterfaceC7269g) it2.next()).mo7726a())) {
                                    List list5 = c7265c2.f23038Z;
                                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                        Iterator it3 = list5.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                InterfaceC7269g interfaceC7269g = (InterfaceC7269g) it3.next();
                                                InterfaceC7272j interfaceC7272jMo7726a2 = interfaceC7269g.mo7726a();
                                                AbstractC16544l.m18094g(interfaceC7272jMo7726a2, "<this>");
                                                if (!interfaceC7272jMo7726a2.equals(C7271i.f23054a) && !AbstractC9196Q3.m9763e(interfaceC7269g.mo7726a())) {
                                                    z10 = false;
                                                }
                                            }
                                        }
                                    }
                                    z10 = true;
                                }
                            }
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        });
        final int i11 = 1;
        this.f23040p0 = C5997d.m6421H(new InterfaceC1426a(this) { // from class: T8.b

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C7265c f23036Z;

            {
                this.f23036Z = this;
            }

            /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                boolean z6;
                boolean z10;
                switch (i11) {
                    case 0:
                        List list2 = this.f23036Z.f23038Z;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!AbstractC16544l.m18089b(((InterfaceC7269g) obj).mo7726a(), C7271i.f23054a)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        C7265c c7265c = this.f23036Z;
                        List list3 = c7265c.f23038Z;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z6 = true;
                        } else {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                InterfaceC7272j interfaceC7272jMo7726a = ((InterfaceC7269g) it.next()).mo7726a();
                                AbstractC16544l.m18094g(interfaceC7272jMo7726a, "<this>");
                                if (!interfaceC7272jMo7726a.equals(C7271i.f23054a)) {
                                    if (c7265c.mo7723d().isEmpty()) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                            }
                            z6 = true;
                        }
                        return Boolean.valueOf(z6);
                    default:
                        C7265c c7265c2 = this.f23036Z;
                        List list4 = c7265c2.f23038Z;
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            z10 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC9196Q3.m9763e(((InterfaceC7269g) it2.next()).mo7726a())) {
                                    List list5 = c7265c2.f23038Z;
                                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                        Iterator it3 = list5.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                InterfaceC7269g interfaceC7269g = (InterfaceC7269g) it3.next();
                                                InterfaceC7272j interfaceC7272jMo7726a2 = interfaceC7269g.mo7726a();
                                                AbstractC16544l.m18094g(interfaceC7272jMo7726a2, "<this>");
                                                if (!interfaceC7272jMo7726a2.equals(C7271i.f23054a) && !AbstractC9196Q3.m9763e(interfaceC7269g.mo7726a())) {
                                                    z10 = false;
                                                }
                                            }
                                        }
                                    }
                                    z10 = true;
                                }
                            }
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        });
        final int i12 = 2;
        this.f23041q0 = C5997d.m6421H(new InterfaceC1426a(this) { // from class: T8.b

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C7265c f23036Z;

            {
                this.f23036Z = this;
            }

            /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                boolean z6;
                boolean z10;
                switch (i12) {
                    case 0:
                        List list2 = this.f23036Z.f23038Z;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!AbstractC16544l.m18089b(((InterfaceC7269g) obj).mo7726a(), C7271i.f23054a)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        C7265c c7265c = this.f23036Z;
                        List list3 = c7265c.f23038Z;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z6 = true;
                        } else {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                InterfaceC7272j interfaceC7272jMo7726a = ((InterfaceC7269g) it.next()).mo7726a();
                                AbstractC16544l.m18094g(interfaceC7272jMo7726a, "<this>");
                                if (!interfaceC7272jMo7726a.equals(C7271i.f23054a)) {
                                    if (c7265c.mo7723d().isEmpty()) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                            }
                            z6 = true;
                        }
                        return Boolean.valueOf(z6);
                    default:
                        C7265c c7265c2 = this.f23036Z;
                        List list4 = c7265c2.f23038Z;
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            z10 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC9196Q3.m9763e(((InterfaceC7269g) it2.next()).mo7726a())) {
                                    List list5 = c7265c2.f23038Z;
                                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                        Iterator it3 = list5.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                InterfaceC7269g interfaceC7269g = (InterfaceC7269g) it3.next();
                                                InterfaceC7272j interfaceC7272jMo7726a2 = interfaceC7269g.mo7726a();
                                                AbstractC16544l.m18094g(interfaceC7272jMo7726a2, "<this>");
                                                if (!interfaceC7272jMo7726a2.equals(C7271i.f23054a) && !AbstractC9196Q3.m9763e(interfaceC7269g.mo7726a())) {
                                                    z10 = false;
                                                }
                                            }
                                        }
                                    }
                                    z10 = true;
                                }
                            }
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        });
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: a */
    public final List mo7721a() {
        return this.f23038Z;
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: b */
    public final boolean mo7722b() {
        return ((Boolean) this.f23041q0.getValue()).booleanValue();
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: d */
    public final List mo7723d() {
        return (List) this.f23039o0.getValue();
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: g */
    public final boolean mo7724g() {
        return ((Boolean) this.f23040p0.getValue()).booleanValue();
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: j */
    public final void mo7725j() {
        AbstractC16283c abstractC16283c = this.f23042r0;
        if (abstractC16283c == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
        List list = this.f23038Z;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC7269g) it.next()).mo7728c());
        }
        abstractC16283c.mo10188b(arrayList.toArray(new String[0]));
    }
}
