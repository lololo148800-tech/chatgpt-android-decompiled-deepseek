package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mm.EnumC17307j;
import p298Lm.C5140G;
import p571X9.AbstractC9227W;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a */
    public final KotlinBuiltIns f51438a;

    /* JADX INFO: renamed from: b */
    public final FqName f51439b;

    /* JADX INFO: renamed from: c */
    public final Map f51440c;

    /* JADX INFO: renamed from: d */
    public final Object f51441d;

    public BuiltInAnnotationDescriptor(KotlinBuiltIns builtIns, FqName fqName, Map<Name, ? extends ConstantValue<?>> allValueArguments, boolean z6) {
        AbstractC16544l.m18094g(builtIns, "builtIns");
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(allValueArguments, "allValueArguments");
        this.f51438a = builtIns;
        this.f51439b = fqName;
        this.f51440c = allValueArguments;
        this.f51441d = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5140G(this, 9));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return this.f51440c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return this.f51439b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        Object value = this.f51441d.getValue();
        AbstractC16544l.m18093f(value, "getValue(...)");
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i10 & 8) != 0 ? false : z6);
    }
}
