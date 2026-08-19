package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: io.sentry.android.core.I */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15191I {

    /* JADX INFO: renamed from: a */
    public static String f47333a;

    /* JADX INFO: renamed from: b */
    public static final Charset f47334b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static synchronized String m16393a(Context context) {
        try {
            if (f47333a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String string = UUID.randomUUID().toString();
                            fileOutputStream.write(string.getBytes(f47334b));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f47333a = string;
                            return string;
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, f47334b);
                        randomAccessFile.close();
                        f47333a = str;
                    } catch (Throwable th4) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    throw new RuntimeException(th6);
                }
            }
            return f47333a;
        } catch (Throwable th7) {
            throw th7;
        }
    }
}
