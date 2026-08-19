package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.C0199Q0;
import p103Dn.InterfaceC2213w0;
import p183H4.InterfaceC3230e;
import p523V9.AbstractC8127k5;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: androidx.lifecycle.S */
/* JADX INFO: loaded from: classes.dex */
public final class C11082S {

    /* JADX INFO: renamed from: f */
    public static final Class[] f33410f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f33411a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f33412b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f33413c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f33414d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3230e f33415e;

    public C11082S(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f33411a = linkedHashMap;
        this.f33412b = new LinkedHashMap();
        this.f33413c = new LinkedHashMap();
        this.f33414d = new LinkedHashMap();
        this.f33415e = new C0199Q0(this, 3);
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m12130a(C11082S this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        for (Map.Entry entry : AbstractC17659D.m19254p(this$0.f33412b).entrySet()) {
            this$0.m12132c((String) entry.getKey(), ((InterfaceC3230e) entry.getValue()).mo612a());
        }
        LinkedHashMap linkedHashMap = this$0.f33411a;
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return AbstractC8127k5.m8632a(new C17309l("keys", arrayList), new C17309l("values", arrayList2));
    }

    /* JADX INFO: renamed from: b */
    public final Object m12131b(String key) {
        LinkedHashMap linkedHashMap = this.f33411a;
        AbstractC16544l.m18094g(key, "key");
        try {
            return linkedHashMap.get(key);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(key);
            if (this.f33413c.remove(key) != null) {
                throw new ClassCastException();
            }
            this.f33414d.remove(key);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12132c(String key, Object obj) {
        AbstractC16544l.m18094g(key, "key");
        if (obj != null) {
            Class[] clsArr = f33410f;
            int i10 = 0;
            while (true) {
                if (i10 >= 29) {
                    throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
                }
                Class cls = clsArr[i10];
                AbstractC16544l.m18091d(cls);
                if (cls.isInstance(obj)) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        Object obj2 = this.f33413c.get(key);
        C11069E c11069e = obj2 instanceof C11069E ? (C11069E) obj2 : null;
        if (c11069e != null) {
            c11069e.mo12122j(obj);
        } else {
            this.f33411a.put(key, obj);
        }
        InterfaceC2213w0 interfaceC2213w0 = (InterfaceC2213w0) this.f33414d.get(key);
        if (interfaceC2213w0 == null) {
            return;
        }
        interfaceC2213w0.setValue(obj);
    }

    public C11082S() {
        this.f33411a = new LinkedHashMap();
        this.f33412b = new LinkedHashMap();
        this.f33413c = new LinkedHashMap();
        this.f33414d = new LinkedHashMap();
        this.f33415e = new C0199Q0(this, 3);
    }
}
