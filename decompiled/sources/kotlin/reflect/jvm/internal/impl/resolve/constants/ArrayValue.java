package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f52875b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayValue(List<? extends ConstantValue<?>> value, InterfaceC1436k computeType) {
        super(value);
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(computeType, "computeType");
        this.f52875b = computeType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        KotlinType kotlinType = (KotlinType) this.f52875b.invoke(module);
        if (!KotlinBuiltIns.isArray(kotlinType) && !KotlinBuiltIns.isPrimitiveArray(kotlinType)) {
            KotlinBuiltIns.isUnsignedArrayType(kotlinType);
        }
        return kotlinType;
    }
}
