package p538W2;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: W2.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8423h {
    /* JADX INFO: renamed from: a */
    public static void m9023a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public static FileDescriptor m9024b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    public static long m9025c(FileDescriptor fileDescriptor, long j10, int i10) {
        return Os.lseek(fileDescriptor, j10, i10);
    }
}
