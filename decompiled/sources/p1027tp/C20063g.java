package p1027tp;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: tp.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C20063g extends CompletableFuture {

    /* JADX INFO: renamed from: Y */
    public final C20077u f63554Y;

    public C20063g(C20077u c20077u) {
        this.f63554Y = c20077u;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        if (z6) {
            this.f63554Y.cancel();
        }
        return super.cancel(z6);
    }
}
