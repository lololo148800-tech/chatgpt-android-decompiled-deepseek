package p501Ub;

import java.util.ArrayDeque;
import java.util.Deque;
import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: Ub.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7611m implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24058Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Runnable f24059Z;

    public /* synthetic */ RunnableC7611m(Runnable runnable, int i10) {
        this.f24058Y = i10;
        this.f24059Z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24058Y) {
            case 0:
                C7605g.f24043Z.set(new ArrayDeque());
                this.f24059Z.run();
                break;
            default:
                Deque deque = (Deque) C7605g.f24043Z.get();
                AbstractC20502t.m21157h(deque);
                Runnable runnable = this.f24059Z;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
        }
    }
}
