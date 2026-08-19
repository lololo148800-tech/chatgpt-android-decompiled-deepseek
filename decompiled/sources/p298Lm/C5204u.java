package p298Lm;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p024Am.C0560a;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Lm.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C5204u implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16916Y;

    /* JADX INFO: renamed from: Z */
    public final C5134D f16917Z;

    public /* synthetic */ C5204u(C5134D c5134d, int i10) {
        this.f16916Y = i10;
        this.f16917Z = c5134d;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws InvocationTargetException {
        ClassDescriptorImpl classDescriptorImplM5683u;
        KotlinClassHeader classHeader;
        KotlinClassHeader.Kind kind = null;
        C5134D c5134d = this.f16917Z;
        switch (this.f16916Y) {
            case 0:
                return new C5214z(c5134d);
            case 1:
                int i10 = C5134D.f16769p0;
                ClassId classIdM5689v = c5134d.m5689v();
                C5214z c5214z = (C5214z) c5134d.f16771o0.getValue();
                c5214z.getClass();
                InterfaceC3776x interfaceC3776x = AbstractC5142H.f16779b[0];
                Object objInvoke = c5214z.f16780a.invoke();
                AbstractC16544l.m18093f(objInvoke, "getValue(...)");
                RuntimeModuleData runtimeModuleData = (RuntimeModuleData) objInvoke;
                ModuleDescriptor module = runtimeModuleData.getModule();
                boolean zIsLocal = classIdM5689v.isLocal();
                Class<?> cls = c5134d.f16770Z;
                ClassDescriptor classDescriptorDeserializeClass = (zIsLocal && cls.isAnnotationPresent(Metadata.class)) ? runtimeModuleData.getDeserialization().deserializeClass(classIdM5689v) : FindClassInModuleKt.findClassAcrossModuleDependencies(module, classIdM5689v);
                if (classDescriptorDeserializeClass != null) {
                    return classDescriptorDeserializeClass;
                }
                if (cls.isSynthetic()) {
                    classDescriptorImplM5683u = C5134D.m5683u(classIdM5689v, runtimeModuleData);
                } else {
                    ReflectKotlinClass reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(cls);
                    if (reflectKotlinClassCreate != null && (classHeader = reflectKotlinClassCreate.getClassHeader()) != null) {
                        kind = classHeader.getKind();
                    }
                    switch (kind == null ? -1 : AbstractC5128A.f16762a[kind.ordinal()]) {
                        case -1:
                        case 6:
                            throw new C0560a("Unresolved class: " + cls + " (kind = " + kind + ')');
                        case 0:
                        default:
                            throw new C0644w();
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            classDescriptorImplM5683u = C5134D.m5683u(classIdM5689v, runtimeModuleData);
                            break;
                        case 5:
                            throw new C0560a("Unknown class: " + cls + " (kind = " + kind + ')');
                    }
                }
                return classDescriptorImplM5683u;
            case 2:
                return c5134d.m5731m(c5134d.getDescriptor().getDefaultType().getMemberScope(), EnumC5144I.f16782Y);
            case 3:
                MemberScope staticScope = c5134d.getDescriptor().getStaticScope();
                AbstractC16544l.m18093f(staticScope, "getStaticScope(...)");
                return c5134d.m5731m(staticScope, EnumC5144I.f16782Y);
            case 4:
                return c5134d.m5731m(c5134d.getDescriptor().getDefaultType().getMemberScope(), EnumC5144I.f16783Z);
            case 5:
                MemberScope staticScope2 = c5134d.getDescriptor().getStaticScope();
                AbstractC16544l.m18093f(staticScope2, "getStaticScope(...)");
                return c5134d.m5731m(staticScope2, EnumC5144I.f16783Z);
            case 6:
                if (c5134d.f16770Z.isAnonymousClass()) {
                    return null;
                }
                ClassId classIdM5689v2 = c5134d.m5689v();
                if (classIdM5689v2.isLocal()) {
                    return null;
                }
                return classIdM5689v2.asSingleFqName().asString();
            default:
                Collection collectionMo5685j = c5134d.mo5685j();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collectionMo5685j, 10));
                Iterator it = collectionMo5685j.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C5152N(c5134d, (ConstructorDescriptor) it.next()));
                }
                return arrayList;
        }
    }
}
