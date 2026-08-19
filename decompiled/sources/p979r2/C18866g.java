package p979r2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.instrumentation.file.C15378c;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p1096x2.C21113h;
import p523V9.AbstractC8020X;
import p523V9.AbstractC8027Y;
import p544W9.AbstractC8746y3;
import p955q2.C18613e;
import p955q2.C18614f;

/* JADX INFO: renamed from: r2.g */
/* JADX INFO: loaded from: classes.dex */
public class C18866g extends AbstractC8020X {

    /* JADX INFO: renamed from: a */
    public static Class f60095a = null;

    /* JADX INFO: renamed from: b */
    public static Constructor f60096b = null;

    /* JADX INFO: renamed from: c */
    public static Method f60097c = null;

    /* JADX INFO: renamed from: d */
    public static Method f60098d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f60099e = false;

    /* JADX INFO: renamed from: m */
    public static boolean m20178m(String str, boolean z6, int i10, Object obj) throws NoSuchMethodException {
        m20179n();
        try {
            return ((Boolean) f60097c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m20179n() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f60099e) {
            return;
        }
        f60099e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            AbstractC15256t.m16466d("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f60096b = constructor;
        f60095a = cls;
        f60097c = method2;
        f60098d = method;
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: g */
    public Typeface mo8357g(Context context, C18613e c18613e, Resources resources, int i10) throws NoSuchMethodException {
        m20179n();
        try {
            Object objNewInstance = f60096b.newInstance(null);
            for (C18614f c18614f : c18613e.f59282a) {
                File fileM8373d = AbstractC8027Y.m8373d(context);
                if (fileM8373d == null) {
                    return null;
                }
                try {
                    if (!AbstractC8027Y.m8371b(fileM8373d, resources, c18614f.f59288f)) {
                        return null;
                    }
                    if (!m20178m(fileM8373d.getPath(), c18614f.f59285c, c18614f.f59284b, objNewInstance)) {
                        return null;
                    }
                    fileM8373d.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM8373d.delete();
                }
            }
            m20179n();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f60095a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f60098d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: h */
    public Typeface mo8358h(Context context, C21113h[] c21113hArr, int i10) {
        File file;
        if (c21113hArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo8362l(c21113hArr, i10).f67063a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                } catch (ErrnoException unused) {
                }
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                C15378c c15378cM9493d = AbstractC8746y3.m9493d(new FileInputStream(fileDescriptor), fileDescriptor);
                try {
                    Typeface typefaceMo8360j = mo8360j(context, c15378cM9493d);
                    c15378cM9493d.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceMo8360j;
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
        } catch (IOException unused2) {
            return null;
        }
    }
}
