package p368Om;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns$Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: renamed from: Om.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6265a extends KotlinBuiltIns {

    /* JADX INFO: renamed from: f */
    public static final FallbackBuiltIns$Companion f20358f = new FallbackBuiltIns$Companion(null);

    /* JADX INFO: renamed from: g */
    public static final C6265a f20359g;

    static {
        C6265a c6265a = new C6265a(new LockBasedStorageManager("FallbackBuiltIns"));
        c6265a.m18109c(true);
        f20359g = c6265a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* JADX INFO: renamed from: f */
    public final PlatformDependentDeclarationFilter mo6752f() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
