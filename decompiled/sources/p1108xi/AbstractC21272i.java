package p1108xi;

import java.util.Iterator;
import java.util.List;
import p204I1.C3573D;
import p204I1.C3587c;
import p328N1.C5609y;
import p774h1.AbstractC14334L;
import p774h1.C14365u;

/* JADX INFO: renamed from: xi.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21272i {

    /* JADX INFO: renamed from: a */
    public static final long f67649a = AbstractC14334L.m15626d(4291941851L);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f67650b = 0;

    /* JADX INFO: renamed from: a */
    public static final void m21619a(C3587c c3587c, C21269f c21269f) {
        C14365u c14365u = c21269f.f67640b;
        List list = c21269f.f67642d;
        long j10 = c14365u != null ? c14365u.f45062a : C14365u.f45060j;
        Integer num = c21269f.f67641c;
        int iM4296h = c3587c.m4296h(new C3573D(j10, 0L, num != null ? new C5609y(num.intValue()) : null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
        try {
            boolean zIsEmpty = list.isEmpty();
            if (zIsEmpty) {
                c3587c.m4291c(c21269f.f67639a);
            } else if (!zIsEmpty) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m21619a(c3587c, (C21269f) it.next());
                }
            }
        } finally {
            c3587c.m4293e(iM4296h);
        }
    }
}
