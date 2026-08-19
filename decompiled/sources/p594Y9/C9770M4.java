package p594Y9;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import p013Ab.C0420b;

/* JADX INFO: renamed from: Y9.M4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9770M4 implements InterfaceC9782O4 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f29292a;

    public C9770M4(Context context, C9764L4 c9764l4) {
        ArrayList arrayList = new ArrayList();
        this.f29292a = arrayList;
        c9764l4.getClass();
        arrayList.add(new C9794Q4(context, c9764l4));
    }

    @Override // p594Y9.InterfaceC9782O4
    /* JADX INFO: renamed from: a */
    public final void mo10376a(C0420b c0420b) {
        Iterator it = this.f29292a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9782O4) it.next()).mo10376a(c0420b);
        }
    }
}
