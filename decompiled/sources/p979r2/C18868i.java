package p979r2;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p1096x2.C21113h;
import p523V9.AbstractC8027Y;
import p817j$.util.DesugarCollections;
import p955q2.C18613e;
import p955q2.C18614f;

/* JADX INFO: renamed from: r2.i */
/* JADX INFO: loaded from: classes.dex */
public class C18868i extends C18866g {

    /* JADX INFO: renamed from: f */
    public final Class f60104f;

    /* JADX INFO: renamed from: g */
    public final Constructor f60105g;

    /* JADX INFO: renamed from: h */
    public final Method f60106h;

    /* JADX INFO: renamed from: i */
    public final Method f60107i;

    /* JADX INFO: renamed from: j */
    public final Method f60108j;

    /* JADX INFO: renamed from: k */
    public final Method f60109k;

    /* JADX INFO: renamed from: l */
    public final Method f60110l;

    public C18868i() throws NoSuchMethodException {
        Method methodMo20189v;
        Constructor<?> constructor;
        Method methodM20182u;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM20182u = m20182u(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo20189v = mo20189v(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            AbstractC15256t.m16466d("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            methodMo20189v = null;
            constructor = null;
            methodM20182u = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f60104f = cls;
        this.f60105g = constructor;
        this.f60106h = methodM20182u;
        this.f60107i = method;
        this.f60108j = method2;
        this.f60109k = method3;
        this.f60110l = methodMo20189v;
    }

    /* JADX INFO: renamed from: u */
    public static Method m20182u(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // p979r2.C18866g, p523V9.AbstractC8020X
    /* JADX INFO: renamed from: g */
    public final Typeface mo8357g(Context context, C18613e c18613e, Resources resources, int i10) {
        if (!m20187s()) {
            return super.mo8357g(context, c18613e, resources, i10);
        }
        Object objM20188t = m20188t();
        if (objM20188t == null) {
            return null;
        }
        for (C18614f c18614f : c18613e.f59282a) {
            if (!m20184p(context, objM20188t, c18614f.f59283a, c18614f.f59287e, c18614f.f59284b, c18614f.f59285c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c18614f.f59286d))) {
                m20183o(objM20188t);
                return null;
            }
        }
        if (m20186r(objM20188t)) {
            return mo20185q(objM20188t);
        }
        return null;
    }

    @Override // p979r2.C18866g, p523V9.AbstractC8020X
    /* JADX INFO: renamed from: h */
    public final Typeface mo8358h(Context context, C21113h[] c21113hArr, int i10) {
        Typeface typefaceMo20185q;
        boolean zBooleanValue;
        if (c21113hArr.length < 1) {
            return null;
        }
        if (!m20187s()) {
            C21113h c21113hMo8362l = mo8362l(c21113hArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c21113hMo8362l.f67063a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c21113hMo8362l.f67065c).setItalic(c21113hMo8362l.f67066d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C21113h c21113h : c21113hArr) {
            if (c21113h.f67067e == 0) {
                Uri uri = c21113h.f67063a;
                if (!map.containsKey(uri)) {
                    map.put(uri, AbstractC8027Y.m8376g(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        Object objM20188t = m20188t();
        if (objM20188t == null) {
            return null;
        }
        int length = c21113hArr.length;
        int i11 = 0;
        boolean z6 = false;
        while (i11 < length) {
            C21113h c21113h2 = c21113hArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c21113h2.f67063a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f60107i.invoke(objM20188t, byteBuffer, Integer.valueOf(c21113h2.f67064b), null, Integer.valueOf(c21113h2.f67065c), Integer.valueOf(c21113h2.f67066d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m20183o(objM20188t);
                    return null;
                }
                z6 = true;
            }
            i11++;
            z6 = z6;
        }
        if (!z6) {
            m20183o(objM20188t);
            return null;
        }
        if (m20186r(objM20188t) && (typefaceMo20185q = mo20185q(objM20188t)) != null) {
            return Typeface.create(typefaceMo20185q, i10);
        }
        return null;
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: k */
    public final Typeface mo8361k(Context context, Resources resources, int i10, String str, int i11) {
        if (!m20187s()) {
            return super.mo8361k(context, resources, i10, str, i11);
        }
        Object objM20188t = m20188t();
        if (objM20188t == null) {
            return null;
        }
        if (!m20184p(context, objM20188t, str, 0, -1, -1, null)) {
            m20183o(objM20188t);
            return null;
        }
        if (m20186r(objM20188t)) {
            return mo20185q(objM20188t);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m20183o(Object obj) {
        try {
            this.f60109k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20184p(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f60106h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public Typeface mo20185q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f60104f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f60110l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20186r(Object obj) {
        try {
            return ((Boolean) this.f60108j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m20187s() {
        Method method = this.f60106h;
        if (method == null) {
            AbstractC15256t.m16482t("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* JADX INFO: renamed from: t */
    public final Object m20188t() {
        try {
            return this.f60105g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public Method mo20189v(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
