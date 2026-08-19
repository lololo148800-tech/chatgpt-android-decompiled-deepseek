package p282L4;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.openai.chatgpt.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p025An.C0644w;
import p544W9.AbstractC8447A3;

/* JADX INFO: renamed from: L4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4933a {

    /* JADX INFO: renamed from: d */
    public static volatile C4933a f16101d;

    /* JADX INFO: renamed from: e */
    public static final Object f16102e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f16105c;

    /* JADX INFO: renamed from: b */
    public final HashSet f16104b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f16103a = new HashMap();

    public C4933a(Context context) {
        this.f16105c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static C4933a m5543c(Context context) {
        if (f16101d == null) {
            synchronized (f16102e) {
                try {
                    if (f16101d == null) {
                        f16101d = new C4933a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f16101d;
    }

    /* JADX INFO: renamed from: a */
    public final void m5544a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f16105c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f16104b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC4934b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m5545b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new C0644w(e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m5545b(Class cls, HashSet hashSet) {
        Object objMo5547b;
        if (AbstractC8447A3.m9051c()) {
            try {
                Trace.beginSection(AbstractC8447A3.m9053f(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f16103a;
        if (map.containsKey(cls)) {
            objMo5547b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC4934b interfaceC4934b = (InterfaceC4934b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo5546a = interfaceC4934b.mo5546a();
                if (!listMo5546a.isEmpty()) {
                    for (Class cls2 : listMo5546a) {
                        if (!map.containsKey(cls2)) {
                            m5545b(cls2, hashSet);
                        }
                    }
                }
                objMo5547b = interfaceC4934b.mo5547b(this.f16105c);
                hashSet.remove(cls);
                map.put(cls, objMo5547b);
            } catch (Throwable th3) {
                throw new C0644w(th3);
            }
        }
        Trace.endSection();
        return objMo5547b;
    }
}
