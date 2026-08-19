package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VariableDescriptorWithInitializerImpl extends VariableDescriptorImpl {

    /* JADX INFO: renamed from: r0 */
    public final boolean f51654r0;

    /* JADX INFO: renamed from: s0 */
    public NullableLazyValue f51655s0;

    /* JADX INFO: renamed from: t0 */
    public InterfaceC1426a f51656t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableDescriptorWithInitializerImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, KotlinType kotlinType, boolean z6, SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, kotlinType, sourceElement);
        if (declarationDescriptor == null) {
            m18161a(0);
            throw null;
        }
        if (annotations == null) {
            m18161a(1);
            throw null;
        }
        if (name == null) {
            m18161a(2);
            throw null;
        }
        if (sourceElement == null) {
            m18161a(3);
            throw null;
        }
        this.f51654r0 = z6;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18161a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = DiagnosticsEntry.NAME_KEY;
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: getCompileTimeInitializer */
    public ConstantValue<?> mo22586getCompileTimeInitializer() {
        NullableLazyValue nullableLazyValue = this.f51655s0;
        if (nullableLazyValue != null) {
            return (ConstantValue) nullableLazyValue.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return this.f51654r0;
    }

    public void setCompileTimeInitializer(NullableLazyValue<ConstantValue<?>> nullableLazyValue, InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a == null) {
            m18161a(5);
            throw null;
        }
        this.f51656t0 = interfaceC1426a;
        if (nullableLazyValue == null) {
            nullableLazyValue = (NullableLazyValue) interfaceC1426a.invoke();
        }
        this.f51655s0 = nullableLazyValue;
    }

    public void setCompileTimeInitializerFactory(InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a != null) {
            setCompileTimeInitializer(null, interfaceC1426a);
        } else {
            m18161a(4);
            throw null;
        }
    }
}
