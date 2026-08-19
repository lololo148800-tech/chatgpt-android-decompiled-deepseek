package p468T2;

import java.util.concurrent.ThreadPoolExecutor;
import p571X9.AbstractC9172M3;
import p658b5.C11238i;

/* JADX INFO: renamed from: T2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7219k extends AbstractC9172M3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9172M3 f22905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f22906b;

    public C7219k(AbstractC9172M3 abstractC9172M3, ThreadPoolExecutor threadPoolExecutor) {
        this.f22905a = abstractC9172M3;
        this.f22906b = threadPoolExecutor;
    }

    @Override // p571X9.AbstractC9172M3
    /* JADX INFO: renamed from: a */
    public final void mo7603a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f22906b;
        try {
            this.f22905a.mo7603a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p571X9.AbstractC9172M3
    /* JADX INFO: renamed from: b */
    public final void mo7604b(C11238i c11238i) {
        ThreadPoolExecutor threadPoolExecutor = this.f22906b;
        try {
            this.f22905a.mo7604b(c11238i);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
