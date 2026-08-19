package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstantValue<T> {

    /* JADX INFO: renamed from: a */
    public final Object f52878a;

    public ConstantValue(T t10) {
        this.f52878a = t10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T value = getValue();
            ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
            if (!AbstractC16544l.m18089b(value, constantValue != null ? constantValue.getValue() : null)) {
                return false;
            }
        }
        return true;
    }

    public abstract KotlinType getType(ModuleDescriptor moduleDescriptor);

    public T getValue() {
        return (T) this.f52878a;
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
