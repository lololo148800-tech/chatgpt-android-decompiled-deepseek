package p345Nm;

import java.util.ServiceLoader;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Nm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5855a implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C5855a f19153Z = new C5855a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C5855a f19154o0 = new C5855a(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19155Y;

    public /* synthetic */ C5855a(int i10) {
        this.f19155Y = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f19155Y) {
            case 0:
                BuiltInsLoader.Companion companion = BuiltInsLoader.Companion.f51291a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                AbstractC16544l.m18091d(serviceLoaderLoad);
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) AbstractC17680n.m19342R(serviceLoaderLoad);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                return new DefaultBuiltIns(false, 1, null);
        }
    }
}
