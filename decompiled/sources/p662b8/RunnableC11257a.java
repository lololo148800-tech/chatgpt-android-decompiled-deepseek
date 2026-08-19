package p662b8;

/* JADX INFO: renamed from: b8.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11257a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public boolean f34103Y;

    @Override // java.lang.Runnable
    public final synchronized void run() {
        this.f34103Y = true;
        notifyAll();
    }
}
