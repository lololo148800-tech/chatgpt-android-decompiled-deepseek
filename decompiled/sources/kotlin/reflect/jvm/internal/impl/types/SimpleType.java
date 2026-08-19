package kotlin.reflect.jvm.internal.impl.types;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public abstract SimpleType makeNullableAsSpecified(boolean z6);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public abstract SimpleType replaceAttributes(TypeAttributes typeAttributes);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, it.next(), null, 2, null), "] "};
            for (int i10 = 0; i10 < 3; i10++) {
                sb2.append(strArr[i10]);
            }
        }
        sb2.append(getConstructor());
        if (!getArguments().isEmpty()) {
            AbstractC17680n.m19347W(getArguments(), sb2, ", ", (124 & 4) != 0 ? "" : Separators.LESS_THAN, (124 & 8) != 0 ? "" : Separators.GREATER_THAN, -1, "...", (124 & 64) != 0 ? null : null);
        }
        if (isMarkedNullable()) {
            sb2.append(Separators.QUESTION);
        }
        return sb2.toString();
    }
}
