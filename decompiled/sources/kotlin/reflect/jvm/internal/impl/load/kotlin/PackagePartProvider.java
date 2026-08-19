package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public interface PackagePartProvider {

    public static final class Empty implements PackagePartProvider {
        public static final Empty INSTANCE = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        public List<String> findPackageParts(String packageFqName) {
            AbstractC16544l.m18094g(packageFqName, "packageFqName");
            return C17689w.f56480Y;
        }
    }

    List<String> findPackageParts(String str);
}
