package p349O0;

import android.graphics.Path;
import java.util.ArrayList;
import p003A1.C0284r0;
import p567X5.C9070t;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: O0.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5980U0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f19461a;

    public C5980U0(int i10) {
        switch (i10) {
            case 1:
                this.f19461a = new ArrayList();
                break;
            default:
                this.f19461a = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6404a(Path path) {
        ArrayList arrayList = this.f19461a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C9070t c9070t = (C9070t) arrayList.get(size);
            C0284r0 c0284r0 = AbstractC14418g.f45308a;
            if (c9070t != null && !c9070t.f27769a) {
                AbstractC14418g.m15930a(path, c9070t.f27772d.m10243k() / 100.0f, c9070t.f27773e.m10243k() / 100.0f, c9070t.f27774f.m10243k() / 360.0f);
            }
        }
    }
}
