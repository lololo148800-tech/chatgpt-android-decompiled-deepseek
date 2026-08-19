package p368Om;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p049Bm.InterfaceC1426a;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Om.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6268d implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20363Y;

    /* JADX INFO: renamed from: Z */
    public final JvmBuiltInsCustomizer f20364Z;

    public /* synthetic */ C6268d(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, int i10) {
        this.f20363Y = i10;
        this.f20364Z = jvmBuiltInsCustomizer;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f20363Y) {
            case 0:
                return Annotations.Companion.create(AbstractC9393x3.m9974d(AnnotationUtilKt.createDeprecatedAnnotation$default(this.f20364Z.f51372a.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
            default:
                SimpleType anyType = this.f20364Z.f51372a.getBuiltIns().getAnyType();
                AbstractC16544l.m18093f(anyType, "getAnyType(...)");
                return anyType;
        }
    }
}
