package p228J;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p138F8.vJO.vRJidSveZHcTw;
import p178H.InterfaceC3161o;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: J.X */
/* JADX INFO: loaded from: classes.dex */
public final class C3821X implements InterfaceC3161o {

    /* JADX INFO: renamed from: b */
    public final int f11573b;

    public C3821X(int i10) {
        this.f11573b = i10;
    }

    @Override // p178H.InterfaceC3161o
    /* JADX INFO: renamed from: a */
    public final C3830d mo3990a() {
        return InterfaceC3161o.f9508a;
    }

    @Override // p178H.InterfaceC3161o
    /* JADX INFO: renamed from: b */
    public final List mo3991b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC3866v interfaceC3866v = (InterfaceC3866v) it.next();
            AbstractC4941g.m5554M(vRJidSveZHcTw.osgEC, interfaceC3866v instanceof InterfaceC3866v);
            if (interfaceC3866v.mo141f() == this.f11573b) {
                arrayList.add(interfaceC3866v);
            }
        }
        return arrayList;
    }
}
