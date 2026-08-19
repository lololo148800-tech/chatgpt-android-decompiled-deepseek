package p165G9;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import io.sentry.android.core.AbstractC15256t;
import p026Ao.C0669c;
import p028B.C0694a;
import p028B.C0710q;
import p178H.C3129W;
import p178H.C3165q;

/* JADX INFO: renamed from: G9.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3021g {

    /* JADX INFO: renamed from: a */
    public static ClassLoader f9108a;

    /* JADX INFO: renamed from: b */
    public static Thread f9109b;

    /* JADX INFO: renamed from: a */
    public static int m3873a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3874b(C0710q c0710q, String str) throws C3129W {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) c0710q.m1481b(str).m1476a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C0694a e10) {
            throw new C3129W(new C3165q(e10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static synchronized ClassLoader m3875c() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (f9108a == null) {
            Thread thread2 = f9109b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f9109b.getContextClassLoader();
                    } catch (SecurityException e11) {
                        AbstractC15256t.m16482t("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e11.getMessage());
                    }
                }
                f9108a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        C0669c c0669c = new C0669c(threadGroup, "GmsDynamite");
                                        try {
                                            c0669c.setContextClassLoader(null);
                                            c0669c.start();
                                            thread = c0669c;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = c0669c;
                                            AbstractC15256t.m16482t("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                                        }
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                    }
                                }
                            } catch (SecurityException e14) {
                                e10 = e14;
                                thread = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    thread2 = thread;
                }
                f9109b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f9109b.getContextClassLoader();
                    }
                }
                f9108a = contextClassLoader;
            }
        }
        return f9108a;
    }
}
