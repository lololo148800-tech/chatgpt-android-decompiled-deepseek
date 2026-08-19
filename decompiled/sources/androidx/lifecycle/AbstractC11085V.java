package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import p1061vb.C20513d;
import p140Fa.C2685e;
import p183H4.C3227b;
import p183H4.InterfaceC3230e;
import p183H4.InterfaceC3232g;
import p523V9.AbstractC8138m0;
import p523V9.AbstractC8242z0;
import p939p3.C18294d;
import p959q8.C18639a;

/* JADX INFO: renamed from: androidx.lifecycle.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11085V {

    /* JADX INFO: renamed from: a */
    public static final C20513d f33426a = new C20513d();

    /* JADX INFO: renamed from: b */
    public static final C2685e f33427b = new C2685e();

    /* JADX INFO: renamed from: c */
    public static final C18639a f33428c = new C18639a(22);

    /* JADX INFO: renamed from: a */
    public static final C11082S m12137a(C18294d c18294d) {
        InterfaceC3232g interfaceC3232g = (InterfaceC3232g) c18294d.m19835a(f33426a);
        if (interfaceC3232g == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) c18294d.m19835a(f33427b);
        if (viewModelStoreOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) c18294d.m19835a(f33428c);
        String str = (String) c18294d.m19835a(ViewModelProvider.NewInstanceFactory.f33444c);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC3230e interfaceC3230eM4123d = interfaceC3232g.mo4127h().m4123d();
        C11087W c11087w = interfaceC3230eM4123d instanceof C11087W ? (C11087W) interfaceC3230eM4123d : null;
        if (c11087w == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = ((C11088X) new ViewModelProvider(viewModelStoreOwner, new C11084U()).f33437a.m12164a(AbstractC8138m0.m8670e(C11088X.class), "androidx.lifecycle.internal.SavedStateHandlesVM")).f33452b;
        C11082S c11082s = (C11082S) linkedHashMap.get(str);
        if (c11082s != null) {
            return c11082s;
        }
        Class[] clsArr = C11082S.f33410f;
        c11087w.m12149b();
        Bundle bundle2 = c11087w.f33450c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c11087w.f33450c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c11087w.f33450c;
        if (bundle5 != null && bundle5.isEmpty()) {
            c11087w.f33450c = null;
        }
        C11082S c11082sM8888a = AbstractC8242z0.m8888a(bundle3, bundle);
        linkedHashMap.put(str, c11082sM8888a);
        return c11082sM8888a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m12138b(InterfaceC3232g interfaceC3232g) {
        EnumC11104m enumC11104mMo7807b = interfaceC3232g.mo7809i().mo7807b();
        if (enumC11104mMo7807b != EnumC11104m.f33475Z && enumC11104mMo7807b != EnumC11104m.f33476o0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC3232g.mo4127h().m4123d() == null) {
            C11087W c11087w = new C11087W(interfaceC3232g.mo4127h(), (ViewModelStoreOwner) interfaceC3232g);
            interfaceC3232g.mo4127h().m4125f("androidx.lifecycle.internal.SavedStateHandlesProvider", c11087w);
            interfaceC3232g.mo7809i().mo7806a(new C3227b(c11087w, 3));
        }
    }
}
