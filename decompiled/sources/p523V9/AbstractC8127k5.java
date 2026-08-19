package p523V9;

import android.app.Activity;
import android.content.ComponentName;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.AbstractC0240d0;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21075b0;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1140z1.AbstractC21678Y;
import p1143z4.C21771a;
import p131F1.C2634l;
import p131F1.C2636n;
import p156G1.AbstractC2962i;
import p156G1.C2961h;
import p156G1.C2963j;
import p156G1.C2968o;
import p156G1.C2971r;
import p156G1.C2974u;
import p392Q0.C6546d;
import p492U1.C7544i;
import p571X9.AbstractC9107B4;
import p571X9.AbstractC9306j0;
import p722e8.C13304N;

/* JADX INFO: renamed from: V9.k5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8127k5 {
    /* JADX INFO: renamed from: a */
    public static final Bundle m8632a(C17309l... c17309lArr) {
        Bundle bundle = new Bundle(c17309lArr.length);
        for (C17309l c17309l : c17309lArr) {
            String str = (String) c17309l.f55136Y;
            Object obj = c17309l.f55137Z;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                AbstractC16544l.m18091d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static C13304N m8633b(Object key, String str) {
        ComponentName componentName;
        String strM9890i;
        String strM9890i2;
        String canonicalName;
        String strName;
        AbstractC16544l.m18094g(key, "key");
        if (key instanceof Activity) {
            componentName = ((Activity) key).getComponentName();
        } else {
            boolean z6 = key instanceof C21771a;
            componentName = null;
        }
        if (componentName == null) {
            boolean z10 = key instanceof String;
            if (z10) {
                strM9890i2 = (String) key;
            } else {
                strM9890i2 = (!(key instanceof Number) && (key instanceof Enum)) ? AbstractC9306j0.m9890i(key.getClass().getName(), Separators.f31989AT, ((Enum) key).name()) : key.toString();
            }
            if (z10) {
                canonicalName = (String) key;
            } else if (key instanceof Number) {
                canonicalName = key.toString();
            } else if (key instanceof Enum) {
                canonicalName = AbstractC9306j0.m9890i(key.getClass().getName(), Separators.DOT, ((Enum) key).name());
            } else {
                canonicalName = key.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = key.getClass().getSimpleName();
                }
            }
            if (str == null) {
                if (z10) {
                    strName = (String) key;
                } else if (key instanceof Number) {
                    strName = key.toString();
                } else {
                    strName = key instanceof Enum ? ((Enum) key).name() : key.getClass().getName();
                }
                str = strName;
            }
            return new C13304N(strM9890i2, canonicalName, str);
        }
        String str2 = componentName.getClassName() + Separators.f31989AT + System.identityHashCode(key);
        String packageName = componentName.getPackageName();
        AbstractC16544l.m18093f(packageName, "key.packageName");
        if (packageName.length() == 0) {
            strM9890i = componentName.getClassName();
            AbstractC16544l.m18093f(strM9890i, "key.className");
        } else {
            String className = componentName.getClassName();
            AbstractC16544l.m18093f(className, "key.className");
            if (AbstractC21329w.m21734u(className, componentName.getPackageName() + Separators.DOT, false)) {
                strM9890i = componentName.getClassName();
                AbstractC16544l.m18093f(strM9890i, "key.className");
            } else {
                String className2 = componentName.getClassName();
                AbstractC16544l.m18093f(className2, "key.className");
                if (AbstractC21322p.m21668B(className2, '.')) {
                    strM9890i = componentName.getClassName();
                    AbstractC16544l.m18093f(strM9890i, "key.className");
                } else {
                    strM9890i = AbstractC9306j0.m9890i(componentName.getPackageName(), Separators.DOT, componentName.getClassName());
                }
            }
        }
        if (str == null) {
            str = componentName.getClassName();
            AbstractC16544l.m18093f(str, "componentName.className");
        }
        return new C13304N(str2, strM9890i, str);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: c */
    public static final void m8634c(C2968o c2968o, int i10, C2634l c2634l) {
        C6546d c6546d = new C6546d(new C2968o[16]);
        List listM3797g = c2968o.m3797g(false, false, false);
        while (true) {
            c6546d.m7101f(c6546d.f21184o0, listM3797g);
            while (c6546d.m7109n()) {
                C2968o c2968o2 = (C2968o) c6546d.m7111p(c6546d.f21184o0 - 1);
                if (AbstractC0240d0.m802m(c2968o2)) {
                    C2974u c2974u = C2971r.f8923i;
                    C2963j c2963j = c2968o2.f8889d;
                    LinkedHashMap linkedHashMap = c2963j.f8880Y;
                    if (linkedHashMap.containsKey(c2974u)) {
                        continue;
                    } else {
                        AbstractC21678Y abstractC21678YM3793c = c2968o2.m3793c();
                        if (abstractC21678YM3793c == null) {
                            AbstractC8111i5.m8593d("Expected semantics node to have a coordinator.");
                            throw null;
                        }
                        C7544i c7544iM9638b = AbstractC9107B4.m9638b(AbstractC21075b0.m21565f(abstractC21678YM3793c));
                        if (c7544iM9638b.f23899a < c7544iM9638b.f23901c && c7544iM9638b.f23900b < c7544iM9638b.f23902d) {
                            Object obj = c2963j.f8880Y.get(AbstractC2962i.f8858e);
                            if (obj == null) {
                                obj = null;
                            }
                            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) obj;
                            Object obj2 = linkedHashMap.get(C2971r.f8930p);
                            C2961h c2961h = (C2961h) (obj2 != null ? obj2 : null);
                            if (interfaceC1439n == null || c2961h == null || ((Number) c2961h.f8851b.invoke()).floatValue() <= 0.0f) {
                                listM3797g = c2968o2.m3797g(false, false, false);
                            } else {
                                int i11 = i10 + 1;
                                c2634l.invoke(new C2636n(c2968o2, i11, c7544iM9638b, abstractC21678YM3793c));
                                m8634c(c2968o2, i11, c2634l);
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
