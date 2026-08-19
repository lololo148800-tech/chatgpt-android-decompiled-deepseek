package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {
    public static final Factory Factory = new Factory(null);

    /* JADX INFO: renamed from: a */
    public final Name f51685a;

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ReflectJavaAnnotationArgument create(Object value, Name name) {
            AbstractC16544l.m18094g(value, "value");
            if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(value.getClass())) {
                return new ReflectJavaEnumValueAnnotationArgument(name, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new ReflectJavaArrayAnnotationArgument(name, (Object[]) value);
            }
            return value instanceof Class ? new ReflectJavaClassObjectAnnotationArgument(name, (Class) value) : new ReflectJavaLiteralAnnotationArgument(name, value);
        }
    }

    public ReflectJavaAnnotationArgument(Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this.f51685a = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    public Name getName() {
        return this.f51685a;
    }
}
