package p298Lm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Lm.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5212y implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16931Y;

    /* JADX INFO: renamed from: Z */
    public final C5214z f16932Z;

    /* JADX INFO: renamed from: o0 */
    public final C5134D f16933o0;

    public /* synthetic */ C5212y(C5214z c5214z, C5134D c5134d, int i10) {
        this.f16931Y = i10;
        this.f16932Z = c5214z;
        this.f16933o0 = c5134d;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws IllegalAccessException {
        switch (this.f16931Y) {
            case 0:
                C5134D c5134d = this.f16933o0;
                if (c5134d.f16770Z.isAnonymousClass()) {
                    return null;
                }
                ClassId classIdM5689v = c5134d.m5689v();
                if (!classIdM5689v.isLocal()) {
                    String strAsString = classIdM5689v.getShortClassName().asString();
                    AbstractC16544l.m18093f(strAsString, "asString(...)");
                    return strAsString;
                }
                this.f16932Z.getClass();
                Class cls = c5134d.f16770Z;
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return AbstractC21322p.m21702j0(simpleName, enclosingMethod.getName() + '$');
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return AbstractC21322p.m21701i0('$', simpleName, simpleName);
                }
                return AbstractC21322p.m21702j0(simpleName, enclosingConstructor.getName() + '$');
            case 1:
                ClassDescriptor classDescriptorM5763a = this.f16932Z.m5763a();
                if (classDescriptorM5763a.getKind() != ClassKind.OBJECT) {
                    return null;
                }
                boolean zIsCompanionObject = classDescriptorM5763a.isCompanionObject();
                C5134D c5134d2 = this.f16933o0;
                Object obj = ((!zIsCompanionObject || CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(CompanionObjectMapping.INSTANCE, classDescriptorM5763a)) ? c5134d2.f16770Z.getDeclaredField("INSTANCE") : c5134d2.f16770Z.getEnclosingClass().getDeclaredField(classDescriptorM5763a.getName().asString())).get(null);
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj;
            case 2:
                List<TypeParameterDescriptor> declaredTypeParameters = this.f16932Z.m5763a().getDeclaredTypeParameters();
                AbstractC16544l.m18093f(declaredTypeParameters, "getDeclaredTypeParameters(...)");
                List<TypeParameterDescriptor> list = declaredTypeParameters;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                for (TypeParameterDescriptor typeParameterDescriptor : list) {
                    AbstractC16544l.m18091d(typeParameterDescriptor);
                    arrayList.add(new C5129A0(this.f16933o0, typeParameterDescriptor));
                }
                return arrayList;
            default:
                C5214z c5214z = this.f16932Z;
                Collection<KotlinType> supertypes = c5214z.m5763a().getTypeConstructor().getSupertypes();
                AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
                ArrayList arrayList2 = new ArrayList(supertypes.size());
                for (KotlinType kotlinType : supertypes) {
                    AbstractC16544l.m18091d(kotlinType);
                    arrayList2.add(new C5213y0(kotlinType, new C5208w(kotlinType, c5214z, this.f16933o0)));
                }
                if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(c5214z.m5763a())) {
                    if (arrayList2.isEmpty()) {
                        SimpleType anyType = DescriptorUtilsKt.getBuiltIns(c5214z.m5763a()).getAnyType();
                        AbstractC16544l.m18093f(anyType, "getAnyType(...)");
                        arrayList2.add(new C5213y0(anyType, C5210x.f16929Y));
                    } else {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ClassKind kind = DescriptorUtils.getClassDescriptorForType(((C5213y0) it.next()).f16935Y).getKind();
                            AbstractC16544l.m18093f(kind, "getKind(...)");
                            if (kind == ClassKind.INTERFACE || kind == ClassKind.ANNOTATION_CLASS) {
                            }
                        }
                        SimpleType anyType2 = DescriptorUtilsKt.getBuiltIns(c5214z.m5763a()).getAnyType();
                        AbstractC16544l.m18093f(anyType2, "getAnyType(...)");
                        arrayList2.add(new C5213y0(anyType2, C5210x.f16929Y));
                    }
                }
                return CollectionsKt.compact(arrayList2);
        }
    }

    public C5212y(C5134D c5134d, C5214z c5214z) {
        this.f16931Y = 0;
        this.f16933o0 = c5134d;
        this.f16932Z = c5214z;
    }
}
