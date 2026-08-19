package p544W9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001A.C0083q0;
import p228J.AbstractC3810L;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.AbstractC5229k;
import p301M.C5226h;
import p301M.C5233o;
import p610Z1.C10145l;
import p773h0.C14311u;
import p774h1.C14341T;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: W9.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8449B {
    /* JADX INFO: renamed from: a */
    public static final C14311u m9060a(float f10, long j10) {
        return new C14311u(f10, new C14341T(j10));
    }

    /* JADX INFO: renamed from: b */
    public static C10145l m9061b(List list, ExecutorC4836i executorC4836i, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC5229k.m5780d(((AbstractC3810L) it.next()).m4509c()));
        }
        return AbstractC16347a.m17947b(new C0083q0(AbstractC16347a.m17947b(new C5226h(new C5233o(new ArrayList(arrayList), false, AbstractC8577W2.m9240b()), scheduledExecutorServiceC4831d, 5000L, 1)), executorC4836i, list));
    }
}
