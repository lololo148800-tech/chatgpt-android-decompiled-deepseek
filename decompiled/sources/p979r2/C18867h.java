package p979r2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.instrumentation.file.C15378c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p1096x2.C21113h;
import p523V9.AbstractC8020X;
import p523V9.AbstractC8027Y;
import p544W9.AbstractC8746y3;
import p692d0.C12959L;
import p955q2.C18613e;
import p955q2.C18614f;

/* JADX INFO: renamed from: r2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C18867h extends AbstractC8020X {

    /* JADX INFO: renamed from: a */
    public static final Class f60100a;

    /* JADX INFO: renamed from: b */
    public static final Constructor f60101b;

    /* JADX INFO: renamed from: c */
    public static final Method f60102c;

    /* JADX INFO: renamed from: d */
    public static final Method f60103d;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            String str = YladLSetV.hTNojW;
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod(str, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            AbstractC15256t.m16466d("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f60101b = constructor;
        f60100a = cls;
        f60102c = method2;
        f60103d = method;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m20180m(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z6) {
        try {
            return ((Boolean) f60102c.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Typeface m20181n(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f60100a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f60103d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d A[LOOP:0: B:9:0x0014->B:37:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x006c A[SYNTHETIC] */
    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: g */
    public final Typeface mo8357g(Context context, C18613e c18613e, Resources resources, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f60101b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (C18614f c18614f : c18613e.f59282a) {
            int i11 = c18614f.f59288f;
            File fileM8373d = AbstractC8027Y.m8373d(context);
            if (fileM8373d != null) {
                try {
                    if (AbstractC8027Y.m8371b(fileM8373d, resources, i11)) {
                        try {
                            C15378c c15378cM9492c = AbstractC8746y3.m9492c(fileM8373d, new FileInputStream(fileM8373d));
                            try {
                                FileChannel channel = c15378cM9492c.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                c15378cM9492c.close();
                                fileM8373d.delete();
                            } catch (Throwable th2) {
                                try {
                                    c15378cM9492c.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        fileM8373d.delete();
                    }
                    if (map == null) {
                        return null;
                    }
                    if (!m20180m(objNewInstance, map, c18614f.f59287e, c18614f.f59284b, c18614f.f59285c)) {
                        return null;
                    }
                } catch (Throwable th4) {
                    fileM8373d.delete();
                    throw th4;
                }
            }
            map = null;
            if (map == null) {
                return null;
            }
            if (!m20180m(objNewInstance, map, c18614f.f59287e, c18614f.f59284b, c18614f.f59285c)) {
                return null;
            }
        }
        return m20181n(objNewInstance);
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: h */
    public final Typeface mo8358h(Context context, C21113h[] c21113hArr, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = f60101b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        C12959L c12959l = new C12959L(0);
        for (C21113h c21113h : c21113hArr) {
            Uri uri = c21113h.f67063a;
            ByteBuffer byteBufferM8376g = (ByteBuffer) c12959l.get(uri);
            if (byteBufferM8376g == null) {
                byteBufferM8376g = AbstractC8027Y.m8376g(context, uri);
                c12959l.put(uri, byteBufferM8376g);
            }
            if (byteBufferM8376g == null) {
                return null;
            }
            if (!m20180m(objNewInstance, byteBufferM8376g, c21113h.f67064b, c21113h.f67065c, c21113h.f67066d)) {
                return null;
            }
        }
        Typeface typefaceM20181n = m20181n(objNewInstance);
        if (typefaceM20181n == null) {
            return null;
        }
        return Typeface.create(typefaceM20181n, i10);
    }
}
