package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p183H4.C3231f;
import p183H4.InterfaceC3230e;
import p437Rn.C6949g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: androidx.lifecycle.W */
/* JADX INFO: loaded from: classes.dex */
public final class C11087W implements InterfaceC3230e {

    /* JADX INFO: renamed from: a */
    public final C3231f f33448a;

    /* JADX INFO: renamed from: b */
    public boolean f33449b;

    /* JADX INFO: renamed from: c */
    public Bundle f33450c;

    /* JADX INFO: renamed from: d */
    public final C17314q f33451d;

    public C11087W(C3231f savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC16544l.m18094g(savedStateRegistry, "savedStateRegistry");
        this.f33448a = savedStateRegistry;
        this.f33451d = AbstractC9227W.m9800c(new C6949g(viewModelStoreOwner, 23));
    }

    @Override // p183H4.InterfaceC3230e
    /* JADX INFO: renamed from: a */
    public final Bundle mo612a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f33450c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C11088X) this.f33451d.getValue()).f33452b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo612a = ((C11082S) entry.getValue()).f33415e.mo612a();
            if (!AbstractC16544l.m18089b(bundleMo612a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo612a);
            }
        }
        this.f33449b = false;
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final void m12149b() {
        if (this.f33449b) {
            return;
        }
        Bundle bundleM4122c = this.f33448a.m4122c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f33450c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM4122c != null) {
            bundle.putAll(bundleM4122c);
        }
        this.f33450c = bundle;
        this.f33449b = true;
    }
}
