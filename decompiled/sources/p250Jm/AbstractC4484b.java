package p250Jm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p024Am.C0560a;
import p025An.C0644w;
import p225Im.C3743B;
import p225Im.EnumC3744C;
import p225Im.InterfaceC3757e;
import p298Lm.C5213y0;
import p298Lm.InterfaceC5136E;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Jm.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4484b {
    /* JADX INFO: renamed from: a */
    public static final C5213y0 m5211a(InterfaceC3757e interfaceC3757e, List arguments, boolean z6, List annotations) {
        ClassifierDescriptor descriptor;
        TypeProjectionBase starProjectionImpl;
        AbstractC16544l.m18094g(interfaceC3757e, "<this>");
        AbstractC16544l.m18094g(arguments, "arguments");
        AbstractC16544l.m18094g(annotations, "annotations");
        InterfaceC5136E interfaceC5136E = interfaceC3757e instanceof InterfaceC5136E ? (InterfaceC5136E) interfaceC3757e : null;
        if (interfaceC5136E == null || (descriptor = interfaceC5136E.getDescriptor()) == null) {
            throw new C0560a("Cannot create type for an unsupported classifier: " + interfaceC3757e + " (" + interfaceC3757e.getClass() + ')');
        }
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        AbstractC16544l.m18093f(parameters, "getParameters(...)");
        if (parameters.size() != arguments.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        TypeAttributes empty = annotations.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.getEmpty();
        List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
        AbstractC16544l.m18093f(parameters2, "getParameters(...)");
        List list = arguments;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            C3743B c3743b = (C3743B) obj;
            C5213y0 c5213y0 = (C5213y0) c3743b.f11393b;
            KotlinType kotlinType = c5213y0 != null ? c5213y0.f16935Y : null;
            EnumC3744C enumC3744C = c3743b.f11392a;
            int i12 = enumC3744C == null ? -1 : AbstractC4483a.f14635a[enumC3744C.ordinal()];
            if (i12 == -1) {
                TypeParameterDescriptor typeParameterDescriptor = parameters2.get(i10);
                AbstractC16544l.m18093f(typeParameterDescriptor, "get(...)");
                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
            } else if (i12 == 1) {
                Variance variance = Variance.INVARIANT;
                AbstractC16544l.m18091d(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(variance, kotlinType);
            } else if (i12 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                AbstractC16544l.m18091d(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(variance2, kotlinType);
            } else {
                if (i12 != 3) {
                    throw new C0644w();
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                AbstractC16544l.m18091d(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(variance3, kotlinType);
            }
            arrayList.add(starProjectionImpl);
            i10 = i11;
        }
        return new C5213y0(KotlinTypeFactory.simpleType$default(empty, typeConstructor, arrayList, z6, (KotlinTypeRefiner) null, 16, (Object) null), null);
    }
}
