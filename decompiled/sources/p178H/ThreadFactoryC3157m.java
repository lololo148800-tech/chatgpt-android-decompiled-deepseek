package p178H;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: H.m */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC3157m implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9498a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f9499b;

    public ThreadFactoryC3157m(int i10) {
        this.f9498a = i10;
        switch (i10) {
            case 1:
                this.f9499b = new AtomicInteger(0);
                break;
            case 2:
                this.f9499b = new AtomicInteger(0);
                break;
            case 3:
                this.f9499b = new AtomicInteger(0);
                break;
            default:
                this.f9499b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r6) {
        switch (this.f9498a) {
            case 0:
                Thread thread = new Thread(r6);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + this.f9499b.getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(r6);
                Locale locale2 = Locale.US;
                thread2.setName("CameraX-camerax_io_" + this.f9499b.getAndIncrement());
                return thread2;
            case 2:
                AbstractC16544l.m18094g(r6, "r");
                Thread thread3 = new Thread(r6);
                thread3.setName("LK_RTC_THREAD_" + this.f9499b.incrementAndGet());
                return thread3;
            default:
                Thread thread4 = new Thread(r6);
                thread4.setName("arch_disk_io_" + this.f9499b.getAndIncrement());
                return thread4;
        }
    }
}
