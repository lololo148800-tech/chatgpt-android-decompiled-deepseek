package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public final class ShortValue extends IntegerValueConstant<Short> {
    public ShortValue(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().intValue() + ".toShort()";
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        SimpleType shortType = module.getBuiltIns().getShortType();
        AbstractC16544l.m18093f(shortType, "getShortType(...)");
        return shortType;
    }
}
