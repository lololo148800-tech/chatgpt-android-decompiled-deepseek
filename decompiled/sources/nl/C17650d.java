package nl;

import java.util.ArrayList;
import java.util.List;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: nl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C17650d extends AbstractC17649c implements InterfaceC17648b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f56437a;

    public C17650d(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C17650d) {
                AbstractC17686t.m19398v(((InterfaceC17648b) obj).mo19241a(), arrayList);
            } else {
                arrayList.add(obj);
            }
        }
        this.f56437a = arrayList;
    }

    @Override // nl.InterfaceC17648b
    /* JADX INFO: renamed from: a */
    public final List mo19241a() {
        return this.f56437a;
    }
}
