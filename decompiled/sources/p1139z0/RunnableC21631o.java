package p1139z0;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: z0.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC21631o implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68527Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ IntConsumer f68528Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f68529o0;

    public /* synthetic */ RunnableC21631o(IntConsumer intConsumer, int i10, int i11) {
        this.f68527Y = i11;
        this.f68528Z = intConsumer;
        this.f68529o0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68527Y) {
            case 0:
                this.f68528Z.accept(this.f68529o0);
                break;
            default:
                this.f68528Z.accept(this.f68529o0);
                break;
        }
    }
}
