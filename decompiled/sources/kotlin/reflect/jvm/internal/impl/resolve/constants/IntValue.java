package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public final class IntValue extends IntegerValueConstant<Integer> {
    public IntValue(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        SimpleType intType = module.getBuiltIns().getIntType();
        AbstractC16544l.m18093f(intType, "getIntType(...)");
        return intType;
    }
}
