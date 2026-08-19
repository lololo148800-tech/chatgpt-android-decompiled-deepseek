package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class NameResolverUtilKt {
    public static final ClassId getClassId(NameResolver nameResolver, int i10) {
        AbstractC16544l.m18094g(nameResolver, "<this>");
        return ClassId.Companion.fromString(nameResolver.getQualifiedClassName(i10), nameResolver.isLocalClassName(i10));
    }

    public static final Name getName(NameResolver nameResolver, int i10) {
        AbstractC16544l.m18094g(nameResolver, "<this>");
        Name nameGuessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i10));
        AbstractC16544l.m18093f(nameGuessByFirstCharacter, "guessByFirstCharacter(...)");
        return nameGuessByFirstCharacter;
    }
}
