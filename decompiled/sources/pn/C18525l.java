package pn;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: pn.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C18525l implements InterfaceC1436k {
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        FqName fqName = (FqName) obj;
        if (fqName != null) {
            return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.unsafeVariance));
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
    }
}
