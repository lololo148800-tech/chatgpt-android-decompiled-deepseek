package p953q0;

import java.util.Comparator;
import p165G9.AbstractC3021g;

/* JADX INFO: renamed from: q0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C18550H implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59109Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC18556N f59110Z;

    public /* synthetic */ C18550H(InterfaceC18556N interfaceC18556N, int i10) {
        this.f59109Y = i10;
        this.f59110Z = interfaceC18556N;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f59109Y) {
            case 0:
                Object key = ((InterfaceC18559Q) obj).getKey();
                InterfaceC18556N interfaceC18556N = this.f59110Z;
                return AbstractC3021g.m3873a(Integer.valueOf(interfaceC18556N.mo1046a(key)), Integer.valueOf(interfaceC18556N.mo1046a(((InterfaceC18559Q) obj2).getKey())));
            case 1:
                Object key2 = ((InterfaceC18559Q) obj).getKey();
                InterfaceC18556N interfaceC18556N2 = this.f59110Z;
                return AbstractC3021g.m3873a(Integer.valueOf(interfaceC18556N2.mo1046a(key2)), Integer.valueOf(interfaceC18556N2.mo1046a(((InterfaceC18559Q) obj2).getKey())));
            case 2:
                Object key3 = ((InterfaceC18559Q) obj2).getKey();
                InterfaceC18556N interfaceC18556N3 = this.f59110Z;
                return AbstractC3021g.m3873a(Integer.valueOf(interfaceC18556N3.mo1046a(key3)), Integer.valueOf(interfaceC18556N3.mo1046a(((InterfaceC18559Q) obj).getKey())));
            default:
                Object key4 = ((InterfaceC18559Q) obj2).getKey();
                InterfaceC18556N interfaceC18556N4 = this.f59110Z;
                return AbstractC3021g.m3873a(Integer.valueOf(interfaceC18556N4.mo1046a(key4)), Integer.valueOf(interfaceC18556N4.mo1046a(((InterfaceC18559Q) obj).getKey())));
        }
    }
}
