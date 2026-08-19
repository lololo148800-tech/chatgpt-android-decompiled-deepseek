package p183H4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: H4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3226a implements InterfaceC3230e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9791a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f9792b;

    public C3226a(C3231f registry) {
        AbstractC16544l.m18094g(registry, "registry");
        this.f9792b = new LinkedHashSet();
        registry.m4125f("androidx.savedstate.Restarter", this);
    }

    @Override // p183H4.InterfaceC3230e
    /* JADX INFO: renamed from: a */
    public final Bundle mo612a() {
        switch (this.f9791a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f9792b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC17375g) this.f9792b).m19053p().getClass();
                return bundle2;
        }
    }

    public C3226a(AbstractActivityC17375g abstractActivityC17375g) {
        this.f9792b = abstractActivityC17375g;
    }
}
