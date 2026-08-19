package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleValue extends ConstantValue<Double> {
    public DoubleValue(double d10) {
        super(Double.valueOf(d10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().doubleValue() + ".toDouble()";
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        SimpleType doubleType = module.getBuiltIns().getDoubleType();
        AbstractC16544l.m18093f(doubleType, "getDoubleType(...)");
        return doubleType;
    }
}
