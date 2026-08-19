package p523V9;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import p013Ab.C0420b;

/* JADX INFO: renamed from: V9.v6 */
/* JADX INFO: loaded from: classes.dex */
public final class C8216v6 implements InterfaceC8208u6 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f25670a;

    public C8216v6(Context context, C8200t6 c8200t6) {
        ArrayList arrayList = new ArrayList();
        this.f25670a = arrayList;
        c8200t6.getClass();
        arrayList.add(new C7847A6(context, c8200t6));
    }

    @Override // p523V9.InterfaceC8208u6
    /* JADX INFO: renamed from: a */
    public final void mo8104a(C0420b c0420b) {
        Iterator it = this.f25670a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8208u6) it.next()).mo8104a(c0420b);
        }
    }
}
