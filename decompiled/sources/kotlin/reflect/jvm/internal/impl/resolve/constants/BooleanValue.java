package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanValue extends ConstantValue<Boolean> {
    public BooleanValue(boolean z6) {
        super(Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        SimpleType booleanType = module.getBuiltIns().getBooleanType();
        AbstractC16544l.m18093f(booleanType, "getBooleanType(...)");
        return booleanType;
    }
}
