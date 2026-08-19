package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public final class FloatValue extends ConstantValue<Float> {
    public FloatValue(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().floatValue() + ".toFloat()";
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        SimpleType floatType = module.getBuiltIns().getFloatType();
        AbstractC16544l.m18093f(floatType, "getFloatType(...)");
        return floatType;
    }
}
