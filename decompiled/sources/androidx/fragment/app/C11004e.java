package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11004e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f33215a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final HashMap f33216b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f33217c = new HashMap();

    /* JADX INFO: renamed from: d */
    public FragmentManagerViewModel f33218d;

    /* JADX INFO: renamed from: a */
    public final void m11834a(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (this.f33215a.contains(abstractComponentCallbacksC11000a)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC11000a);
        }
        synchronized (this.f33215a) {
            this.f33215a.add(abstractComponentCallbacksC11000a);
        }
        abstractComponentCallbacksC11000a.f33161w0 = true;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractComponentCallbacksC11000a m11835b(String str) {
        C11003d c11003d = (C11003d) this.f33216b.get(str);
        if (c11003d != null) {
            return c11003d.f33212c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC11000a m11836c(String str) {
        for (C11003d c11003d : this.f33216b.values()) {
            if (c11003d != null) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11836c = c11003d.f33212c;
                if (!str.equals(abstractComponentCallbacksC11000aM11836c.f33155q0)) {
                    abstractComponentCallbacksC11000aM11836c = abstractComponentCallbacksC11000aM11836c.f33124F0.f33186c.m11836c(str);
                }
                if (abstractComponentCallbacksC11000aM11836c != null) {
                    return abstractComponentCallbacksC11000aM11836c;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m11837d() {
        ArrayList arrayList = new ArrayList();
        for (C11003d c11003d : this.f33216b.values()) {
            if (c11003d != null) {
                arrayList.add(c11003d);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m11838e() {
        ArrayList arrayList = new ArrayList();
        for (C11003d c11003d : this.f33216b.values()) {
            if (c11003d != null) {
                arrayList.add(c11003d.f33212c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List m11839f() {
        ArrayList arrayList;
        if (this.f33215a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f33215a) {
            arrayList = new ArrayList(this.f33215a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m11840g(C11003d c11003d) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d.f33212c;
        String str = abstractComponentCallbacksC11000a.f33155q0;
        HashMap map = this.f33216b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC11000a.f33155q0, c11003d);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC11000a);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11841h(C11003d c11003d) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d.f33212c;
        if (abstractComponentCallbacksC11000a.f33131M0) {
            this.f33218d.m11738i(abstractComponentCallbacksC11000a);
        }
        HashMap map = this.f33216b;
        if (map.get(abstractComponentCallbacksC11000a.f33155q0) == c11003d && ((C11003d) map.put(abstractComponentCallbacksC11000a.f33155q0, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC11000a);
        }
    }

    /* JADX INFO: renamed from: i */
    public final Bundle m11842i(String str, Bundle bundle) {
        HashMap map = this.f33217c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
