package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p077Cn.C1756x;
import p877ln.C17069a;
import p909nm.AbstractC17665J;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassDeserializer {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final Set f52989c = AbstractC17665J.m19268h(ClassId.Companion.topLevel(StandardNames.FqNames.cloneable.toSafe()));

    /* JADX INFO: renamed from: a */
    public final DeserializationComponents f52990a;

    /* JADX INFO: renamed from: b */
    public final MemoizedFunctionToNullable f52991b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.f52989c;
        }
    }

    public ClassDeserializer(DeserializationComponents components) {
        AbstractC16544l.m18094g(components, "components");
        this.f52990a = components;
        this.f52991b = components.getStorageManager().createMemoizedFunctionWithNullableValues(new C1756x(this, 24));
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    public final ClassDescriptor deserializeClass(ClassId classId, ClassData classData) {
        AbstractC16544l.m18094g(classId, "classId");
        return (ClassDescriptor) this.f52991b.invoke(new C17069a(classId, classData));
    }
}
