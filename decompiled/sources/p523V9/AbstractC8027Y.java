package p523V9;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15379d;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.C0397g;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: V9.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8027Y {
    /* JADX INFO: renamed from: a */
    public static void m8370a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8371b(File file, Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
            try {
                boolean zM8372c = m8372c(file, inputStreamOpenRawResource);
                m8370a(inputStreamOpenRawResource);
                return zM8372c;
            } catch (Throwable th2) {
                th = th2;
                m8370a(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8372c(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        C15379d c15379dM9508c = null;
        try {
            c15379dM9508c = AbstractC8752z3.m9508c(file, new FileOutputStream(file, false), false);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    return true;
                }
                c15379dM9508c.write(bArr, 0, i10);
                m8370a(c15379dM9508c);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            }
        } catch (IOException e10) {
            AbstractC15256t.m16465c("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e10.getMessage());
            return false;
        } finally {
            m8370a(c15379dM9508c);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    /* JADX INFO: renamed from: d */
    public static File m8373d(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m8374e(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                    StringBuilder sbM11058p = AbstractC10763a.m11058p(Separators.LESS_THAN, str2, " threw ");
                    sbM11058p.append(e10.getClass().getName());
                    sbM11058p.append(Separators.GREATER_THAN);
                    string = sbM11058p.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public static final void m8375f(Runnable runnable, Throwable th2, InterfaceC11256c logger) {
        AbstractC16544l.m18094g(logger, "logger");
        if (th2 == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                try {
                    ((Future) runnable).get();
                } catch (SecurityException e10) {
                    AbstractC7889G0.m8184b(logger, 5, EnumC11255b.f34099Z, C0397g.f1318Z, e10, false, 48);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                th2 = e11;
            } catch (ExecutionException e12) {
                th2 = e12.getCause();
            }
        }
        Throwable th3 = th2;
        if (th3 != null) {
            AbstractC7889G0.m8185c(logger, 5, AbstractC17681o.m19382k(EnumC11255b.f34098Y, EnumC11255b.f34100o0), C0397g.f1319o0, th3, 48);
        }
    }

    /* JADX INFO: renamed from: g */
    public static MappedByteBuffer m8376g(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                C15378c c15378cM9493d = AbstractC8746y3.m9493d(new FileInputStream(fileDescriptor), fileDescriptor);
                try {
                    FileChannel channel = c15378cM9493d.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    c15378cM9493d.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th2) {
                    try {
                        c15378cM9493d.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
