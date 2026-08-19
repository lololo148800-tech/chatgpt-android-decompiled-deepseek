package p026Ao;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Ao.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C0690x implements Closeable {

    /* JADX INFO: renamed from: Y */
    public boolean f2011Y;

    /* JADX INFO: renamed from: Z */
    public int f2012Z;

    /* JADX INFO: renamed from: o0 */
    public final ReentrantLock f2013o0 = new ReentrantLock();

    /* JADX INFO: renamed from: p0 */
    public final RandomAccessFile f2014p0;

    public C0690x(RandomAccessFile randomAccessFile) {
        this.f2014p0 = randomAccessFile;
    }

    /* JADX INFO: renamed from: a */
    public final long m1470a() {
        long length;
        ReentrantLock reentrantLock = this.f2013o0;
        reentrantLock.lock();
        try {
            if (this.f2011Y) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f2014p0.length();
            }
            return length;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f2013o0;
        reentrantLock.lock();
        try {
            if (this.f2011Y) {
                reentrantLock.unlock();
                return;
            }
            this.f2011Y = true;
            if (this.f2012Z != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f2014p0.close();
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0680n m1471e(long j10) {
        ReentrantLock reentrantLock = this.f2013o0;
        reentrantLock.lock();
        try {
            if (this.f2011Y) {
                throw new IllegalStateException("closed");
            }
            this.f2012Z++;
            reentrantLock.unlock();
            return new C0680n(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
