package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectKotlinClassFinderKt {
    public static final String access$toRuntimeFqName(ClassId classId) {
        String strM21730q = AbstractC21329w.m21730q(classId.getRelativeClassName().asString(), '.', '$');
        if (classId.getPackageFqName().isRoot()) {
            return strM21730q;
        }
        return classId.getPackageFqName() + '.' + strM21730q;
    }
}
