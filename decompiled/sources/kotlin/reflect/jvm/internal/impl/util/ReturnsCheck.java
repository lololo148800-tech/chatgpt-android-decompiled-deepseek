package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p049Bm.InterfaceC1436k;
import p1047un.C20392a;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReturnsCheck implements Check {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1436k f53300a;

    /* JADX INFO: renamed from: b */
    public final String f53301b;

    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean("Boolean", C20392a.f64496t0, null);
    }

    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt INSTANCE = new ReturnsInt("Int", C20392a.f64497u0, null);
    }

    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit INSTANCE = new ReturnsUnit("Unit", C20392a.f64498v0, null);
    }

    public ReturnsCheck(String str, InterfaceC1436k interfaceC1436k, DefaultConstructorMarker defaultConstructorMarker) {
        this.f53300a = interfaceC1436k;
        this.f53301b = AbstractC9306j0.m9889h("must return ", str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(FunctionDescriptor functionDescriptor) {
        AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
        return AbstractC16544l.m18089b(functionDescriptor.getReturnType(), this.f53300a.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f53301b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
