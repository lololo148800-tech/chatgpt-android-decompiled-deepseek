package p571X9;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import p013Ab.C0420b;

/* JADX INFO: renamed from: X9.J4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9155J4 implements InterfaceC9167L4 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f27930a;

    public C9155J4(Context context, C9149I4 c9149i4) {
        ArrayList arrayList = new ArrayList();
        this.f27930a = arrayList;
        c9149i4.getClass();
        arrayList.add(new C9179N4(context, c9149i4));
    }

    @Override // p571X9.InterfaceC9167L4
    /* JADX INFO: renamed from: a */
    public final void mo9704a(C0420b c0420b) {
        Iterator it = this.f27930a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9167L4) it.next()).mo9704a(c0420b);
        }
    }
}
