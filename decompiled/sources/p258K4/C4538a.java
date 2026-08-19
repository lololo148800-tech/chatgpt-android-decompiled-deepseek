package p258K4;

import io.sentry.android.core.AbstractC15256t;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p544W9.AbstractC8752z3;

/* JADX INFO: renamed from: K4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4538a {

    /* JADX INFO: renamed from: e */
    public static final HashMap f14835e = new HashMap();

    /* JADX INFO: renamed from: a */
    public final boolean f14836a;

    /* JADX INFO: renamed from: b */
    public final File f14837b;

    /* JADX INFO: renamed from: c */
    public final Lock f14838c;

    /* JADX INFO: renamed from: d */
    public FileChannel f14839d;

    public C4538a(String str, File file, boolean z6) {
        Lock lock;
        this.f14836a = z6;
        this.f14837b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f14835e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14838c = lock;
    }

    /* JADX INFO: renamed from: a */
    public final void m5301a(boolean z6) {
        this.f14838c.lock();
        if (z6) {
            File file = this.f14837b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = AbstractC8752z3.m9509d(new FileOutputStream(file), file).getChannel();
                channel.lock();
                this.f14839d = channel;
            } catch (IOException e10) {
                this.f14839d = null;
                AbstractC15256t.m16483u("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5302b() {
        try {
            FileChannel fileChannel = this.f14839d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f14838c.unlock();
    }
}
