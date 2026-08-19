package io.sentry.cache;

import io.sentry.C15324c;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.cache.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15327a {

    /* JADX INFO: renamed from: a */
    public static final Charset f47875a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m16535a(C15524y1 c15524y1, String str, String str2) {
        File file;
        String cacheDirPath = c15524y1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Deleting %s from scope cache", str2);
            if (file3.delete()) {
                return;
            }
            c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m16536b(C15524y1 c15524y1, String str, String str2, Class cls, C15324c c15324c) {
        File file;
        String cacheDirPath = c15524y1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            file = new File(cacheDirPath, str);
            file.mkdirs();
        }
        if (file == null) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file2 = new File(file, str2);
        if (file2.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), f47875a));
                try {
                    if (c15324c == null) {
                        Object objMo16323c = c15524y1.getSerializer().mo16323c(bufferedReader, cls);
                        bufferedReader.close();
                        return objMo16323c;
                    }
                    Object objMo16325e = c15524y1.getSerializer().mo16325e(bufferedReader, cls, c15324c);
                    bufferedReader.close();
                    return objMo16325e;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th4, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m16537c(C15524y1 c15524y1, Object obj, String str, String str2) {
        File file;
        String cacheDirPath = c15524y1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file3.delete()) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f47875a));
                try {
                    c15524y1.getSerializer().mo16326f(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th6, "Error persisting entity: %s", str2);
        }
    }
}
