package p615Z6;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Z6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C10225m {

    /* JADX INFO: renamed from: a */
    public ArrayList f30352a = null;

    /* JADX INFO: renamed from: b */
    public int f30353b = 0;

    /* JADX INFO: renamed from: a */
    public final void m10791a() {
        this.f30353b += 1000;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f30352a.iterator();
        while (it.hasNext()) {
            sb2.append((C10227n) it.next());
            sb2.append(' ');
        }
        sb2.append('[');
        return AbstractC12107L1.m13826q(sb2, this.f30353b, ']');
    }
}
