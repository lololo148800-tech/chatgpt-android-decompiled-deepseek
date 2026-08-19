package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinSpecialPropertiesKt {
    public static final FqName access$child(FqName fqName, String str) {
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return fqName.child(nameIdentifier);
    }

    public static final FqName access$childSafe(FqNameUnsafe fqNameUnsafe, String str) {
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return fqNameUnsafe.child(nameIdentifier).toSafe();
    }
}
