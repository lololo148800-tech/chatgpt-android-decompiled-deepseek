package p567X5;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p001A.AbstractC0010F;
import p591Y5.C9664o;
import p675c6.C11672g;

/* JADX INFO: renamed from: X5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9062l implements InterfaceC9063m, InterfaceC9060j {

    /* JADX INFO: renamed from: a */
    public final Path f27710a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f27711b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f27712c = new Path();

    /* JADX INFO: renamed from: d */
    public final ArrayList f27713d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final C11672g f27714e;

    public C9062l(C11672g c11672g) {
        c11672g.getClass();
        this.f27714e = c11672g;
    }

    /* JADX INFO: renamed from: a */
    public final void m9623a(Path.Op op2) {
        Matrix matrixM10252e;
        Matrix matrixM10252e2;
        Path path = this.f27711b;
        path.reset();
        Path path2 = this.f27710a;
        path2.reset();
        ArrayList arrayList = this.f27713d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            InterfaceC9063m interfaceC9063m = (InterfaceC9063m) arrayList.get(size);
            if (interfaceC9063m instanceof C9054d) {
                C9054d c9054d = (C9054d) interfaceC9063m;
                ArrayList arrayList2 = (ArrayList) c9054d.m9616d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathMo9617n = ((InterfaceC9063m) arrayList2.get(size2)).mo9617n();
                    C9664o c9664o = c9054d.f27656k;
                    if (c9664o != null) {
                        matrixM10252e2 = c9664o.m10252e();
                    } else {
                        matrixM10252e2 = c9054d.f27648c;
                        matrixM10252e2.reset();
                    }
                    pathMo9617n.transform(matrixM10252e2);
                    path.addPath(pathMo9617n);
                }
            } else {
                path.addPath(interfaceC9063m.mo9617n());
            }
        }
        int i10 = 0;
        InterfaceC9063m interfaceC9063m2 = (InterfaceC9063m) arrayList.get(0);
        if (interfaceC9063m2 instanceof C9054d) {
            C9054d c9054d2 = (C9054d) interfaceC9063m2;
            List listM9616d = c9054d2.m9616d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listM9616d;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path pathMo9617n2 = ((InterfaceC9063m) arrayList3.get(i10)).mo9617n();
                C9664o c9664o2 = c9054d2.f27656k;
                if (c9664o2 != null) {
                    matrixM10252e = c9664o2.m10252e();
                } else {
                    matrixM10252e = c9054d2.f27648c;
                    matrixM10252e.reset();
                }
                pathMo9617n2.transform(matrixM10252e);
                path2.addPath(pathMo9617n2);
                i10++;
            }
        } else {
            path2.set(interfaceC9063m2.mo9617n());
        }
        this.f27712c.op(path2, path, op2);
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27713d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((InterfaceC9063m) arrayList.get(i10)).mo9611b(list, list2);
            i10++;
        }
    }

    @Override // p567X5.InterfaceC9060j
    /* JADX INFO: renamed from: d */
    public final void mo9622d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) listIterator.previous();
            if (interfaceC9053c instanceof InterfaceC9063m) {
                this.f27713d.add((InterfaceC9063m) interfaceC9053c);
                listIterator.remove();
            }
        }
    }

    @Override // p567X5.InterfaceC9063m
    /* JADX INFO: renamed from: n */
    public final Path mo9617n() {
        Path path = this.f27712c;
        path.reset();
        C11672g c11672g = this.f27714e;
        if (c11672g.f35359b) {
            return path;
        }
        int iM24h = AbstractC0010F.m24h(c11672g.f35358a);
        if (iM24h == 0) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f27713d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                path.addPath(((InterfaceC9063m) arrayList.get(i10)).mo9617n());
                i10++;
            }
        } else if (iM24h == 1) {
            m9623a(Path.Op.UNION);
        } else if (iM24h == 2) {
            m9623a(Path.Op.REVERSE_DIFFERENCE);
        } else if (iM24h == 3) {
            m9623a(Path.Op.INTERSECT);
        } else if (iM24h == 4) {
            m9623a(Path.Op.XOR);
        }
        return path;
    }
}
