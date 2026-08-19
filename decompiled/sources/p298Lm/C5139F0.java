package p298Lm;

import android.gov.nist.core.Separators;
import io.sentry.internal.debugmeta.C15384c;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16535c;
import kotlin.jvm.internal.AbstractC16540h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.AbstractC16547o;
import kotlin.jvm.internal.AbstractC16552t;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.C16554v;
import kotlin.jvm.internal.InterfaceC16536d;
import kotlin.jvm.internal.InterfaceC16539g;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import mm.C17309l;
import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3757e;
import p225Im.InterfaceC3758f;
import p225Im.InterfaceC3759g;
import p225Im.InterfaceC3762j;
import p225Im.InterfaceC3764l;
import p225Im.InterfaceC3771s;
import p225Im.InterfaceC3773u;
import p225Im.InterfaceC3775w;
import p225Im.InterfaceC3777y;
import p225Im.InterfaceC3778z;
import p250Jm.AbstractC4484b;
import p274Km.C4813b;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: Lm.F0 */
/* JADX INFO: loaded from: classes2.dex */
public class C5139F0 extends C16527D {
    /* JADX INFO: renamed from: o */
    public static AbstractC5148K m5691o(AbstractC16535c abstractC16535c) {
        InterfaceC3758f owner = abstractC16535c.getOwner();
        return owner instanceof AbstractC5148K ? (AbstractC5148K) owner : C5172e.f16852Z;
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: a */
    public final InterfaceC3759g mo5692a(AbstractC16540h abstractC16540h) {
        AbstractC5148K container = m5691o(abstractC16540h);
        String name = abstractC16540h.getName();
        String signature = abstractC16540h.getSignature();
        Object boundReceiver = abstractC16540h.getBoundReceiver();
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(signature, "signature");
        return new C5152N(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: b */
    public final InterfaceC3756d mo5693b(Class cls) {
        return AbstractC5168c.m5744a(cls);
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: c */
    public final InterfaceC3758f mo5694c(Class jClass, String str) {
        C15384c c15384c = AbstractC5168c.f16839a;
        AbstractC16544l.m18094g(jClass, "jClass");
        return (InterfaceC3758f) AbstractC5168c.f16840b.m16640o(jClass);
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: d */
    public final InterfaceC3777y mo5695d(InterfaceC3777y type) {
        AbstractC16544l.m18094g(type, "type");
        KotlinType kotlinType = ((C5213y0) type).f16935Y;
        if (!(kotlinType instanceof SimpleType)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        SimpleType simpleType = (SimpleType) kotlinType;
        FqName onlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
        if (onlyToMutable == null) {
            throw new IllegalArgumentException("Not a readonly collection: " + classDescriptor);
        }
        ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(classDescriptor).getBuiltInClassByFqName(onlyToMutable);
        AbstractC16544l.m18093f(builtInClassByFqName, "getBuiltInClassByFqName(...)");
        TypeConstructor typeConstructor = builtInClassByFqName.getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        return new C5213y0(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null);
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: e */
    public final InterfaceC3762j mo5696e(AbstractC16547o abstractC16547o) {
        return new C5154P(m5691o(abstractC16547o), abstractC16547o.getName(), abstractC16547o.getSignature(), abstractC16547o.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: f */
    public final InterfaceC3764l mo5697f(C16549q c16549q) {
        return new C5156S(m5691o(c16549q), c16549q.getName(), c16549q.getSignature(), c16549q.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: g */
    public final InterfaceC3771s mo5698g(AbstractC16552t abstractC16552t) {
        return new C5177g0(m5691o(abstractC16552t), abstractC16552t.getName(), abstractC16552t.getSignature(), abstractC16552t.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: h */
    public final InterfaceC3773u mo5699h(C16553u c16553u) {
        return new C5183j0(m5691o(c16553u), c16553u.getName(), c16553u.getSignature(), c16553u.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: i */
    public final InterfaceC3775w mo5700i(C16554v c16554v) {
        return new C5189m0(m5691o(c16554v), c16554v.getName(), c16554v.getSignature());
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: j */
    public final String mo5701j(InterfaceC16539g interfaceC16539g) {
        C5152N c5152nM5714b;
        AbstractC16544l.m18094g(interfaceC16539g, "<this>");
        Metadata metadata = (Metadata) interfaceC16539g.getClass().getAnnotation(Metadata.class);
        C5152N c5152n = null;
        if (metadata != null) {
            String[] strArrM18066d1 = metadata.m18066d1();
            if (strArrM18066d1.length == 0) {
                strArrM18066d1 = null;
            }
            if (strArrM18066d1 != null) {
                C17309l functionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(strArrM18066d1, metadata.m18067d2());
                JvmNameResolver jvmNameResolver = (JvmNameResolver) functionDataFrom.f55136Y;
                ProtoBuf.Function function = (ProtoBuf.Function) functionDataFrom.f55137Z;
                JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(metadata.m18069mv(), (metadata.m18071xi() & 8) != 0);
                Class<?> cls = interfaceC16539g.getClass();
                ProtoBuf.TypeTable typeTable = function.getTypeTable();
                AbstractC16544l.m18093f(typeTable, "getTypeTable(...)");
                c5152n = new C5152N(C5172e.f16852Z, (SimpleFunctionDescriptor) AbstractC5147J0.m5718f(cls, function, jvmNameResolver, new TypeTable(typeTable), jvmMetadataVersion, C4813b.f15693Y));
            }
        }
        if (c5152n == null || (c5152nM5714b = AbstractC5147J0.m5714b(c5152n)) == null) {
            return super.mo5701j(interfaceC16539g);
        }
        DescriptorRenderer descriptorRenderer = AbstractC5141G0.f16778a;
        FunctionDescriptor functionDescriptorMo5738m = c5152nM5714b.mo5738m();
        StringBuilder sb2 = new StringBuilder();
        AbstractC5141G0.m5706a(sb2, functionDescriptorMo5738m);
        List<ValueParameterDescriptor> valueParameters = functionDescriptorMo5738m.getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        AbstractC17680n.m19347W(valueParameters, sb2, ", ", (124 & 4) != 0 ? "" : Separators.LPAREN, (124 & 8) != 0 ? "" : Separators.RPAREN, -1, "...", (124 & 64) != 0 ? null : C5166b.f16834x0);
        sb2.append(" -> ");
        KotlinType returnType = functionDescriptorMo5738m.getReturnType();
        AbstractC16544l.m18091d(returnType);
        sb2.append(AbstractC5141G0.m5709d(returnType));
        return sb2.toString();
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: k */
    public final String mo5702k(AbstractC16546n abstractC16546n) {
        return mo5701j(abstractC16546n);
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: m */
    public final InterfaceC3777y mo5704m(InterfaceC3757e interfaceC3757e, List arguments, boolean z6) {
        if (!(interfaceC3757e instanceof InterfaceC16536d)) {
            return AbstractC4484b.m5211a(interfaceC3757e, arguments, z6, Collections.emptyList());
        }
        Class jClass = ((InterfaceC16536d) interfaceC3757e).mo5684d();
        C15384c c15384c = AbstractC5168c.f16839a;
        AbstractC16544l.m18094g(jClass, "jClass");
        AbstractC16544l.m18094g(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z6 ? (InterfaceC3777y) AbstractC5168c.f16842d.m16640o(jClass) : (InterfaceC3777y) AbstractC5168c.f16841c.m16640o(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC5168c.f16843e.m16640o(jClass);
        C17309l c17309l = new C17309l(arguments, Boolean.valueOf(z6));
        Object obj = concurrentHashMap.get(c17309l);
        if (obj == null) {
            C5213y0 c5213y0M5211a = AbstractC4484b.m5211a(AbstractC5168c.m5744a(jClass), arguments, z6, C17689w.f56480Y);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c17309l, c5213y0M5211a);
            obj = objPutIfAbsent == null ? c5213y0M5211a : objPutIfAbsent;
        }
        return (InterfaceC3777y) obj;
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: n */
    public final InterfaceC3778z mo5705n(InterfaceC3756d interfaceC3756d) {
        List<InterfaceC3778z> typeParameters;
        if (interfaceC3756d instanceof InterfaceC3756d) {
            typeParameters = interfaceC3756d.getTypeParameters();
        } else {
            if (!(interfaceC3756d instanceof InterfaceC3755c)) {
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + interfaceC3756d);
            }
            typeParameters = ((InterfaceC3755c) interfaceC3756d).getTypeParameters();
        }
        for (InterfaceC3778z interfaceC3778z : typeParameters) {
            if (interfaceC3778z.getName().equals("PluginConfigT")) {
                return interfaceC3778z;
            }
        }
        throw new IllegalArgumentException("Type parameter PluginConfigT is not found in container: " + interfaceC3756d);
    }

    @Override // kotlin.jvm.internal.C16527D
    /* JADX INFO: renamed from: l */
    public final void mo5703l(InterfaceC3778z interfaceC3778z, List list) {
    }
}
