package p544W9;

import android.content.Context;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: W9.L4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8514L4 implements InterfaceC8508K4 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f26332a;

    public C8514L4(Context context, C8502J4 c8502j4) {
        ArrayList arrayList = new ArrayList();
        this.f26332a = arrayList;
        c8502j4.getClass();
        arrayList.add(new C8526N4(context, c8502j4));
    }

    @Override // p544W9.InterfaceC8508K4
    /* JADX INFO: renamed from: a */
    public final void mo9170a(C15358g1 c15358g1) {
        Iterator it = this.f26332a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8508K4) it.next()).mo9170a(c15358g1);
        }
    }
}
