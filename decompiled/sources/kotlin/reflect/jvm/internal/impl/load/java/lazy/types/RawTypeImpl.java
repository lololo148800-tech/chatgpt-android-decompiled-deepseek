package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mm.C17309l;
import p1113xn.AbstractC21322p;
import p630Zm.C10427c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class RawTypeImpl extends FlexibleType implements RawType {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        super(lowerBound, upperBound);
        AbstractC16544l.m18094g(lowerBound, "lowerBound");
        AbstractC16544l.m18094g(upperBound, "upperBound");
        KotlinTypeChecker.DEFAULT.isSubtypeOf(lowerBound, upperBound);
    }

    /* JADX INFO: renamed from: a */
    public static final ArrayList m18224a(DescriptorRenderer descriptorRenderer, SimpleType simpleType) {
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.renderTypeProjection((TypeProjection) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18225b(String str, String str2) {
        if (!AbstractC21322p.m21668B(str, '<')) {
            return str;
        }
        return AbstractC21322p.m21705m0(str, '<') + '<' + str2 + '>' + AbstractC21322p.m21703k0('>', str, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType getDelegate() {
        return getLowerBound();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = getConstructor().mo22589getDeclarationDescriptor();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        Object[] objArr = 0;
        ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
        if (classDescriptor != null) {
            MemberScope memberScope = classDescriptor.getMemberScope(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0));
            AbstractC16544l.m18093f(memberScope, "getMemberScope(...)");
            return memberScope;
        }
        throw new IllegalStateException(("Incorrect classifier: " + getConstructor().mo22589getDeclarationDescriptor()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String render(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        AbstractC16544l.m18094g(renderer, "renderer");
        AbstractC16544l.m18094g(options, "options");
        String strRenderType = renderer.renderType(getLowerBound());
        String strRenderType2 = renderer.renderType(getUpperBound());
        if (options.getDebugMode()) {
            return "raw (" + strRenderType + ".." + strRenderType2 + ')';
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return renderer.renderFlexibleType(strRenderType, strRenderType2, TypeUtilsKt.getBuiltIns(this));
        }
        ArrayList arrayListM18224a = m18224a(renderer, getLowerBound());
        ArrayList arrayListM18224a2 = m18224a(renderer, getUpperBound());
        String strM19349Y = AbstractC17680n.m19349Y(arrayListM18224a, ", ", null, null, 0, null, C10427c.f30902Y, 30);
        ArrayList arrayListM19334J0 = AbstractC17680n.m19334J0(arrayListM18224a, arrayListM18224a2);
        if (!arrayListM19334J0.isEmpty()) {
            Iterator it = arrayListM19334J0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strRenderType2 = m18225b(strRenderType2, strM19349Y);
                    break;
                }
                C17309l c17309l = (C17309l) it.next();
                String str = (String) c17309l.f55136Y;
                String str2 = (String) c17309l.f55137Z;
                if (!AbstractC16544l.m18089b(str, AbstractC21322p.m21688V(str2, "out ")) && !str2.equals(Separators.STAR)) {
                    break;
                }
            }
        } else {
            strRenderType2 = m18225b(strRenderType2, strM19349Y);
            break;
        }
        String strM18225b = m18225b(strRenderType, strM19349Y);
        return AbstractC16544l.m18089b(strM18225b, strRenderType2) ? strM18225b : renderer.renderFlexibleType(strM18225b, strRenderType2, TypeUtilsKt.getBuiltIns(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public RawTypeImpl makeNullableAsSpecified(boolean z6) {
        return new RawTypeImpl(getLowerBound().makeNullableAsSpecified(z6), getUpperBound().makeNullableAsSpecified(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public RawTypeImpl replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return new RawTypeImpl(getLowerBound().replaceAttributes(newAttributes), getUpperBound().replaceAttributes(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public FlexibleType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getLowerBound());
        AbstractC16544l.m18092e(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) getUpperBound());
        AbstractC16544l.m18092e(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((SimpleType) kotlinTypeRefineType, (SimpleType) kotlinTypeRefineType2);
    }
}
