package p768gc;

import ec.InterfaceC13365g;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p1060v9.AbstractC20502t;
import p165G9.C3020f;
import p501Ub.C7604f;

/* JADX INFO: renamed from: gc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13836a implements InterfaceC13365g {

    /* JADX INFO: renamed from: b */
    public static final C13836a f43872b = new C13836a();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f43873a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final boolean m15474a() {
        AtomicReference atomicReference = this.f43873a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z6 = C3020f.m3865a(C7604f.m7950c().m7952b(), "com.google.mlkit.dynamite.text.latin") > 0;
        atomicReference.set(Boolean.valueOf(z6));
        return z6;
    }

    /* JADX INFO: renamed from: b */
    public final String m15475b() {
        return true != m15474a() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13836a)) {
            return false;
        }
        ((C13836a) obj).getClass();
        return AbstractC20502t.m21161l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }
}
