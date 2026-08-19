package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor;
import p225Im.InterfaceC3776x;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsTypeAttributeKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC3776x[] f53146a;

    /* JADX INFO: renamed from: b */
    public static final NullableArrayMapAccessor f53147b;

    static {
        C16553u c16553u = new C16553u(AnnotationsTypeAttributeKt.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        C16527D c16527d = AbstractC16526C.f51263a;
        f53146a = new InterfaceC3776x[]{c16527d.mo5699h(c16553u)};
        NullableArrayMapAccessor<TypeAttribute<?>, TypeAttribute<?>, T> nullableArrayMapAccessorGenerateNullableAccessor = TypeAttributes.Companion.generateNullableAccessor(c16527d.mo5693b(AnnotationsTypeAttribute.class));
        AbstractC16544l.m18092e(nullableArrayMapAccessorGenerateNullableAccessor, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f53147b = nullableArrayMapAccessorGenerateNullableAccessor;
    }

    public static final Annotations getAnnotations(TypeAttributes typeAttributes) {
        Annotations annotations;
        AbstractC16544l.m18094g(typeAttributes, "<this>");
        AnnotationsTypeAttribute annotationsAttribute = getAnnotationsAttribute(typeAttributes);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? Annotations.Companion.getEMPTY() : annotations;
    }

    public static final AnnotationsTypeAttribute getAnnotationsAttribute(TypeAttributes typeAttributes) {
        AbstractC16544l.m18094g(typeAttributes, "<this>");
        return (AnnotationsTypeAttribute) f53147b.getValue((Object) typeAttributes, f53146a[0]);
    }
}
