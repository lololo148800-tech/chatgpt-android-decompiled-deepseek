package p178H;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import p523V9.AbstractC8072d6;

/* JADX INFO: renamed from: H.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RejectedExecutionHandlerC3155l implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AbstractC8072d6.m8487d("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
