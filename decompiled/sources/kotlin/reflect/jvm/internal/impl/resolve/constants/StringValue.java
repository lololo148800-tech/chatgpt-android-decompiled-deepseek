package kotlin.reflect.jvm.internal.impl.resolve.constants;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes2.dex */
public final class StringValue extends ConstantValue<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValue(String value) {
        super(value);
        AbstractC16544l.m18094g(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder(Separators.DOUBLE_QUOTE), getValue(), '\"');
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        SimpleType stringType = module.getBuiltIns().getStringType();
        AbstractC16544l.m18093f(stringType, "getStringType(...)");
        return stringType;
    }
}
